package com.lzw.kafka.comsumer;

import com.lzw.kafka.comsumer.event.KafkaConsumerEvent;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

/**
 * @author liys
 * @date 2018/3/1719:55
 */
@Component
public class KafkaEventConsumer {

    private static final Logger logger= LoggerFactory.getLogger(KafkaEventConsumer.class);

    @Autowired
    private ApplicationContext applicationContext;


    @KafkaListener(topicPattern = "${wind.event.kafka.consumer.topicPattern}")
    public void receive(ConsumerRecord<Long,String> record, Acknowledgment ack){
        String topic=record.topic();
        Integer partition=record.partition();
        Long key=record.key();
        String message=record.value();
        KafkaConsumerEvent event=new KafkaConsumerEvent(this,topic,key,partition,message);
        event.setRecord(record);
        logger.info("receive:event={}",event);
        this.applicationContext.publishEvent(event);
    }


}
