package com.lzw.common.redis.dao.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lzw.common.core.exception.CommonErrorCode;
import com.lzw.common.core.exception.CommonException;
import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.redis.dao.CommonRedisDao;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.util.*;
import java.util.function.Function;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/9/4 16:44
 */
public class CommonRedisDaoImpl<D,K> implements CommonRedisDao<D,K> {
    private Function<D,K> idGetter;


    private String redisKey;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private StringRedisTemplate redisTemplate;

    final private String BASE_KEY = "wind:table:";

    public CommonRedisDaoImpl() {
        this.idGetter=d-> (K)  CommonUtils.getFieldValue(d,"id");
    }

    public CommonRedisDaoImpl(String idFieldName) {
        this.idGetter=d-> (K) CommonUtils.getFieldValue(d,idFieldName);
    }

    public CommonRedisDaoImpl(Function<D, K> idGetter) {
        this.idGetter = idGetter;
    }

    @Override
    public void insert(D d) {
        if(d == null){
            return;
        }
        String redisKey=getReidsKey((Class<D>)d.getClass());
        K key=idGetter.apply(d);
        if(key == null){
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE,"id不能为空。");
        }
        String keyString = key.toString();
        String value = "";
        try {
            value = objectMapper.writeValueAsString(d);
        } catch (JsonProcessingException e) {
            throw CommonException.exception("writeValueAsString转换失败。");
        }
        //先删除
        redisTemplate.opsForHash().delete(redisKey,keyString);
        //再存入
        redisTemplate.opsForHash().put(redisKey,keyString,value);
    }

    @Override
    public void insertList(List<D> list,Class<D> dClass){
        if(dClass == null){
            throw CommonException.exception("需实现getEntityClass返回class。");
        }
        if(CollectionUtils.isEmpty(list)){
            return;
        }
        String redisKey = getReidsKey(dClass);
        Map<String,String> map = new HashMap<>();
        String [] keys = new String[list.size()];
        for(int i=0;i<list.size();i++){
            if(list.get(i) != null){
                Object objectKey = CommonUtils.getFieldValue(list.get(i),"id");
                if(objectKey != null){
                    String value = "";
                    try {
                        value = objectMapper.writeValueAsString(list.get(i));
                    } catch (JsonProcessingException e1) {
                        throw CommonException.exception("writeValueAsString转换失败。");
                    }
                    map.put(objectKey.toString(),value);
                    keys[i] = objectKey.toString();
                }
            }
        }
        if(!CollectionUtils.isEmpty(map)){
            // 先删除
            redisTemplate.opsForHash().delete(redisKey,keys);
            //再插入
            redisTemplate.opsForHash().putAll(redisKey,map);
        }

    }

    @Override
    public void update(D d) {
        this.insert(d);
    }

    @Override
    public void deleteById(K key,Class<D> dClass) {
        if(dClass == null){
            throw CommonException.exception("需实现getEntityClass返回class。");
        }
        if(key == null){
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE,"id不能为空。");
        }
        String redisKey = getReidsKey(dClass);
        String keyString = key.toString();
        redisTemplate.opsForHash().delete(redisKey,keyString);
    }

    @Override
    public void deleteByIds(Class<D> dClass,K... keys) {
        List<K> list = Arrays.asList(keys);
        this.deleteByIds(list,dClass);
    }

    @Override
    public void deleteByIds(List<K> ids,Class<D> dClass){
        if(CollectionUtils.isEmpty(ids)){
            return;
        }
        if(dClass == null){
            throw CommonException.exception("需实现getEntityClass返回class。");
        }
        String[] keys = new String[ids.size()];
        for(int i=0;i<ids.size();i++){
            if(ids.get(i) != null){
                keys[i] = ids.get(i).toString();
            }
        }
        String redisKey = getReidsKey(dClass);
        redisTemplate.opsForHash().delete(redisKey,keys);
    }

    @Override
    public void deleteAll(Class<D> dClass){
        if(dClass == null){
            throw CommonException.exception("需实现getEntityClass返回class。");
        }
        String redisKey = getReidsKey(dClass);
        redisTemplate.opsForHash().delete(redisKey);
    }

    @Override
    public D getById(K key,Class<D> dClass){
        if(dClass == null){
            throw CommonException.exception("需实现getEntityClass返回class。");
        }
        String redisKey = getReidsKey(dClass);
        if(key == null){
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE,"id不能为空。");
        }
        String keyString = key.toString();
        String value = (String)redisTemplate.opsForHash().get(redisKey,keyString);
        if(value != null){
            try {
                return objectMapper.readValue(value,dClass);
            } catch (IOException e) {
                throw CommonException.exception("objectMapper.readValue转换失败。");
            }
        }
        return null;
    }

    @Override
    public List<D> listByIds(Collection<K> ids,Class<D> dClass) {
        if(dClass == null){
            throw CommonException.exception("需实现getEntityClass返回class。");
        }
        if(CollectionUtils.isEmpty(ids)){
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE,"ids不能为空。");
        }
        String redisKey = getReidsKey(dClass);
        Collection<Object> hashKeys = new ArrayList<>();
        ids.forEach(e->{
            if(e != null){
                hashKeys.add(e.toString());
            }
        });
        List<Object> valueList = redisTemplate.opsForHash().multiGet(redisKey,hashKeys);
        return createDList(valueList,dClass);
    }

    @Override
    public List<D> listByIds(Class<D> dClass,K... keys) {
        List<K> list = Arrays.asList(keys);
        return this.listByIds(list,dClass);
    }

    private List<D> createDList(List<Object> valueList,Class<D> dClass) {
        if(!CollectionUtils.isEmpty(valueList)){
            List<D> dList = new ArrayList<>();
            valueList.forEach(e->{
                D d = null;
                try {
                    if(e != null){
                        d = objectMapper.readValue((String) e,dClass);
                        dList.add(d);
                    }
                } catch (IOException e1) {
                    throw CommonException.exception("objectMapper.readValue转换失败。");
                }
            });
            return dList;
        }
        return null;
    }

    protected String getReidsKey(Class<D> clazz) {
        if (!StringUtils.isBlank(this.redisKey)) {
            return this.redisKey;
        }

        if (clazz == null) {
            throw new RuntimeException();
        }

        this.redisKey = BASE_KEY + clazz.getSimpleName();
        return this.redisKey;
    }

    /*private Class<D> getTClass() {
        ClassUtil<D> classUtil = new ClassUtil<D>(){};
        return classUtil.getTClass();
    }*/

}