package com.lzw.common.cache.manager;

import java.util.Collection;
import java.util.List;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/9/18 10:53
 */
public interface CommonCacheManager<D,K> {
    Integer insert(D d);

    Integer insertList(List<D> list);

    Integer update(D d);

    Integer deleteById(K key);

    /**
     * 根据id数组删除
     * @param keys
     */
    Integer deleteByIds(K... keys);

    /**
     * 根据id数组删除，如果ids为空则不删除
     * @param ids
     */
    Integer deleteByIds(List<K> ids);

    D getById(K key);

    List<D> listByIds(Collection<K> ids);

    List<D> listByIds(K... keys);
}
