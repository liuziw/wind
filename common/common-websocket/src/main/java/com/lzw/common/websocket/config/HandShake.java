
package com.lzw.common.websocket.config;

import com.hyzs.gz.common.core.exception.CommonErrorCode;
import com.hyzs.gz.common.core.exception.CommonException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import java.util.Map;


/**
 * Socket建立连接（握手）和断开
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/7/20 16:30
 */
@Slf4j
public class HandShake implements HandshakeInterceptor {

	public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {
		if (request instanceof ServletServerHttpRequest) {
			ServletServerHttpRequest servletRequest = (ServletServerHttpRequest) request;
			if(servletRequest.getServletRequest().getParameter("userId") == null){
				CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE,"请传入userId");
			}
			if(servletRequest.getServletRequest().getParameter("token") == null){
				CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE,"请传入token");
			}
			Long userId = Long.valueOf(servletRequest.getServletRequest().getParameter("userId"));
			String token = servletRequest.getServletRequest().getParameter("token");
			log.info("beforeHandshake:",userId+"连上了websocket");

			/**
			 * 将用户及服务信息放入redis中，当给某个客户端发消息时，可以在reids中查看用户服务信息,
			 * 确定所要发送到客户端连接的websocket服务和当前服务是不是同一个服务，
			 * 若在同一个服务则直接发消息，若不在则发到kafka，kafka消息中包含要接收消息的用户和所要发送的消息，
			 * kafka的topic中放入接收者所在服务的端口，订阅了该kafka消息的服务可以收到该消息，然后像客户端发消息。
			 */
			// 标记用户
			if(userId!=null){
				attributes.put("userId", userId);
				attributes.put("token", token);
			}else{
				return false;
			}
		}
		return true;
	}

	public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Exception exception) {

	}

}
