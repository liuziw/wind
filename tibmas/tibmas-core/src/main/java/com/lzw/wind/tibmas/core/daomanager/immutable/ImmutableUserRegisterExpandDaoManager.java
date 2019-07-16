package com.lzw.wind.tibmas.core.daomanager.immutable;

import com.hyzs.gz.common.dao.daomanager.CommonDaoManager;
import com.hyzs.tibmas.core.dbo.UserRegisterExpandDO;
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
public interface ImmutableUserRegisterExpandDaoManager extends CommonDaoManager<UserRegisterExpandDO,Long> {


        public List<UserRegisterExpandDO> listByPropertyName(String propertyName, String... fieldNames);

        public Map<Long,UserRegisterExpandDO> mapByPropertyName(String propertyName, String... fieldNames);

        public Integer countByPropertyName(String propertyName);

        public default UserRegisterExpandDO singleResultByPropertyName(String propertyName, String... fieldNames){
             List<UserRegisterExpandDO> list=this.listByPropertyName(propertyName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterExpandDO>> groupingByPropertyName(String propertyName, Function<UserRegisterExpandDO, T> mapper, String... fieldNames){
             List<UserRegisterExpandDO> list=this.listByPropertyName(propertyName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPropertyName(UserRegisterExpandDO updateDO, String propertyName);

        public Integer updateAllFieldsByPropertyName(UserRegisterExpandDO updateDO, String propertyName);

        public Integer deleteByPropertyName(String propertyName);






        public List<UserRegisterExpandDO> listByInPropertyName(Collection<String> propertyNameList, String... fieldNames);

         public Map<Long,UserRegisterExpandDO> mapByInPropertyName(Collection<String> propertyNameList, String... fieldNames);

         public Integer countByInPropertyName(Collection<String> propertyNameList);

         public default UserRegisterExpandDO singleResultByInPropertyName(Collection<String> propertyNameList, String... fieldNames){
              List<UserRegisterExpandDO> list=this.listByInPropertyName(propertyNameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterExpandDO>> groupingByInPropertyName(Collection<String> propertyNameList, Function<UserRegisterExpandDO, T> mapper, String... fieldNames){
              List<UserRegisterExpandDO> list=this.listByInPropertyName(propertyNameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPropertyName(UserRegisterExpandDO updateDO, Collection<String> propertyNameList);

         public Integer updateAllFieldsByInPropertyName(UserRegisterExpandDO updateDO, Collection<String> propertyNameList);

         public Integer deleteByInPropertyName(Collection<String> propertyNameList);
        public List<UserRegisterExpandDO> listByPropertyValue(String propertyValue, String... fieldNames);

        public Map<Long,UserRegisterExpandDO> mapByPropertyValue(String propertyValue, String... fieldNames);

        public Integer countByPropertyValue(String propertyValue);

        public default UserRegisterExpandDO singleResultByPropertyValue(String propertyValue, String... fieldNames){
             List<UserRegisterExpandDO> list=this.listByPropertyValue(propertyValue,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterExpandDO>> groupingByPropertyValue(String propertyValue, Function<UserRegisterExpandDO, T> mapper, String... fieldNames){
             List<UserRegisterExpandDO> list=this.listByPropertyValue(propertyValue,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPropertyValue(UserRegisterExpandDO updateDO, String propertyValue);

        public Integer updateAllFieldsByPropertyValue(UserRegisterExpandDO updateDO, String propertyValue);

        public Integer deleteByPropertyValue(String propertyValue);






        public List<UserRegisterExpandDO> listByInPropertyValue(Collection<String> propertyValueList, String... fieldNames);

         public Map<Long,UserRegisterExpandDO> mapByInPropertyValue(Collection<String> propertyValueList, String... fieldNames);

         public Integer countByInPropertyValue(Collection<String> propertyValueList);

         public default UserRegisterExpandDO singleResultByInPropertyValue(Collection<String> propertyValueList, String... fieldNames){
              List<UserRegisterExpandDO> list=this.listByInPropertyValue(propertyValueList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterExpandDO>> groupingByInPropertyValue(Collection<String> propertyValueList, Function<UserRegisterExpandDO, T> mapper, String... fieldNames){
              List<UserRegisterExpandDO> list=this.listByInPropertyValue(propertyValueList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPropertyValue(UserRegisterExpandDO updateDO, Collection<String> propertyValueList);

         public Integer updateAllFieldsByInPropertyValue(UserRegisterExpandDO updateDO, Collection<String> propertyValueList);

         public Integer deleteByInPropertyValue(Collection<String> propertyValueList);
        public List<UserRegisterExpandDO> listByRegisterId(Long registerId, String... fieldNames);

        public Map<Long,UserRegisterExpandDO> mapByRegisterId(Long registerId, String... fieldNames);

        public Integer countByRegisterId(Long registerId);

        public default UserRegisterExpandDO singleResultByRegisterId(Long registerId, String... fieldNames){
             List<UserRegisterExpandDO> list=this.listByRegisterId(registerId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterExpandDO>> groupingByRegisterId(Long registerId, Function<UserRegisterExpandDO, T> mapper, String... fieldNames){
             List<UserRegisterExpandDO> list=this.listByRegisterId(registerId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRegisterId(UserRegisterExpandDO updateDO, Long registerId);

        public Integer updateAllFieldsByRegisterId(UserRegisterExpandDO updateDO, Long registerId);

        public Integer deleteByRegisterId(Long registerId);






        public List<UserRegisterExpandDO> listByInRegisterId(Collection<Long> registerIdList, String... fieldNames);

         public Map<Long,UserRegisterExpandDO> mapByInRegisterId(Collection<Long> registerIdList, String... fieldNames);

         public Integer countByInRegisterId(Collection<Long> registerIdList);

         public default UserRegisterExpandDO singleResultByInRegisterId(Collection<Long> registerIdList, String... fieldNames){
              List<UserRegisterExpandDO> list=this.listByInRegisterId(registerIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterExpandDO>> groupingByInRegisterId(Collection<Long> registerIdList, Function<UserRegisterExpandDO, T> mapper, String... fieldNames){
              List<UserRegisterExpandDO> list=this.listByInRegisterId(registerIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInRegisterId(UserRegisterExpandDO updateDO, Collection<Long> registerIdList);

         public Integer updateAllFieldsByInRegisterId(UserRegisterExpandDO updateDO, Collection<Long> registerIdList);

         public Integer deleteByInRegisterId(Collection<Long> registerIdList);
        public List<UserRegisterExpandDO> listByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Map<Long,UserRegisterExpandDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Integer countByUserIdCreate(Long userIdCreate);

        public default UserRegisterExpandDO singleResultByUserIdCreate(Long userIdCreate, String... fieldNames){
             List<UserRegisterExpandDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterExpandDO>> groupingByUserIdCreate(Long userIdCreate, Function<UserRegisterExpandDO, T> mapper, String... fieldNames){
             List<UserRegisterExpandDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(UserRegisterExpandDO updateDO, Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(UserRegisterExpandDO updateDO, Long userIdCreate);

        public Integer deleteByUserIdCreate(Long userIdCreate);






        public List<UserRegisterExpandDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Map<Long,UserRegisterExpandDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Integer countByInUserIdCreate(Collection<Long> userIdCreateList);

         public default UserRegisterExpandDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
              List<UserRegisterExpandDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterExpandDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<UserRegisterExpandDO, T> mapper, String... fieldNames){
              List<UserRegisterExpandDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdCreate(UserRegisterExpandDO updateDO, Collection<Long> userIdCreateList);

         public Integer updateAllFieldsByInUserIdCreate(UserRegisterExpandDO updateDO, Collection<Long> userIdCreateList);

         public Integer deleteByInUserIdCreate(Collection<Long> userIdCreateList);
        public List<UserRegisterExpandDO> listByUserIdModified(Long userIdModified, String... fieldNames);

        public Map<Long,UserRegisterExpandDO> mapByUserIdModified(Long userIdModified, String... fieldNames);

        public Integer countByUserIdModified(Long userIdModified);

        public default UserRegisterExpandDO singleResultByUserIdModified(Long userIdModified, String... fieldNames){
             List<UserRegisterExpandDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRegisterExpandDO>> groupingByUserIdModified(Long userIdModified, Function<UserRegisterExpandDO, T> mapper, String... fieldNames){
             List<UserRegisterExpandDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(UserRegisterExpandDO updateDO, Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(UserRegisterExpandDO updateDO, Long userIdModified);

        public Integer deleteByUserIdModified(Long userIdModified);






        public List<UserRegisterExpandDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Map<Long,UserRegisterExpandDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Integer countByInUserIdModified(Collection<Long> userIdModifiedList);

         public default UserRegisterExpandDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
              List<UserRegisterExpandDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRegisterExpandDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<UserRegisterExpandDO, T> mapper, String... fieldNames){
              List<UserRegisterExpandDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdModified(UserRegisterExpandDO updateDO, Collection<Long> userIdModifiedList);

         public Integer updateAllFieldsByInUserIdModified(UserRegisterExpandDO updateDO, Collection<Long> userIdModifiedList);

         public Integer deleteByInUserIdModified(Collection<Long> userIdModifiedList);


}

