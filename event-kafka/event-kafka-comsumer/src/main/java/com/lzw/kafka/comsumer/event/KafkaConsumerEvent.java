package com.lzw.kafka.comsumer.event;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.context.ApplicationEvent;

/**
 * @author liys
 * @date 2018/3/1811:41
 */
public class KafkaConsumerEvent extends ApplicationEvent {

    /**
     * 消息的ID
     */
    private Long key;

    /**
     * 主题sss
     */
    private String topic;


    /**
     * 消息内容，一般为序列化之后的json字符串
     */
    private Object message;


    private Integer partition;


    private ConsumerRecord<Long,String> record;




    public KafkaConsumerEvent(Object source, String topic,Long key, Object message) {
        super(source);
        this.topic = topic;
        this.message = message;
        this.key=key;
    }

    public KafkaConsumerEvent(Object source, String topic,Long key, Integer partition, Object message) {
        super(source);
        this.topic = topic;
        this.message = message;
        this.partition = partition;
        this.key=key;
    }

    public String getTopic() {
        return topic;
    }

    public Object getMessage() {
        return message;
    }

    public Integer getPartition() {
        return partition;
    }

    public Long getKey() {
        return key;
    }


    public ConsumerRecord<Long, String> getRecord() {
        return record;
    }

    public void setRecord(ConsumerRecord<Long, String> record) {
        this.record = record;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("KafkaConsumerEvent{");
        sb.append("key='").append(key).append('\'');
        sb.append(",topic='").append(topic).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append(", partition=").append(partition);
        sb.append('}');
        return sb.toString();
    }
}
