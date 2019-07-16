package com.lzw.common.websocket.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/10/11 9:34
 */
@Configuration
@Slf4j
public class WebSocketHandlerConfig {

    @Bean
    @ConditionalOnMissingBean
    public WebSocketMessageHandler defaultWebSocketHandler(){
        WebSocketDefaultHandler webSocketDefaultHandler=new WebSocketDefaultHandler();
        log.warn("defaultWebSocketHandler={}",webSocketDefaultHandler);
        return webSocketDefaultHandler;
    }


}
