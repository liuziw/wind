package com.lzw.wind.tibmas.core.mapper;

import com.lzw.common.dao.mapper.CommonMapper;
import com.lzw.wind.tibmas.core.dbo.UserRegisterExpandDO;
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
public interface UserRegisterExpandMapper extends CommonMapper<UserRegisterExpandDO,Long> {

        public List<UserRegisterExpandDO> listByPropertyName(@Param("propertyName") String propertyName, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterExpandDO> mapByPropertyName(@Param("propertyName") String propertyName, @Param("fieldNames") String[] fieldNames);

        public Integer countByPropertyName(@Param("propertyName") String propertyName);

        public default UserRegisterExpandDO singleResultByPropertyName(String propertyName, String[] fieldNames){
             List<UserRegisterExpandDO> list=this.listByPropertyName(propertyName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterExpandDO>> groupingByPropertyName(String propertyName, Function<UserRegisterExpandDO, T> mapper, String[] fieldNames){
             List<UserRegisterExpandDO> list=this.listByPropertyName(propertyName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPropertyName(@Param("updateDO") UserRegisterExpandDO updateDO, @Param("propertyName") String propertyName);

        public Integer updateAllFieldsByPropertyName(@Param("updateDO") UserRegisterExpandDO updateDO, @Param("propertyName") String propertyName);

        public Integer deleteByPropertyName(@Param("propertyName") String propertyName);




        public List<UserRegisterExpandDO> listByInPropertyName(@Param("propertyNameList") Collection<String> propertyNameList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterExpandDO> mapByInPropertyName(@Param("propertyNameList") Collection<String> propertyNameList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInPropertyName(@Param("propertyNameList") Collection<String> propertyNameList);

        public default UserRegisterExpandDO singleResultByInPropertyName(Collection<String> propertyNameList, String[] fieldNames){
             List<UserRegisterExpandDO> list=this.listByInPropertyName(propertyNameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterExpandDO>> groupingByInPropertyName(Collection<String> propertyNameList, Function<UserRegisterExpandDO, T> mapper, String[] fieldNames){
             List<UserRegisterExpandDO> list=this.listByInPropertyName(propertyNameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPropertyName(@Param("updateDO") UserRegisterExpandDO updateDO, @Param("propertyNameList") Collection<String> propertyNameList);

        public Integer updateAllFieldsByInPropertyName(@Param("updateDO") UserRegisterExpandDO updateDO, @Param("propertyNameList") Collection<String> propertyNameList);

        public Integer deleteByInPropertyName(@Param("propertyNameList") Collection<String> propertyNameList);

        public List<UserRegisterExpandDO> listByPropertyValue(@Param("propertyValue") String propertyValue, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterExpandDO> mapByPropertyValue(@Param("propertyValue") String propertyValue, @Param("fieldNames") String[] fieldNames);

        public Integer countByPropertyValue(@Param("propertyValue") String propertyValue);

        public default UserRegisterExpandDO singleResultByPropertyValue(String propertyValue, String[] fieldNames){
             List<UserRegisterExpandDO> list=this.listByPropertyValue(propertyValue,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterExpandDO>> groupingByPropertyValue(String propertyValue, Function<UserRegisterExpandDO, T> mapper, String[] fieldNames){
             List<UserRegisterExpandDO> list=this.listByPropertyValue(propertyValue,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPropertyValue(@Param("updateDO") UserRegisterExpandDO updateDO, @Param("propertyValue") String propertyValue);

        public Integer updateAllFieldsByPropertyValue(@Param("updateDO") UserRegisterExpandDO updateDO, @Param("propertyValue") String propertyValue);

        public Integer deleteByPropertyValue(@Param("propertyValue") String propertyValue);




        public List<UserRegisterExpandDO> listByInPropertyValue(@Param("propertyValueList") Collection<String> propertyValueList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterExpandDO> mapByInPropertyValue(@Param("propertyValueList") Collection<String> propertyValueList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInPropertyValue(@Param("propertyValueList") Collection<String> propertyValueList);

        public default UserRegisterExpandDO singleResultByInPropertyValue(Collection<String> propertyValueList, String[] fieldNames){
             List<UserRegisterExpandDO> list=this.listByInPropertyValue(propertyValueList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterExpandDO>> groupingByInPropertyValue(Collection<String> propertyValueList, Function<UserRegisterExpandDO, T> mapper, String[] fieldNames){
             List<UserRegisterExpandDO> list=this.listByInPropertyValue(propertyValueList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPropertyValue(@Param("updateDO") UserRegisterExpandDO updateDO, @Param("propertyValueList") Collection<String> propertyValueList);

        public Integer updateAllFieldsByInPropertyValue(@Param("updateDO") UserRegisterExpandDO updateDO, @Param("propertyValueList") Collection<String> propertyValueList);

        public Integer deleteByInPropertyValue(@Param("propertyValueList") Collection<String> propertyValueList);

        public List<UserRegisterExpandDO> listByRegisterId(@Param("registerId") Long registerId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterExpandDO> mapByRegisterId(@Param("registerId") Long registerId, @Param("fieldNames") String[] fieldNames);

        public Integer countByRegisterId(@Param("registerId") Long registerId);

        public default UserRegisterExpandDO singleResultByRegisterId(Long registerId, String[] fieldNames){
             List<UserRegisterExpandDO> list=this.listByRegisterId(registerId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterExpandDO>> groupingByRegisterId(Long registerId, Function<UserRegisterExpandDO, T> mapper, String[] fieldNames){
             List<UserRegisterExpandDO> list=this.listByRegisterId(registerId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRegisterId(@Param("updateDO") UserRegisterExpandDO updateDO, @Param("registerId") Long registerId);

        public Integer updateAllFieldsByRegisterId(@Param("updateDO") UserRegisterExpandDO updateDO, @Param("registerId") Long registerId);

        public Integer deleteByRegisterId(@Param("registerId") Long registerId);




        public List<UserRegisterExpandDO> listByInRegisterId(@Param("registerIdList") Collection<Long> registerIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterExpandDO> mapByInRegisterId(@Param("registerIdList") Collection<Long> registerIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInRegisterId(@Param("registerIdList") Collection<Long> registerIdList);

        public default UserRegisterExpandDO singleResultByInRegisterId(Collection<Long> registerIdList, String[] fieldNames){
             List<UserRegisterExpandDO> list=this.listByInRegisterId(registerIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterExpandDO>> groupingByInRegisterId(Collection<Long> registerIdList, Function<UserRegisterExpandDO, T> mapper, String[] fieldNames){
             List<UserRegisterExpandDO> list=this.listByInRegisterId(registerIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInRegisterId(@Param("updateDO") UserRegisterExpandDO updateDO, @Param("registerIdList") Collection<Long> registerIdList);

        public Integer updateAllFieldsByInRegisterId(@Param("updateDO") UserRegisterExpandDO updateDO, @Param("registerIdList") Collection<Long> registerIdList);

        public Integer deleteByInRegisterId(@Param("registerIdList") Collection<Long> registerIdList);

        public List<UserRegisterExpandDO> listByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterExpandDO> mapByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdCreate(@Param("userIdCreate") Long userIdCreate);

        public default UserRegisterExpandDO singleResultByUserIdCreate(Long userIdCreate, String[] fieldNames){
             List<UserRegisterExpandDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterExpandDO>> groupingByUserIdCreate(Long userIdCreate, Function<UserRegisterExpandDO, T> mapper, String[] fieldNames){
             List<UserRegisterExpandDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(@Param("updateDO") UserRegisterExpandDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(@Param("updateDO") UserRegisterExpandDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer deleteByUserIdCreate(@Param("userIdCreate") Long userIdCreate);




        public List<UserRegisterExpandDO> listByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterExpandDO> mapByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public default UserRegisterExpandDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String[] fieldNames){
             List<UserRegisterExpandDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterExpandDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<UserRegisterExpandDO, T> mapper, String[] fieldNames){
             List<UserRegisterExpandDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdCreate(@Param("updateDO") UserRegisterExpandDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer updateAllFieldsByInUserIdCreate(@Param("updateDO") UserRegisterExpandDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer deleteByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public List<UserRegisterExpandDO> listByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterExpandDO> mapByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdModified(@Param("userIdModified") Long userIdModified);

        public default UserRegisterExpandDO singleResultByUserIdModified(Long userIdModified, String[] fieldNames){
             List<UserRegisterExpandDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterExpandDO>> groupingByUserIdModified(Long userIdModified, Function<UserRegisterExpandDO, T> mapper, String[] fieldNames){
             List<UserRegisterExpandDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(@Param("updateDO") UserRegisterExpandDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(@Param("updateDO") UserRegisterExpandDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer deleteByUserIdModified(@Param("userIdModified") Long userIdModified);




        public List<UserRegisterExpandDO> listByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRegisterExpandDO> mapByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public default UserRegisterExpandDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String[] fieldNames){
             List<UserRegisterExpandDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterExpandDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<UserRegisterExpandDO, T> mapper, String[] fieldNames){
             List<UserRegisterExpandDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdModified(@Param("updateDO") UserRegisterExpandDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer updateAllFieldsByInUserIdModified(@Param("updateDO") UserRegisterExpandDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer deleteByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);


}
