package com.lzw.common.websocket.service.impl;

import com.hyzs.event.kafka.producer.event.KafkaProducerEvent;
import com.hyzs.gz.common.core.exception.CommonErrorCode;
import com.hyzs.gz.common.core.exception.CommonException;
import com.hyzs.gz.common.core.manager.IdManager;
import com.hyzs.websocket.core.dto.MessageDTO;
import com.hyzs.websocket.core.dto.MessageToAllDTO;
import com.hyzs.websocket.core.dto.MessageToUsersDTO;
import com.hyzs.websocket.core.service.WebsocketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;

import java.util.Date;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/8/20 11:28
 */
//创建注解EnableKafkaWebsocket来注入WebsocketKafkaServiceImpl，因此注释了下面的两个注解
//@Service
//@ConditionalOnProperty(value = "hyzs.websocket.kafka.enabled",havingValue = "true")
@Slf4j
@Primary
public class WebsocketKafkaServiceImpl implements WebsocketService {


    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private IdManager idManager;

    /**
     * 向指定的用户或页面发消息
     * @param messageDTO
     */
    public void sendMessage(MessageDTO messageDTO){
        if(messageDTO == null){
            CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"请传入要发送的消息。");
        }
        messageDTO.setDate(new Date());
        log.info("handleMessage:",messageDTO.toString());
        /**
         * 将消息发往kafka中，解决websocket负载均衡不知道websocke在哪个节点的问题
         */
        KafkaProducerEvent kafkaEvent = new KafkaProducerEvent(this,"websocket_text_user",idManager.createId(),messageDTO);
        this.applicationContext.publishEvent(kafkaEvent);
    }

    /**
     * 向指定的用户群发消息
     * @param messageToUsersDTO
     */
    public void sendMessageToUsers(MessageToUsersDTO messageToUsersDTO){
        if(messageToUsersDTO == null){
            CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"请传入要发送的消息。");
        }
        messageToUsersDTO.setDate(new Date());
        log.info("handleMessage:",messageToUsersDTO.toString());
        /**
         * 将消息发往kafka中，解决websocket负载均衡不知道websocke在哪个节点的问题
         */
        KafkaProducerEvent kafkaEvent = new KafkaProducerEvent(this,"websocket_text_users",idManager.createId(),messageToUsersDTO);
        this.applicationContext.publishEvent(kafkaEvent);
    }

    /**
     * 向所有在线用户群发消息
     * @param messageToAllDTO
     */
    public void sendMessageToAll(MessageToAllDTO messageToAllDTO){
        if(messageToAllDTO == null){
            CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"请传入要发送的消息。");
        }
        messageToAllDTO.setDate(new Date());
        log.info("handleMessage:",messageToAllDTO.toString());
        /**
         * 将消息发往kafka中，解决websocket负载均衡不知道websocke在哪个节点的问题
         */
        KafkaProducerEvent kafkaEvent = new KafkaProducerEvent(this,"websocket_text_all",idManager.createId(),messageToAllDTO);
        this.applicationContext.publishEvent(kafkaEvent);
    }
}
