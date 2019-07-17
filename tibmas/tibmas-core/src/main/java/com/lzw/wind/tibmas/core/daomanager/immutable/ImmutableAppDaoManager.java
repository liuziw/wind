package com.lzw.wind.tibmas.core.daomanager.immutable;

import com.lzw.common.dao.daomanager.CommonDaoManager;
import com.lzw.wind.tibmas.core.dbo.AppDO;
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
public interface ImmutableAppDaoManager extends CommonDaoManager<AppDO,Long> {


        /**
         * 根据主键获取记录
         *
         */
        public AppDO getById(Long id);

        public List<AppDO> listById(Long id, String... fieldNames);

        public Map<Long,AppDO> mapById(Long id, String... fieldNames);

        public Integer countById(Long id);

        public default AppDO singleResultById(Long id, String... fieldNames){
             List<AppDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingById(Long id, Function<AppDO, T> mapper, String... fieldNames){
             List<AppDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(AppDO updateDO, Long id);

        public Integer updateAllFieldsById(AppDO updateDO, Long id);

        public Integer deleteById(Long id);






        public List<AppDO> listByInId(Collection<Long> idList, String... fieldNames);

         public Map<Long,AppDO> mapByInId(Collection<Long> idList, String... fieldNames);

         public Integer countByInId(Collection<Long> idList);

         public default AppDO singleResultByInId(Collection<Long> idList, String... fieldNames){
              List<AppDO> list=this.listByInId(idList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AppDO>> groupingByInId(Collection<Long> idList, Function<AppDO, T> mapper, String... fieldNames){
              List<AppDO> list=this.listByInId(idList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInId(AppDO updateDO, Collection<Long> idList);

         public Integer updateAllFieldsByInId(AppDO updateDO, Collection<Long> idList);

         public Integer deleteByInId(Collection<Long> idList);
        public List<AppDO> listByAppCode(String appCode, String... fieldNames);

        public Map<Long,AppDO> mapByAppCode(String appCode, String... fieldNames);

        public Integer countByAppCode(String appCode);

        public default AppDO singleResultByAppCode(String appCode, String... fieldNames){
             List<AppDO> list=this.listByAppCode(appCode,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByAppCode(String appCode, Function<AppDO, T> mapper, String... fieldNames){
             List<AppDO> list=this.listByAppCode(appCode,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAppCode(AppDO updateDO, String appCode);

        public Integer updateAllFieldsByAppCode(AppDO updateDO, String appCode);

        public Integer deleteByAppCode(String appCode);






        public List<AppDO> listByInAppCode(Collection<String> appCodeList, String... fieldNames);

         public Map<Long,AppDO> mapByInAppCode(Collection<String> appCodeList, String... fieldNames);

         public Integer countByInAppCode(Collection<String> appCodeList);

         public default AppDO singleResultByInAppCode(Collection<String> appCodeList, String... fieldNames){
              List<AppDO> list=this.listByInAppCode(appCodeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AppDO>> groupingByInAppCode(Collection<String> appCodeList, Function<AppDO, T> mapper, String... fieldNames){
              List<AppDO> list=this.listByInAppCode(appCodeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInAppCode(AppDO updateDO, Collection<String> appCodeList);

         public Integer updateAllFieldsByInAppCode(AppDO updateDO, Collection<String> appCodeList);

         public Integer deleteByInAppCode(Collection<String> appCodeList);
        public List<AppDO> listByAppName(String appName, String... fieldNames);

        public Map<Long,AppDO> mapByAppName(String appName, String... fieldNames);

        public Integer countByAppName(String appName);

        public default AppDO singleResultByAppName(String appName, String... fieldNames){
             List<AppDO> list=this.listByAppName(appName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByAppName(String appName, Function<AppDO, T> mapper, String... fieldNames){
             List<AppDO> list=this.listByAppName(appName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAppName(AppDO updateDO, String appName);

        public Integer updateAllFieldsByAppName(AppDO updateDO, String appName);

        public Integer deleteByAppName(String appName);






        public List<AppDO> listByInAppName(Collection<String> appNameList, String... fieldNames);

         public Map<Long,AppDO> mapByInAppName(Collection<String> appNameList, String... fieldNames);

         public Integer countByInAppName(Collection<String> appNameList);

         public default AppDO singleResultByInAppName(Collection<String> appNameList, String... fieldNames){
              List<AppDO> list=this.listByInAppName(appNameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AppDO>> groupingByInAppName(Collection<String> appNameList, Function<AppDO, T> mapper, String... fieldNames){
              List<AppDO> list=this.listByInAppName(appNameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInAppName(AppDO updateDO, Collection<String> appNameList);

         public Integer updateAllFieldsByInAppName(AppDO updateDO, Collection<String> appNameList);

         public Integer deleteByInAppName(Collection<String> appNameList);
        public List<AppDO> listByAppIcon(Long appIcon, String... fieldNames);

        public Map<Long,AppDO> mapByAppIcon(Long appIcon, String... fieldNames);

        public Integer countByAppIcon(Long appIcon);

        public default AppDO singleResultByAppIcon(Long appIcon, String... fieldNames){
             List<AppDO> list=this.listByAppIcon(appIcon,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByAppIcon(Long appIcon, Function<AppDO, T> mapper, String... fieldNames){
             List<AppDO> list=this.listByAppIcon(appIcon,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAppIcon(AppDO updateDO, Long appIcon);

        public Integer updateAllFieldsByAppIcon(AppDO updateDO, Long appIcon);

        public Integer deleteByAppIcon(Long appIcon);






        public List<AppDO> listByInAppIcon(Collection<Long> appIconList, String... fieldNames);

         public Map<Long,AppDO> mapByInAppIcon(Collection<Long> appIconList, String... fieldNames);

         public Integer countByInAppIcon(Collection<Long> appIconList);

         public default AppDO singleResultByInAppIcon(Collection<Long> appIconList, String... fieldNames){
              List<AppDO> list=this.listByInAppIcon(appIconList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AppDO>> groupingByInAppIcon(Collection<Long> appIconList, Function<AppDO, T> mapper, String... fieldNames){
              List<AppDO> list=this.listByInAppIcon(appIconList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInAppIcon(AppDO updateDO, Collection<Long> appIconList);

         public Integer updateAllFieldsByInAppIcon(AppDO updateDO, Collection<Long> appIconList);

         public Integer deleteByInAppIcon(Collection<Long> appIconList);
        public List<AppDO> listByAppDesc(String appDesc, String... fieldNames);

        public Map<Long,AppDO> mapByAppDesc(String appDesc, String... fieldNames);

        public Integer countByAppDesc(String appDesc);

        public default AppDO singleResultByAppDesc(String appDesc, String... fieldNames){
             List<AppDO> list=this.listByAppDesc(appDesc,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByAppDesc(String appDesc, Function<AppDO, T> mapper, String... fieldNames){
             List<AppDO> list=this.listByAppDesc(appDesc,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAppDesc(AppDO updateDO, String appDesc);

        public Integer updateAllFieldsByAppDesc(AppDO updateDO, String appDesc);

        public Integer deleteByAppDesc(String appDesc);






        public List<AppDO> listByInAppDesc(Collection<String> appDescList, String... fieldNames);

         public Map<Long,AppDO> mapByInAppDesc(Collection<String> appDescList, String... fieldNames);

         public Integer countByInAppDesc(Collection<String> appDescList);

         public default AppDO singleResultByInAppDesc(Collection<String> appDescList, String... fieldNames){
              List<AppDO> list=this.listByInAppDesc(appDescList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AppDO>> groupingByInAppDesc(Collection<String> appDescList, Function<AppDO, T> mapper, String... fieldNames){
              List<AppDO> list=this.listByInAppDesc(appDescList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInAppDesc(AppDO updateDO, Collection<String> appDescList);

         public Integer updateAllFieldsByInAppDesc(AppDO updateDO, Collection<String> appDescList);

         public Integer deleteByInAppDesc(Collection<String> appDescList);
        public List<AppDO> listByAppUrl(String appUrl, String... fieldNames);

        public Map<Long,AppDO> mapByAppUrl(String appUrl, String... fieldNames);

        public Integer countByAppUrl(String appUrl);

        public default AppDO singleResultByAppUrl(String appUrl, String... fieldNames){
             List<AppDO> list=this.listByAppUrl(appUrl,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByAppUrl(String appUrl, Function<AppDO, T> mapper, String... fieldNames){
             List<AppDO> list=this.listByAppUrl(appUrl,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAppUrl(AppDO updateDO, String appUrl);

        public Integer updateAllFieldsByAppUrl(AppDO updateDO, String appUrl);

        public Integer deleteByAppUrl(String appUrl);






        public List<AppDO> listByInAppUrl(Collection<String> appUrlList, String... fieldNames);

         public Map<Long,AppDO> mapByInAppUrl(Collection<String> appUrlList, String... fieldNames);

         public Integer countByInAppUrl(Collection<String> appUrlList);

         public default AppDO singleResultByInAppUrl(Collection<String> appUrlList, String... fieldNames){
              List<AppDO> list=this.listByInAppUrl(appUrlList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AppDO>> groupingByInAppUrl(Collection<String> appUrlList, Function<AppDO, T> mapper, String... fieldNames){
              List<AppDO> list=this.listByInAppUrl(appUrlList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInAppUrl(AppDO updateDO, Collection<String> appUrlList);

         public Integer updateAllFieldsByInAppUrl(AppDO updateDO, Collection<String> appUrlList);

         public Integer deleteByInAppUrl(Collection<String> appUrlList);
        public List<AppDO> listByAccessKey(String accessKey, String... fieldNames);

        public Map<Long,AppDO> mapByAccessKey(String accessKey, String... fieldNames);

        public Integer countByAccessKey(String accessKey);

        public default AppDO singleResultByAccessKey(String accessKey, String... fieldNames){
             List<AppDO> list=this.listByAccessKey(accessKey,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByAccessKey(String accessKey, Function<AppDO, T> mapper, String... fieldNames){
             List<AppDO> list=this.listByAccessKey(accessKey,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAccessKey(AppDO updateDO, String accessKey);

        public Integer updateAllFieldsByAccessKey(AppDO updateDO, String accessKey);

        public Integer deleteByAccessKey(String accessKey);






        public List<AppDO> listByInAccessKey(Collection<String> accessKeyList, String... fieldNames);

         public Map<Long,AppDO> mapByInAccessKey(Collection<String> accessKeyList, String... fieldNames);

         public Integer countByInAccessKey(Collection<String> accessKeyList);

         public default AppDO singleResultByInAccessKey(Collection<String> accessKeyList, String... fieldNames){
              List<AppDO> list=this.listByInAccessKey(accessKeyList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AppDO>> groupingByInAccessKey(Collection<String> accessKeyList, Function<AppDO, T> mapper, String... fieldNames){
              List<AppDO> list=this.listByInAccessKey(accessKeyList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInAccessKey(AppDO updateDO, Collection<String> accessKeyList);

         public Integer updateAllFieldsByInAccessKey(AppDO updateDO, Collection<String> accessKeyList);

         public Integer deleteByInAccessKey(Collection<String> accessKeyList);
        public List<AppDO> listByAccessKeyPlain(String accessKeyPlain, String... fieldNames);

        public Map<Long,AppDO> mapByAccessKeyPlain(String accessKeyPlain, String... fieldNames);

        public Integer countByAccessKeyPlain(String accessKeyPlain);

        public default AppDO singleResultByAccessKeyPlain(String accessKeyPlain, String... fieldNames){
             List<AppDO> list=this.listByAccessKeyPlain(accessKeyPlain,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByAccessKeyPlain(String accessKeyPlain, Function<AppDO, T> mapper, String... fieldNames){
             List<AppDO> list=this.listByAccessKeyPlain(accessKeyPlain,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAccessKeyPlain(AppDO updateDO, String accessKeyPlain);

        public Integer updateAllFieldsByAccessKeyPlain(AppDO updateDO, String accessKeyPlain);

        public Integer deleteByAccessKeyPlain(String accessKeyPlain);






        public List<AppDO> listByInAccessKeyPlain(Collection<String> accessKeyPlainList, String... fieldNames);

         public Map<Long,AppDO> mapByInAccessKeyPlain(Collection<String> accessKeyPlainList, String... fieldNames);

         public Integer countByInAccessKeyPlain(Collection<String> accessKeyPlainList);

         public default AppDO singleResultByInAccessKeyPlain(Collection<String> accessKeyPlainList, String... fieldNames){
              List<AppDO> list=this.listByInAccessKeyPlain(accessKeyPlainList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AppDO>> groupingByInAccessKeyPlain(Collection<String> accessKeyPlainList, Function<AppDO, T> mapper, String... fieldNames){
              List<AppDO> list=this.listByInAccessKeyPlain(accessKeyPlainList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInAccessKeyPlain(AppDO updateDO, Collection<String> accessKeyPlainList);

         public Integer updateAllFieldsByInAccessKeyPlain(AppDO updateDO, Collection<String> accessKeyPlainList);

         public Integer deleteByInAccessKeyPlain(Collection<String> accessKeyPlainList);
        public List<AppDO> listByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Map<Long,AppDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Integer countByUserIdCreate(Long userIdCreate);

        public default AppDO singleResultByUserIdCreate(Long userIdCreate, String... fieldNames){
             List<AppDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByUserIdCreate(Long userIdCreate, Function<AppDO, T> mapper, String... fieldNames){
             List<AppDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(AppDO updateDO, Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(AppDO updateDO, Long userIdCreate);

        public Integer deleteByUserIdCreate(Long userIdCreate);






        public List<AppDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Map<Long,AppDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Integer countByInUserIdCreate(Collection<Long> userIdCreateList);

         public default AppDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
              List<AppDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AppDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<AppDO, T> mapper, String... fieldNames){
              List<AppDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdCreate(AppDO updateDO, Collection<Long> userIdCreateList);

         public Integer updateAllFieldsByInUserIdCreate(AppDO updateDO, Collection<Long> userIdCreateList);

         public Integer deleteByInUserIdCreate(Collection<Long> userIdCreateList);
        public List<AppDO> listByUserIdModified(Long userIdModified, String... fieldNames);

        public Map<Long,AppDO> mapByUserIdModified(Long userIdModified, String... fieldNames);

        public Integer countByUserIdModified(Long userIdModified);

        public default AppDO singleResultByUserIdModified(Long userIdModified, String... fieldNames){
             List<AppDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<AppDO>> groupingByUserIdModified(Long userIdModified, Function<AppDO, T> mapper, String... fieldNames){
             List<AppDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(AppDO updateDO, Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(AppDO updateDO, Long userIdModified);

        public Integer deleteByUserIdModified(Long userIdModified);






        public List<AppDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Map<Long,AppDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Integer countByInUserIdModified(Collection<Long> userIdModifiedList);

         public default AppDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
              List<AppDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<AppDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<AppDO, T> mapper, String... fieldNames){
              List<AppDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdModified(AppDO updateDO, Collection<Long> userIdModifiedList);

         public Integer updateAllFieldsByInUserIdModified(AppDO updateDO, Collection<Long> userIdModifiedList);

         public Integer deleteByInUserIdModified(Collection<Long> userIdModifiedList);


}

