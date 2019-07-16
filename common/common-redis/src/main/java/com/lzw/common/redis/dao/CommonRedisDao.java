package com.lzw.common.redis.dao;

import java.util.Collection;
import java.util.List;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/9/4 16:43
 */
public interface CommonRedisDao<D,K> {

    void insert(D d);

    void insertList(List<D> list, Class<D> dClass);

    void update(D d);

    void deleteById(K key, Class<D> dClass);

    /**
     * 根据id数组删除
     * @param keys
     */
    void deleteByIds(Class<D> dClass, K... keys);

    /**
     * 根据id数组删除，如果ids为空则不删除
     * @param ids
     */
    void deleteByIds(List<K> ids, Class<D> dClass);

    /**
     * 删除该对象所有缓存
     */
    void deleteAll(Class<D> dClass);

    D getById(K key, Class<D> dClass);

    List<D> listByIds(Collection<K> ids, Class<D> dClass);

    List<D> listByIds(Class<D> dClass, K... keys);
}
