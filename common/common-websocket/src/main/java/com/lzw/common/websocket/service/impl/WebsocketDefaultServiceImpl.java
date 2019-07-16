package com.lzw.common.websocket.service.impl;

import com.google.gson.GsonBuilder;
import com.hyzs.gz.common.core.exception.CommonErrorCode;
import com.hyzs.gz.common.core.exception.CommonException;
import com.hyzs.websocket.core.config.WebSocketMessageHandler;
import com.hyzs.websocket.core.dto.MessageDTO;
import com.hyzs.websocket.core.dto.MessageToAllDTO;
import com.hyzs.websocket.core.dto.MessageToUsersDTO;
import com.hyzs.websocket.core.service.WebsocketService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;

import java.io.IOException;
import java.util.Date;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/8/20 19:57
 */
@Service
//@ConditionalOnProperty(value = "hyzs.websocket.kafka.enabled",havingValue = "false",matchIfMissing = true)
@ConditionalOnMissingBean(name = "websocketService")
@Slf4j
public class WebsocketDefaultServiceImpl implements WebsocketService {

    @Autowired
    private WebSocketMessageHandler webSocketMessageHandler;

    /**
     * 向指定的用户或页面发消息
     * @param message
     */
    public void sendMessage(MessageDTO message){
        if(message == null){
            CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"请传入要发送的消息。");
        }
        message.setDate(new Date());
        log.info("handleMessage:",message.toString());

        //1.传了token，即往指定页面发消息
        if(!StringUtils.isEmpty(message.getToken())){
            webSocketMessageHandler.sendMessageToUser(message.getToken(), new TextMessage(new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create().toJson(message)));
        }
        //2.传了接收者id没传token，及发给所有登录了该接收者的页面
        else if(message.getTo() != null && StringUtils.isEmpty(message.getToken())){
            webSocketMessageHandler.sendMessageToClients(message.getTo(),new TextMessage(new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create().toJson(message)));
        }
        //3.缺少接收信息
        else{
            CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"请传入接收者信息");
        }

    }

    /**
     * 向指定的用户群发消息
     * @param message
     */
    public void sendMessageToUsers(MessageToUsersDTO message){
        if(message == null){
            CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"请传入要发送的消息。");
        }
        message.setDate(new Date());
        log.info("handleMessage:",message.toString());
        webSocketMessageHandler.sendMessageToUsers(message.getUserIdList(),new TextMessage(new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create().toJson(message)));
    }

    /**
     * 向所有在线用户群发消息
     * @param message
     */
    public void sendMessageToAll(MessageToAllDTO message){
        if(message == null){
            CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"请传入要发送的消息。");
        }
        message.setDate(new Date());
        log.info("handleMessage:",message.toString());
        try {
            webSocketMessageHandler.broadcast(new TextMessage(new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create().toJson(message)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
