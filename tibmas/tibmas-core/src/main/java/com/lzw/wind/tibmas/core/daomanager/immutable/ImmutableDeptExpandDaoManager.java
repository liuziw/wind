package com.lzw.wind.tibmas.core.daomanager.immutable;

import com.hyzs.gz.common.dao.daomanager.CommonDaoManager;
import com.hyzs.tibmas.core.dbo.DeptExpandDO;
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
public interface ImmutableDeptExpandDaoManager extends CommonDaoManager<DeptExpandDO,Long> {


        /**
         * 根据主键获取记录
         *
         */
        public DeptExpandDO getById(Long id);

        public List<DeptExpandDO> listById(Long id, String... fieldNames);

        public Map<Long,DeptExpandDO> mapById(Long id, String... fieldNames);

        public Integer countById(Long id);

        public default DeptExpandDO singleResultById(Long id, String... fieldNames){
             List<DeptExpandDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptExpandDO>> groupingById(Long id, Function<DeptExpandDO, T> mapper, String... fieldNames){
             List<DeptExpandDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(DeptExpandDO updateDO, Long id);

        public Integer updateAllFieldsById(DeptExpandDO updateDO, Long id);

        public Integer deleteById(Long id);






        public List<DeptExpandDO> listByInId(Collection<Long> idList, String... fieldNames);

         public Map<Long,DeptExpandDO> mapByInId(Collection<Long> idList, String... fieldNames);

         public Integer countByInId(Collection<Long> idList);

         public default DeptExpandDO singleResultByInId(Collection<Long> idList, String... fieldNames){
              List<DeptExpandDO> list=this.listByInId(idList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptExpandDO>> groupingByInId(Collection<Long> idList, Function<DeptExpandDO, T> mapper, String... fieldNames){
              List<DeptExpandDO> list=this.listByInId(idList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInId(DeptExpandDO updateDO, Collection<Long> idList);

         public Integer updateAllFieldsByInId(DeptExpandDO updateDO, Collection<Long> idList);

         public Integer deleteByInId(Collection<Long> idList);
        public List<DeptExpandDO> listByPropertyName(String propertyName, String... fieldNames);

        public Map<Long,DeptExpandDO> mapByPropertyName(String propertyName, String... fieldNames);

        public Integer countByPropertyName(String propertyName);

        public default DeptExpandDO singleResultByPropertyName(String propertyName, String... fieldNames){
             List<DeptExpandDO> list=this.listByPropertyName(propertyName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptExpandDO>> groupingByPropertyName(String propertyName, Function<DeptExpandDO, T> mapper, String... fieldNames){
             List<DeptExpandDO> list=this.listByPropertyName(propertyName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPropertyName(DeptExpandDO updateDO, String propertyName);

        public Integer updateAllFieldsByPropertyName(DeptExpandDO updateDO, String propertyName);

        public Integer deleteByPropertyName(String propertyName);






        public List<DeptExpandDO> listByInPropertyName(Collection<String> propertyNameList, String... fieldNames);

         public Map<Long,DeptExpandDO> mapByInPropertyName(Collection<String> propertyNameList, String... fieldNames);

         public Integer countByInPropertyName(Collection<String> propertyNameList);

         public default DeptExpandDO singleResultByInPropertyName(Collection<String> propertyNameList, String... fieldNames){
              List<DeptExpandDO> list=this.listByInPropertyName(propertyNameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptExpandDO>> groupingByInPropertyName(Collection<String> propertyNameList, Function<DeptExpandDO, T> mapper, String... fieldNames){
              List<DeptExpandDO> list=this.listByInPropertyName(propertyNameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPropertyName(DeptExpandDO updateDO, Collection<String> propertyNameList);

         public Integer updateAllFieldsByInPropertyName(DeptExpandDO updateDO, Collection<String> propertyNameList);

         public Integer deleteByInPropertyName(Collection<String> propertyNameList);
        public List<DeptExpandDO> listByPropertyValue(String propertyValue, String... fieldNames);

        public Map<Long,DeptExpandDO> mapByPropertyValue(String propertyValue, String... fieldNames);

        public Integer countByPropertyValue(String propertyValue);

        public default DeptExpandDO singleResultByPropertyValue(String propertyValue, String... fieldNames){
             List<DeptExpandDO> list=this.listByPropertyValue(propertyValue,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptExpandDO>> groupingByPropertyValue(String propertyValue, Function<DeptExpandDO, T> mapper, String... fieldNames){
             List<DeptExpandDO> list=this.listByPropertyValue(propertyValue,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPropertyValue(DeptExpandDO updateDO, String propertyValue);

        public Integer updateAllFieldsByPropertyValue(DeptExpandDO updateDO, String propertyValue);

        public Integer deleteByPropertyValue(String propertyValue);






        public List<DeptExpandDO> listByInPropertyValue(Collection<String> propertyValueList, String... fieldNames);

         public Map<Long,DeptExpandDO> mapByInPropertyValue(Collection<String> propertyValueList, String... fieldNames);

         public Integer countByInPropertyValue(Collection<String> propertyValueList);

         public default DeptExpandDO singleResultByInPropertyValue(Collection<String> propertyValueList, String... fieldNames){
              List<DeptExpandDO> list=this.listByInPropertyValue(propertyValueList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptExpandDO>> groupingByInPropertyValue(Collection<String> propertyValueList, Function<DeptExpandDO, T> mapper, String... fieldNames){
              List<DeptExpandDO> list=this.listByInPropertyValue(propertyValueList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPropertyValue(DeptExpandDO updateDO, Collection<String> propertyValueList);

         public Integer updateAllFieldsByInPropertyValue(DeptExpandDO updateDO, Collection<String> propertyValueList);

         public Integer deleteByInPropertyValue(Collection<String> propertyValueList);
        public List<DeptExpandDO> listByDeptId(Long deptId, String... fieldNames);

        public Map<Long,DeptExpandDO> mapByDeptId(Long deptId, String... fieldNames);

        public Integer countByDeptId(Long deptId);

        public default DeptExpandDO singleResultByDeptId(Long deptId, String... fieldNames){
             List<DeptExpandDO> list=this.listByDeptId(deptId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptExpandDO>> groupingByDeptId(Long deptId, Function<DeptExpandDO, T> mapper, String... fieldNames){
             List<DeptExpandDO> list=this.listByDeptId(deptId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeptId(DeptExpandDO updateDO, Long deptId);

        public Integer updateAllFieldsByDeptId(DeptExpandDO updateDO, Long deptId);

        public Integer deleteByDeptId(Long deptId);






        public List<DeptExpandDO> listByInDeptId(Collection<Long> deptIdList, String... fieldNames);

         public Map<Long,DeptExpandDO> mapByInDeptId(Collection<Long> deptIdList, String... fieldNames);

         public Integer countByInDeptId(Collection<Long> deptIdList);

         public default DeptExpandDO singleResultByInDeptId(Collection<Long> deptIdList, String... fieldNames){
              List<DeptExpandDO> list=this.listByInDeptId(deptIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptExpandDO>> groupingByInDeptId(Collection<Long> deptIdList, Function<DeptExpandDO, T> mapper, String... fieldNames){
              List<DeptExpandDO> list=this.listByInDeptId(deptIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInDeptId(DeptExpandDO updateDO, Collection<Long> deptIdList);

         public Integer updateAllFieldsByInDeptId(DeptExpandDO updateDO, Collection<Long> deptIdList);

         public Integer deleteByInDeptId(Collection<Long> deptIdList);
        public List<DeptExpandDO> listByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Map<Long,DeptExpandDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Integer countByUserIdCreate(Long userIdCreate);

        public default DeptExpandDO singleResultByUserIdCreate(Long userIdCreate, String... fieldNames){
             List<DeptExpandDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptExpandDO>> groupingByUserIdCreate(Long userIdCreate, Function<DeptExpandDO, T> mapper, String... fieldNames){
             List<DeptExpandDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(DeptExpandDO updateDO, Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(DeptExpandDO updateDO, Long userIdCreate);

        public Integer deleteByUserIdCreate(Long userIdCreate);






        public List<DeptExpandDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Map<Long,DeptExpandDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Integer countByInUserIdCreate(Collection<Long> userIdCreateList);

         public default DeptExpandDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
              List<DeptExpandDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptExpandDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<DeptExpandDO, T> mapper, String... fieldNames){
              List<DeptExpandDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdCreate(DeptExpandDO updateDO, Collection<Long> userIdCreateList);

         public Integer updateAllFieldsByInUserIdCreate(DeptExpandDO updateDO, Collection<Long> userIdCreateList);

         public Integer deleteByInUserIdCreate(Collection<Long> userIdCreateList);
        public List<DeptExpandDO> listByUserIdModified(Long userIdModified, String... fieldNames);

        public Map<Long,DeptExpandDO> mapByUserIdModified(Long userIdModified, String... fieldNames);

        public Integer countByUserIdModified(Long userIdModified);

        public default DeptExpandDO singleResultByUserIdModified(Long userIdModified, String... fieldNames){
             List<DeptExpandDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptExpandDO>> groupingByUserIdModified(Long userIdModified, Function<DeptExpandDO, T> mapper, String... fieldNames){
             List<DeptExpandDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(DeptExpandDO updateDO, Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(DeptExpandDO updateDO, Long userIdModified);

        public Integer deleteByUserIdModified(Long userIdModified);






        public List<DeptExpandDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Map<Long,DeptExpandDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Integer countByInUserIdModified(Collection<Long> userIdModifiedList);

         public default DeptExpandDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
              List<DeptExpandDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptExpandDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<DeptExpandDO, T> mapper, String... fieldNames){
              List<DeptExpandDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdModified(DeptExpandDO updateDO, Collection<Long> userIdModifiedList);

         public Integer updateAllFieldsByInUserIdModified(DeptExpandDO updateDO, Collection<Long> userIdModifiedList);

         public Integer deleteByInUserIdModified(Collection<Long> userIdModifiedList);


}

