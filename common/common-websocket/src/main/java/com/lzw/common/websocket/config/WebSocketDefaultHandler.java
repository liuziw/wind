package com.lzw.common.websocket.config;

import com.lzw.common.core.exception.CommonErrorCode;
import com.lzw.common.core.exception.CommonException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;
import org.springframework.web.socket.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Socket处理器
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/7/20 16:30
 */
@Slf4j
public class WebSocketDefaultHandler implements WebSocketMessageHandler {
	//用于保存HttpSession与WebSocketSession的映射关系
	public static final Map<String, WebSocketSession> userSocketSessionMap;
	//用户保存登录用户与页面token的关系,一个用户可能登录多个界面
	public static final Map<Long, List<String>> userTokenMap;
	
	static {
		userSocketSessionMap = new ConcurrentHashMap<>();
		userTokenMap = new ConcurrentHashMap<>();
	}
	
	/**
	 * 建立连接后,把登录用户的id写入WebSocketSession
	 */
	public void afterConnectionEstablished(WebSocketSession session)
			throws Exception {
		Long userId = (Long)session.getAttributes().get("userId");
		String token = (String)session.getAttributes().get("token");
		if (userSocketSessionMap.get(token) == null) {
			userSocketSessionMap.put(token, session);
			//将uid用户的token都放入map中
			if(userTokenMap.get(userId) == null){
				List<String> tokenList = new ArrayList<>();
				tokenList.add(token);
				userTokenMap.put(userId,tokenList);
			}else {
				List<String> tokenList = userTokenMap.get(userId);
				tokenList.add(token);
				userTokenMap.put(userId,tokenList);
			}
		}
	}

	/**
	 * 消息处理，在客户端通过Websocket API发送的消息会经过这里，然后进行相应的处理
	 */
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
		/*if(message.getPayloadLength()==0){
			return;
		}
		MessageDTO msg=new Gson().fromJson(message.getPayload().toString(),MessageDTO.class);
		log.info("handleMessage:",msg.toString());
		*//**
		 * 将消息发往kafka中，解决websocket负载均衡不知道websocke在哪个节点的问题
		 *//*
		KafkaProducerEvent kafkaEvent = new KafkaProducerEvent(this,"websocket_user_text",idManager.createId(),msg);
		this.applicationContext.publishEvent(kafkaEvent);*/

	}

	/**
	 * 消息传输错误处理
	 */
	public void handleTransportError(WebSocketSession session,
			Throwable exception) throws Exception {
		if (session.isOpen()) {
			session.close();
		}
		Iterator<Entry<String, WebSocketSession>> it = userSocketSessionMap.entrySet().iterator();
		// 移除当前抛出异常用户的Socket会话
		while (it.hasNext()) {
			Entry<String, WebSocketSession> entry = it.next();
			if (entry.getValue().getId().equals(session.getId())) {
				userSocketSessionMap.remove(entry.getKey());
				break;
			}
		}
	}

	/**
	 * 关闭连接后
	 */
	public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
		System.out.println("Websocket:" + session.getId() + "已经关闭");
		Iterator<Entry<String, WebSocketSession>> it = userSocketSessionMap.entrySet().iterator();
		// 移除当前用户的Socket会话
		while (it.hasNext()) {
			Entry<String, WebSocketSession> entry = it.next();
			if (entry.getValue().getId().equals(session.getId())) {
				userSocketSessionMap.remove(entry.getKey());
				break;
			}
		}
	}

	public boolean supportsPartialMessages() {
		return false;
	}

	/**
	 * 给所有在线用户发送消息
	 * @param message
	 * @throws IOException
	 */
	public void broadcast(final TextMessage message) throws IOException {
		Iterator<Entry<String, WebSocketSession>> it = userSocketSessionMap.entrySet().iterator();
		//多线程群发
		while (it.hasNext()) {
			final Entry<String, WebSocketSession> entry = it.next();
			if (entry.getValue().isOpen()) {
				new Thread(new Runnable() {
					public void run() {
						try {
							if (entry.getValue().isOpen()) {
								entry.getValue().sendMessage(message);
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}).start();
			}
		}
	}

	/**
	 * 给某个页面发送消息
	 * 
	 * @param token
	 * @param message
	 * @throws IOException
	 */
	public void sendMessageToUser(String token, TextMessage message) {
		WebSocketSession session = userSocketSessionMap.get(token);
		if (session != null && session.isOpen()) {
			try {
				session.sendMessage(message);
			} catch (IOException e) {
				e.printStackTrace();
				CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE,"发送websocket消息出错。");
			}
		}
	}

	/**
	 * 给指定用户的所有登录页面群发消息
	 * @param userId
	 * @param message
	 */
	public void sendMessageToClients(Long userId,TextMessage message){
		Map<Long,List<String>> userTokenMap = WebSocketDefaultHandler.userTokenMap;
		List<String> tokenList = userTokenMap.get(userId);
		for(String token : tokenList){
			this.sendMessageToUser(token,message);
		}
	}


	/**
	 * 给指定用户群的所有登录页面群发消息
	 * @param userIdList
	 * @param message
	 */
	public void sendMessageToUsers(List<Long> userIdList,TextMessage message){
		if(CollectionUtils.isEmpty(userIdList)){
			return;
		}
		for (Long userId : userIdList){
			sendMessageToClients(userId,message);
		}
	}

}
