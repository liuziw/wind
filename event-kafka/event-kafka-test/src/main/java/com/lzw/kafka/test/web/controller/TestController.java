package com.lzw.kafka.test.web.controller;

import com.lzw.kafka.comsumer.event.KafkaConsumerEvent;
import com.lzw.kafka.producer.event.KafkaProducerEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liys
 * @date 2018/3/1810:29
 */
@RestController
public class TestController {

    private long count=System.currentTimeMillis();

    @Autowired
    private ApplicationContext applicationContext;

    @PostMapping("/send")
    public void send(String topic,String message){
        KafkaProducerEvent kafkaEvent=new KafkaProducerEvent(this,topic,this.count++,message);
        this.applicationContext.publishEvent(kafkaEvent);
    }


    @EventListener
    public void listen(KafkaConsumerEvent event){
        System.out.println(event);
    }
}
