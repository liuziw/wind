package com.lzw.common.websocket.annotation;

import com.lzw.common.websocket.service.impl.WebsocketKafkaServiceImpl;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/8/27 20:15
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(WebsocketKafkaServiceImpl.class)
public @interface EnableKafkaWebsocket {
}
