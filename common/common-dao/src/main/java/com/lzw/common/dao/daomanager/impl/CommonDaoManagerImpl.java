package com.lzw.common.dao.daomanager.impl;

import com.google.common.collect.Lists;
import com.hyzs.gz.common.core.bo.PageBO;
import com.hyzs.gz.common.core.exception.CommonErrorCode;
import com.hyzs.gz.common.core.exception.CommonException;
import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.gz.common.dao.daomanager.CommonDaoManager;
import com.hyzs.gz.common.dao.dto.PageQueryItemDTO;
import com.hyzs.gz.common.dao.dto.QueryItemDTO;
import com.hyzs.gz.common.dao.manager.DOChecker;
import com.hyzs.gz.common.dao.mapper.CommonMapper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.function.Function;

public class CommonDaoManagerImpl<D,K> implements CommonDaoManager<D,K> {

    private static final Logger logger= LoggerFactory.getLogger(CommonDaoManagerImpl.class);

    private static final String[] EMPTY_NAME=new String[]{};

    protected CommonMapper<D,K> commonMapper;

    protected Map<String,String> fieldNameMap;

    @Autowired(required = false)
    protected DOChecker doChecker;



    protected void setFieldNameMap(Map<String, String> fieldNameMap) {
        this.fieldNameMap = Collections.unmodifiableMap(fieldNameMap);
    }

    protected void setCommonMapper(CommonMapper<D, K> commonMapper) {
        this.commonMapper = commonMapper;
    }


    protected String[] javaFieldNames2DataBaseNames(String[] javaFieldNames){
        if(javaFieldNames==null){
            return EMPTY_NAME;
        }
        if(javaFieldNames.length==0){
            return EMPTY_NAME;
        }
        String[] dataBaseNames=new String[javaFieldNames.length];
        for(int i=0;i<javaFieldNames.length;i++){
            String dataBaseName=this.fieldNameMap.get(javaFieldNames[i]);
            if(StringUtils.isBlank(dataBaseName)){
                throw CommonException.exception("字段不存在["+javaFieldNames[i]+"]");
            }
            dataBaseNames[i]=dataBaseName;
        }
        return dataBaseNames;
    }

    protected void checkQueryItems(List<QueryItemDTO> queryItemDTOS){
        if(!CollectionUtils.isEmpty(queryItemDTOS)){
            for(QueryItemDTO item:queryItemDTOS){
                String dbName=this.fieldNameMap.get(item.getFieldName());
                if(StringUtils.isBlank(dbName)){
                    throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"字段不存在："+item.getFieldName());
                }
                item.setFieldName(dbName);
            }
        }
    }

    @Override
    public List<D> listAll() {
        return this.commonMapper.listAll();
    }

    @Override
    public Map<K, D> mapAll() {
        return this.commonMapper.mapAll();
    }

    @Override
    public D getById(K id, String... fieldNames) {
        return this.commonMapper.getById(id,this.javaFieldNames2DataBaseNames(fieldNames));
    }

    @Override
    public List<D> listByIds(Collection<K> ids, String... fieldNames) {
        if(CollectionUtils.isEmpty(ids)){
            return new ArrayList<>();
        }
        return this.commonMapper.listByIds(ids,this.javaFieldNames2DataBaseNames(fieldNames));
    }

    @Override
    public Map<K, D> mapByIds(Collection<K> ids, String... fieldNames) {
        if(CollectionUtils.isEmpty(ids)){
            return new HashMap<>(0);
        }
        return this.commonMapper.mapByIds(ids,this.javaFieldNames2DataBaseNames(fieldNames));
    }

    @Override
    public Integer deleteById(K id) {
        if(id==null){
            throw CommonException.exception("id不能为空");
        }
        return this.commonMapper.deleteById(id);
    }

    @Override
    public Integer deleteByIds(Collection<K> ids) {
        if(CollectionUtils.isEmpty(ids)){
            logger.warn("ids is empty");
            return 0;
        }
        return this.commonMapper.deleteByIds(ids);
    }

    @Override
    public Integer updateAllProperties(D d) {
        if(d==null){
            throw CommonException.exception("更新的对象不能为空");
        }
        if (doChecker != null){
            this.doChecker.checkWhenModify(d);
        }
        return this.commonMapper.updateAllProperties(d);
    }

    @Override
    public Integer updateNotNullProperties(D d) {
        if(d==null){
            throw CommonException.exception("更新的对象不能为空");
        }
        if (doChecker != null){
            this.doChecker.checkWhenModify(d);
        }
        return this.commonMapper.updateNotNullProperties(d);
    }

    @Override
    public Integer insertAllProperties(D d) {
        if(d==null){
            throw CommonException.exception("插入的对象不能为空");
        }
        if (doChecker != null){
            this.doChecker.checkWhenAdd(d);
        }
        return this.commonMapper.insertAllProperties(d);
    }

    @Override
    public Integer insertNotNullProperties(D d) {
        if(d==null){
            throw CommonException.exception("插入的对象不能为空");
        }
        if (doChecker != null){
            this.doChecker.checkWhenAdd(d);
        }
        return this.commonMapper.insertNotNullProperties(d);
    }

    @Override
    public Integer insertAllPropertiesList(List<D> list) {
        if(CollectionUtils.isEmpty(list)){
            logger.warn("ids is empty");
            return 0;
        }
        for (D d:list) {
            if (doChecker != null) {
                this.doChecker.checkWhenAdd(d);
            }
        }
        return this.commonMapper.insertAllPropertiesList(list);
    }


    @Override
    public List<D> listByProperty(String propertyName, Object value, String... fieldNames) {
        String dataBaseName=this.fieldNameMap.get(propertyName);
        if(StringUtils.isBlank(dataBaseName)){
            throw CommonException.exception("字段不存在["+propertyName+"]");
        }
        return this.commonMapper.listByProperty(dataBaseName,value,this.javaFieldNames2DataBaseNames(fieldNames));
    }

    @Override
    public Integer countByProperty(String propertyName, Object value) {
        String dataBaseName=this.fieldNameMap.get(propertyName);
        if(StringUtils.isBlank(dataBaseName)){
            throw CommonException.exception("字段不存在["+propertyName+"]");
        }
        return this.commonMapper.countByProperty(dataBaseName,value);
    }

    @Override
    public Map<K, D> mapByProperty(String propertyName, Object value, String... fieldNames) {
        String dataBaseName=this.fieldNameMap.get(propertyName);
        if(StringUtils.isBlank(dataBaseName)){
            throw CommonException.exception("字段不存在["+propertyName+"]");
        }
        return this.commonMapper.mapByProperty(dataBaseName,value,this.javaFieldNames2DataBaseNames(fieldNames));
    }

    @Override
    public List<D> listByProperties(String[] propertyNames, Object[] values, String... fieldNames) {
        return this.commonMapper.listByProperties(this.javaFieldNames2DataBaseNames(propertyNames),values,this.javaFieldNames2DataBaseNames(fieldNames));
    }

    @Override
    public Integer countByProperties(String[] propertyNames, Object[] values) {
        return this.commonMapper.countByProperties(this.javaFieldNames2DataBaseNames(propertyNames),values);
    }

    @Override
    public Map<K,D> mapByProperties(String[] propertyNames, Object[] values, String... fieldNames) {
        return this.commonMapper.mapByProperties(this.javaFieldNames2DataBaseNames(propertyNames),values,this.javaFieldNames2DataBaseNames(fieldNames));
    }

    @Override
    public List<D> listByQueryItems(List<QueryItemDTO> items, String... fieldNames) {
        this.checkQueryItems(items);
        return this.commonMapper.listByQueryItems(items,this.javaFieldNames2DataBaseNames(fieldNames));
    }


    @Override
    public Integer countByQueryItems(List<QueryItemDTO> items) {
        this.checkQueryItems(items);
        return this.commonMapper.countByQueryItems(items);
    }

    @Override
    public Map<K, D> mapByQueryItems(List<QueryItemDTO> items, String... fieldNames) {
        this.checkQueryItems(items);
        return this.commonMapper.mapByQueryItems(items,this.javaFieldNames2DataBaseNames(fieldNames));
    }

    @Override
    public <T> Map<T, List<D>> groupingByQueryItems(List<QueryItemDTO> items, Function<D, T> mapper, String... fieldNames) {
        this.checkQueryItems(items);
        return this.commonMapper.groupingByQueryItems(items,mapper,this.javaFieldNames2DataBaseNames(fieldNames));
    }

    @Override
    public PageBO<D> pageQuery(PageQueryItemDTO pageQueryItemDTO) {
        if(pageQueryItemDTO==null){
            throw CommonException.exception("pageQueryItemDTO can not be null");
        }
        if(pageQueryItemDTO.getPageSize()==null || pageQueryItemDTO.getPageSize()<=0){
            throw CommonException.exception("pageSize is null or <0");
        }
        if(pageQueryItemDTO.getCurrPage()==null || pageQueryItemDTO.getCurrPage()<=0){
            throw CommonException.exception("currPage is null or <=0");
        }
        this.checkQueryItems(pageQueryItemDTO.getQueryItems());
        return this.commonMapper.pageQuery(pageQueryItemDTO);
    }


    @Override
    public Integer updateAllFieldsByProperty(D d, String propertyName, Object value) {
        String dataBaseName=this.fieldNameMap.get(propertyName);
        if(StringUtils.isBlank(dataBaseName)){
            throw CommonException.exception("字段不存在["+propertyName+"]");
        }
        if (doChecker != null){
            this.doChecker.checkWhenModify(d);
        }
        return this.commonMapper.updateAllFieldsByProperty(d,dataBaseName,value);
    }

    @Override
    public Integer updateNotNullFieldsByProperty(D d, String propertyName, Object value) {
        String dataBaseName=this.fieldNameMap.get(propertyName);
        if(StringUtils.isBlank(dataBaseName)){
            throw CommonException.exception("字段不存在["+propertyName+"]");
        }
        if (doChecker != null){
            this.doChecker.checkWhenModify(d);
        }
        return this.commonMapper.updateNotNullFieldsByProperty(d,dataBaseName,value);
    }

    @Override
    public Integer deleteByProperty(String propertyName, Object value) {
        String dataBaseName=this.fieldNameMap.get(propertyName);
        if(StringUtils.isBlank(dataBaseName)){
            throw CommonException.exception("字段不存在["+propertyName+"]");
        }
        if (value == null){
            throw CommonException.exception("value不能为空");
        }
        return this.commonMapper.deleteByProperty(dataBaseName,value);
    }

    @Override
    public Integer updateNotNullFieldsByProperties(D d, String[] propertyNames, Object[] values) {
        if (doChecker != null){
            this.doChecker.checkWhenModify(d);
        }
        return this.commonMapper.updateNotNullFieldsByProperties(d,this.javaFieldNames2DataBaseNames(propertyNames),values);
    }

    @Override
    public Integer updateAllFieldsByProperties(D d, String[] propertyNames, Object[] values) {
        if (doChecker != null){
            this.doChecker.checkWhenModify(d);
        }
        return this.commonMapper.updateAllFieldsByProperties(d,this.javaFieldNames2DataBaseNames(propertyNames),values);
    }

    @Override
    public Integer deleteByProperties(String[] propertyNames, Object[] values) {
        return this.commonMapper.deleteByProperties(this.javaFieldNames2DataBaseNames(propertyNames),values);
    }

    @Override
    public Integer updateNotNullFieldsByQueryItems(D d, List<QueryItemDTO> items) {
        this.checkQueryItems(items);
        if (doChecker != null){
            this.doChecker.checkWhenModify(d);
        }
        return this.commonMapper.updateNotNullFieldsByQueryItems(d,items);
    }

    @Override
    public Integer updateAllFieldsByQueryItems(D d, List<QueryItemDTO> items) {
        this.checkQueryItems(items);
        if (doChecker != null){
            this.doChecker.checkWhenModify(d);
        }
        return this.commonMapper.updateAllFieldsByQueryItems(d,items);
    }

    @Override
    public Integer deleteByQueryItems(List<QueryItemDTO> items) {
        this.checkQueryItems(items);
        return this.commonMapper.deleteByQueryItems(items);
    }


    protected List<QueryItemDTO> item2List(QueryItemDTO item){
        return Lists.newArrayList(item);
    }

    @Override
    public List<D> listByQueryItems(QueryItemDTO item, String... fieldNames) {
        return this.listByQueryItems(item2List(item),fieldNames);
    }

    @Override
    public Integer countByQueryItems(QueryItemDTO item) {
        return this.countByQueryItems(item2List(item));
    }

    @Override
    public Map<K, D> mapByQueryItems(QueryItemDTO item, String... fieldNames) {
        return this.mapByQueryItems(item2List(item),fieldNames);
    }

    @Override
    public <T> Map<T, List<D>> groupingByQueryItems(QueryItemDTO item, Function<D, T> mapper, String... fieldNames) {
        return this.groupingByQueryItems(item2List(item),mapper,fieldNames);
    }


    @Override
    public D singleResultByQueryItems(List<QueryItemDTO> items, String... fieldNames) {
        List<D> list = this.listByQueryItems(items, fieldNames);
        if(CommonUtils.isEmpty(list)){
            return null;
        }
        return list.get(0);
    }

    @Override
    public D singleResultItems(QueryItemDTO item, String... fieldNames) {
        return this.singleResultByQueryItems(Lists.newArrayList(item),fieldNames);
    }

    @Override
    public Integer updateNotNullFieldsByQueryItems(D d, QueryItemDTO item) {
        if (doChecker != null){
            this.doChecker.checkWhenModify(d);
        }
        return this.updateNotNullFieldsByQueryItems(d,item2List(item));
    }

    @Override
    public Integer updateAllFieldsByQueryItems(D d, QueryItemDTO item) {
        if (doChecker != null){
            this.doChecker.checkWhenModify(d);
        }
        return this.updateAllFieldsByQueryItems(d,item2List(item));
    }

    @Override
    public Integer deleteByQueryItems(QueryItemDTO item) {
        return this.deleteByQueryItems(item2List(item));
    }
}
