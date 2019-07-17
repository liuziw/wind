package com.lzw.wind.tibmas.core.mapper;

import com.lzw.common.dao.mapper.CommonMapper;
import com.lzw.wind.tibmas.core.dbo.SysConfigDO;
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
public interface SysConfigMapper extends CommonMapper<SysConfigDO,Long> {

        public List<SysConfigDO> listByConfigKey(@Param("configKey") String configKey, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysConfigDO> mapByConfigKey(@Param("configKey") String configKey, @Param("fieldNames") String[] fieldNames);

        public Integer countByConfigKey(@Param("configKey") String configKey);

        public default SysConfigDO singleResultByConfigKey(String configKey, String[] fieldNames){
             List<SysConfigDO> list=this.listByConfigKey(configKey,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysConfigDO>> groupingByConfigKey(String configKey, Function<SysConfigDO, T> mapper, String[] fieldNames){
             List<SysConfigDO> list=this.listByConfigKey(configKey,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByConfigKey(@Param("updateDO") SysConfigDO updateDO, @Param("configKey") String configKey);

        public Integer updateAllFieldsByConfigKey(@Param("updateDO") SysConfigDO updateDO, @Param("configKey") String configKey);

        public Integer deleteByConfigKey(@Param("configKey") String configKey);




        public List<SysConfigDO> listByInConfigKey(@Param("configKeyList") Collection<String> configKeyList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysConfigDO> mapByInConfigKey(@Param("configKeyList") Collection<String> configKeyList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInConfigKey(@Param("configKeyList") Collection<String> configKeyList);

        public default SysConfigDO singleResultByInConfigKey(Collection<String> configKeyList, String[] fieldNames){
             List<SysConfigDO> list=this.listByInConfigKey(configKeyList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysConfigDO>> groupingByInConfigKey(Collection<String> configKeyList, Function<SysConfigDO, T> mapper, String[] fieldNames){
             List<SysConfigDO> list=this.listByInConfigKey(configKeyList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInConfigKey(@Param("updateDO") SysConfigDO updateDO, @Param("configKeyList") Collection<String> configKeyList);

        public Integer updateAllFieldsByInConfigKey(@Param("updateDO") SysConfigDO updateDO, @Param("configKeyList") Collection<String> configKeyList);

        public Integer deleteByInConfigKey(@Param("configKeyList") Collection<String> configKeyList);

        public List<SysConfigDO> listByConfigValue(@Param("configValue") String configValue, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysConfigDO> mapByConfigValue(@Param("configValue") String configValue, @Param("fieldNames") String[] fieldNames);

        public Integer countByConfigValue(@Param("configValue") String configValue);

        public default SysConfigDO singleResultByConfigValue(String configValue, String[] fieldNames){
             List<SysConfigDO> list=this.listByConfigValue(configValue,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysConfigDO>> groupingByConfigValue(String configValue, Function<SysConfigDO, T> mapper, String[] fieldNames){
             List<SysConfigDO> list=this.listByConfigValue(configValue,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByConfigValue(@Param("updateDO") SysConfigDO updateDO, @Param("configValue") String configValue);

        public Integer updateAllFieldsByConfigValue(@Param("updateDO") SysConfigDO updateDO, @Param("configValue") String configValue);

        public Integer deleteByConfigValue(@Param("configValue") String configValue);




        public List<SysConfigDO> listByInConfigValue(@Param("configValueList") Collection<String> configValueList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysConfigDO> mapByInConfigValue(@Param("configValueList") Collection<String> configValueList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInConfigValue(@Param("configValueList") Collection<String> configValueList);

        public default SysConfigDO singleResultByInConfigValue(Collection<String> configValueList, String[] fieldNames){
             List<SysConfigDO> list=this.listByInConfigValue(configValueList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysConfigDO>> groupingByInConfigValue(Collection<String> configValueList, Function<SysConfigDO, T> mapper, String[] fieldNames){
             List<SysConfigDO> list=this.listByInConfigValue(configValueList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInConfigValue(@Param("updateDO") SysConfigDO updateDO, @Param("configValueList") Collection<String> configValueList);

        public Integer updateAllFieldsByInConfigValue(@Param("updateDO") SysConfigDO updateDO, @Param("configValueList") Collection<String> configValueList);

        public Integer deleteByInConfigValue(@Param("configValueList") Collection<String> configValueList);

        public List<SysConfigDO> listByRemark(@Param("remark") String remark, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysConfigDO> mapByRemark(@Param("remark") String remark, @Param("fieldNames") String[] fieldNames);

        public Integer countByRemark(@Param("remark") String remark);

        public default SysConfigDO singleResultByRemark(String remark, String[] fieldNames){
             List<SysConfigDO> list=this.listByRemark(remark,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysConfigDO>> groupingByRemark(String remark, Function<SysConfigDO, T> mapper, String[] fieldNames){
             List<SysConfigDO> list=this.listByRemark(remark,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRemark(@Param("updateDO") SysConfigDO updateDO, @Param("remark") String remark);

        public Integer updateAllFieldsByRemark(@Param("updateDO") SysConfigDO updateDO, @Param("remark") String remark);

        public Integer deleteByRemark(@Param("remark") String remark);




        public List<SysConfigDO> listByInRemark(@Param("remarkList") Collection<String> remarkList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysConfigDO> mapByInRemark(@Param("remarkList") Collection<String> remarkList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInRemark(@Param("remarkList") Collection<String> remarkList);

        public default SysConfigDO singleResultByInRemark(Collection<String> remarkList, String[] fieldNames){
             List<SysConfigDO> list=this.listByInRemark(remarkList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysConfigDO>> groupingByInRemark(Collection<String> remarkList, Function<SysConfigDO, T> mapper, String[] fieldNames){
             List<SysConfigDO> list=this.listByInRemark(remarkList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInRemark(@Param("updateDO") SysConfigDO updateDO, @Param("remarkList") Collection<String> remarkList);

        public Integer updateAllFieldsByInRemark(@Param("updateDO") SysConfigDO updateDO, @Param("remarkList") Collection<String> remarkList);

        public Integer deleteByInRemark(@Param("remarkList") Collection<String> remarkList);

        public List<SysConfigDO> listByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysConfigDO> mapByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdCreate(@Param("userIdCreate") Long userIdCreate);

        public default SysConfigDO singleResultByUserIdCreate(Long userIdCreate, String[] fieldNames){
             List<SysConfigDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysConfigDO>> groupingByUserIdCreate(Long userIdCreate, Function<SysConfigDO, T> mapper, String[] fieldNames){
             List<SysConfigDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(@Param("updateDO") SysConfigDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(@Param("updateDO") SysConfigDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer deleteByUserIdCreate(@Param("userIdCreate") Long userIdCreate);




        public List<SysConfigDO> listByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysConfigDO> mapByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public default SysConfigDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String[] fieldNames){
             List<SysConfigDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysConfigDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<SysConfigDO, T> mapper, String[] fieldNames){
             List<SysConfigDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdCreate(@Param("updateDO") SysConfigDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer updateAllFieldsByInUserIdCreate(@Param("updateDO") SysConfigDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer deleteByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public List<SysConfigDO> listByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysConfigDO> mapByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdModified(@Param("userIdModified") Long userIdModified);

        public default SysConfigDO singleResultByUserIdModified(Long userIdModified, String[] fieldNames){
             List<SysConfigDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysConfigDO>> groupingByUserIdModified(Long userIdModified, Function<SysConfigDO, T> mapper, String[] fieldNames){
             List<SysConfigDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(@Param("updateDO") SysConfigDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(@Param("updateDO") SysConfigDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer deleteByUserIdModified(@Param("userIdModified") Long userIdModified);




        public List<SysConfigDO> listByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,SysConfigDO> mapByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public default SysConfigDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String[] fieldNames){
             List<SysConfigDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<SysConfigDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<SysConfigDO, T> mapper, String[] fieldNames){
             List<SysConfigDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdModified(@Param("updateDO") SysConfigDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer updateAllFieldsByInUserIdModified(@Param("updateDO") SysConfigDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer deleteByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);


}
