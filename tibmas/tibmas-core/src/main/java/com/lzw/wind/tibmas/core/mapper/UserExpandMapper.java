package com.lzw.wind.tibmas.core.mapper;

import com.hyzs.gz.common.dao.mapper.CommonMapper;
import com.hyzs.tibmas.core.dbo.UserExpandDO;
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
public interface UserExpandMapper extends CommonMapper<UserExpandDO,Long> {

        public List<UserExpandDO> listByPropertyName(@Param("propertyName") String propertyName, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserExpandDO> mapByPropertyName(@Param("propertyName") String propertyName, @Param("fieldNames") String[] fieldNames);

        public Integer countByPropertyName(@Param("propertyName") String propertyName);

        public default UserExpandDO singleResultByPropertyName(String propertyName, String[] fieldNames){
             List<UserExpandDO> list=this.listByPropertyName(propertyName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserExpandDO>> groupingByPropertyName(String propertyName, Function<UserExpandDO, T> mapper, String[] fieldNames){
             List<UserExpandDO> list=this.listByPropertyName(propertyName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPropertyName(@Param("updateDO") UserExpandDO updateDO, @Param("propertyName") String propertyName);

        public Integer updateAllFieldsByPropertyName(@Param("updateDO") UserExpandDO updateDO, @Param("propertyName") String propertyName);

        public Integer deleteByPropertyName(@Param("propertyName") String propertyName);




        public List<UserExpandDO> listByInPropertyName(@Param("propertyNameList") Collection<String> propertyNameList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserExpandDO> mapByInPropertyName(@Param("propertyNameList") Collection<String> propertyNameList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInPropertyName(@Param("propertyNameList") Collection<String> propertyNameList);

        public default UserExpandDO singleResultByInPropertyName(Collection<String> propertyNameList, String[] fieldNames){
             List<UserExpandDO> list=this.listByInPropertyName(propertyNameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserExpandDO>> groupingByInPropertyName(Collection<String> propertyNameList, Function<UserExpandDO, T> mapper, String[] fieldNames){
             List<UserExpandDO> list=this.listByInPropertyName(propertyNameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPropertyName(@Param("updateDO") UserExpandDO updateDO, @Param("propertyNameList") Collection<String> propertyNameList);

        public Integer updateAllFieldsByInPropertyName(@Param("updateDO") UserExpandDO updateDO, @Param("propertyNameList") Collection<String> propertyNameList);

        public Integer deleteByInPropertyName(@Param("propertyNameList") Collection<String> propertyNameList);

        public List<UserExpandDO> listByPropertyValue(@Param("propertyValue") String propertyValue, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserExpandDO> mapByPropertyValue(@Param("propertyValue") String propertyValue, @Param("fieldNames") String[] fieldNames);

        public Integer countByPropertyValue(@Param("propertyValue") String propertyValue);

        public default UserExpandDO singleResultByPropertyValue(String propertyValue, String[] fieldNames){
             List<UserExpandDO> list=this.listByPropertyValue(propertyValue,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserExpandDO>> groupingByPropertyValue(String propertyValue, Function<UserExpandDO, T> mapper, String[] fieldNames){
             List<UserExpandDO> list=this.listByPropertyValue(propertyValue,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPropertyValue(@Param("updateDO") UserExpandDO updateDO, @Param("propertyValue") String propertyValue);

        public Integer updateAllFieldsByPropertyValue(@Param("updateDO") UserExpandDO updateDO, @Param("propertyValue") String propertyValue);

        public Integer deleteByPropertyValue(@Param("propertyValue") String propertyValue);




        public List<UserExpandDO> listByInPropertyValue(@Param("propertyValueList") Collection<String> propertyValueList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserExpandDO> mapByInPropertyValue(@Param("propertyValueList") Collection<String> propertyValueList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInPropertyValue(@Param("propertyValueList") Collection<String> propertyValueList);

        public default UserExpandDO singleResultByInPropertyValue(Collection<String> propertyValueList, String[] fieldNames){
             List<UserExpandDO> list=this.listByInPropertyValue(propertyValueList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserExpandDO>> groupingByInPropertyValue(Collection<String> propertyValueList, Function<UserExpandDO, T> mapper, String[] fieldNames){
             List<UserExpandDO> list=this.listByInPropertyValue(propertyValueList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPropertyValue(@Param("updateDO") UserExpandDO updateDO, @Param("propertyValueList") Collection<String> propertyValueList);

        public Integer updateAllFieldsByInPropertyValue(@Param("updateDO") UserExpandDO updateDO, @Param("propertyValueList") Collection<String> propertyValueList);

        public Integer deleteByInPropertyValue(@Param("propertyValueList") Collection<String> propertyValueList);

        public List<UserExpandDO> listByUserId(@Param("userId") Long userId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserExpandDO> mapByUserId(@Param("userId") Long userId, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserId(@Param("userId") Long userId);

        public default UserExpandDO singleResultByUserId(Long userId, String[] fieldNames){
             List<UserExpandDO> list=this.listByUserId(userId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserExpandDO>> groupingByUserId(Long userId, Function<UserExpandDO, T> mapper, String[] fieldNames){
             List<UserExpandDO> list=this.listByUserId(userId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserId(@Param("updateDO") UserExpandDO updateDO, @Param("userId") Long userId);

        public Integer updateAllFieldsByUserId(@Param("updateDO") UserExpandDO updateDO, @Param("userId") Long userId);

        public Integer deleteByUserId(@Param("userId") Long userId);




        public List<UserExpandDO> listByInUserId(@Param("userIdList") Collection<Long> userIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserExpandDO> mapByInUserId(@Param("userIdList") Collection<Long> userIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserId(@Param("userIdList") Collection<Long> userIdList);

        public default UserExpandDO singleResultByInUserId(Collection<Long> userIdList, String[] fieldNames){
             List<UserExpandDO> list=this.listByInUserId(userIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserExpandDO>> groupingByInUserId(Collection<Long> userIdList, Function<UserExpandDO, T> mapper, String[] fieldNames){
             List<UserExpandDO> list=this.listByInUserId(userIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserId(@Param("updateDO") UserExpandDO updateDO, @Param("userIdList") Collection<Long> userIdList);

        public Integer updateAllFieldsByInUserId(@Param("updateDO") UserExpandDO updateDO, @Param("userIdList") Collection<Long> userIdList);

        public Integer deleteByInUserId(@Param("userIdList") Collection<Long> userIdList);

        public List<UserExpandDO> listByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserExpandDO> mapByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdCreate(@Param("userIdCreate") Long userIdCreate);

        public default UserExpandDO singleResultByUserIdCreate(Long userIdCreate, String[] fieldNames){
             List<UserExpandDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserExpandDO>> groupingByUserIdCreate(Long userIdCreate, Function<UserExpandDO, T> mapper, String[] fieldNames){
             List<UserExpandDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(@Param("updateDO") UserExpandDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(@Param("updateDO") UserExpandDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer deleteByUserIdCreate(@Param("userIdCreate") Long userIdCreate);




        public List<UserExpandDO> listByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserExpandDO> mapByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public default UserExpandDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String[] fieldNames){
             List<UserExpandDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserExpandDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<UserExpandDO, T> mapper, String[] fieldNames){
             List<UserExpandDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdCreate(@Param("updateDO") UserExpandDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer updateAllFieldsByInUserIdCreate(@Param("updateDO") UserExpandDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer deleteByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public List<UserExpandDO> listByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserExpandDO> mapByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdModified(@Param("userIdModified") Long userIdModified);

        public default UserExpandDO singleResultByUserIdModified(Long userIdModified, String[] fieldNames){
             List<UserExpandDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserExpandDO>> groupingByUserIdModified(Long userIdModified, Function<UserExpandDO, T> mapper, String[] fieldNames){
             List<UserExpandDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(@Param("updateDO") UserExpandDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(@Param("updateDO") UserExpandDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer deleteByUserIdModified(@Param("userIdModified") Long userIdModified);




        public List<UserExpandDO> listByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserExpandDO> mapByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public default UserExpandDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String[] fieldNames){
             List<UserExpandDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserExpandDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<UserExpandDO, T> mapper, String[] fieldNames){
             List<UserExpandDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdModified(@Param("updateDO") UserExpandDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer updateAllFieldsByInUserIdModified(@Param("updateDO") UserExpandDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer deleteByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);


}
