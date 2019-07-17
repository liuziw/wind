package com.lzw.common.dao.daomanager;


import com.lzw.common.core.bo.PageBO;
import com.lzw.common.dao.dto.PageQueryItemDTO;
import com.lzw.common.dao.dto.QueryItemDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;


/**
 * 封装了{@link com.lzw.common.dao.mapper.CommonMapper}的所有方法，供Service层调用
 * @param <D>
 * @param <K>
 */
public interface CommonDaoManager<D,K> {

    /**
     * 获取所有,注意大表时千万别调用
     * @return
     */
    public List<D> listAll();



    /**
     * 获取所有,以Map的形式返回，Key为主键。注意大表时千万别调用
     * @return
     */
    public Map<K,D> mapAll();

    /**
     * 主键查找
     * @param id
     * @return
     */
    public D getById(K id, String... fieldNames);

    /**
     * 多个主键查找
     * @param ids
     * @return
     */
    public List<D> listByIds(Collection<K> ids, String... fieldNames);



    public default <T> List<D> listByIds(Collection<T> ids, Function<T, K> mapper, String... fieldNames)
    {
        if(CollectionUtils.isEmpty(ids)){
            return new ArrayList<>(0);
        }
        return this.listByIds(ids.stream().map(mapper).collect(Collectors.toSet()),fieldNames);
    }


    /**
     * 多个主键查找，以Map的形式返回
     * @param ids
     * @param fieldNames
     * @return
     */
    public Map<K,D> mapByIds(@Param("ids") Collection<K> ids, String... fieldNames);

    public default <T> Map<K,D> mapByIds(Collection<T> ids, Function<T, K> mapper, String... fieldNames)
    {
        if(CollectionUtils.isEmpty(ids)){
            return new HashMap<>(0);
        }
        return this.mapByIds(ids.stream().map(mapper).collect(Collectors.toSet()),fieldNames);
    }



    /**
     * 根据ID删除，set is_deleted=1
     * @param id
     * @return
     */
    public Integer deleteById(K id);

    public Integer deleteByIds(Collection<K> ids);


    public default <T> Integer deleteByIds(Collection<T> ids, Function<T, K> mapper){
        if(CollectionUtils.isEmpty(ids)){
            return 0;
        }
        return this.deleteByIds(ids.stream().map(mapper).collect(Collectors.toSet()));
    }

    /**
     * 根据id更新所有字段，DO对象中为空的字段也会更新
     * @param d
     * @return
     */
    public Integer updateAllProperties(D d);


    /**
     * 根据id更新不为空的字段
     * @param d
     * @return
     */
    public Integer updateNotNullProperties(D d);


    /**
     * 插入所有字段，包括为空的字段
     * @param d
     * @return
     */
    public Integer insertAllProperties(D d);

    /**
     * 插入不为空的字段，为空的由数据库处理，一般为默认值
     * @param d
     * @return
     */
    public Integer insertNotNullProperties(D d);

    /**
     * 批量插入，所有字段
     * @param list
     * @return
     */
    public Integer insertAllPropertiesList(List<D> list);


    /**
     * 根据某个字段查询 where is_deleted=0 and ${propertyName}=#{value}
     * @param propertyName
     * @param value
     * @param fieldNames
     * @return
     */
    public List<D> listByProperty(String propertyName, Object value, String... fieldNames);


    /**
     * 根据某个字段查询 where is_deleted=0 and ${propertyName}=#{value}
     * @param propertyName
     * @param value
     * @return
     */
    public Integer countByProperty(String propertyName, Object value);


    /**
     * 根据某个字段查询 where is_deleted=0 and ${propertyName}=#{value}
     * @param propertyName
     * @param value
     * @param fieldNames
     * @return
     */
    public Map<K,D> mapByProperty(String propertyName, Object value, String... fieldNames);

    /**
     * 根据某个字段查询，返回单个值，如果无数据返回null
     * @param propertyName
     * @param value
     * @param fieldNames
     * @return
     */
    public default D singleResultByProperty(String propertyName, Object value, String... fieldNames){
        List<D> list=this.listByProperty(propertyName,value,fieldNames);
        return list==null || list.size()==0?null:list.get(0);
    }

    /**
     * 根据某个字段查询，分组返回
     * @param propertyName
     * @param value
     * @param mapper
     * @param fieldNames
     * @param <T>
     * @return
     */
    public default <T> Map<T,List<D>> groupingByProperty(String propertyName, Object value, Function<D, T> mapper, String... fieldNames){
        List<D> list=this.listByProperty(propertyName,value,fieldNames);
        if(CollectionUtils.isEmpty(list)){
            return new HashMap<>();
        }
        return list.stream().collect(Collectors.groupingBy(mapper));
    }


    /**
     * 多个字段查询
     * @param propertyNames
     * @param values
     * @param fieldNames
     * @return
     */
    public List<D> listByProperties(String[] propertyNames, Object[] values, String... fieldNames);



    /**
     * 多个字段查询
     * @param propertyNames
     * @param values
     * @return
     */
    public Integer countByProperties(String[] propertyNames, Object[] values);

    /**
     * 多个字段查询
     * @param propertyNames
     * @param values
     * @param fieldNames
     * @return
     */
    public Map<K,D> mapByProperties(String[] propertyNames, Object[] values, String... fieldNames);


    /**
     * 多个字段查询,单值返回
     * @param propertyNames
     * @param values
     * @param fieldNames
     * @return
     */
    public default D singleResultByProperties(String[] propertyNames, Object[] values, String... fieldNames){
        List<D> list=this.listByProperties(propertyNames,values,fieldNames);
        return list==null || list.size()==0?null:list.get(0);
    }


    /**
     * 多个字段查询,分组返回
     * @param propertyNames
     * @param values
     * @param mapper
     * @param fieldNames
     * @param <T>
     * @return
     */
    public default <T> Map<T,List<D>> groupingByProperties(String[] propertyNames, Object[] values, Function<D, T> mapper, String... fieldNames){
        List<D> list=this.listByProperties(propertyNames,values,fieldNames);
        if(CollectionUtils.isEmpty(list)){
            return new HashMap<>();
        }
        return list.stream().collect(Collectors.groupingBy(mapper));
    }


    /**
     * 根据QueryItem查询
     * @param items
     * @param fieldNames
     * @return
     */
    public  List<D> listByQueryItems(List<QueryItemDTO> items, String... fieldNames);

    public  List<D> listByQueryItems(QueryItemDTO item, String... fieldNames);


    /**
     * 根据QueryItem查询
     * @param items
     * @return
     */
    public  Integer countByQueryItems(List<QueryItemDTO> items);

    public  Integer countByQueryItems(QueryItemDTO item);


    /**
     * 根据QueryItem查询
     * @param items
     * @param fieldNames
     * @return
     */
    public  Map<K,D> mapByQueryItems(List<QueryItemDTO> items, String... fieldNames);

    public  Map<K,D> mapByQueryItems(QueryItemDTO item, String... fieldNames);


    /**
     * 根据QueryItem查询
     * @param items
     * @param mapper
     * @param fieldNames
     * @param <T>
     * @return
     */
    public <T> Map<T,List<D>> groupingByQueryItems(List<QueryItemDTO> items, Function<D, T> mapper, String... fieldNames);

    public <T> Map<T,List<D>> groupingByQueryItems(QueryItemDTO item, Function<D, T> mapper, String... fieldNames);


    /**
     * 根据QueryItem查询
     * @param items
     * @param fieldNames
     * @return
     */
    public  D singleResultByQueryItems(List<QueryItemDTO> items, String... fieldNames);

    public  D singleResultItems(QueryItemDTO item, String... fieldNames);


    /**
     * 内部方法，根据QueryItem查询,分页
     * @param pageQueryItemDTO
     * @return
     */
    @Deprecated
    public PageBO<D> pageQuery(PageQueryItemDTO pageQueryItemDTO);



    /**
     * 根据某个字段更新
     * @param d
     * @param propertyName
     * @param value
     * @return
     */
    public Integer updateAllFieldsByProperty(D d, String propertyName, Object value);

    /**
     * 根据某个字段更新
     * @param d
     * @param propertyName
     * @param value
     * @return
     */
    public Integer updateNotNullFieldsByProperty(D d, String propertyName, Object value);


    /**
     * 根据某个字段删除
     * @param propertyName
     * @param value
     * @return
     */
    public Integer deleteByProperty(String propertyName, Object value);


    public Integer updateNotNullFieldsByProperties(D d, String[] propertyNames, Object[] values);


    public Integer updateAllFieldsByProperties(D d, String[] propertyNames, Object[] values);


    public Integer deleteByProperties(String[] propertyNames, Object[] values);


    public  Integer updateNotNullFieldsByQueryItems(D d, List<QueryItemDTO> items);

    public  Integer updateAllFieldsByQueryItems(D d, List<QueryItemDTO> items);

    public  Integer deleteByQueryItems(List<QueryItemDTO> items);

    public  Integer updateNotNullFieldsByQueryItems(D d, QueryItemDTO item);

    public  Integer updateAllFieldsByQueryItems(D d, QueryItemDTO item);

    public  Integer deleteByQueryItems(QueryItemDTO item);
}
