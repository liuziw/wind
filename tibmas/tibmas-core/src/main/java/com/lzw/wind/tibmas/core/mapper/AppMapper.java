package com.lzw.wind.tibmas.core.mapper;

import com.hyzs.gz.common.dao.mapper.CommonMapper;
import com.hyzs.tibmas.core.dbo.AppDO;
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
public interface AppMapper extends CommonMapper<AppDO,Long> {


        public AppDO getById(@Param("id") Long id, @Param("fieldNames") String... fieldNames);



        public List<AppDO> listById(@Param("id") Long id, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppDO> mapById(@Param("id") Long id, @Param("fieldNames") String[] fieldNames);

        public Integer countById(@Param("id") Long id);

        public default AppDO singleResultById(Long id, String[] fieldNames){
             List<AppDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingById(Long id, Function<AppDO, T> mapper, String[] fieldNames){
             List<AppDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(@Param("updateDO") AppDO updateDO, @Param("id") Long id);

        public Integer updateAllFieldsById(@Param("updateDO") AppDO updateDO, @Param("id") Long id);

        public Integer deleteById(@Param("id") Long id);




        public List<AppDO> listByInId(@Param("idList") Collection<Long> idList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppDO> mapByInId(@Param("idList") Collection<Long> idList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInId(@Param("idList") Collection<Long> idList);

        public default AppDO singleResultByInId(Collection<Long> idList, String[] fieldNames){
             List<AppDO> list=this.listByInId(idList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByInId(Collection<Long> idList, Function<AppDO, T> mapper, String[] fieldNames){
             List<AppDO> list=this.listByInId(idList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInId(@Param("updateDO") AppDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer updateAllFieldsByInId(@Param("updateDO") AppDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer deleteByInId(@Param("idList") Collection<Long> idList);

        public List<AppDO> listByAppCode(@Param("appCode") String appCode, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppDO> mapByAppCode(@Param("appCode") String appCode, @Param("fieldNames") String[] fieldNames);

        public Integer countByAppCode(@Param("appCode") String appCode);

        public default AppDO singleResultByAppCode(String appCode, String[] fieldNames){
             List<AppDO> list=this.listByAppCode(appCode,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByAppCode(String appCode, Function<AppDO, T> mapper, String[] fieldNames){
             List<AppDO> list=this.listByAppCode(appCode,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAppCode(@Param("updateDO") AppDO updateDO, @Param("appCode") String appCode);

        public Integer updateAllFieldsByAppCode(@Param("updateDO") AppDO updateDO, @Param("appCode") String appCode);

        public Integer deleteByAppCode(@Param("appCode") String appCode);




        public List<AppDO> listByInAppCode(@Param("appCodeList") Collection<String> appCodeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppDO> mapByInAppCode(@Param("appCodeList") Collection<String> appCodeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInAppCode(@Param("appCodeList") Collection<String> appCodeList);

        public default AppDO singleResultByInAppCode(Collection<String> appCodeList, String[] fieldNames){
             List<AppDO> list=this.listByInAppCode(appCodeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByInAppCode(Collection<String> appCodeList, Function<AppDO, T> mapper, String[] fieldNames){
             List<AppDO> list=this.listByInAppCode(appCodeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInAppCode(@Param("updateDO") AppDO updateDO, @Param("appCodeList") Collection<String> appCodeList);

        public Integer updateAllFieldsByInAppCode(@Param("updateDO") AppDO updateDO, @Param("appCodeList") Collection<String> appCodeList);

        public Integer deleteByInAppCode(@Param("appCodeList") Collection<String> appCodeList);

        public List<AppDO> listByAppName(@Param("appName") String appName, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppDO> mapByAppName(@Param("appName") String appName, @Param("fieldNames") String[] fieldNames);

        public Integer countByAppName(@Param("appName") String appName);

        public default AppDO singleResultByAppName(String appName, String[] fieldNames){
             List<AppDO> list=this.listByAppName(appName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByAppName(String appName, Function<AppDO, T> mapper, String[] fieldNames){
             List<AppDO> list=this.listByAppName(appName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAppName(@Param("updateDO") AppDO updateDO, @Param("appName") String appName);

        public Integer updateAllFieldsByAppName(@Param("updateDO") AppDO updateDO, @Param("appName") String appName);

        public Integer deleteByAppName(@Param("appName") String appName);




        public List<AppDO> listByInAppName(@Param("appNameList") Collection<String> appNameList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppDO> mapByInAppName(@Param("appNameList") Collection<String> appNameList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInAppName(@Param("appNameList") Collection<String> appNameList);

        public default AppDO singleResultByInAppName(Collection<String> appNameList, String[] fieldNames){
             List<AppDO> list=this.listByInAppName(appNameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByInAppName(Collection<String> appNameList, Function<AppDO, T> mapper, String[] fieldNames){
             List<AppDO> list=this.listByInAppName(appNameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInAppName(@Param("updateDO") AppDO updateDO, @Param("appNameList") Collection<String> appNameList);

        public Integer updateAllFieldsByInAppName(@Param("updateDO") AppDO updateDO, @Param("appNameList") Collection<String> appNameList);

        public Integer deleteByInAppName(@Param("appNameList") Collection<String> appNameList);

        public List<AppDO> listByAppIcon(@Param("appIcon") Long appIcon, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppDO> mapByAppIcon(@Param("appIcon") Long appIcon, @Param("fieldNames") String[] fieldNames);

        public Integer countByAppIcon(@Param("appIcon") Long appIcon);

        public default AppDO singleResultByAppIcon(Long appIcon, String[] fieldNames){
             List<AppDO> list=this.listByAppIcon(appIcon,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByAppIcon(Long appIcon, Function<AppDO, T> mapper, String[] fieldNames){
             List<AppDO> list=this.listByAppIcon(appIcon,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAppIcon(@Param("updateDO") AppDO updateDO, @Param("appIcon") Long appIcon);

        public Integer updateAllFieldsByAppIcon(@Param("updateDO") AppDO updateDO, @Param("appIcon") Long appIcon);

        public Integer deleteByAppIcon(@Param("appIcon") Long appIcon);




        public List<AppDO> listByInAppIcon(@Param("appIconList") Collection<Long> appIconList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppDO> mapByInAppIcon(@Param("appIconList") Collection<Long> appIconList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInAppIcon(@Param("appIconList") Collection<Long> appIconList);

        public default AppDO singleResultByInAppIcon(Collection<Long> appIconList, String[] fieldNames){
             List<AppDO> list=this.listByInAppIcon(appIconList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByInAppIcon(Collection<Long> appIconList, Function<AppDO, T> mapper, String[] fieldNames){
             List<AppDO> list=this.listByInAppIcon(appIconList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInAppIcon(@Param("updateDO") AppDO updateDO, @Param("appIconList") Collection<Long> appIconList);

        public Integer updateAllFieldsByInAppIcon(@Param("updateDO") AppDO updateDO, @Param("appIconList") Collection<Long> appIconList);

        public Integer deleteByInAppIcon(@Param("appIconList") Collection<Long> appIconList);

        public List<AppDO> listByAppDesc(@Param("appDesc") String appDesc, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppDO> mapByAppDesc(@Param("appDesc") String appDesc, @Param("fieldNames") String[] fieldNames);

        public Integer countByAppDesc(@Param("appDesc") String appDesc);

        public default AppDO singleResultByAppDesc(String appDesc, String[] fieldNames){
             List<AppDO> list=this.listByAppDesc(appDesc,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByAppDesc(String appDesc, Function<AppDO, T> mapper, String[] fieldNames){
             List<AppDO> list=this.listByAppDesc(appDesc,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAppDesc(@Param("updateDO") AppDO updateDO, @Param("appDesc") String appDesc);

        public Integer updateAllFieldsByAppDesc(@Param("updateDO") AppDO updateDO, @Param("appDesc") String appDesc);

        public Integer deleteByAppDesc(@Param("appDesc") String appDesc);




        public List<AppDO> listByInAppDesc(@Param("appDescList") Collection<String> appDescList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppDO> mapByInAppDesc(@Param("appDescList") Collection<String> appDescList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInAppDesc(@Param("appDescList") Collection<String> appDescList);

        public default AppDO singleResultByInAppDesc(Collection<String> appDescList, String[] fieldNames){
             List<AppDO> list=this.listByInAppDesc(appDescList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByInAppDesc(Collection<String> appDescList, Function<AppDO, T> mapper, String[] fieldNames){
             List<AppDO> list=this.listByInAppDesc(appDescList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInAppDesc(@Param("updateDO") AppDO updateDO, @Param("appDescList") Collection<String> appDescList);

        public Integer updateAllFieldsByInAppDesc(@Param("updateDO") AppDO updateDO, @Param("appDescList") Collection<String> appDescList);

        public Integer deleteByInAppDesc(@Param("appDescList") Collection<String> appDescList);

        public List<AppDO> listByAppUrl(@Param("appUrl") String appUrl, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppDO> mapByAppUrl(@Param("appUrl") String appUrl, @Param("fieldNames") String[] fieldNames);

        public Integer countByAppUrl(@Param("appUrl") String appUrl);

        public default AppDO singleResultByAppUrl(String appUrl, String[] fieldNames){
             List<AppDO> list=this.listByAppUrl(appUrl,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByAppUrl(String appUrl, Function<AppDO, T> mapper, String[] fieldNames){
             List<AppDO> list=this.listByAppUrl(appUrl,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAppUrl(@Param("updateDO") AppDO updateDO, @Param("appUrl") String appUrl);

        public Integer updateAllFieldsByAppUrl(@Param("updateDO") AppDO updateDO, @Param("appUrl") String appUrl);

        public Integer deleteByAppUrl(@Param("appUrl") String appUrl);




        public List<AppDO> listByInAppUrl(@Param("appUrlList") Collection<String> appUrlList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppDO> mapByInAppUrl(@Param("appUrlList") Collection<String> appUrlList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInAppUrl(@Param("appUrlList") Collection<String> appUrlList);

        public default AppDO singleResultByInAppUrl(Collection<String> appUrlList, String[] fieldNames){
             List<AppDO> list=this.listByInAppUrl(appUrlList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByInAppUrl(Collection<String> appUrlList, Function<AppDO, T> mapper, String[] fieldNames){
             List<AppDO> list=this.listByInAppUrl(appUrlList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInAppUrl(@Param("updateDO") AppDO updateDO, @Param("appUrlList") Collection<String> appUrlList);

        public Integer updateAllFieldsByInAppUrl(@Param("updateDO") AppDO updateDO, @Param("appUrlList") Collection<String> appUrlList);

        public Integer deleteByInAppUrl(@Param("appUrlList") Collection<String> appUrlList);

        public List<AppDO> listByAccessKey(@Param("accessKey") String accessKey, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppDO> mapByAccessKey(@Param("accessKey") String accessKey, @Param("fieldNames") String[] fieldNames);

        public Integer countByAccessKey(@Param("accessKey") String accessKey);

        public default AppDO singleResultByAccessKey(String accessKey, String[] fieldNames){
             List<AppDO> list=this.listByAccessKey(accessKey,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByAccessKey(String accessKey, Function<AppDO, T> mapper, String[] fieldNames){
             List<AppDO> list=this.listByAccessKey(accessKey,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAccessKey(@Param("updateDO") AppDO updateDO, @Param("accessKey") String accessKey);

        public Integer updateAllFieldsByAccessKey(@Param("updateDO") AppDO updateDO, @Param("accessKey") String accessKey);

        public Integer deleteByAccessKey(@Param("accessKey") String accessKey);




        public List<AppDO> listByInAccessKey(@Param("accessKeyList") Collection<String> accessKeyList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppDO> mapByInAccessKey(@Param("accessKeyList") Collection<String> accessKeyList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInAccessKey(@Param("accessKeyList") Collection<String> accessKeyList);

        public default AppDO singleResultByInAccessKey(Collection<String> accessKeyList, String[] fieldNames){
             List<AppDO> list=this.listByInAccessKey(accessKeyList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByInAccessKey(Collection<String> accessKeyList, Function<AppDO, T> mapper, String[] fieldNames){
             List<AppDO> list=this.listByInAccessKey(accessKeyList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInAccessKey(@Param("updateDO") AppDO updateDO, @Param("accessKeyList") Collection<String> accessKeyList);

        public Integer updateAllFieldsByInAccessKey(@Param("updateDO") AppDO updateDO, @Param("accessKeyList") Collection<String> accessKeyList);

        public Integer deleteByInAccessKey(@Param("accessKeyList") Collection<String> accessKeyList);

        public List<AppDO> listByAccessKeyPlain(@Param("accessKeyPlain") String accessKeyPlain, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppDO> mapByAccessKeyPlain(@Param("accessKeyPlain") String accessKeyPlain, @Param("fieldNames") String[] fieldNames);

        public Integer countByAccessKeyPlain(@Param("accessKeyPlain") String accessKeyPlain);

        public default AppDO singleResultByAccessKeyPlain(String accessKeyPlain, String[] fieldNames){
             List<AppDO> list=this.listByAccessKeyPlain(accessKeyPlain,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByAccessKeyPlain(String accessKeyPlain, Function<AppDO, T> mapper, String[] fieldNames){
             List<AppDO> list=this.listByAccessKeyPlain(accessKeyPlain,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAccessKeyPlain(@Param("updateDO") AppDO updateDO, @Param("accessKeyPlain") String accessKeyPlain);

        public Integer updateAllFieldsByAccessKeyPlain(@Param("updateDO") AppDO updateDO, @Param("accessKeyPlain") String accessKeyPlain);

        public Integer deleteByAccessKeyPlain(@Param("accessKeyPlain") String accessKeyPlain);




        public List<AppDO> listByInAccessKeyPlain(@Param("accessKeyPlainList") Collection<String> accessKeyPlainList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppDO> mapByInAccessKeyPlain(@Param("accessKeyPlainList") Collection<String> accessKeyPlainList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInAccessKeyPlain(@Param("accessKeyPlainList") Collection<String> accessKeyPlainList);

        public default AppDO singleResultByInAccessKeyPlain(Collection<String> accessKeyPlainList, String[] fieldNames){
             List<AppDO> list=this.listByInAccessKeyPlain(accessKeyPlainList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByInAccessKeyPlain(Collection<String> accessKeyPlainList, Function<AppDO, T> mapper, String[] fieldNames){
             List<AppDO> list=this.listByInAccessKeyPlain(accessKeyPlainList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInAccessKeyPlain(@Param("updateDO") AppDO updateDO, @Param("accessKeyPlainList") Collection<String> accessKeyPlainList);

        public Integer updateAllFieldsByInAccessKeyPlain(@Param("updateDO") AppDO updateDO, @Param("accessKeyPlainList") Collection<String> accessKeyPlainList);

        public Integer deleteByInAccessKeyPlain(@Param("accessKeyPlainList") Collection<String> accessKeyPlainList);

        public List<AppDO> listByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppDO> mapByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdCreate(@Param("userIdCreate") Long userIdCreate);

        public default AppDO singleResultByUserIdCreate(Long userIdCreate, String[] fieldNames){
             List<AppDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByUserIdCreate(Long userIdCreate, Function<AppDO, T> mapper, String[] fieldNames){
             List<AppDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(@Param("updateDO") AppDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(@Param("updateDO") AppDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer deleteByUserIdCreate(@Param("userIdCreate") Long userIdCreate);




        public List<AppDO> listByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppDO> mapByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public default AppDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String[] fieldNames){
             List<AppDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<AppDO, T> mapper, String[] fieldNames){
             List<AppDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdCreate(@Param("updateDO") AppDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer updateAllFieldsByInUserIdCreate(@Param("updateDO") AppDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer deleteByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public List<AppDO> listByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppDO> mapByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdModified(@Param("userIdModified") Long userIdModified);

        public default AppDO singleResultByUserIdModified(Long userIdModified, String[] fieldNames){
             List<AppDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByUserIdModified(Long userIdModified, Function<AppDO, T> mapper, String[] fieldNames){
             List<AppDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(@Param("updateDO") AppDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(@Param("updateDO") AppDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer deleteByUserIdModified(@Param("userIdModified") Long userIdModified);




        public List<AppDO> listByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,AppDO> mapByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public default AppDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String[] fieldNames){
             List<AppDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<AppDO, T> mapper, String[] fieldNames){
             List<AppDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdModified(@Param("updateDO") AppDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer updateAllFieldsByInUserIdModified(@Param("updateDO") AppDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer deleteByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);


}
