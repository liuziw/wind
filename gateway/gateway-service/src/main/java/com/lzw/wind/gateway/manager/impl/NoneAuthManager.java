package com.lzw.wind.gateway.manager.impl;

import com.lzw.wind.gateway.enums.AuthInfoEnum;
import com.lzw.wind.gateway.manager.AuthManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

@Component
@ConditionalOnProperty(value = "lzw.wind.auth.type",havingValue = "NONE")
@Slf4j
public class NoneAuthManager implements AuthManager {

    @Override
    public AuthInfoEnum checkChannelInfo(ServerWebExchange exchange) {
        log.warn("没有做权限的校验...");
        return AuthInfoEnum.OK;
    }

    @Override
    public AuthInfoEnum checkAuthInfo(ServerWebExchange exchange) {
        log.warn("没有做权限的校验...");
        return AuthInfoEnum.OK;
    }
}
