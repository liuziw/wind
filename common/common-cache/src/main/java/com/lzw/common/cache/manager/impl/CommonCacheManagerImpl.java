package com.lzw.common.cache.manager.impl;


import com.lzw.common.cache.manager.CommonCacheManager;
import com.lzw.common.core.exception.CommonException;
import com.lzw.common.dao.daomanager.CommonDaoManager;
import com.lzw.common.dao.dto.QueryItemDTO;
import com.lzw.common.dao.util.DaoUtils;
import com.lzw.common.redis.dao.CommonRedisDao;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/9/18 10:55
 */
public abstract class CommonCacheManagerImpl<D,K> implements CommonCacheManager<D,K> {

    protected CommonDaoManager commonDaoManager;

    protected CommonRedisDao commonRedisDao;

    public abstract Class<D> getEntityClass();

    @Override
    @Transactional
    public Integer insert(D d) {
        if(d == null){
            throw CommonException.exception("插入的对象不能为空。");
        }
        int result = commonDaoManager.insertNotNullProperties(d);
        commonRedisDao.insert(d);

        return result;
    }

    @Override
    @Transactional
    public Integer insertList(List<D> list) {
        Class<D> dClass = this.getEntityClass();
        if(dClass == null){
            throw CommonException.exception("需实现getEntityClass返回class。");
        }
        if(CollectionUtils.isEmpty(list)){
            return 0;
        }
        int result = commonDaoManager.insertAllPropertiesList(list);
        commonRedisDao.insertList(list,dClass);

        return result;
    }

    @Override
    @Transactional
    public Integer update(D d) {
        if(d == null){
            throw CommonException.exception("更新的对象不能为空。");
        }
        int result = commonDaoManager.updateNotNullProperties(d);
        commonRedisDao.update(d);

        return result;
    }

    @Override
    @Transactional
    public Integer deleteById(K key) {
        Class<D> dClass = this.getEntityClass();
        if(dClass == null){
            throw CommonException.exception("需实现getEntityClass返回class。");
        }
        if(key == null){
            throw CommonException.exception("id不能为空。");
        }
        int result = commonDaoManager.deleteById(key);
        commonRedisDao.deleteById(key,dClass);

        return result;
    }

    @Override
    @Transactional
    public Integer deleteByIds(K... keys) {
        Class<D> dClass = this.getEntityClass();
        if(dClass == null){
            throw CommonException.exception("需实现getEntityClass返回class。");
        }
        List<K> list = Arrays.asList(keys);
        int result = commonDaoManager.deleteByIds(list);
        commonRedisDao.deleteByIds(dClass,keys);

        return result;
    }

    @Override
    @Transactional
    public Integer deleteByIds(List<K> ids) {
        Class<D> dClass = this.getEntityClass();
        if(dClass == null){
            throw CommonException.exception("需实现getEntityClass返回class。");
        }
        int result = commonDaoManager.deleteByIds(ids);
        commonRedisDao.deleteByIds(ids,dClass);

        return result;
    }

    @Override
    public D getById(K key) {
        Class<D> dClass = this.getEntityClass();
        if(dClass == null){
            throw CommonException.exception("需实现getEntityClass返回class。");
        }
        if(key == null){
            throw CommonException.exception("id不能为空");
        }
        D d = (D)commonRedisDao.getById(key,dClass);
        if(d == null){
            QueryItemDTO idItem = DaoUtils.buildEqualTo("id",key);
            QueryItemDTO isDeletedItem = DaoUtils.buildEqualTo("is_deleted",0);
            List<QueryItemDTO> items = new ArrayList<>();
            items.add(idItem);
            items.add(isDeletedItem);
            List<D> list = commonDaoManager.listByQueryItems(items);
            if(!CollectionUtils.isEmpty(list)){
                d = list.get(0);
                commonRedisDao.insert(d);
            }
        }
        return d;
    }

    @Override
    public List<D> listByIds(Collection<K> ids) {
        Class<D> dClass = this.getEntityClass();
        if(dClass == null){
            throw CommonException.exception("需实现getEntityClass返回class。");
        }
        if(CollectionUtils.isEmpty(ids)){
            throw CommonException.exception("ids不能为空。");
        }
        List<D> list = commonRedisDao.listByIds(ids,dClass);
        if(CollectionUtils.isEmpty(list) || list.size()!= ids.size()){
            QueryItemDTO idItem = DaoUtils.buildIn("id",ids);
            QueryItemDTO isDeletedItem = DaoUtils.buildEqualTo("is_deleted",0);
            List<QueryItemDTO> items = new ArrayList<>();
            items.add(idItem);
            items.add(isDeletedItem);
            list = commonDaoManager.listByQueryItems(items);
            if(!CollectionUtils.isEmpty(list)){
                commonRedisDao.insertList(list,dClass);
            }
        }
        return list;
    }

    @Override
    public List<D> listByIds(K... keys) {
        List<K> list = Arrays.asList(keys);
        return this.listByIds(list);
    }

    public void setCommonDaoManager(CommonDaoManager commonDaoManager) {
        this.commonDaoManager = commonDaoManager;
    }

    public void setCommonRedisDao(CommonRedisDao commonRedisDao) {
        this.commonRedisDao = commonRedisDao;
    }

}
