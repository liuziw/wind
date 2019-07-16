package com.lzw.wind.tibmas.core.daomanager.immutable;

import com.hyzs.gz.common.dao.daomanager.CommonDaoManager;
import com.hyzs.tibmas.core.dbo.PermDO;
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
public interface ImmutablePermDaoManager extends CommonDaoManager<PermDO,Long> {


        /**
         * 根据主键获取记录
         *
         */
        public PermDO getById(Long id);

        public List<PermDO> listById(Long id, String... fieldNames);

        public Map<Long,PermDO> mapById(Long id, String... fieldNames);

        public Integer countById(Long id);

        public default PermDO singleResultById(Long id, String... fieldNames){
             List<PermDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingById(Long id, Function<PermDO, T> mapper, String... fieldNames){
             List<PermDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(PermDO updateDO, Long id);

        public Integer updateAllFieldsById(PermDO updateDO, Long id);

        public Integer deleteById(Long id);






        public List<PermDO> listByInId(Collection<Long> idList, String... fieldNames);

         public Map<Long,PermDO> mapByInId(Collection<Long> idList, String... fieldNames);

         public Integer countByInId(Collection<Long> idList);

         public default PermDO singleResultByInId(Collection<Long> idList, String... fieldNames){
              List<PermDO> list=this.listByInId(idList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<PermDO>> groupingByInId(Collection<Long> idList, Function<PermDO, T> mapper, String... fieldNames){
              List<PermDO> list=this.listByInId(idList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInId(PermDO updateDO, Collection<Long> idList);

         public Integer updateAllFieldsByInId(PermDO updateDO, Collection<Long> idList);

         public Integer deleteByInId(Collection<Long> idList);
        public List<PermDO> listByPid(Long pid, String... fieldNames);

        public Map<Long,PermDO> mapByPid(Long pid, String... fieldNames);

        public Integer countByPid(Long pid);

        public default PermDO singleResultByPid(Long pid, String... fieldNames){
             List<PermDO> list=this.listByPid(pid,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByPid(Long pid, Function<PermDO, T> mapper, String... fieldNames){
             List<PermDO> list=this.listByPid(pid,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPid(PermDO updateDO, Long pid);

        public Integer updateAllFieldsByPid(PermDO updateDO, Long pid);

        public Integer deleteByPid(Long pid);






        public List<PermDO> listByInPid(Collection<Long> pidList, String... fieldNames);

         public Map<Long,PermDO> mapByInPid(Collection<Long> pidList, String... fieldNames);

         public Integer countByInPid(Collection<Long> pidList);

         public default PermDO singleResultByInPid(Collection<Long> pidList, String... fieldNames){
              List<PermDO> list=this.listByInPid(pidList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<PermDO>> groupingByInPid(Collection<Long> pidList, Function<PermDO, T> mapper, String... fieldNames){
              List<PermDO> list=this.listByInPid(pidList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPid(PermDO updateDO, Collection<Long> pidList);

         public Integer updateAllFieldsByInPid(PermDO updateDO, Collection<Long> pidList);

         public Integer deleteByInPid(Collection<Long> pidList);
        public List<PermDO> listByPermCode(String permCode, String... fieldNames);

        public Map<Long,PermDO> mapByPermCode(String permCode, String... fieldNames);

        public Integer countByPermCode(String permCode);

        public default PermDO singleResultByPermCode(String permCode, String... fieldNames){
             List<PermDO> list=this.listByPermCode(permCode,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByPermCode(String permCode, Function<PermDO, T> mapper, String... fieldNames){
             List<PermDO> list=this.listByPermCode(permCode,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPermCode(PermDO updateDO, String permCode);

        public Integer updateAllFieldsByPermCode(PermDO updateDO, String permCode);

        public Integer deleteByPermCode(String permCode);






        public List<PermDO> listByInPermCode(Collection<String> permCodeList, String... fieldNames);

         public Map<Long,PermDO> mapByInPermCode(Collection<String> permCodeList, String... fieldNames);

         public Integer countByInPermCode(Collection<String> permCodeList);

         public default PermDO singleResultByInPermCode(Collection<String> permCodeList, String... fieldNames){
              List<PermDO> list=this.listByInPermCode(permCodeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<PermDO>> groupingByInPermCode(Collection<String> permCodeList, Function<PermDO, T> mapper, String... fieldNames){
              List<PermDO> list=this.listByInPermCode(permCodeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPermCode(PermDO updateDO, Collection<String> permCodeList);

         public Integer updateAllFieldsByInPermCode(PermDO updateDO, Collection<String> permCodeList);

         public Integer deleteByInPermCode(Collection<String> permCodeList);
        public List<PermDO> listByPermName(String permName, String... fieldNames);

        public Map<Long,PermDO> mapByPermName(String permName, String... fieldNames);

        public Integer countByPermName(String permName);

        public default PermDO singleResultByPermName(String permName, String... fieldNames){
             List<PermDO> list=this.listByPermName(permName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByPermName(String permName, Function<PermDO, T> mapper, String... fieldNames){
             List<PermDO> list=this.listByPermName(permName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPermName(PermDO updateDO, String permName);

        public Integer updateAllFieldsByPermName(PermDO updateDO, String permName);

        public Integer deleteByPermName(String permName);






        public List<PermDO> listByInPermName(Collection<String> permNameList, String... fieldNames);

         public Map<Long,PermDO> mapByInPermName(Collection<String> permNameList, String... fieldNames);

         public Integer countByInPermName(Collection<String> permNameList);

         public default PermDO singleResultByInPermName(Collection<String> permNameList, String... fieldNames){
              List<PermDO> list=this.listByInPermName(permNameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<PermDO>> groupingByInPermName(Collection<String> permNameList, Function<PermDO, T> mapper, String... fieldNames){
              List<PermDO> list=this.listByInPermName(permNameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPermName(PermDO updateDO, Collection<String> permNameList);

         public Integer updateAllFieldsByInPermName(PermDO updateDO, Collection<String> permNameList);

         public Integer deleteByInPermName(Collection<String> permNameList);
        public List<PermDO> listByPermType(Integer permType, String... fieldNames);

        public Map<Long,PermDO> mapByPermType(Integer permType, String... fieldNames);

        public Integer countByPermType(Integer permType);

        public default PermDO singleResultByPermType(Integer permType, String... fieldNames){
             List<PermDO> list=this.listByPermType(permType,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByPermType(Integer permType, Function<PermDO, T> mapper, String... fieldNames){
             List<PermDO> list=this.listByPermType(permType,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPermType(PermDO updateDO, Integer permType);

        public Integer updateAllFieldsByPermType(PermDO updateDO, Integer permType);

        public Integer deleteByPermType(Integer permType);






        public List<PermDO> listByInPermType(Collection<Integer> permTypeList, String... fieldNames);

         public Map<Long,PermDO> mapByInPermType(Collection<Integer> permTypeList, String... fieldNames);

         public Integer countByInPermType(Collection<Integer> permTypeList);

         public default PermDO singleResultByInPermType(Collection<Integer> permTypeList, String... fieldNames){
              List<PermDO> list=this.listByInPermType(permTypeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<PermDO>> groupingByInPermType(Collection<Integer> permTypeList, Function<PermDO, T> mapper, String... fieldNames){
              List<PermDO> list=this.listByInPermType(permTypeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPermType(PermDO updateDO, Collection<Integer> permTypeList);

         public Integer updateAllFieldsByInPermType(PermDO updateDO, Collection<Integer> permTypeList);

         public Integer deleteByInPermType(Collection<Integer> permTypeList);
        public List<PermDO> listByPermUrl(String permUrl, String... fieldNames);

        public Map<Long,PermDO> mapByPermUrl(String permUrl, String... fieldNames);

        public Integer countByPermUrl(String permUrl);

        public default PermDO singleResultByPermUrl(String permUrl, String... fieldNames){
             List<PermDO> list=this.listByPermUrl(permUrl,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByPermUrl(String permUrl, Function<PermDO, T> mapper, String... fieldNames){
             List<PermDO> list=this.listByPermUrl(permUrl,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPermUrl(PermDO updateDO, String permUrl);

        public Integer updateAllFieldsByPermUrl(PermDO updateDO, String permUrl);

        public Integer deleteByPermUrl(String permUrl);






        public List<PermDO> listByInPermUrl(Collection<String> permUrlList, String... fieldNames);

         public Map<Long,PermDO> mapByInPermUrl(Collection<String> permUrlList, String... fieldNames);

         public Integer countByInPermUrl(Collection<String> permUrlList);

         public default PermDO singleResultByInPermUrl(Collection<String> permUrlList, String... fieldNames){
              List<PermDO> list=this.listByInPermUrl(permUrlList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<PermDO>> groupingByInPermUrl(Collection<String> permUrlList, Function<PermDO, T> mapper, String... fieldNames){
              List<PermDO> list=this.listByInPermUrl(permUrlList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPermUrl(PermDO updateDO, Collection<String> permUrlList);

         public Integer updateAllFieldsByInPermUrl(PermDO updateDO, Collection<String> permUrlList);

         public Integer deleteByInPermUrl(Collection<String> permUrlList);
        public List<PermDO> listByPermDesc(String permDesc, String... fieldNames);

        public Map<Long,PermDO> mapByPermDesc(String permDesc, String... fieldNames);

        public Integer countByPermDesc(String permDesc);

        public default PermDO singleResultByPermDesc(String permDesc, String... fieldNames){
             List<PermDO> list=this.listByPermDesc(permDesc,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByPermDesc(String permDesc, Function<PermDO, T> mapper, String... fieldNames){
             List<PermDO> list=this.listByPermDesc(permDesc,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPermDesc(PermDO updateDO, String permDesc);

        public Integer updateAllFieldsByPermDesc(PermDO updateDO, String permDesc);

        public Integer deleteByPermDesc(String permDesc);






        public List<PermDO> listByInPermDesc(Collection<String> permDescList, String... fieldNames);

         public Map<Long,PermDO> mapByInPermDesc(Collection<String> permDescList, String... fieldNames);

         public Integer countByInPermDesc(Collection<String> permDescList);

         public default PermDO singleResultByInPermDesc(Collection<String> permDescList, String... fieldNames){
              List<PermDO> list=this.listByInPermDesc(permDescList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<PermDO>> groupingByInPermDesc(Collection<String> permDescList, Function<PermDO, T> mapper, String... fieldNames){
              List<PermDO> list=this.listByInPermDesc(permDescList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPermDesc(PermDO updateDO, Collection<String> permDescList);

         public Integer updateAllFieldsByInPermDesc(PermDO updateDO, Collection<String> permDescList);

         public Integer deleteByInPermDesc(Collection<String> permDescList);
        public List<PermDO> listByPermIcon(Long permIcon, String... fieldNames);

        public Map<Long,PermDO> mapByPermIcon(Long permIcon, String... fieldNames);

        public Integer countByPermIcon(Long permIcon);

        public default PermDO singleResultByPermIcon(Long permIcon, String... fieldNames){
             List<PermDO> list=this.listByPermIcon(permIcon,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByPermIcon(Long permIcon, Function<PermDO, T> mapper, String... fieldNames){
             List<PermDO> list=this.listByPermIcon(permIcon,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPermIcon(PermDO updateDO, Long permIcon);

        public Integer updateAllFieldsByPermIcon(PermDO updateDO, Long permIcon);

        public Integer deleteByPermIcon(Long permIcon);






        public List<PermDO> listByInPermIcon(Collection<Long> permIconList, String... fieldNames);

         public Map<Long,PermDO> mapByInPermIcon(Collection<Long> permIconList, String... fieldNames);

         public Integer countByInPermIcon(Collection<Long> permIconList);

         public default PermDO singleResultByInPermIcon(Collection<Long> permIconList, String... fieldNames){
              List<PermDO> list=this.listByInPermIcon(permIconList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<PermDO>> groupingByInPermIcon(Collection<Long> permIconList, Function<PermDO, T> mapper, String... fieldNames){
              List<PermDO> list=this.listByInPermIcon(permIconList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPermIcon(PermDO updateDO, Collection<Long> permIconList);

         public Integer updateAllFieldsByInPermIcon(PermDO updateDO, Collection<Long> permIconList);

         public Integer deleteByInPermIcon(Collection<Long> permIconList);
        public List<PermDO> listByPermIconUrl(String permIconUrl, String... fieldNames);

        public Map<Long,PermDO> mapByPermIconUrl(String permIconUrl, String... fieldNames);

        public Integer countByPermIconUrl(String permIconUrl);

        public default PermDO singleResultByPermIconUrl(String permIconUrl, String... fieldNames){
             List<PermDO> list=this.listByPermIconUrl(permIconUrl,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByPermIconUrl(String permIconUrl, Function<PermDO, T> mapper, String... fieldNames){
             List<PermDO> list=this.listByPermIconUrl(permIconUrl,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPermIconUrl(PermDO updateDO, String permIconUrl);

        public Integer updateAllFieldsByPermIconUrl(PermDO updateDO, String permIconUrl);

        public Integer deleteByPermIconUrl(String permIconUrl);






        public List<PermDO> listByInPermIconUrl(Collection<String> permIconUrlList, String... fieldNames);

         public Map<Long,PermDO> mapByInPermIconUrl(Collection<String> permIconUrlList, String... fieldNames);

         public Integer countByInPermIconUrl(Collection<String> permIconUrlList);

         public default PermDO singleResultByInPermIconUrl(Collection<String> permIconUrlList, String... fieldNames){
              List<PermDO> list=this.listByInPermIconUrl(permIconUrlList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<PermDO>> groupingByInPermIconUrl(Collection<String> permIconUrlList, Function<PermDO, T> mapper, String... fieldNames){
              List<PermDO> list=this.listByInPermIconUrl(permIconUrlList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPermIconUrl(PermDO updateDO, Collection<String> permIconUrlList);

         public Integer updateAllFieldsByInPermIconUrl(PermDO updateDO, Collection<String> permIconUrlList);

         public Integer deleteByInPermIconUrl(Collection<String> permIconUrlList);
        public List<PermDO> listByAppId(Long appId, String... fieldNames);

        public Map<Long,PermDO> mapByAppId(Long appId, String... fieldNames);

        public Integer countByAppId(Long appId);

        public default PermDO singleResultByAppId(Long appId, String... fieldNames){
             List<PermDO> list=this.listByAppId(appId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByAppId(Long appId, Function<PermDO, T> mapper, String... fieldNames){
             List<PermDO> list=this.listByAppId(appId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAppId(PermDO updateDO, Long appId);

        public Integer updateAllFieldsByAppId(PermDO updateDO, Long appId);

        public Integer deleteByAppId(Long appId);






        public List<PermDO> listByInAppId(Collection<Long> appIdList, String... fieldNames);

         public Map<Long,PermDO> mapByInAppId(Collection<Long> appIdList, String... fieldNames);

         public Integer countByInAppId(Collection<Long> appIdList);

         public default PermDO singleResultByInAppId(Collection<Long> appIdList, String... fieldNames){
              List<PermDO> list=this.listByInAppId(appIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<PermDO>> groupingByInAppId(Collection<Long> appIdList, Function<PermDO, T> mapper, String... fieldNames){
              List<PermDO> list=this.listByInAppId(appIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInAppId(PermDO updateDO, Collection<Long> appIdList);

         public Integer updateAllFieldsByInAppId(PermDO updateDO, Collection<Long> appIdList);

         public Integer deleteByInAppId(Collection<Long> appIdList);
        public List<PermDO> listBySeq(Long seq, String... fieldNames);

        public Map<Long,PermDO> mapBySeq(Long seq, String... fieldNames);

        public Integer countBySeq(Long seq);

        public default PermDO singleResultBySeq(Long seq, String... fieldNames){
             List<PermDO> list=this.listBySeq(seq,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingBySeq(Long seq, Function<PermDO, T> mapper, String... fieldNames){
             List<PermDO> list=this.listBySeq(seq,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsBySeq(PermDO updateDO, Long seq);

        public Integer updateAllFieldsBySeq(PermDO updateDO, Long seq);

        public Integer deleteBySeq(Long seq);






        public List<PermDO> listByInSeq(Collection<Long> seqList, String... fieldNames);

         public Map<Long,PermDO> mapByInSeq(Collection<Long> seqList, String... fieldNames);

         public Integer countByInSeq(Collection<Long> seqList);

         public default PermDO singleResultByInSeq(Collection<Long> seqList, String... fieldNames){
              List<PermDO> list=this.listByInSeq(seqList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<PermDO>> groupingByInSeq(Collection<Long> seqList, Function<PermDO, T> mapper, String... fieldNames){
              List<PermDO> list=this.listByInSeq(seqList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInSeq(PermDO updateDO, Collection<Long> seqList);

         public Integer updateAllFieldsByInSeq(PermDO updateDO, Collection<Long> seqList);

         public Integer deleteByInSeq(Collection<Long> seqList);
        public List<PermDO> listByEnableStatus(Integer enableStatus, String... fieldNames);

        public Map<Long,PermDO> mapByEnableStatus(Integer enableStatus, String... fieldNames);

        public Integer countByEnableStatus(Integer enableStatus);

        public default PermDO singleResultByEnableStatus(Integer enableStatus, String... fieldNames){
             List<PermDO> list=this.listByEnableStatus(enableStatus,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByEnableStatus(Integer enableStatus, Function<PermDO, T> mapper, String... fieldNames){
             List<PermDO> list=this.listByEnableStatus(enableStatus,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByEnableStatus(PermDO updateDO, Integer enableStatus);

        public Integer updateAllFieldsByEnableStatus(PermDO updateDO, Integer enableStatus);

        public Integer deleteByEnableStatus(Integer enableStatus);






        public List<PermDO> listByInEnableStatus(Collection<Integer> enableStatusList, String... fieldNames);

         public Map<Long,PermDO> mapByInEnableStatus(Collection<Integer> enableStatusList, String... fieldNames);

         public Integer countByInEnableStatus(Collection<Integer> enableStatusList);

         public default PermDO singleResultByInEnableStatus(Collection<Integer> enableStatusList, String... fieldNames){
              List<PermDO> list=this.listByInEnableStatus(enableStatusList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<PermDO>> groupingByInEnableStatus(Collection<Integer> enableStatusList, Function<PermDO, T> mapper, String... fieldNames){
              List<PermDO> list=this.listByInEnableStatus(enableStatusList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInEnableStatus(PermDO updateDO, Collection<Integer> enableStatusList);

         public Integer updateAllFieldsByInEnableStatus(PermDO updateDO, Collection<Integer> enableStatusList);

         public Integer deleteByInEnableStatus(Collection<Integer> enableStatusList);
        public List<PermDO> listByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Map<Long,PermDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Integer countByUserIdCreate(Long userIdCreate);

        public default PermDO singleResultByUserIdCreate(Long userIdCreate, String... fieldNames){
             List<PermDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByUserIdCreate(Long userIdCreate, Function<PermDO, T> mapper, String... fieldNames){
             List<PermDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(PermDO updateDO, Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(PermDO updateDO, Long userIdCreate);

        public Integer deleteByUserIdCreate(Long userIdCreate);






        public List<PermDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Map<Long,PermDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Integer countByInUserIdCreate(Collection<Long> userIdCreateList);

         public default PermDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
              List<PermDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<PermDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<PermDO, T> mapper, String... fieldNames){
              List<PermDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdCreate(PermDO updateDO, Collection<Long> userIdCreateList);

         public Integer updateAllFieldsByInUserIdCreate(PermDO updateDO, Collection<Long> userIdCreateList);

         public Integer deleteByInUserIdCreate(Collection<Long> userIdCreateList);
        public List<PermDO> listByUserIdModified(Long userIdModified, String... fieldNames);

        public Map<Long,PermDO> mapByUserIdModified(Long userIdModified, String... fieldNames);

        public Integer countByUserIdModified(Long userIdModified);

        public default PermDO singleResultByUserIdModified(Long userIdModified, String... fieldNames){
             List<PermDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByUserIdModified(Long userIdModified, Function<PermDO, T> mapper, String... fieldNames){
             List<PermDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(PermDO updateDO, Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(PermDO updateDO, Long userIdModified);

        public Integer deleteByUserIdModified(Long userIdModified);






        public List<PermDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Map<Long,PermDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Integer countByInUserIdModified(Collection<Long> userIdModifiedList);

         public default PermDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
              List<PermDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<PermDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<PermDO, T> mapper, String... fieldNames){
              List<PermDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdModified(PermDO updateDO, Collection<Long> userIdModifiedList);

         public Integer updateAllFieldsByInUserIdModified(PermDO updateDO, Collection<Long> userIdModifiedList);

         public Integer deleteByInUserIdModified(Collection<Long> userIdModifiedList);


}

