package com.lzw.wind.tibmas.core.mapper;

import com.lzw.common.dao.mapper.CommonMapper;
import com.lzw.wind.tibmas.core.dbo.PermDO;
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
public interface PermMapper extends CommonMapper<PermDO,Long> {


        public PermDO getById(@Param("id") Long id, @Param("fieldNames") String... fieldNames);



        public List<PermDO> listById(@Param("id") Long id, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapById(@Param("id") Long id, @Param("fieldNames") String[] fieldNames);

        public Integer countById(@Param("id") Long id);

        public default PermDO singleResultById(Long id, String[] fieldNames){
             List<PermDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingById(Long id, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(@Param("updateDO") PermDO updateDO, @Param("id") Long id);

        public Integer updateAllFieldsById(@Param("updateDO") PermDO updateDO, @Param("id") Long id);

        public Integer deleteById(@Param("id") Long id);




        public List<PermDO> listByInId(@Param("idList") Collection<Long> idList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByInId(@Param("idList") Collection<Long> idList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInId(@Param("idList") Collection<Long> idList);

        public default PermDO singleResultByInId(Collection<Long> idList, String[] fieldNames){
             List<PermDO> list=this.listByInId(idList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByInId(Collection<Long> idList, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByInId(idList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInId(@Param("updateDO") PermDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer updateAllFieldsByInId(@Param("updateDO") PermDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer deleteByInId(@Param("idList") Collection<Long> idList);

        public List<PermDO> listByPid(@Param("pid") Long pid, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByPid(@Param("pid") Long pid, @Param("fieldNames") String[] fieldNames);

        public Integer countByPid(@Param("pid") Long pid);

        public default PermDO singleResultByPid(Long pid, String[] fieldNames){
             List<PermDO> list=this.listByPid(pid,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByPid(Long pid, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByPid(pid,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPid(@Param("updateDO") PermDO updateDO, @Param("pid") Long pid);

        public Integer updateAllFieldsByPid(@Param("updateDO") PermDO updateDO, @Param("pid") Long pid);

        public Integer deleteByPid(@Param("pid") Long pid);




        public List<PermDO> listByInPid(@Param("pidList") Collection<Long> pidList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByInPid(@Param("pidList") Collection<Long> pidList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInPid(@Param("pidList") Collection<Long> pidList);

        public default PermDO singleResultByInPid(Collection<Long> pidList, String[] fieldNames){
             List<PermDO> list=this.listByInPid(pidList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByInPid(Collection<Long> pidList, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByInPid(pidList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPid(@Param("updateDO") PermDO updateDO, @Param("pidList") Collection<Long> pidList);

        public Integer updateAllFieldsByInPid(@Param("updateDO") PermDO updateDO, @Param("pidList") Collection<Long> pidList);

        public Integer deleteByInPid(@Param("pidList") Collection<Long> pidList);

        public List<PermDO> listByPermCode(@Param("permCode") String permCode, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByPermCode(@Param("permCode") String permCode, @Param("fieldNames") String[] fieldNames);

        public Integer countByPermCode(@Param("permCode") String permCode);

        public default PermDO singleResultByPermCode(String permCode, String[] fieldNames){
             List<PermDO> list=this.listByPermCode(permCode,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByPermCode(String permCode, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByPermCode(permCode,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPermCode(@Param("updateDO") PermDO updateDO, @Param("permCode") String permCode);

        public Integer updateAllFieldsByPermCode(@Param("updateDO") PermDO updateDO, @Param("permCode") String permCode);

        public Integer deleteByPermCode(@Param("permCode") String permCode);




        public List<PermDO> listByInPermCode(@Param("permCodeList") Collection<String> permCodeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByInPermCode(@Param("permCodeList") Collection<String> permCodeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInPermCode(@Param("permCodeList") Collection<String> permCodeList);

        public default PermDO singleResultByInPermCode(Collection<String> permCodeList, String[] fieldNames){
             List<PermDO> list=this.listByInPermCode(permCodeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByInPermCode(Collection<String> permCodeList, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByInPermCode(permCodeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPermCode(@Param("updateDO") PermDO updateDO, @Param("permCodeList") Collection<String> permCodeList);

        public Integer updateAllFieldsByInPermCode(@Param("updateDO") PermDO updateDO, @Param("permCodeList") Collection<String> permCodeList);

        public Integer deleteByInPermCode(@Param("permCodeList") Collection<String> permCodeList);

        public List<PermDO> listByPermName(@Param("permName") String permName, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByPermName(@Param("permName") String permName, @Param("fieldNames") String[] fieldNames);

        public Integer countByPermName(@Param("permName") String permName);

        public default PermDO singleResultByPermName(String permName, String[] fieldNames){
             List<PermDO> list=this.listByPermName(permName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByPermName(String permName, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByPermName(permName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPermName(@Param("updateDO") PermDO updateDO, @Param("permName") String permName);

        public Integer updateAllFieldsByPermName(@Param("updateDO") PermDO updateDO, @Param("permName") String permName);

        public Integer deleteByPermName(@Param("permName") String permName);




        public List<PermDO> listByInPermName(@Param("permNameList") Collection<String> permNameList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByInPermName(@Param("permNameList") Collection<String> permNameList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInPermName(@Param("permNameList") Collection<String> permNameList);

        public default PermDO singleResultByInPermName(Collection<String> permNameList, String[] fieldNames){
             List<PermDO> list=this.listByInPermName(permNameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByInPermName(Collection<String> permNameList, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByInPermName(permNameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPermName(@Param("updateDO") PermDO updateDO, @Param("permNameList") Collection<String> permNameList);

        public Integer updateAllFieldsByInPermName(@Param("updateDO") PermDO updateDO, @Param("permNameList") Collection<String> permNameList);

        public Integer deleteByInPermName(@Param("permNameList") Collection<String> permNameList);

        public List<PermDO> listByPermType(@Param("permType") Integer permType, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByPermType(@Param("permType") Integer permType, @Param("fieldNames") String[] fieldNames);

        public Integer countByPermType(@Param("permType") Integer permType);

        public default PermDO singleResultByPermType(Integer permType, String[] fieldNames){
             List<PermDO> list=this.listByPermType(permType,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByPermType(Integer permType, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByPermType(permType,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPermType(@Param("updateDO") PermDO updateDO, @Param("permType") Integer permType);

        public Integer updateAllFieldsByPermType(@Param("updateDO") PermDO updateDO, @Param("permType") Integer permType);

        public Integer deleteByPermType(@Param("permType") Integer permType);




        public List<PermDO> listByInPermType(@Param("permTypeList") Collection<Integer> permTypeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByInPermType(@Param("permTypeList") Collection<Integer> permTypeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInPermType(@Param("permTypeList") Collection<Integer> permTypeList);

        public default PermDO singleResultByInPermType(Collection<Integer> permTypeList, String[] fieldNames){
             List<PermDO> list=this.listByInPermType(permTypeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByInPermType(Collection<Integer> permTypeList, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByInPermType(permTypeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPermType(@Param("updateDO") PermDO updateDO, @Param("permTypeList") Collection<Integer> permTypeList);

        public Integer updateAllFieldsByInPermType(@Param("updateDO") PermDO updateDO, @Param("permTypeList") Collection<Integer> permTypeList);

        public Integer deleteByInPermType(@Param("permTypeList") Collection<Integer> permTypeList);

        public List<PermDO> listByPermUrl(@Param("permUrl") String permUrl, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByPermUrl(@Param("permUrl") String permUrl, @Param("fieldNames") String[] fieldNames);

        public Integer countByPermUrl(@Param("permUrl") String permUrl);

        public default PermDO singleResultByPermUrl(String permUrl, String[] fieldNames){
             List<PermDO> list=this.listByPermUrl(permUrl,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByPermUrl(String permUrl, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByPermUrl(permUrl,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPermUrl(@Param("updateDO") PermDO updateDO, @Param("permUrl") String permUrl);

        public Integer updateAllFieldsByPermUrl(@Param("updateDO") PermDO updateDO, @Param("permUrl") String permUrl);

        public Integer deleteByPermUrl(@Param("permUrl") String permUrl);




        public List<PermDO> listByInPermUrl(@Param("permUrlList") Collection<String> permUrlList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByInPermUrl(@Param("permUrlList") Collection<String> permUrlList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInPermUrl(@Param("permUrlList") Collection<String> permUrlList);

        public default PermDO singleResultByInPermUrl(Collection<String> permUrlList, String[] fieldNames){
             List<PermDO> list=this.listByInPermUrl(permUrlList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByInPermUrl(Collection<String> permUrlList, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByInPermUrl(permUrlList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPermUrl(@Param("updateDO") PermDO updateDO, @Param("permUrlList") Collection<String> permUrlList);

        public Integer updateAllFieldsByInPermUrl(@Param("updateDO") PermDO updateDO, @Param("permUrlList") Collection<String> permUrlList);

        public Integer deleteByInPermUrl(@Param("permUrlList") Collection<String> permUrlList);

        public List<PermDO> listByPermDesc(@Param("permDesc") String permDesc, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByPermDesc(@Param("permDesc") String permDesc, @Param("fieldNames") String[] fieldNames);

        public Integer countByPermDesc(@Param("permDesc") String permDesc);

        public default PermDO singleResultByPermDesc(String permDesc, String[] fieldNames){
             List<PermDO> list=this.listByPermDesc(permDesc,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByPermDesc(String permDesc, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByPermDesc(permDesc,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPermDesc(@Param("updateDO") PermDO updateDO, @Param("permDesc") String permDesc);

        public Integer updateAllFieldsByPermDesc(@Param("updateDO") PermDO updateDO, @Param("permDesc") String permDesc);

        public Integer deleteByPermDesc(@Param("permDesc") String permDesc);




        public List<PermDO> listByInPermDesc(@Param("permDescList") Collection<String> permDescList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByInPermDesc(@Param("permDescList") Collection<String> permDescList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInPermDesc(@Param("permDescList") Collection<String> permDescList);

        public default PermDO singleResultByInPermDesc(Collection<String> permDescList, String[] fieldNames){
             List<PermDO> list=this.listByInPermDesc(permDescList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByInPermDesc(Collection<String> permDescList, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByInPermDesc(permDescList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPermDesc(@Param("updateDO") PermDO updateDO, @Param("permDescList") Collection<String> permDescList);

        public Integer updateAllFieldsByInPermDesc(@Param("updateDO") PermDO updateDO, @Param("permDescList") Collection<String> permDescList);

        public Integer deleteByInPermDesc(@Param("permDescList") Collection<String> permDescList);

        public List<PermDO> listByPermIcon(@Param("permIcon") Long permIcon, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByPermIcon(@Param("permIcon") Long permIcon, @Param("fieldNames") String[] fieldNames);

        public Integer countByPermIcon(@Param("permIcon") Long permIcon);

        public default PermDO singleResultByPermIcon(Long permIcon, String[] fieldNames){
             List<PermDO> list=this.listByPermIcon(permIcon,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByPermIcon(Long permIcon, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByPermIcon(permIcon,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPermIcon(@Param("updateDO") PermDO updateDO, @Param("permIcon") Long permIcon);

        public Integer updateAllFieldsByPermIcon(@Param("updateDO") PermDO updateDO, @Param("permIcon") Long permIcon);

        public Integer deleteByPermIcon(@Param("permIcon") Long permIcon);




        public List<PermDO> listByInPermIcon(@Param("permIconList") Collection<Long> permIconList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByInPermIcon(@Param("permIconList") Collection<Long> permIconList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInPermIcon(@Param("permIconList") Collection<Long> permIconList);

        public default PermDO singleResultByInPermIcon(Collection<Long> permIconList, String[] fieldNames){
             List<PermDO> list=this.listByInPermIcon(permIconList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByInPermIcon(Collection<Long> permIconList, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByInPermIcon(permIconList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPermIcon(@Param("updateDO") PermDO updateDO, @Param("permIconList") Collection<Long> permIconList);

        public Integer updateAllFieldsByInPermIcon(@Param("updateDO") PermDO updateDO, @Param("permIconList") Collection<Long> permIconList);

        public Integer deleteByInPermIcon(@Param("permIconList") Collection<Long> permIconList);

        public List<PermDO> listByPermIconUrl(@Param("permIconUrl") String permIconUrl, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByPermIconUrl(@Param("permIconUrl") String permIconUrl, @Param("fieldNames") String[] fieldNames);

        public Integer countByPermIconUrl(@Param("permIconUrl") String permIconUrl);

        public default PermDO singleResultByPermIconUrl(String permIconUrl, String[] fieldNames){
             List<PermDO> list=this.listByPermIconUrl(permIconUrl,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByPermIconUrl(String permIconUrl, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByPermIconUrl(permIconUrl,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPermIconUrl(@Param("updateDO") PermDO updateDO, @Param("permIconUrl") String permIconUrl);

        public Integer updateAllFieldsByPermIconUrl(@Param("updateDO") PermDO updateDO, @Param("permIconUrl") String permIconUrl);

        public Integer deleteByPermIconUrl(@Param("permIconUrl") String permIconUrl);




        public List<PermDO> listByInPermIconUrl(@Param("permIconUrlList") Collection<String> permIconUrlList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByInPermIconUrl(@Param("permIconUrlList") Collection<String> permIconUrlList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInPermIconUrl(@Param("permIconUrlList") Collection<String> permIconUrlList);

        public default PermDO singleResultByInPermIconUrl(Collection<String> permIconUrlList, String[] fieldNames){
             List<PermDO> list=this.listByInPermIconUrl(permIconUrlList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByInPermIconUrl(Collection<String> permIconUrlList, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByInPermIconUrl(permIconUrlList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPermIconUrl(@Param("updateDO") PermDO updateDO, @Param("permIconUrlList") Collection<String> permIconUrlList);

        public Integer updateAllFieldsByInPermIconUrl(@Param("updateDO") PermDO updateDO, @Param("permIconUrlList") Collection<String> permIconUrlList);

        public Integer deleteByInPermIconUrl(@Param("permIconUrlList") Collection<String> permIconUrlList);

        public List<PermDO> listByAppId(@Param("appId") Long appId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByAppId(@Param("appId") Long appId, @Param("fieldNames") String[] fieldNames);

        public Integer countByAppId(@Param("appId") Long appId);

        public default PermDO singleResultByAppId(Long appId, String[] fieldNames){
             List<PermDO> list=this.listByAppId(appId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByAppId(Long appId, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByAppId(appId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAppId(@Param("updateDO") PermDO updateDO, @Param("appId") Long appId);

        public Integer updateAllFieldsByAppId(@Param("updateDO") PermDO updateDO, @Param("appId") Long appId);

        public Integer deleteByAppId(@Param("appId") Long appId);




        public List<PermDO> listByInAppId(@Param("appIdList") Collection<Long> appIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByInAppId(@Param("appIdList") Collection<Long> appIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInAppId(@Param("appIdList") Collection<Long> appIdList);

        public default PermDO singleResultByInAppId(Collection<Long> appIdList, String[] fieldNames){
             List<PermDO> list=this.listByInAppId(appIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByInAppId(Collection<Long> appIdList, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByInAppId(appIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInAppId(@Param("updateDO") PermDO updateDO, @Param("appIdList") Collection<Long> appIdList);

        public Integer updateAllFieldsByInAppId(@Param("updateDO") PermDO updateDO, @Param("appIdList") Collection<Long> appIdList);

        public Integer deleteByInAppId(@Param("appIdList") Collection<Long> appIdList);

        public List<PermDO> listBySeq(@Param("seq") Long seq, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapBySeq(@Param("seq") Long seq, @Param("fieldNames") String[] fieldNames);

        public Integer countBySeq(@Param("seq") Long seq);

        public default PermDO singleResultBySeq(Long seq, String[] fieldNames){
             List<PermDO> list=this.listBySeq(seq,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingBySeq(Long seq, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listBySeq(seq,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsBySeq(@Param("updateDO") PermDO updateDO, @Param("seq") Long seq);

        public Integer updateAllFieldsBySeq(@Param("updateDO") PermDO updateDO, @Param("seq") Long seq);

        public Integer deleteBySeq(@Param("seq") Long seq);




        public List<PermDO> listByInSeq(@Param("seqList") Collection<Long> seqList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByInSeq(@Param("seqList") Collection<Long> seqList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInSeq(@Param("seqList") Collection<Long> seqList);

        public default PermDO singleResultByInSeq(Collection<Long> seqList, String[] fieldNames){
             List<PermDO> list=this.listByInSeq(seqList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByInSeq(Collection<Long> seqList, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByInSeq(seqList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInSeq(@Param("updateDO") PermDO updateDO, @Param("seqList") Collection<Long> seqList);

        public Integer updateAllFieldsByInSeq(@Param("updateDO") PermDO updateDO, @Param("seqList") Collection<Long> seqList);

        public Integer deleteByInSeq(@Param("seqList") Collection<Long> seqList);

        public List<PermDO> listByEnableStatus(@Param("enableStatus") Integer enableStatus, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByEnableStatus(@Param("enableStatus") Integer enableStatus, @Param("fieldNames") String[] fieldNames);

        public Integer countByEnableStatus(@Param("enableStatus") Integer enableStatus);

        public default PermDO singleResultByEnableStatus(Integer enableStatus, String[] fieldNames){
             List<PermDO> list=this.listByEnableStatus(enableStatus,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByEnableStatus(Integer enableStatus, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByEnableStatus(enableStatus,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByEnableStatus(@Param("updateDO") PermDO updateDO, @Param("enableStatus") Integer enableStatus);

        public Integer updateAllFieldsByEnableStatus(@Param("updateDO") PermDO updateDO, @Param("enableStatus") Integer enableStatus);

        public Integer deleteByEnableStatus(@Param("enableStatus") Integer enableStatus);




        public List<PermDO> listByInEnableStatus(@Param("enableStatusList") Collection<Integer> enableStatusList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByInEnableStatus(@Param("enableStatusList") Collection<Integer> enableStatusList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInEnableStatus(@Param("enableStatusList") Collection<Integer> enableStatusList);

        public default PermDO singleResultByInEnableStatus(Collection<Integer> enableStatusList, String[] fieldNames){
             List<PermDO> list=this.listByInEnableStatus(enableStatusList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByInEnableStatus(Collection<Integer> enableStatusList, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByInEnableStatus(enableStatusList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInEnableStatus(@Param("updateDO") PermDO updateDO, @Param("enableStatusList") Collection<Integer> enableStatusList);

        public Integer updateAllFieldsByInEnableStatus(@Param("updateDO") PermDO updateDO, @Param("enableStatusList") Collection<Integer> enableStatusList);

        public Integer deleteByInEnableStatus(@Param("enableStatusList") Collection<Integer> enableStatusList);

        public List<PermDO> listByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdCreate(@Param("userIdCreate") Long userIdCreate);

        public default PermDO singleResultByUserIdCreate(Long userIdCreate, String[] fieldNames){
             List<PermDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByUserIdCreate(Long userIdCreate, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(@Param("updateDO") PermDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(@Param("updateDO") PermDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer deleteByUserIdCreate(@Param("userIdCreate") Long userIdCreate);




        public List<PermDO> listByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public default PermDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String[] fieldNames){
             List<PermDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdCreate(@Param("updateDO") PermDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer updateAllFieldsByInUserIdCreate(@Param("updateDO") PermDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer deleteByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public List<PermDO> listByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdModified(@Param("userIdModified") Long userIdModified);

        public default PermDO singleResultByUserIdModified(Long userIdModified, String[] fieldNames){
             List<PermDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByUserIdModified(Long userIdModified, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(@Param("updateDO") PermDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(@Param("updateDO") PermDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer deleteByUserIdModified(@Param("userIdModified") Long userIdModified);




        public List<PermDO> listByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,PermDO> mapByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public default PermDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String[] fieldNames){
             List<PermDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<PermDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<PermDO, T> mapper, String[] fieldNames){
             List<PermDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdModified(@Param("updateDO") PermDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer updateAllFieldsByInUserIdModified(@Param("updateDO") PermDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer deleteByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);


}
