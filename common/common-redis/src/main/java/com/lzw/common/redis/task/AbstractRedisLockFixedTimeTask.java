package com.lzw.common.redis.task;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.concurrent.TimeUnit;

/**
 * 定时任务的抽象.分布式部署时，多个相同的定时任务不能同时跑，这里利用redis的锁解决这个问题.
 */
@Slf4j
public abstract class AbstractRedisLockFixedTimeTask {


    @Autowired
    private StringRedisTemplate redisTemplate;

    public static final Long DEFAULT_KEY_TIMEOUT=10L;


    protected abstract String getRedisKey();

    /**
     * rediskey的过期时间,单位为分钟数
     * @return
     */
    protected Long getKeyTimeout(){
        return DEFAULT_KEY_TIMEOUT;
    }



    protected void schedule(){
        String key=this.getRedisKey();
        log.warn("执行任务,redisKey={}",key);
        ValueOperations<String, String> valueOperations = this.redisTemplate.opsForValue();

        if(valueOperations.setIfAbsent(key,"1")){
            //锁没有被用

            try {
                log.warn("开时执行任务....");
                //先设置过期时间
                this.redisTemplate.expire(key, this.getKeyTimeout().longValue(), TimeUnit.MINUTES);
            }catch (Exception e){
                //就算是失败了，也要执行任务
                log.error("设置redis过期时间失败，任务继续执行....",e);
            }
            finally{
                this.doTask();
                log.warn("任务执行完成....");

                //任务执行完后设置key过期
                this.redisTemplate.delete(key);
            }
        }
        else{
            //锁已经被使用,说明任务已经有其他程序在执行了，其次不执行
            //找到过期时间
            Long expire = this.redisTemplate.getExpire(key, TimeUnit.MINUTES);
            if(expire == null || expire.longValue() < 0L){
                //再设置一次过期时间
                this.redisTemplate.expire(key, this.getKeyTimeout().longValue(), TimeUnit.MINUTES);
            }
            if(expire!=null && expire.longValue()-this.getKeyTimeout().longValue()>0){
                //再设置一次过期时间
                this.redisTemplate.expire(key, this.getKeyTimeout().longValue(), TimeUnit.MINUTES);
            }
            log.warn("此次任务有其他程序在执行");
        }
    }

    protected abstract void doTask();

}
