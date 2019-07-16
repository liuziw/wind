package com.lzw.common.core.manager;

/**
 *
 * ID的生成器
 * @author liys
 * @date 2018/3/279:16
 */
public interface IdManager {


    /**
     * 生成一个id，每次调用都是唯一的
     * @return
     */
    public Long createId();


    /**
     *  生成一个id，每次调用相同Key的情况下都是唯一的
     * @param key
     * @return
     */
    public Long createId(String key);

}
