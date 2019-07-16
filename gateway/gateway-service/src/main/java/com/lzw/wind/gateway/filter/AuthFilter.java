package com.lzw.wind.gateway.filter;

import com.hyzs.gateway.enums.AuthInfoEnum;
import com.hyzs.gateway.manager.AuthManager;
import com.hyzs.gateway.util.GatewayUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import javax.annotation.PostConstruct;


/**
 * 鉴权的过滤器
 * <PRE>
 *     这个过滤器的相关配置见:{@linkplain AuthProperties}类，鉴权类型主要有三种:
 *      1.{@linkplain com.hyzs.gateway.filter.AuthProperties.AuthTypeEnum#NONE}不做鉴权处理，任何请求直接放过
 *      2.{@linkplain com.hyzs.gateway.filter.AuthProperties.AuthTypeEnum#LOGIN}统一鉴权登录验证,过程如下
 *           2.1:判断session是否有用户信息
 *           2.2:验证请求头X-Token的值是否与session中用户信息一致
 *           2.3:验证请求头X-Auth-Info的值合法性
 *                  A.该值分为三个部分，每个部分用","分隔
 *                        第一部分:为X-Token请求头值md5加密后的数值
 *                        第二部分:为一个key值，是前端生成的随机的字符串
 *                        第三部分:签名信息，该值的算法如下，(第一部分值+第二部分key的偶数位字符)再用Base64加密
 *           2.4:对文件上传的特殊处理
 *              1.只校验X-Token的值，可以是cookie、request的请求参数及httpheader中的信息
 *      3.{@linkplain com.hyzs.gateway.filter.AuthProperties.AuthTypeEnum#APP_SIGNATURE}APP接口的签名验证
 *          该部分的算法待完善
 *      4.{@linkplain com.hyzs.gateway.filter.AuthProperties.AuthTypeEnum#MINI_PROGRAM_SIGNATURE}小程序接口的签名验证
 *          该部分的算法待完善
 *
 * </PRE>
 */
@Component
@Slf4j
public class AuthFilter implements GlobalFilter, Ordered {


    @Autowired
    private AuthProperties authProperties;

    private String[] excludePaths;

    private PathMatcher pathMatcher=new AntPathMatcher();


    @Autowired
    private AuthManager authManager;



    @PostConstruct
    private void init(){
        if(this.authProperties.getExcludePaths()!=null){
            this.excludePaths=this.authProperties.getExcludePaths().toArray(new String[this.authProperties.getExcludePaths().size()]);
        }
        else{
            this.excludePaths=new String[0];
        }
        log.warn("excludePaths={}", ArrayUtils.toString(this.excludePaths));
    }


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        String channelInfo = GatewayUtils.getHeader(request, GatewayUtils.HEADER_NAME_CHANNEL_INFO);
        String authInfo = GatewayUtils.getHeader(request, GatewayUtils.HEADER_NAME_AUTH_INFO);
        if(StringUtils.equals(channelInfo,GatewayUtils.AUTH_PASSWORD) || StringUtils.equals(authInfo,GatewayUtils.AUTH_PASSWORD)){
            //带了密码，就不用了
            return chain.filter(exchange);
        }

        //来源验证
        if(this.authProperties.isCheckChannel()){
            AuthInfoEnum channelInfoBO = this.authManager.checkChannelInfo(exchange);
            if(channelInfoBO!= AuthInfoEnum.OK ){
                //不通过
                throw new ResponseStatusException(channelInfoBO.getStatus(),channelInfoBO.getInfo());
            }
        }

        //不需要token验证
        if(!this.authProperties.isCheckToken()){
            return chain.filter(exchange);
        }

        //请求路径不需要token验证
        if(!this.needCheck(exchange)){
            //不需要token校验,直接过
            return chain.filter(exchange);
        }


        //token验证
        AuthInfoEnum tokenInfoBO = this.authManager.checkAuthInfo(exchange);
        if(tokenInfoBO!= AuthInfoEnum.OK ){
            //不通过
            throw new ResponseStatusException(tokenInfoBO.getStatus(),tokenInfoBO.getInfo());
        }

        return chain.filter(exchange);
    }


    protected boolean needCheck(ServerWebExchange exchange){
        if(this.excludePaths==null || this.excludePaths.length==0){
            //所有的路径都要校验
            return true;
        }
        ServerHttpRequest request = exchange.getRequest();
        String path = request.getURI().getPath();
        for(String exPath:this.excludePaths){
            if(this.pathMatcher.match(exPath,path)){
                return false;
            }
        }
        return true;
    }



    @Override
    public int getOrder() {
        return 0;
    }
}
