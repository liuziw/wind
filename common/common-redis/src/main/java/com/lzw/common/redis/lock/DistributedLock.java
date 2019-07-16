package com.lzw.common.redis.lock;

/**
 *
 * Redis实现分布式锁
 * @author liys
 * @date 2018/3/2910:47
 */
public interface DistributedLock {

    /**
     * 最大等待时间
     */
    public static final int DEFAULT_WAIT_TIMEOUT=10;

    /**
     * 持有锁的最长时间
     */
    public static final int LOCK_TIMEOUT=10;


    /**
     * 通过key获取一个锁，注意key为锁的最小颗粒度
     * @param key
     * @return
     */
    public String lock(String key) throws InterruptedException;


    /**
     * 通过key获取一个锁，注意key为锁的最小颗粒度
     * @param key
     * @return
     */
    public String lock(String key, int waitTimeout) throws InterruptedException;

    /**
     * 通过key获取一个锁，注意key为锁的最小颗粒度。
     * <PRE>
     *    如果到时间没有获取到锁，返回null,
     * </PRE>
     * @param key
     * @return
     */
    public String lock(String key, int waitTimeout, int lockTimeout) throws InterruptedException;


    /**
     * 释放锁
     * @param key
     * @param lockedID
     */
    public void release(String key, String lockedID);




}
