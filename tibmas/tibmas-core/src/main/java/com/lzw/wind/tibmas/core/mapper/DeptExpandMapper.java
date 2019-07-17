package com.lzw.wind.tibmas.core.mapper;

import com.lzw.common.dao.mapper.CommonMapper;
import com.lzw.wind.tibmas.core.dbo.DeptExpandDO;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Mapper
public interface DeptExpandMapper extends CommonMapper<DeptExpandDO,Long> {


        public DeptExpandDO getById(@Param("id") Long id, @Param("fieldNames") String... fieldNames);



        public List<DeptExpandDO> listById(@Param("id") Long id, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptExpandDO> mapById(@Param("id") Long id, @Param("fieldNames") String[] fieldNames);

        public Integer countById(@Param("id") Long id);

        public default DeptExpandDO singleResultById(Long id, String[] fieldNames){
             List<DeptExpandDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptExpandDO>> groupingById(Long id, Function<DeptExpandDO, T> mapper, String[] fieldNames){
             List<DeptExpandDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(@Param("updateDO") DeptExpandDO updateDO, @Param("id") Long id);

        public Integer updateAllFieldsById(@Param("updateDO") DeptExpandDO updateDO, @Param("id") Long id);

        public Integer deleteById(@Param("id") Long id);




        public List<DeptExpandDO> listByInId(@Param("idList") Collection<Long> idList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptExpandDO> mapByInId(@Param("idList") Collection<Long> idList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInId(@Param("idList") Collection<Long> idList);

        public default DeptExpandDO singleResultByInId(Collection<Long> idList, String[] fieldNames){
             List<DeptExpandDO> list=this.listByInId(idList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptExpandDO>> groupingByInId(Collection<Long> idList, Function<DeptExpandDO, T> mapper, String[] fieldNames){
             List<DeptExpandDO> list=this.listByInId(idList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInId(@Param("updateDO") DeptExpandDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer updateAllFieldsByInId(@Param("updateDO") DeptExpandDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer deleteByInId(@Param("idList") Collection<Long> idList);

        public List<DeptExpandDO> listByPropertyName(@Param("propertyName") String propertyName, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptExpandDO> mapByPropertyName(@Param("propertyName") String propertyName, @Param("fieldNames") String[] fieldNames);

        public Integer countByPropertyName(@Param("propertyName") String propertyName);

        public default DeptExpandDO singleResultByPropertyName(String propertyName, String[] fieldNames){
             List<DeptExpandDO> list=this.listByPropertyName(propertyName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptExpandDO>> groupingByPropertyName(String propertyName, Function<DeptExpandDO, T> mapper, String[] fieldNames){
             List<DeptExpandDO> list=this.listByPropertyName(propertyName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPropertyName(@Param("updateDO") DeptExpandDO updateDO, @Param("propertyName") String propertyName);

        public Integer updateAllFieldsByPropertyName(@Param("updateDO") DeptExpandDO updateDO, @Param("propertyName") String propertyName);

        public Integer deleteByPropertyName(@Param("propertyName") String propertyName);




        public List<DeptExpandDO> listByInPropertyName(@Param("propertyNameList") Collection<String> propertyNameList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptExpandDO> mapByInPropertyName(@Param("propertyNameList") Collection<String> propertyNameList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInPropertyName(@Param("propertyNameList") Collection<String> propertyNameList);

        public default DeptExpandDO singleResultByInPropertyName(Collection<String> propertyNameList, String[] fieldNames){
             List<DeptExpandDO> list=this.listByInPropertyName(propertyNameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptExpandDO>> groupingByInPropertyName(Collection<String> propertyNameList, Function<DeptExpandDO, T> mapper, String[] fieldNames){
             List<DeptExpandDO> list=this.listByInPropertyName(propertyNameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPropertyName(@Param("updateDO") DeptExpandDO updateDO, @Param("propertyNameList") Collection<String> propertyNameList);

        public Integer updateAllFieldsByInPropertyName(@Param("updateDO") DeptExpandDO updateDO, @Param("propertyNameList") Collection<String> propertyNameList);

        public Integer deleteByInPropertyName(@Param("propertyNameList") Collection<String> propertyNameList);

        public List<DeptExpandDO> listByPropertyValue(@Param("propertyValue") String propertyValue, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptExpandDO> mapByPropertyValue(@Param("propertyValue") String propertyValue, @Param("fieldNames") String[] fieldNames);

        public Integer countByPropertyValue(@Param("propertyValue") String propertyValue);

        public default DeptExpandDO singleResultByPropertyValue(String propertyValue, String[] fieldNames){
             List<DeptExpandDO> list=this.listByPropertyValue(propertyValue,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptExpandDO>> groupingByPropertyValue(String propertyValue, Function<DeptExpandDO, T> mapper, String[] fieldNames){
             List<DeptExpandDO> list=this.listByPropertyValue(propertyValue,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPropertyValue(@Param("updateDO") DeptExpandDO updateDO, @Param("propertyValue") String propertyValue);

        public Integer updateAllFieldsByPropertyValue(@Param("updateDO") DeptExpandDO updateDO, @Param("propertyValue") String propertyValue);

        public Integer deleteByPropertyValue(@Param("propertyValue") String propertyValue);




        public List<DeptExpandDO> listByInPropertyValue(@Param("propertyValueList") Collection<String> propertyValueList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptExpandDO> mapByInPropertyValue(@Param("propertyValueList") Collection<String> propertyValueList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInPropertyValue(@Param("propertyValueList") Collection<String> propertyValueList);

        public default DeptExpandDO singleResultByInPropertyValue(Collection<String> propertyValueList, String[] fieldNames){
             List<DeptExpandDO> list=this.listByInPropertyValue(propertyValueList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptExpandDO>> groupingByInPropertyValue(Collection<String> propertyValueList, Function<DeptExpandDO, T> mapper, String[] fieldNames){
             List<DeptExpandDO> list=this.listByInPropertyValue(propertyValueList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPropertyValue(@Param("updateDO") DeptExpandDO updateDO, @Param("propertyValueList") Collection<String> propertyValueList);

        public Integer updateAllFieldsByInPropertyValue(@Param("updateDO") DeptExpandDO updateDO, @Param("propertyValueList") Collection<String> propertyValueList);

        public Integer deleteByInPropertyValue(@Param("propertyValueList") Collection<String> propertyValueList);

        public List<DeptExpandDO> listByDeptId(@Param("deptId") Long deptId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptExpandDO> mapByDeptId(@Param("deptId") Long deptId, @Param("fieldNames") String[] fieldNames);

        public Integer countByDeptId(@Param("deptId") Long deptId);

        public default DeptExpandDO singleResultByDeptId(Long deptId, String[] fieldNames){
             List<DeptExpandDO> list=this.listByDeptId(deptId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptExpandDO>> groupingByDeptId(Long deptId, Function<DeptExpandDO, T> mapper, String[] fieldNames){
             List<DeptExpandDO> list=this.listByDeptId(deptId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeptId(@Param("updateDO") DeptExpandDO updateDO, @Param("deptId") Long deptId);

        public Integer updateAllFieldsByDeptId(@Param("updateDO") DeptExpandDO updateDO, @Param("deptId") Long deptId);

        public Integer deleteByDeptId(@Param("deptId") Long deptId);




        public List<DeptExpandDO> listByInDeptId(@Param("deptIdList") Collection<Long> deptIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptExpandDO> mapByInDeptId(@Param("deptIdList") Collection<Long> deptIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInDeptId(@Param("deptIdList") Collection<Long> deptIdList);

        public default DeptExpandDO singleResultByInDeptId(Collection<Long> deptIdList, String[] fieldNames){
             List<DeptExpandDO> list=this.listByInDeptId(deptIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptExpandDO>> groupingByInDeptId(Collection<Long> deptIdList, Function<DeptExpandDO, T> mapper, String[] fieldNames){
             List<DeptExpandDO> list=this.listByInDeptId(deptIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInDeptId(@Param("updateDO") DeptExpandDO updateDO, @Param("deptIdList") Collection<Long> deptIdList);

        public Integer updateAllFieldsByInDeptId(@Param("updateDO") DeptExpandDO updateDO, @Param("deptIdList") Collection<Long> deptIdList);

        public Integer deleteByInDeptId(@Param("deptIdList") Collection<Long> deptIdList);

        public List<DeptExpandDO> listByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptExpandDO> mapByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdCreate(@Param("userIdCreate") Long userIdCreate);

        public default DeptExpandDO singleResultByUserIdCreate(Long userIdCreate, String[] fieldNames){
             List<DeptExpandDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptExpandDO>> groupingByUserIdCreate(Long userIdCreate, Function<DeptExpandDO, T> mapper, String[] fieldNames){
             List<DeptExpandDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(@Param("updateDO") DeptExpandDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(@Param("updateDO") DeptExpandDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer deleteByUserIdCreate(@Param("userIdCreate") Long userIdCreate);




        public List<DeptExpandDO> listByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptExpandDO> mapByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public default DeptExpandDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String[] fieldNames){
             List<DeptExpandDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptExpandDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<DeptExpandDO, T> mapper, String[] fieldNames){
             List<DeptExpandDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdCreate(@Param("updateDO") DeptExpandDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer updateAllFieldsByInUserIdCreate(@Param("updateDO") DeptExpandDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer deleteByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public List<DeptExpandDO> listByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptExpandDO> mapByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdModified(@Param("userIdModified") Long userIdModified);

        public default DeptExpandDO singleResultByUserIdModified(Long userIdModified, String[] fieldNames){
             List<DeptExpandDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptExpandDO>> groupingByUserIdModified(Long userIdModified, Function<DeptExpandDO, T> mapper, String[] fieldNames){
             List<DeptExpandDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(@Param("updateDO") DeptExpandDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(@Param("updateDO") DeptExpandDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer deleteByUserIdModified(@Param("userIdModified") Long userIdModified);




        public List<DeptExpandDO> listByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptExpandDO> mapByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public default DeptExpandDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String[] fieldNames){
             List<DeptExpandDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptExpandDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<DeptExpandDO, T> mapper, String[] fieldNames){
             List<DeptExpandDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdModified(@Param("updateDO") DeptExpandDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer updateAllFieldsByInUserIdModified(@Param("updateDO") DeptExpandDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer deleteByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);


}
