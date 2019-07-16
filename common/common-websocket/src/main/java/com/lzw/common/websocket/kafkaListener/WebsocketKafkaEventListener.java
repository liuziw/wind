package com.lzw.common.websocket.kafkaListener;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.GsonBuilder;
import com.hyzs.event.kafka.comsumer.event.KafkaConsumerEvent;
import com.hyzs.gz.common.core.exception.CommonErrorCode;
import com.hyzs.gz.common.core.exception.CommonException;
import com.hyzs.websocket.core.config.WebSocketMessageHandler;
import com.hyzs.websocket.core.dto.MessageDTO;
import com.hyzs.websocket.core.dto.MessageToAllDTO;
import com.hyzs.websocket.core.dto.MessageToUsersDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;

import java.io.IOException;

/**
 * 监听websocket发往kafka中的消息类
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/8/17 15:51
 */
@Component
@ConditionalOnClass(name = "com.hyzs.event.kafka.comsumer.event.KafkaConsumerEvent")
@Slf4j
public class WebsocketKafkaEventListener implements ApplicationListener<KafkaConsumerEvent>{

    private ObjectMapper objectMapper=new ObjectMapper();

    @Autowired
    private WebSocketMessageHandler webSocketMessageHandler;

    @Override
    public void onApplicationEvent(KafkaConsumerEvent event) {
        String msg = (String)event.getMessage();
        /**
         * 监听websocket发往kafka中的消息，得到消息通过本websocket发往客户端
         */
        //向指定用户或一面发消息
        if(StringUtils.equals(event.getTopic(),"websocket_text_user")){
            try {
                MessageDTO message = objectMapper.readValue(msg,MessageDTO.class);
                if(message == null){
                    CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"messageDTO is null");
                }

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
            } catch (IOException e) {
                e.printStackTrace();
                log.error("WebsocketKafkaDTO 错误", e);
            }
        }
        //向指定用户群群发消息
        else if(StringUtils.equals(event.getTopic(),"websocket_text_users")){
            try {
                MessageToUsersDTO message = objectMapper.readValue(msg, MessageToUsersDTO.class);
                if(message == null){
                    CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"MessageToUsersDTO is null");
                }
                webSocketMessageHandler.sendMessageToUsers(message.getUserIdList(),new TextMessage(new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create().toJson(message)));
            } catch (IOException e) {
                e.printStackTrace();
                log.error("WebsocketKafkaDTO 错误", e);
            }
        }
        //向所有在线用户发消息
        else if(StringUtils.equals(event.getTopic(),"websocket_text_all")){
            try {
                MessageToAllDTO message = objectMapper.readValue(msg,MessageToAllDTO.class);
                if(message == null){
                    CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"MessageToAllDTO is null");
                }
                webSocketMessageHandler.broadcast(new TextMessage(new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create().toJson(message)));
            } catch (IOException e) {
                e.printStackTrace();
                log.error("WebsocketKafkaDTO 错误", e);
            }
        }
    }
}
