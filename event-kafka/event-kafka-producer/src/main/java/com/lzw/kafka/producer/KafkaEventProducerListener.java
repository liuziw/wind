package com.lzw.kafka.producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hyzs.event.kafka.producer.event.KafkaProducerEvent;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


/**
 * @author liys
 * @date 2018/3/1718:54
 */
@Component
public class KafkaEventProducerListener implements ApplicationListener<KafkaProducerEvent> {

    private static final Logger logger= LoggerFactory.getLogger(KafkaEventProducerListener.class);


    private static final ObjectMapper objectMapper=new ObjectMapper();




    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Override
    public void onApplicationEvent(KafkaProducerEvent event) {
        if(event.getKey()==null||StringUtils.isBlank(event.getTopic()) || event.getMessage()==null){
            logger.error("该消息将被忽然，因为Key、主题或消息内容为空:{}",event);
            return;
        }
        String topic=event.getTopic();
        Long key=event.getKey();
        String message=null;
        if(event.getMessage() instanceof String){
            message=(String)event.getMessage();
        }else{
            try {
                message=objectMapper.writeValueAsString(event.getMessage());
            } catch (JsonProcessingException e) {
               logger.error("Json Exception",e);
               return;
            }
        }

        if(StringUtils.isBlank(message)){
            logger.error("该消息将被忽然，因为消息内容为空");
            return;
        }


        if(event.getPartition()==null){
            logger.info("发送kafka消息:topic={},key={},message={}",topic,key,message);
            kafkaTemplate.send(topic,key,message);
            return;
        }
        logger.info("发送kafka消息:topic={},key={},partition={},message={}",topic,key,event.getPartition(),message);
        kafkaTemplate.send(topic,event.getPartition(),key,message);
    }
}
