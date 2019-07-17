package com.lzw.wind.gateway.web.controller;


import com.lzw.wind.gateway.manager.StateCodeCreator;
import com.lzw.wind.gateway.sso.SsoProperties;
import com.lzw.wind.gateway.util.GatewayUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebSession;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class SsoLoginController {


    private static final String _STATE_CODE_KEY="SsoLoginController_STATE_CODE_KEY";

    private static final String _REDIRECT_URI_KEY="SsoLoginController_REDIRECT_URI_KEY";

    private static final String _GO_TO_KEY="SsoLoginController_GO_TO_KEY";



    private RestTemplate restTemplate=new RestTemplate();


    @Autowired
    private SsoProperties ssoProperties;

    @Autowired
    private StateCodeCreator stateCodeCreator;



    private JacksonJsonParser jacksonJsonParser=new JacksonJsonParser();


    public SsoLoginController(){
    }


    /**
     * 单点登录逻辑
     * <PRE>
     *     1.前端调用{@linkplain #loginUserInfo(WebSession)}接口，如果返回为空，如果为空则未登陆，将页面重定向到{@linkplain #login(ServerWebExchange, ServerHttpRequest, ServerHttpResponse, WebSession)}页面
     *     2.login方法中将页面重定向到统一鉴权
     *     3.统一鉴权生成授权码，login方法的中，请求参数为code
     *     4.根据code获取token
     *     5.根据token获取用户信息
     * </PRE>
     * @param exchange
     * @param request
     * @param response
     * @param session
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public void login(ServerWebExchange exchange,
                      ServerHttpRequest request,
                      ServerHttpResponse response,
                      WebSession session){
        //授权码
        String code= GatewayUtils.getParam(request,"code");
        String state=GatewayUtils.getParam(request,"state");
        String goToUri=GatewayUtils.getParam(request,"go");

        if(StringUtils.isNotBlank(goToUri)){
            session.getAttributes().put(_GO_TO_KEY,goToUri);
        }

        if(StringUtils.isEmpty(code)){
            log.warn("没有发现授权码...需要到统一鉴权登录...");
            //没有授权码，获取一个
            String stateCode=this.stateCodeCreator.createStateCode();
            String redirectUri=this.getCurrentPath(request);
            response.setStatusCode(HttpStatus.FOUND);
            response.getHeaders().add("Location",this.buildAuthorizeUrl(redirectUri,stateCode));
            GatewayUtils.setAttributes(session,new String[]{_STATE_CODE_KEY,_REDIRECT_URI_KEY},new Object[]{stateCode,redirectUri});
            return;
        }
        else{
            //获取token
            String stateCode=session.getAttribute(_STATE_CODE_KEY);
            String redirectUri=session.getAttribute(_REDIRECT_URI_KEY);
            if(StringUtils.isEmpty(redirectUri)){
                response.setStatusCode(HttpStatus.BAD_REQUEST);
                log.warn("redirectUri not null");
                return;
            }
            if(!StringUtils.equals(stateCode,state)){
                response.setStatusCode(HttpStatus.BAD_REQUEST);
                log.warn("stateCode error....");
                return;
            }
            String token=this.getToken(this.ssoProperties.getAccessTokenUri(),code,this.ssoProperties.getClientId(),this.ssoProperties.getClientSecret(),redirectUri);
            log.warn("token={}",token);
            Map<String, Object> userInfo = this.getUserInfo(this.ssoProperties.getTokenInfoUri(), token);
            log.warn("userInfo={}",userInfo);
            String userInfoString=(String)userInfo.get("userInfo");
            Map<String, Object> newUserInfo= this.jacksonJsonParser.parseMap(userInfoString);
            newUserInfo.put("token",token);
            //保存在session中,所有校验时用
            GatewayUtils.setAttributes(session,GatewayUtils.USER_INFO_KEY,newUserInfo);

            //写Cookie
            response.addCookie(ResponseCookie.from("X-Token",token).build());
            //登陆成功后，跳转
            String url=session.getAttribute(_GO_TO_KEY);
            if(StringUtils.isBlank(url)){
                response.setStatusCode(HttpStatus.FOUND);
                response.getHeaders().add("Location","/");
            }
            else{
                session.getAttributes().remove(_GO_TO_KEY);
                session.save();
                response.setStatusCode(HttpStatus.FOUND);
                response.getHeaders().add("Location",url);
            }
            return;
        }
    }


    @RequestMapping(value ={"/loginUserInfo","/webapi/loginUserInfo"},method = RequestMethod.POST)
    public Map<String,Object> loginUserInfo(WebSession session){
        Object userInfo=session.getAttribute(GatewayUtils.USER_INFO_KEY);
        Map<String,Object> data=null;
        if(userInfo!=null){
            data=new HashMap<>();
            data.put("userInfo",userInfo);
        }
        Map<String,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("msg","TradeOK");
        map.put("data",data);
        return map;
    }


    @RequestMapping(value="/logout",method = RequestMethod.GET)
    public void logout(ServerHttpRequest request,
                       ServerHttpResponse response,
                       WebSession session){
        session.invalidate();
        response.setStatusCode(HttpStatus.FOUND);
        String ssoLogoutPath=this.ssoProperties.getLogoutUrl()+"?url="+this.getLoginPath(request);
        response.getHeaders().add("Location",ssoLogoutPath);
    }



    protected String buildAuthorizeUrl(String redirectUri,String state){
        StringBuilder sb=new StringBuilder();
        sb.append(ssoProperties.getUserAuthorizationUri());
        sb.append("?");
        sb.append("client_id=");
        sb.append(ssoProperties.getClientId());
        sb.append("&");
        sb.append("redirect_uri=");
        sb.append(redirectUri);
        sb.append("&");
        sb.append("response_type=code&state=");
        sb.append(state);
        log.warn("buildAuthorizeUrl={}",sb);
        return sb.toString();
    }


    protected String getToken(String accessTokenUri,String code,String clientId,String clientSecret,String redirectUri){
        MultiValueMap<String, String> requestEntity = new LinkedMultiValueMap<>();
        requestEntity.add("grant_type", "authorization_code");
        requestEntity.add("code", code);
        requestEntity.add("client_id", clientId);
        requestEntity.add("client_secret",clientSecret);
        requestEntity.add("redirect_uri",redirectUri);
        ResponseEntity<Map> mapResponseEntity = this.restTemplate.postForEntity(accessTokenUri, requestEntity, Map.class);
        if(mapResponseEntity.getStatusCode()!=HttpStatus.OK){
            //不是200，就是不成功
            throw new RuntimeException("获取token失败");
        }
        return (String)mapResponseEntity.getBody().get("access_token");
    }

    protected Map<String,Object> getUserInfo(String tokenInfoUri,String token){
        MultiValueMap<String, String> requestEntity = new LinkedMultiValueMap<>();
        requestEntity.add("token", token);
        ResponseEntity<String> rep = this.restTemplate.postForEntity(tokenInfoUri, requestEntity, String.class);
        if(rep.getStatusCode()!=HttpStatus.OK){
            //不是200，就是不成功
            throw new RuntimeException("获取用户信息失败");
        }
        return jacksonJsonParser.parseMap(rep.getBody());
    }



    public String getFullHost(ServerHttpRequest request){
        URI uri = request.getURI();
        StringBuilder sb=new StringBuilder();
        sb.append(uri.getScheme());
        sb.append("://");
        sb.append(uri.getHost());
        int port = uri.getPort();
        if(port==80 || port==443){

        }
        else{
            sb.append(":");
            sb.append(port);
        }
        return sb.toString();
    }


    public String getCurrentPath(ServerHttpRequest request){
        if(request.getMethod()!= HttpMethod.GET){
            return this.getFullHost(request);
        }
        URI uri = request.getURI();
        return this.getFullHost(request)+uri.getPath();
    }
    public String getLoginPath(ServerHttpRequest request){
        return this.getFullHost(request)+"/login";
    }




}
