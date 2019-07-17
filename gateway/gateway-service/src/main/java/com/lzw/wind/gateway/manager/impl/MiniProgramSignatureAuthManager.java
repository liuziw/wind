package com.lzw.wind.gateway.manager.impl;

import com.lzw.wind.gateway.enums.AuthInfoEnum;
import com.lzw.wind.gateway.util.GatewayUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

@Slf4j
@Component
@ConditionalOnProperty(value = "lzw.wind.auth.type",havingValue = "MINI_PROGRAM_SIGNATURE")
public class MiniProgramSignatureAuthManager extends AbstractAuthManager {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public AuthInfoEnum checkAuthInfo(ServerWebExchange exchange) {
        AuthInfoEnum fileServiceAuthInfoBO = this.checkFileService(exchange);
        if(fileServiceAuthInfoBO!=null){
            //文件服务校验通过
            return fileServiceAuthInfoBO;
        }
        ServerHttpRequest request = exchange.getRequest();
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
        if(!this.checkToken(token)){
            log.warn("X-Auth-Info校验失败");
            return AuthInfoEnum.CHECK_TOKEN_ERROR;
        }
        if(!this.checkXAuthInfo(token,value,key,signature)){
            log.warn("X-Auth-Info校验失败");
            return AuthInfoEnum.CHECK_TOKEN_ERROR;
        }
        return AuthInfoEnum.OK;
    }

    protected boolean checkToken(String token){
        String date=StringUtils.substringBefore(token,"-");
        String key=GatewayUtils.MINI_PROGRAM_TOKEN_KEY+date;
        Object o = this.stringRedisTemplate.opsForHash().get(key, token);
        //有token
        return o!=null;
    }

    @Override
    protected boolean checkToken(ServerWebExchange exchange, String token) {
        return this.checkToken(token);
    }
}
