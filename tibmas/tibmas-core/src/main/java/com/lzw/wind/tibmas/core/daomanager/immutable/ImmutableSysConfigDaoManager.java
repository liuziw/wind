package com.lzw.wind.tibmas.core.daomanager.immutable;

import com.lzw.common.dao.daomanager.CommonDaoManager;
import com.lzw.wind.tibmas.core.dbo.SysConfigDO;
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
public interface ImmutableSysConfigDaoManager extends CommonDaoManager<SysConfigDO,Long> {


        public List<SysConfigDO> listByConfigKey(String configKey, String... fieldNames);

        public Map<Long,SysConfigDO> mapByConfigKey(String configKey, String... fieldNames);

        public Integer countByConfigKey(String configKey);

        public default SysConfigDO singleResultByConfigKey(String configKey, String... fieldNames){
             List<SysConfigDO> list=this.listByConfigKey(configKey,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysConfigDO>> groupingByConfigKey(String configKey, Function<SysConfigDO, T> mapper, String... fieldNames){
             List<SysConfigDO> list=this.listByConfigKey(configKey,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByConfigKey(SysConfigDO updateDO, String configKey);

        public Integer updateAllFieldsByConfigKey(SysConfigDO updateDO, String configKey);

        public Integer deleteByConfigKey(String configKey);






        public List<SysConfigDO> listByInConfigKey(Collection<String> configKeyList, String... fieldNames);

         public Map<Long,SysConfigDO> mapByInConfigKey(Collection<String> configKeyList, String... fieldNames);

         public Integer countByInConfigKey(Collection<String> configKeyList);

         public default SysConfigDO singleResultByInConfigKey(Collection<String> configKeyList, String... fieldNames){
              List<SysConfigDO> list=this.listByInConfigKey(configKeyList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysConfigDO>> groupingByInConfigKey(Collection<String> configKeyList, Function<SysConfigDO, T> mapper, String... fieldNames){
              List<SysConfigDO> list=this.listByInConfigKey(configKeyList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInConfigKey(SysConfigDO updateDO, Collection<String> configKeyList);

         public Integer updateAllFieldsByInConfigKey(SysConfigDO updateDO, Collection<String> configKeyList);

         public Integer deleteByInConfigKey(Collection<String> configKeyList);
        public List<SysConfigDO> listByConfigValue(String configValue, String... fieldNames);

        public Map<Long,SysConfigDO> mapByConfigValue(String configValue, String... fieldNames);

        public Integer countByConfigValue(String configValue);

        public default SysConfigDO singleResultByConfigValue(String configValue, String... fieldNames){
             List<SysConfigDO> list=this.listByConfigValue(configValue,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysConfigDO>> groupingByConfigValue(String configValue, Function<SysConfigDO, T> mapper, String... fieldNames){
             List<SysConfigDO> list=this.listByConfigValue(configValue,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByConfigValue(SysConfigDO updateDO, String configValue);

        public Integer updateAllFieldsByConfigValue(SysConfigDO updateDO, String configValue);

        public Integer deleteByConfigValue(String configValue);






        public List<SysConfigDO> listByInConfigValue(Collection<String> configValueList, String... fieldNames);

         public Map<Long,SysConfigDO> mapByInConfigValue(Collection<String> configValueList, String... fieldNames);

         public Integer countByInConfigValue(Collection<String> configValueList);

         public default SysConfigDO singleResultByInConfigValue(Collection<String> configValueList, String... fieldNames){
              List<SysConfigDO> list=this.listByInConfigValue(configValueList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysConfigDO>> groupingByInConfigValue(Collection<String> configValueList, Function<SysConfigDO, T> mapper, String... fieldNames){
              List<SysConfigDO> list=this.listByInConfigValue(configValueList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInConfigValue(SysConfigDO updateDO, Collection<String> configValueList);

         public Integer updateAllFieldsByInConfigValue(SysConfigDO updateDO, Collection<String> configValueList);

         public Integer deleteByInConfigValue(Collection<String> configValueList);
        public List<SysConfigDO> listByRemark(String remark, String... fieldNames);

        public Map<Long,SysConfigDO> mapByRemark(String remark, String... fieldNames);

        public Integer countByRemark(String remark);

        public default SysConfigDO singleResultByRemark(String remark, String... fieldNames){
             List<SysConfigDO> list=this.listByRemark(remark,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysConfigDO>> groupingByRemark(String remark, Function<SysConfigDO, T> mapper, String... fieldNames){
             List<SysConfigDO> list=this.listByRemark(remark,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRemark(SysConfigDO updateDO, String remark);

        public Integer updateAllFieldsByRemark(SysConfigDO updateDO, String remark);

        public Integer deleteByRemark(String remark);






        public List<SysConfigDO> listByInRemark(Collection<String> remarkList, String... fieldNames);

         public Map<Long,SysConfigDO> mapByInRemark(Collection<String> remarkList, String... fieldNames);

         public Integer countByInRemark(Collection<String> remarkList);

         public default SysConfigDO singleResultByInRemark(Collection<String> remarkList, String... fieldNames){
              List<SysConfigDO> list=this.listByInRemark(remarkList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysConfigDO>> groupingByInRemark(Collection<String> remarkList, Function<SysConfigDO, T> mapper, String... fieldNames){
              List<SysConfigDO> list=this.listByInRemark(remarkList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInRemark(SysConfigDO updateDO, Collection<String> remarkList);

         public Integer updateAllFieldsByInRemark(SysConfigDO updateDO, Collection<String> remarkList);

         public Integer deleteByInRemark(Collection<String> remarkList);
        public List<SysConfigDO> listByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Map<Long,SysConfigDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Integer countByUserIdCreate(Long userIdCreate);

        public default SysConfigDO singleResultByUserIdCreate(Long userIdCreate, String... fieldNames){
             List<SysConfigDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysConfigDO>> groupingByUserIdCreate(Long userIdCreate, Function<SysConfigDO, T> mapper, String... fieldNames){
             List<SysConfigDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(SysConfigDO updateDO, Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(SysConfigDO updateDO, Long userIdCreate);

        public Integer deleteByUserIdCreate(Long userIdCreate);






        public List<SysConfigDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Map<Long,SysConfigDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Integer countByInUserIdCreate(Collection<Long> userIdCreateList);

         public default SysConfigDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
              List<SysConfigDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysConfigDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<SysConfigDO, T> mapper, String... fieldNames){
              List<SysConfigDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdCreate(SysConfigDO updateDO, Collection<Long> userIdCreateList);

         public Integer updateAllFieldsByInUserIdCreate(SysConfigDO updateDO, Collection<Long> userIdCreateList);

         public Integer deleteByInUserIdCreate(Collection<Long> userIdCreateList);
        public List<SysConfigDO> listByUserIdModified(Long userIdModified, String... fieldNames);

        public Map<Long,SysConfigDO> mapByUserIdModified(Long userIdModified, String... fieldNames);

        public Integer countByUserIdModified(Long userIdModified);

        public default SysConfigDO singleResultByUserIdModified(Long userIdModified, String... fieldNames){
             List<SysConfigDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysConfigDO>> groupingByUserIdModified(Long userIdModified, Function<SysConfigDO, T> mapper, String... fieldNames){
             List<SysConfigDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(SysConfigDO updateDO, Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(SysConfigDO updateDO, Long userIdModified);

        public Integer deleteByUserIdModified(Long userIdModified);






        public List<SysConfigDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Map<Long,SysConfigDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Integer countByInUserIdModified(Collection<Long> userIdModifiedList);

         public default SysConfigDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
              List<SysConfigDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<SysConfigDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<SysConfigDO, T> mapper, String... fieldNames){
              List<SysConfigDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdModified(SysConfigDO updateDO, Collection<Long> userIdModifiedList);

         public Integer updateAllFieldsByInUserIdModified(SysConfigDO updateDO, Collection<Long> userIdModifiedList);

         public Integer deleteByInUserIdModified(Collection<Long> userIdModifiedList);


}

