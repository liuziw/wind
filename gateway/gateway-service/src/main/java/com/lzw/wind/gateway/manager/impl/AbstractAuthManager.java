package com.lzw.wind.gateway.manager.impl;

import com.lzw.wind.gateway.enums.AuthInfoEnum;
import com.lzw.wind.gateway.manager.AuthManager;
import com.lzw.wind.gateway.util.GatewayUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpCookie;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;

@Slf4j
public abstract class AbstractAuthManager implements AuthManager {


    private static final String _CHECK_FILE_SERVICE_TAG="_CHECK_FILE_SERVICE_TAG_";


    /**
     *
     *  简单对X-Channel-Info和X-Auth-Info进行校验
     *  <PRE>
     *      X-Channel-Info
     *      分为三部分：用户","分隔
     *              第一部分：uuid,作为请求的流水，每一次访问都必须生成不同的流水，服务端会对流水做重复校验
     *              第二部分：请求时间,格式：yyyyMMddHH24missSSS
     *              第三部分: base64(第一部分,第二部分，X-Auth-Info)
     *  </PRE>
     * @param exchange
     * @return
     */
    protected AuthInfoEnum simpleCheckChannel(ServerWebExchange exchange){
        ServerHttpRequest request = exchange.getRequest();
        String channelInfo = GatewayUtils.getHeader(request, GatewayUtils.HEADER_NAME_CHANNEL_INFO);
        String authInfo = GatewayUtils.getHeader(request, GatewayUtils.HEADER_NAME_AUTH_INFO);
        if(StringUtils.isBlank(channelInfo)){
            return AuthInfoEnum.CHECK_CHANNEL_ERROR;
        }
        if(StringUtils.isBlank(authInfo)){
            return AuthInfoEnum.CHECK_CHANNEL_ERROR;
        }


        /**
         * channelInfo分为三个部分
         *  1.流水，一般是uuid
         *  2.请求时间，yyyyMMddHH24missSSS
         *  3.签名信息
         */
        String[] ss = StringUtils.split(channelInfo, ",");
        if(ss==null || ss.length<3){
            return AuthInfoEnum.CHECK_CHANNEL_ERROR;
        }
        String tradeId=ss[0];
        String time=ss[1];
        String signature=ss[2];
        if(!this.checkTradeId(tradeId,time)){
              return AuthInfoEnum.CHECK_CHANNEL_ERROR;
        }
        if(!this.checkSignature(tradeId,time,signature,authInfo)){
            return AuthInfoEnum.CHECK_CHANNEL_ERROR;
        }
        return AuthInfoEnum.OK;
    }


    @Override
    public AuthInfoEnum checkChannelInfo(ServerWebExchange exchange) {
        AuthInfoEnum fileServiceAuthInfoBO = this.checkFileService(exchange);
        if(fileServiceAuthInfoBO!=null){
            //文件服务校验通过
            return fileServiceAuthInfoBO;
        }
        //不是文件服务
        return this.simpleCheckChannel(exchange);
    }

    /**
     * 校验流水，一般是排同
     * @param tradeId
     * @param time
     * @return
     */
    protected boolean checkTradeId(String tradeId,String time){
        return true;
    }


    /**
     * X-Channel-Info签名
     * @param tradeId
     * @param time
     * @param signature
     * @param authInfo
     * @return
     */
    protected boolean checkSignature(String tradeId,String time,String signature,String authInfo){
        String authInfoMd5= DigestUtils.md5Hex(authInfo);
        StringBuilder sb=new StringBuilder();
        sb.append(tradeId);
        sb.append(",");
        sb.append(time);
        sb.append(",");
        sb.append(authInfoMd5);
        byte[] bytes = Base64.encodeBase64(sb.toString().getBytes());
        return StringUtils.equals(signature,new String(bytes));
    }


    /**
     * <PRE>
     *     X-Auth-Info
     * 分为三个部分，用","分隔
     * 第一部分：Token值md5之后的字符串
     * 第二部分：随机字符串
     * 第三部分：base64（第一部分的值+md5(第二部分)的偶数位）
     * </PRE>
     * @param token
     * @param value
     * @param key
     * @param signature
     * @return
     */
    protected boolean checkXAuthInfo(String token,String value,String key,String signature){
        //token经过md5加密之后就是value的值
        String tokenMD5= DigestUtils.md5Hex(token);
        if(!StringUtils.equals(tokenMD5,value)){
            log.warn("token和value值非法...");
            return false;
        }
        //key的md5值
        String keyMD5=DigestUtils.md5Hex(key);

        StringBuilder sb=new StringBuilder(tokenMD5);
        //取key值的偶数位
        for(int i=0;i<keyMD5.length();i=i+2){
            sb.append(keyMD5.charAt(i));
        }
        //Base64加密
        String newSignature= Base64.encodeBase64String(sb.toString().getBytes());

        if(!StringUtils.equals(signature,newSignature)){
            log.warn("signature值非法...");
            return false;
        }
        return true;
    }




    protected AuthInfoEnum checkFileService(ServerWebExchange exchange){
        Object tag = exchange.getAttributes().get(_CHECK_FILE_SERVICE_TAG);
        if(Boolean.TRUE.equals(tag)){
            //已经校验过了
            return AuthInfoEnum.OK;
        }
        ServerHttpRequest request = exchange.getRequest();
        String path = request.getURI().getPath();
        if(!StringUtils.containsIgnoreCase(path,"file-upload-service")){
            return null;
        }
//        if(request.getMethod()!= HttpMethod.GET){
//            return null;
//        }
        String token=this.getToken(request);
        if(StringUtils.isBlank(token)){
            return AuthInfoEnum.CHECK_FILE_SERVICE_TOKEN_ERROR;
        }
        if(this.checkToken(exchange,token)){
            exchange.getAttributes().put(_CHECK_FILE_SERVICE_TAG,Boolean.TRUE);
            return AuthInfoEnum.OK;
        }
        return AuthInfoEnum.CHECK_FILE_SERVICE_TOKEN_ERROR;
    }


    protected String getToken(ServerHttpRequest request){
        //先从cookie里拿
        HttpCookie tokenCookie = request.getCookies().getFirst("X-Token");
        if(tokenCookie!=null && StringUtils.isNotBlank(tokenCookie.getValue())){
            return tokenCookie.getValue();
        }
        //再从参数里拿
        String paramToken = request.getQueryParams().getFirst("X-Token");
        if(StringUtils.isNotBlank(paramToken)){
            return paramToken;
        }
        //再从头部拿
        return GatewayUtils.getHeader(request,"X-Token");
    }


    /**
     * 判断token的合法性
     * @param token
     * @return
     */
    protected abstract boolean checkToken(ServerWebExchange exchange,String token);



}
