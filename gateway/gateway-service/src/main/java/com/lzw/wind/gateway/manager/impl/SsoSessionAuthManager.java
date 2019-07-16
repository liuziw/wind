package com.lzw.wind.gateway.manager.impl;

import com.hyzs.gateway.enums.AuthInfoEnum;
import com.hyzs.gateway.util.GatewayUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebSession;

import java.util.Map;

@Slf4j
@Component
@ConditionalOnProperty(value = "hyzs.auth.type",havingValue = "LOGIN")
public class SsoSessionAuthManager extends AbstractAuthManager {


    @Override
    public AuthInfoEnum checkAuthInfo(ServerWebExchange exchange) {
        AuthInfoEnum fileServiceAuthInfoBO = this.checkFileService(exchange);
        if(fileServiceAuthInfoBO!=null){
            //文件服务校验通过
            return fileServiceAuthInfoBO;
        }
        return this.checkSession(exchange);
    }


    /**
     * 统一鉴权的session校验
     * @param exchange
     * @return
     */
    public AuthInfoEnum checkSession(ServerWebExchange exchange){
        ServerHttpRequest request = exchange.getRequest();
        WebSession session = exchange.getSession().block();

        Map<String,Object> userInfoMap=(Map<String,Object>)session.getAttribute(GatewayUtils.USER_INFO_KEY);
        //未登陆
        if(userInfoMap==null){
            return AuthInfoEnum.USER_NOT_LOGIN;
        }



        String authInfo=GatewayUtils.getHeader(request,"X-Auth-Info");
        String[] infos= StringUtils.split(authInfo,",");
        if(infos==null || infos.length!=3){
            //必须是三个
            log.warn("X-Auth-Info信息不合法");
            return AuthInfoEnum.CHECK_TOKEN_ERROR;
        }

        String value=infos[0];
        String key=infos[1];
        String signature=infos[2];


        //对token进行校验
        String token=GatewayUtils.getHeader(request,"X-Token");
        if(!StringUtils.equals(token,(String)userInfoMap.get("token"))){
            //token与之前的不一致
            //TODO 可能是同时登陆多个账号导致的
            log.warn("X-Token值非法");
            return AuthInfoEnum.CHECK_TOKEN_ERROR;
        }

        if(!this.checkXAuthInfo(token,value,key,signature)){
            log.warn("X-Auth-Info校验失败");
            return AuthInfoEnum.CHECK_TOKEN_ERROR;
        }
        return AuthInfoEnum.OK;
    }


    @Override
    protected boolean checkToken(ServerWebExchange exchange,String token) {
        WebSession session = exchange.getSession().block();
        Map<String,Object> userInfoMap=(Map<String,Object>)session.getAttribute(GatewayUtils.USER_INFO_KEY);
        //未登陆
        if(userInfoMap==null){
            return false;
        }
        if(!StringUtils.equals(token,(String)userInfoMap.get("token"))){
            //token与之前的不一致
            //TODO 可能是同时登陆多个账号导致的
            log.warn("X-Token值非法");
            return false;
        }
        return true;
    }
}
