package com.lzw.wind.tibmas.core.daomanager.immutable;

import com.hyzs.gz.common.dao.daomanager.CommonDaoManager;
import com.hyzs.tibmas.core.dbo.UserExpandDO;
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
public interface ImmutableUserExpandDaoManager extends CommonDaoManager<UserExpandDO,Long> {


        public List<UserExpandDO> listByPropertyName(String propertyName, String... fieldNames);

        public Map<Long,UserExpandDO> mapByPropertyName(String propertyName, String... fieldNames);

        public Integer countByPropertyName(String propertyName);

        public default UserExpandDO singleResultByPropertyName(String propertyName, String... fieldNames){
             List<UserExpandDO> list=this.listByPropertyName(propertyName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserExpandDO>> groupingByPropertyName(String propertyName, Function<UserExpandDO, T> mapper, String... fieldNames){
             List<UserExpandDO> list=this.listByPropertyName(propertyName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPropertyName(UserExpandDO updateDO, String propertyName);

        public Integer updateAllFieldsByPropertyName(UserExpandDO updateDO, String propertyName);

        public Integer deleteByPropertyName(String propertyName);






        public List<UserExpandDO> listByInPropertyName(Collection<String> propertyNameList, String... fieldNames);

         public Map<Long,UserExpandDO> mapByInPropertyName(Collection<String> propertyNameList, String... fieldNames);

         public Integer countByInPropertyName(Collection<String> propertyNameList);

         public default UserExpandDO singleResultByInPropertyName(Collection<String> propertyNameList, String... fieldNames){
              List<UserExpandDO> list=this.listByInPropertyName(propertyNameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserExpandDO>> groupingByInPropertyName(Collection<String> propertyNameList, Function<UserExpandDO, T> mapper, String... fieldNames){
              List<UserExpandDO> list=this.listByInPropertyName(propertyNameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPropertyName(UserExpandDO updateDO, Collection<String> propertyNameList);

         public Integer updateAllFieldsByInPropertyName(UserExpandDO updateDO, Collection<String> propertyNameList);

         public Integer deleteByInPropertyName(Collection<String> propertyNameList);
        public List<UserExpandDO> listByPropertyValue(String propertyValue, String... fieldNames);

        public Map<Long,UserExpandDO> mapByPropertyValue(String propertyValue, String... fieldNames);

        public Integer countByPropertyValue(String propertyValue);

        public default UserExpandDO singleResultByPropertyValue(String propertyValue, String... fieldNames){
             List<UserExpandDO> list=this.listByPropertyValue(propertyValue,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserExpandDO>> groupingByPropertyValue(String propertyValue, Function<UserExpandDO, T> mapper, String... fieldNames){
             List<UserExpandDO> list=this.listByPropertyValue(propertyValue,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPropertyValue(UserExpandDO updateDO, String propertyValue);

        public Integer updateAllFieldsByPropertyValue(UserExpandDO updateDO, String propertyValue);

        public Integer deleteByPropertyValue(String propertyValue);






        public List<UserExpandDO> listByInPropertyValue(Collection<String> propertyValueList, String... fieldNames);

         public Map<Long,UserExpandDO> mapByInPropertyValue(Collection<String> propertyValueList, String... fieldNames);

         public Integer countByInPropertyValue(Collection<String> propertyValueList);

         public default UserExpandDO singleResultByInPropertyValue(Collection<String> propertyValueList, String... fieldNames){
              List<UserExpandDO> list=this.listByInPropertyValue(propertyValueList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserExpandDO>> groupingByInPropertyValue(Collection<String> propertyValueList, Function<UserExpandDO, T> mapper, String... fieldNames){
              List<UserExpandDO> list=this.listByInPropertyValue(propertyValueList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPropertyValue(UserExpandDO updateDO, Collection<String> propertyValueList);

         public Integer updateAllFieldsByInPropertyValue(UserExpandDO updateDO, Collection<String> propertyValueList);

         public Integer deleteByInPropertyValue(Collection<String> propertyValueList);
        public List<UserExpandDO> listByUserId(Long userId, String... fieldNames);

        public Map<Long,UserExpandDO> mapByUserId(Long userId, String... fieldNames);

        public Integer countByUserId(Long userId);

        public default UserExpandDO singleResultByUserId(Long userId, String... fieldNames){
             List<UserExpandDO> list=this.listByUserId(userId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserExpandDO>> groupingByUserId(Long userId, Function<UserExpandDO, T> mapper, String... fieldNames){
             List<UserExpandDO> list=this.listByUserId(userId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserId(UserExpandDO updateDO, Long userId);

        public Integer updateAllFieldsByUserId(UserExpandDO updateDO, Long userId);

        public Integer deleteByUserId(Long userId);






        public List<UserExpandDO> listByInUserId(Collection<Long> userIdList, String... fieldNames);

         public Map<Long,UserExpandDO> mapByInUserId(Collection<Long> userIdList, String... fieldNames);

         public Integer countByInUserId(Collection<Long> userIdList);

         public default UserExpandDO singleResultByInUserId(Collection<Long> userIdList, String... fieldNames){
              List<UserExpandDO> list=this.listByInUserId(userIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserExpandDO>> groupingByInUserId(Collection<Long> userIdList, Function<UserExpandDO, T> mapper, String... fieldNames){
              List<UserExpandDO> list=this.listByInUserId(userIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserId(UserExpandDO updateDO, Collection<Long> userIdList);

         public Integer updateAllFieldsByInUserId(UserExpandDO updateDO, Collection<Long> userIdList);

         public Integer deleteByInUserId(Collection<Long> userIdList);
        public List<UserExpandDO> listByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Map<Long,UserExpandDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Integer countByUserIdCreate(Long userIdCreate);

        public default UserExpandDO singleResultByUserIdCreate(Long userIdCreate, String... fieldNames){
             List<UserExpandDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserExpandDO>> groupingByUserIdCreate(Long userIdCreate, Function<UserExpandDO, T> mapper, String... fieldNames){
             List<UserExpandDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(UserExpandDO updateDO, Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(UserExpandDO updateDO, Long userIdCreate);

        public Integer deleteByUserIdCreate(Long userIdCreate);






        public List<UserExpandDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Map<Long,UserExpandDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Integer countByInUserIdCreate(Collection<Long> userIdCreateList);

         public default UserExpandDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
              List<UserExpandDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserExpandDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<UserExpandDO, T> mapper, String... fieldNames){
              List<UserExpandDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdCreate(UserExpandDO updateDO, Collection<Long> userIdCreateList);

         public Integer updateAllFieldsByInUserIdCreate(UserExpandDO updateDO, Collection<Long> userIdCreateList);

         public Integer deleteByInUserIdCreate(Collection<Long> userIdCreateList);
        public List<UserExpandDO> listByUserIdModified(Long userIdModified, String... fieldNames);

        public Map<Long,UserExpandDO> mapByUserIdModified(Long userIdModified, String... fieldNames);

        public Integer countByUserIdModified(Long userIdModified);

        public default UserExpandDO singleResultByUserIdModified(Long userIdModified, String... fieldNames){
             List<UserExpandDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserExpandDO>> groupingByUserIdModified(Long userIdModified, Function<UserExpandDO, T> mapper, String... fieldNames){
             List<UserExpandDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(UserExpandDO updateDO, Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(UserExpandDO updateDO, Long userIdModified);

        public Integer deleteByUserIdModified(Long userIdModified);






        public List<UserExpandDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Map<Long,UserExpandDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Integer countByInUserIdModified(Collection<Long> userIdModifiedList);

         public default UserExpandDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
              List<UserExpandDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserExpandDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<UserExpandDO, T> mapper, String... fieldNames){
              List<UserExpandDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdModified(UserExpandDO updateDO, Collection<Long> userIdModifiedList);

         public Integer updateAllFieldsByInUserIdModified(UserExpandDO updateDO, Collection<Long> userIdModifiedList);

         public Integer deleteByInUserIdModified(Collection<Long> userIdModifiedList);


}

