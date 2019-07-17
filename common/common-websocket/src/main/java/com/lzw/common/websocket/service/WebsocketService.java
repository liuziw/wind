package com.lzw.common.websocket.service;


import com.lzw.common.websocket.dto.MessageDTO;
import com.lzw.common.websocket.dto.MessageToAllDTO;
import com.lzw.common.websocket.dto.MessageToUsersDTO;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/8/20 11:25
 */
public interface WebsocketService {

    /**
     * 向指定的用户或页面发消息
     * @param messageDTO
     */
    void sendMessage(MessageDTO messageDTO);

    /**
     * 向指定的用户群发消息
     * @param messageToUsersDTO
     */
    void sendMessageToUsers(MessageToUsersDTO messageToUsersDTO);

    /**
     * 向所有在线用户群发消息
     * @param messageToAllDTO
     */
    void sendMessageToAll(MessageToAllDTO messageToAllDTO);
}
