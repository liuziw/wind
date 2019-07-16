package com.lzw.common.websocket.config;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;

import java.io.IOException;
import java.util.List;

/**
 *继承WebSocketHandler接口，
 *并添加了向客户端发送消息的方法
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/10/11 9:11
 */
public interface WebSocketMessageHandler extends WebSocketHandler {

    /**
     * 给所有在线用户发送消息
     * @param message
     * @throws IOException
     */
    void broadcast(final TextMessage message) throws IOException;

    /**
     * 给某个页面发送消息
     *
     * @param token 客户端生成的一个token,
     *               由此来确定是哪一个页面
     * @param message
     * @throws IOException
     */
    void sendMessageToUser(String token, TextMessage message);

    /**
     * 给指定用户的所有登录页面群发消息
     * @param userId 客户端传入的userId,一个user可能在多个页面连接
     * @param message
     */
    void sendMessageToClients(Long userId, TextMessage message);

    /**
     * 给指定用户群的所有登录页面群发消息
     * @param userIdList
     * @param message
     */
    void sendMessageToUsers(List<Long> userIdList, TextMessage message);
}
