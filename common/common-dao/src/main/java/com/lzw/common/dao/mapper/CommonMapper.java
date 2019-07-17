package com.lzw.common.dao.mapper;
import com.lzw.common.core.bo.PageBO;
import com.lzw.common.dao.dto.PageQueryDTO;
import com.lzw.common.dao.dto.PageQueryItemDTO;
import com.lzw.common.dao.dto.QueryItemDTO;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 *
 * Mybatis中的Mapper公共方法的定义。
 *
 * @Auther liys
 *
 * @param <D> DO对象
 * @param <K> K 数据库主键对应的类型，一般为Long或String类，在我们的数据库规范中主键只有一个字段，都为Long类型
 */
public interface CommonMapper<D,K> {



    /**
     * 获取所有,注意大表时千万别调用 select * from tab where is_deleted=0
     * @return
     */
    public List<D> listAll();



    /**
     * 获取所有,以Map的形式返回，Key为主键。注意大表时千万别调用 select * from tab where is_deleted=0
     * @return
     */
    @MapKey("id")
    public Map<K,D> mapAll();

    /**
     * 主键查找 select * from tab where id=id
     * @param id
     * @return
     */
    public D getById(@Param("id") K id, @Param("fieldNames") String[] fieldNames);

    /**
     * 多个主键查找 select * from tab where id in (ids)
     * @param ids
     * @return
     */
    public List<D> listByIds(@Param("ids") Collection<K> ids, @Param("fieldNames") String[] fieldNames);


    /**
     * 多个主键查找 select * from tab where id in (ids)
     * @param ids
     * @param mapper
     * @param fieldNames
     * @param <T>
     * @return
     */
    public default <T> List<D> listByIds(Collection<T> ids, Function<T, K> mapper, String[] fieldNames)
    {
        if(CollectionUtils.isEmpty(ids)){
            return new ArrayList<>(0);
        }
        return this.listByIds(ids.stream().map(mapper).collect(Collectors.toSet()),fieldNames);
    }


    /**
     * 多个主键查找，以Map的形式返回 select * from tab where id in (ids)
     * @param ids
     * @param fieldNames
     * @return
     */
    @MapKey("id")
    public Map<K,D> mapByIds(@Param("ids") Collection<K> ids, @Param("fieldNames") String[] fieldNames);


    /**
     * 多个主键查找，以Map的形式返回  select * from tab where id in (ids)
     * @param ids
     * @param mapper
     * @param fieldNames
     * @param <T>
     * @return
     */
    public default <T> Map<K,D> mapByIds(Collection<T> ids, Function<T, K> mapper, String[] fieldNames)
    {
        if(CollectionUtils.isEmpty(ids)){
            return new HashMap<>(0);
        }
        return this.mapByIds(ids.stream().map(mapper).collect(Collectors.toSet()),fieldNames);
    }


    /**
     * 根据ID删除，update table set is_deleted=1 where id=id
     * @param id
     * @return
     */
    public Integer deleteById(@Param("id") K id);

    public Integer deleteByIds(@Param("ids") Collection<K> ids);

    /**
     * 根据多个ID删除，update table set is_deleted=1 where id in (ids)
     * @param ids
     * @param mapper
     * @param <T>
     * @return
     */
    public default <T> Integer deleteByIds(Collection<T> ids, Function<T, K> mapper){
        if(CollectionUtils.isEmpty(ids)){
            return 0;
        }
        return this.deleteByIds(ids.stream().map(mapper).collect(Collectors.toSet()));
    }

    /**
     * 根据id更新所有字段，DO对象中为空的字段也会更新 {field1:value1,field2:null} update tab set field1=value1,fields=null where id=id
     * @param d
     * @return
     */
    public Integer updateAllProperties(D d);


    /**
     * 根据id更新不为空的字段 {field1:value1,field2:null} update tab set field1=value1 where id=id
     * @param d
     * @return
     */
    public Integer updateNotNullProperties(D d);


    /**
     * 插入所有字段，包括为空的字段 {field1:value1,field2:null} insert tab (field1,field2) values (value1,null)
     * @param d
     * @return
     */
    public Integer insertAllProperties(D d);

    /**
     * 插入不为空的字段，为空的由数据库处理，一般为默认值 field1:value1,field2:null} insert tab (field1) values (value1)
     * @param d
     * @return
     */
    public Integer insertNotNullProperties(D d);


    /**
     * 批量插入，所有字段
     * @param list
     * @return
     */
    public Integer insertAllPropertiesList(@Param("list") List<D> list);

    /**
    public List<D> listByQueryItem(@Param("item") QueryItemDTO queryItemDTO,@Param("fieldNames") String[] fieldNames);

    public D singleResultByQueryItem(QueryItemDTO queryItemDTO,String[] fieldNames);

    public List<D> listByQueryItems(List<QueryItemDTO> queryItemDTOS,String[] fieldNames);

    public D singleResultByQueryItems(List<QueryItemDTO> queryItemDTOS,String[] fieldNames);
    */

    /**
     * 根据某个字段查询select * from tab where is_deleted=0 and ${propertyName}=#{value}
     * @param propertyName
     * @param value
     * @param fieldNames
     * @return
     */
    public List<D> listByProperty(@Param("propertyName") String propertyName, @Param("value") Object value, @Param("fieldNames") String[] fieldNames);

    /**
     * 根据某个字段查询select * from tab where is_deleted=0 and ${propertyName}=#{value}
     * @param propertyName
     * @param value
     * @return
     */
    public Integer countByProperty(@Param("propertyName") String propertyName, @Param("value") Object value);


    /**
     * 根据某个字段查询 select * from tab where is_deleted=0 and ${propertyName}=#{value}
     * @param propertyName
     * @param value
     * @param fieldNames
     * @return
     */
    @MapKey("id")
    public Map<K,D> mapByProperty(@Param("propertyName") String propertyName, @Param("value") Object value, @Param("fieldNames") String[] fieldNames);


    /**
     *根据某个字段更新
     * @param d
     * @param propertyName
     * @param value
     * @return
     */
    public Integer updateNotNullFieldsByProperty(@Param("updateDO") D d, @Param("propertyName") String propertyName, @Param("value") Object value);

    /**
     * 根据某个字段更新
     * @param d
     * @param propertyName
     * @param value
     * @return
     */
    public Integer updateAllFieldsByProperty(@Param("updateDO") D d, @Param("propertyName") String propertyName, @Param("value") Object value);


    /**
     * 根据某个字段删除
     * @param propertyName
     * @param value
     * @return
     */
    public Integer deleteByProperty(@Param("propertyName") String propertyName, @Param("value") Object value);


    /**
     * 根据某个字段查询，返回单个值，如果无数据返回null select * from tab where is_deleted=0 and ${propertyName}=#{value} limit 1
     * @param propertyName
     * @param value
     * @param fieldNames
     * @return
     */
    public default D singleResultByProperty(String propertyName, Object value, String[] fieldNames){
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
    public default <T> Map<T,List<D>> groupingByProperty(String propertyName, Object value, Function<D, T> mapper, String[] fieldNames){
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
    public List<D> listByProperties(@Param("propertyNames") String[] propertyNames, @Param("values") Object[] values, @Param("fieldNames") String[] fieldNames);


    /**
     * 多个字段查询
     * @param propertyNames
     * @param values
     * @return
     */
    public Integer countByProperties(@Param("propertyNames") String[] propertyNames, @Param("values") Object[] values);


    /**
     * 多个字段查询
     * @param propertyNames
     * @param values
     * @param fieldNames
     * @return
     */
    @MapKey("id")
    public Map<K,D> mapByProperties(@Param("propertyNames") String[] propertyNames, @Param("values") Object[] values, @Param("fieldNames") String[] fieldNames);

    /**
     * 多个字段查询,单值返回
     * @param propertyNames
     * @param values
     * @param fieldNames
     * @return
     */
    public default D singleResultByProperties(String[] propertyNames, Object[] values, String[] fieldNames){
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
    public default <T> Map<T,List<D>> groupingByProperties(String[] propertyNames, Object[] values, Function<D, T> mapper, String[] fieldNames){
        List<D> list=this.listByProperties(propertyNames,values,fieldNames);
        if(CollectionUtils.isEmpty(list)){
            return new HashMap<>();
        }
        return list.stream().collect(Collectors.groupingBy(mapper));
    }



    public Integer updateNotNullFieldsByProperties(@Param("updateDO") D d, @Param("propertyNames") String[] propertyNames, @Param("values") Object[] values);


    public Integer updateAllFieldsByProperties(@Param("updateDO") D d, @Param("propertyNames") String[] propertyNames, @Param("values") Object[] values);


    public Integer deleteByProperties(@Param("propertyNames") String[] propertyNames, @Param("values") Object[] values);

    /**
     * 将QueryItem对象转化成Map对象，作为mybatis执行sql的入参
     * @param items
     * @return
     */
    public default Map<String,Object> queryItems2Values(List<QueryItemDTO> items){
        Map<String,Object> values=new HashMap<>();
        if(!CollectionUtils.isEmpty(items)){
            items.forEach(item->{
                values.put(item.getValueKeyName(),item.getValue());
            });
        }
        return values;
    }

    /**
     * 内部方法，根据QueryItem查询
     * @param items
     * @param values
     * @param fieldNames
     * @return
     */
    public List<D> _listByQueryItems(@Param("items") List<QueryItemDTO> items, @Param("values") Object values, @Param("fieldNames") String[] fieldNames);

    /**
     * 内部方法，根据QueryItem查询
     * @param items
     * @param values
     * @param
     * @return
     */
    public Integer _countByQueryItems(@Param("items") List<QueryItemDTO> items, @Param("values") Object values);


    /**
     * 内部方法，根据QueryItem查询
     * @param items
     * @param values
     * @param fieldNames
     * @return
     */
    @MapKey("id")
    public Map<K,D> _mapByQueryItems(@Param("items") List<QueryItemDTO> items, @Param("values") Object values, @Param("fieldNames") String[] fieldNames);


    /**
     * 内部方法，根据QueryItem更新数据
     * @param items
     * @param values
     * @return
     */
    public Integer _updateNotNullFieldsByQueryItems(@Param("updateDO") D d, @Param("items") List<QueryItemDTO> items, @Param("values") Object values);

    /**
     * 内部方法，根据QueryItem更新数据
     * @param items
     * @param values
     * @return
     */
    public Integer _updateAllFieldsByQueryItems(@Param("updateDO") D d, @Param("items") List<QueryItemDTO> items, @Param("values") Object values);

    /**
     * 内部方法，根据QueryItem删除数据
     * @param items
     * @param values
     * @return
     */
    public Integer _deleteByQueryItems(@Param("items") List<QueryItemDTO> items, @Param("values") Object values);

    /**
     * 根据QueryItem查询
     * @param items
     * @param fieldNames
     * @return
     */
    public default List<D> listByQueryItems(@Param("items") List<QueryItemDTO> items, @Param("fieldNames") String[] fieldNames){
        Map<String,Object> values=this.queryItems2Values(items);
        return this._listByQueryItems(items,values,fieldNames);
    }


    /**
     * 根据QueryItem查询
     * @param items
     * @param mapper
     * @param fieldNames
     * @param <T>
     * @return
     */
    public default <T> Map<T,List<D>> groupingByQueryItems(@Param("items") List<QueryItemDTO> items, Function<D, T> mapper, @Param("fieldNames") String[] fieldNames){
        List<D> list=this.listByQueryItems(items,fieldNames);
        if(CollectionUtils.isEmpty(list)){
            return new HashMap<>();
        }
        return list.stream().collect(Collectors.groupingBy(mapper));
    }

    /**
     * 根据QueryItem查询
     * @param items
     * @return
     */
    public default Integer countByQueryItems(@Param("items") List<QueryItemDTO> items){
        Map<String,Object> values=this.queryItems2Values(items);
        return this._countByQueryItems(items,values);
    }

    /**
     * 根据QueryItem查询,分组返回
     * @param items
     * @param fieldNames
     * @return
     */
    public default Map<K,D> mapByQueryItems(@Param("items") List<QueryItemDTO> items, @Param("fieldNames") String[] fieldNames){
        Map<String,Object> values=this.queryItems2Values(items);
        return this._mapByQueryItems(items,values,fieldNames);
    }



    public default Integer updateNotNullFieldsByQueryItems(@Param("updateDO") D d, @Param("items") List<QueryItemDTO> items){
        Map<String,Object> values=this.queryItems2Values(items);
        return this._updateNotNullFieldsByQueryItems(d,items,values);
    }

    public default Integer updateAllFieldsByQueryItems(@Param("updateDO") D d, @Param("items") List<QueryItemDTO> items){
        Map<String,Object> values=this.queryItems2Values(items);
        return this._updateAllFieldsByQueryItems(d,items,values);
    }

    public default Integer deleteByQueryItems(@Param("items") List<QueryItemDTO> items){
        Map<String,Object> values=this.queryItems2Values(items);
        return this._deleteByQueryItems(items,values);
    }

    /**
     * 内部方法，根据QueryItem查询,分页
     * @param items
     * @param values
     * @param fieldNames
     * @param pageQueryDTO
     * @return
     */
    public List<D> _listByPageQuery(@Param("items") List<QueryItemDTO> items,
                                    @Param("values") Object values,
                                    @Param("fieldNames") String[] fieldNames,
                                    @Param("pageQuery") PageQueryDTO pageQueryDTO);


    /**
     * 根据QueryItem查询,分页
     * @param pageQueryItemDTO
     * @return
     */
    public default List<D> listByPageQuery(PageQueryItemDTO pageQueryItemDTO){
        List<QueryItemDTO> items=pageQueryItemDTO.getQueryItems();
        Object values=this.queryItems2Values(items);
        return this._listByPageQuery(items,values,pageQueryItemDTO.getFieldNames(),pageQueryItemDTO);
    }


    /**
     * 内部方法，根据QueryItem查询,分页
     * @param items
     * @param values
     * @param fieldNames
     * @return
     */
    public Integer _countByPageQuery(@Param("items") List<QueryItemDTO> items,
                                     @Param("values") Object values,
                                     @Param("fieldNames") String[] fieldNames);


    /**
     * 根据QueryItem查询,分页
     * @param pageQueryItemDTO
     * @return
     */
    public default Integer countByPageQuery(PageQueryItemDTO pageQueryItemDTO){
        List<QueryItemDTO> items=pageQueryItemDTO.getQueryItems();
        Object values=this.queryItems2Values(items);
        return this._countByPageQuery(items,values,pageQueryItemDTO.getFieldNames());
    }

    /**
     * 根据PageQueryItemDTO查询,分页
     * @param pageQueryItemDTO
     * @return
     */
    public default PageBO<D> pageQuery(PageQueryItemDTO pageQueryItemDTO){
        Integer count=null;
        PageBO<D> pageBO=new PageBO<>();
        pageBO.setCurrPage(pageQueryItemDTO.getCurrPage());
        pageBO.setPageSize(pageQueryItemDTO.getPageSize());
        List<QueryItemDTO> items=pageQueryItemDTO.getQueryItems();
        Map<String,Object> values=this.queryItems2Values(items);
        values.put("pageOffset",(pageQueryItemDTO.getCurrPage()-1)*pageQueryItemDTO.getPageSize());
        values.put("pageOffsetLimit",pageQueryItemDTO.getCurrPage()*pageQueryItemDTO.getPageSize());

        //需要获取条数
        if(pageQueryItemDTO.getIsCount()){
            count=this._countByPageQuery(items,values,pageQueryItemDTO.getFieldNames());
            pageBO.setTotalCount(count.longValue());
            int tmp=pageBO.getTotalCount().intValue()%pageBO.getPageSize();
            if(tmp==0){
                pageBO.setTotalPage(pageBO.getTotalCount().intValue()/pageBO.getPageSize());
            }else{
                pageBO.setTotalPage(pageBO.getTotalCount().intValue()/pageBO.getPageSize()+1);
            }
        }
        List<D> list=this._listByPageQuery(items,values,pageQueryItemDTO.getFieldNames(),pageQueryItemDTO);

        pageBO.setList(list);

        return pageBO;

    }



}
