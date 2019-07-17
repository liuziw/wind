package com.lzw.common.redis.lock.impl;

import com.lzw.common.core.exception.CommonErrorCode;
import com.lzw.common.core.exception.CommonException;
import com.lzw.common.redis.lock.DistributedLock;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author liys
 * @date 2018/3/2914:04
 */
@Component
public class DistributedLockImpl implements DistributedLock {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public String lock(String key) throws InterruptedException {
        return null;
    }

    @Override
    public String lock(String key, int waitTimeout) throws InterruptedException {
        return null;
    }

    @Override
    public String lock(String key, int waitTimeout, int lockTimeout) throws InterruptedException {
        if(StringUtils.isBlank(key)){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"key不能为空");
        }
        if(waitTimeout<0){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"waitTimeout不能小于0");
        }
        if(lockTimeout<0){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"lockTimeout不能小于0");
        }
        return null;
    }

    @Override
    public void release(String key, String lockedID) {

    }
}
