package com.lzw.wind.tibmas.core.mapper;

import com.hyzs.gz.common.dao.mapper.CommonMapper;
import com.hyzs.tibmas.core.dbo.OptrLogDO;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Mapper
public interface OptrLogMapper extends CommonMapper<OptrLogDO,Long> {

        public List<OptrLogDO> listByUserId(@Param("userId") Long userId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OptrLogDO> mapByUserId(@Param("userId") Long userId, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserId(@Param("userId") Long userId);

        public default OptrLogDO singleResultByUserId(Long userId, String[] fieldNames){
             List<OptrLogDO> list=this.listByUserId(userId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByUserId(Long userId, Function<OptrLogDO, T> mapper, String[] fieldNames){
             List<OptrLogDO> list=this.listByUserId(userId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserId(@Param("updateDO") OptrLogDO updateDO, @Param("userId") Long userId);

        public Integer updateAllFieldsByUserId(@Param("updateDO") OptrLogDO updateDO, @Param("userId") Long userId);

        public Integer deleteByUserId(@Param("userId") Long userId);




        public List<OptrLogDO> listByInUserId(@Param("userIdList") Collection<Long> userIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OptrLogDO> mapByInUserId(@Param("userIdList") Collection<Long> userIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserId(@Param("userIdList") Collection<Long> userIdList);

        public default OptrLogDO singleResultByInUserId(Collection<Long> userIdList, String[] fieldNames){
             List<OptrLogDO> list=this.listByInUserId(userIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByInUserId(Collection<Long> userIdList, Function<OptrLogDO, T> mapper, String[] fieldNames){
             List<OptrLogDO> list=this.listByInUserId(userIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserId(@Param("updateDO") OptrLogDO updateDO, @Param("userIdList") Collection<Long> userIdList);

        public Integer updateAllFieldsByInUserId(@Param("updateDO") OptrLogDO updateDO, @Param("userIdList") Collection<Long> userIdList);

        public Integer deleteByInUserId(@Param("userIdList") Collection<Long> userIdList);

        public List<OptrLogDO> listByDeptId(@Param("deptId") Long deptId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OptrLogDO> mapByDeptId(@Param("deptId") Long deptId, @Param("fieldNames") String[] fieldNames);

        public Integer countByDeptId(@Param("deptId") Long deptId);

        public default OptrLogDO singleResultByDeptId(Long deptId, String[] fieldNames){
             List<OptrLogDO> list=this.listByDeptId(deptId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByDeptId(Long deptId, Function<OptrLogDO, T> mapper, String[] fieldNames){
             List<OptrLogDO> list=this.listByDeptId(deptId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeptId(@Param("updateDO") OptrLogDO updateDO, @Param("deptId") Long deptId);

        public Integer updateAllFieldsByDeptId(@Param("updateDO") OptrLogDO updateDO, @Param("deptId") Long deptId);

        public Integer deleteByDeptId(@Param("deptId") Long deptId);




        public List<OptrLogDO> listByInDeptId(@Param("deptIdList") Collection<Long> deptIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OptrLogDO> mapByInDeptId(@Param("deptIdList") Collection<Long> deptIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInDeptId(@Param("deptIdList") Collection<Long> deptIdList);

        public default OptrLogDO singleResultByInDeptId(Collection<Long> deptIdList, String[] fieldNames){
             List<OptrLogDO> list=this.listByInDeptId(deptIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByInDeptId(Collection<Long> deptIdList, Function<OptrLogDO, T> mapper, String[] fieldNames){
             List<OptrLogDO> list=this.listByInDeptId(deptIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInDeptId(@Param("updateDO") OptrLogDO updateDO, @Param("deptIdList") Collection<Long> deptIdList);

        public Integer updateAllFieldsByInDeptId(@Param("updateDO") OptrLogDO updateDO, @Param("deptIdList") Collection<Long> deptIdList);

        public Integer deleteByInDeptId(@Param("deptIdList") Collection<Long> deptIdList);

        public List<OptrLogDO> listByAppId(@Param("appId") Long appId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OptrLogDO> mapByAppId(@Param("appId") Long appId, @Param("fieldNames") String[] fieldNames);

        public Integer countByAppId(@Param("appId") Long appId);

        public default OptrLogDO singleResultByAppId(Long appId, String[] fieldNames){
             List<OptrLogDO> list=this.listByAppId(appId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByAppId(Long appId, Function<OptrLogDO, T> mapper, String[] fieldNames){
             List<OptrLogDO> list=this.listByAppId(appId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAppId(@Param("updateDO") OptrLogDO updateDO, @Param("appId") Long appId);

        public Integer updateAllFieldsByAppId(@Param("updateDO") OptrLogDO updateDO, @Param("appId") Long appId);

        public Integer deleteByAppId(@Param("appId") Long appId);




        public List<OptrLogDO> listByInAppId(@Param("appIdList") Collection<Long> appIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OptrLogDO> mapByInAppId(@Param("appIdList") Collection<Long> appIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInAppId(@Param("appIdList") Collection<Long> appIdList);

        public default OptrLogDO singleResultByInAppId(Collection<Long> appIdList, String[] fieldNames){
             List<OptrLogDO> list=this.listByInAppId(appIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByInAppId(Collection<Long> appIdList, Function<OptrLogDO, T> mapper, String[] fieldNames){
             List<OptrLogDO> list=this.listByInAppId(appIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInAppId(@Param("updateDO") OptrLogDO updateDO, @Param("appIdList") Collection<Long> appIdList);

        public Integer updateAllFieldsByInAppId(@Param("updateDO") OptrLogDO updateDO, @Param("appIdList") Collection<Long> appIdList);

        public Integer deleteByInAppId(@Param("appIdList") Collection<Long> appIdList);

        public List<OptrLogDO> listByMainModel(@Param("mainModel") String mainModel, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OptrLogDO> mapByMainModel(@Param("mainModel") String mainModel, @Param("fieldNames") String[] fieldNames);

        public Integer countByMainModel(@Param("mainModel") String mainModel);

        public default OptrLogDO singleResultByMainModel(String mainModel, String[] fieldNames){
             List<OptrLogDO> list=this.listByMainModel(mainModel,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByMainModel(String mainModel, Function<OptrLogDO, T> mapper, String[] fieldNames){
             List<OptrLogDO> list=this.listByMainModel(mainModel,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByMainModel(@Param("updateDO") OptrLogDO updateDO, @Param("mainModel") String mainModel);

        public Integer updateAllFieldsByMainModel(@Param("updateDO") OptrLogDO updateDO, @Param("mainModel") String mainModel);

        public Integer deleteByMainModel(@Param("mainModel") String mainModel);




        public List<OptrLogDO> listByInMainModel(@Param("mainModelList") Collection<String> mainModelList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OptrLogDO> mapByInMainModel(@Param("mainModelList") Collection<String> mainModelList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInMainModel(@Param("mainModelList") Collection<String> mainModelList);

        public default OptrLogDO singleResultByInMainModel(Collection<String> mainModelList, String[] fieldNames){
             List<OptrLogDO> list=this.listByInMainModel(mainModelList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByInMainModel(Collection<String> mainModelList, Function<OptrLogDO, T> mapper, String[] fieldNames){
             List<OptrLogDO> list=this.listByInMainModel(mainModelList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInMainModel(@Param("updateDO") OptrLogDO updateDO, @Param("mainModelList") Collection<String> mainModelList);

        public Integer updateAllFieldsByInMainModel(@Param("updateDO") OptrLogDO updateDO, @Param("mainModelList") Collection<String> mainModelList);

        public Integer deleteByInMainModel(@Param("mainModelList") Collection<String> mainModelList);

        public List<OptrLogDO> listBySubModel(@Param("subModel") String subModel, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OptrLogDO> mapBySubModel(@Param("subModel") String subModel, @Param("fieldNames") String[] fieldNames);

        public Integer countBySubModel(@Param("subModel") String subModel);

        public default OptrLogDO singleResultBySubModel(String subModel, String[] fieldNames){
             List<OptrLogDO> list=this.listBySubModel(subModel,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingBySubModel(String subModel, Function<OptrLogDO, T> mapper, String[] fieldNames){
             List<OptrLogDO> list=this.listBySubModel(subModel,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsBySubModel(@Param("updateDO") OptrLogDO updateDO, @Param("subModel") String subModel);

        public Integer updateAllFieldsBySubModel(@Param("updateDO") OptrLogDO updateDO, @Param("subModel") String subModel);

        public Integer deleteBySubModel(@Param("subModel") String subModel);




        public List<OptrLogDO> listByInSubModel(@Param("subModelList") Collection<String> subModelList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OptrLogDO> mapByInSubModel(@Param("subModelList") Collection<String> subModelList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInSubModel(@Param("subModelList") Collection<String> subModelList);

        public default OptrLogDO singleResultByInSubModel(Collection<String> subModelList, String[] fieldNames){
             List<OptrLogDO> list=this.listByInSubModel(subModelList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByInSubModel(Collection<String> subModelList, Function<OptrLogDO, T> mapper, String[] fieldNames){
             List<OptrLogDO> list=this.listByInSubModel(subModelList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInSubModel(@Param("updateDO") OptrLogDO updateDO, @Param("subModelList") Collection<String> subModelList);

        public Integer updateAllFieldsByInSubModel(@Param("updateDO") OptrLogDO updateDO, @Param("subModelList") Collection<String> subModelList);

        public Integer deleteByInSubModel(@Param("subModelList") Collection<String> subModelList);

        public List<OptrLogDO> listByOptrTarget(@Param("optrTarget") String optrTarget, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OptrLogDO> mapByOptrTarget(@Param("optrTarget") String optrTarget, @Param("fieldNames") String[] fieldNames);

        public Integer countByOptrTarget(@Param("optrTarget") String optrTarget);

        public default OptrLogDO singleResultByOptrTarget(String optrTarget, String[] fieldNames){
             List<OptrLogDO> list=this.listByOptrTarget(optrTarget,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByOptrTarget(String optrTarget, Function<OptrLogDO, T> mapper, String[] fieldNames){
             List<OptrLogDO> list=this.listByOptrTarget(optrTarget,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByOptrTarget(@Param("updateDO") OptrLogDO updateDO, @Param("optrTarget") String optrTarget);

        public Integer updateAllFieldsByOptrTarget(@Param("updateDO") OptrLogDO updateDO, @Param("optrTarget") String optrTarget);

        public Integer deleteByOptrTarget(@Param("optrTarget") String optrTarget);




        public List<OptrLogDO> listByInOptrTarget(@Param("optrTargetList") Collection<String> optrTargetList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OptrLogDO> mapByInOptrTarget(@Param("optrTargetList") Collection<String> optrTargetList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInOptrTarget(@Param("optrTargetList") Collection<String> optrTargetList);

        public default OptrLogDO singleResultByInOptrTarget(Collection<String> optrTargetList, String[] fieldNames){
             List<OptrLogDO> list=this.listByInOptrTarget(optrTargetList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByInOptrTarget(Collection<String> optrTargetList, Function<OptrLogDO, T> mapper, String[] fieldNames){
             List<OptrLogDO> list=this.listByInOptrTarget(optrTargetList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInOptrTarget(@Param("updateDO") OptrLogDO updateDO, @Param("optrTargetList") Collection<String> optrTargetList);

        public Integer updateAllFieldsByInOptrTarget(@Param("updateDO") OptrLogDO updateDO, @Param("optrTargetList") Collection<String> optrTargetList);

        public Integer deleteByInOptrTarget(@Param("optrTargetList") Collection<String> optrTargetList);

        public List<OptrLogDO> listByOptrDesc(@Param("optrDesc") String optrDesc, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OptrLogDO> mapByOptrDesc(@Param("optrDesc") String optrDesc, @Param("fieldNames") String[] fieldNames);

        public Integer countByOptrDesc(@Param("optrDesc") String optrDesc);

        public default OptrLogDO singleResultByOptrDesc(String optrDesc, String[] fieldNames){
             List<OptrLogDO> list=this.listByOptrDesc(optrDesc,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByOptrDesc(String optrDesc, Function<OptrLogDO, T> mapper, String[] fieldNames){
             List<OptrLogDO> list=this.listByOptrDesc(optrDesc,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByOptrDesc(@Param("updateDO") OptrLogDO updateDO, @Param("optrDesc") String optrDesc);

        public Integer updateAllFieldsByOptrDesc(@Param("updateDO") OptrLogDO updateDO, @Param("optrDesc") String optrDesc);

        public Integer deleteByOptrDesc(@Param("optrDesc") String optrDesc);




        public List<OptrLogDO> listByInOptrDesc(@Param("optrDescList") Collection<String> optrDescList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OptrLogDO> mapByInOptrDesc(@Param("optrDescList") Collection<String> optrDescList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInOptrDesc(@Param("optrDescList") Collection<String> optrDescList);

        public default OptrLogDO singleResultByInOptrDesc(Collection<String> optrDescList, String[] fieldNames){
             List<OptrLogDO> list=this.listByInOptrDesc(optrDescList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByInOptrDesc(Collection<String> optrDescList, Function<OptrLogDO, T> mapper, String[] fieldNames){
             List<OptrLogDO> list=this.listByInOptrDesc(optrDescList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInOptrDesc(@Param("updateDO") OptrLogDO updateDO, @Param("optrDescList") Collection<String> optrDescList);

        public Integer updateAllFieldsByInOptrDesc(@Param("updateDO") OptrLogDO updateDO, @Param("optrDescList") Collection<String> optrDescList);

        public Integer deleteByInOptrDesc(@Param("optrDescList") Collection<String> optrDescList);

        public List<OptrLogDO> listByOptrTime(@Param("optrTime") Date optrTime, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OptrLogDO> mapByOptrTime(@Param("optrTime") Date optrTime, @Param("fieldNames") String[] fieldNames);

        public Integer countByOptrTime(@Param("optrTime") Date optrTime);

        public default OptrLogDO singleResultByOptrTime(Date optrTime, String[] fieldNames){
             List<OptrLogDO> list=this.listByOptrTime(optrTime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByOptrTime(Date optrTime, Function<OptrLogDO, T> mapper, String[] fieldNames){
             List<OptrLogDO> list=this.listByOptrTime(optrTime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByOptrTime(@Param("updateDO") OptrLogDO updateDO, @Param("optrTime") Date optrTime);

        public Integer updateAllFieldsByOptrTime(@Param("updateDO") OptrLogDO updateDO, @Param("optrTime") Date optrTime);

        public Integer deleteByOptrTime(@Param("optrTime") Date optrTime);




        public List<OptrLogDO> listByInOptrTime(@Param("optrTimeList") Collection<Date> optrTimeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OptrLogDO> mapByInOptrTime(@Param("optrTimeList") Collection<Date> optrTimeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInOptrTime(@Param("optrTimeList") Collection<Date> optrTimeList);

        public default OptrLogDO singleResultByInOptrTime(Collection<Date> optrTimeList, String[] fieldNames){
             List<OptrLogDO> list=this.listByInOptrTime(optrTimeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByInOptrTime(Collection<Date> optrTimeList, Function<OptrLogDO, T> mapper, String[] fieldNames){
             List<OptrLogDO> list=this.listByInOptrTime(optrTimeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInOptrTime(@Param("updateDO") OptrLogDO updateDO, @Param("optrTimeList") Collection<Date> optrTimeList);

        public Integer updateAllFieldsByInOptrTime(@Param("updateDO") OptrLogDO updateDO, @Param("optrTimeList") Collection<Date> optrTimeList);

        public Integer deleteByInOptrTime(@Param("optrTimeList") Collection<Date> optrTimeList);

        public List<OptrLogDO> listByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OptrLogDO> mapByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdCreate(@Param("userIdCreate") Long userIdCreate);

        public default OptrLogDO singleResultByUserIdCreate(Long userIdCreate, String[] fieldNames){
             List<OptrLogDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByUserIdCreate(Long userIdCreate, Function<OptrLogDO, T> mapper, String[] fieldNames){
             List<OptrLogDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(@Param("updateDO") OptrLogDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(@Param("updateDO") OptrLogDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer deleteByUserIdCreate(@Param("userIdCreate") Long userIdCreate);




        public List<OptrLogDO> listByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OptrLogDO> mapByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public default OptrLogDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String[] fieldNames){
             List<OptrLogDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<OptrLogDO, T> mapper, String[] fieldNames){
             List<OptrLogDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdCreate(@Param("updateDO") OptrLogDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer updateAllFieldsByInUserIdCreate(@Param("updateDO") OptrLogDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer deleteByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public List<OptrLogDO> listByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OptrLogDO> mapByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdModified(@Param("userIdModified") Long userIdModified);

        public default OptrLogDO singleResultByUserIdModified(Long userIdModified, String[] fieldNames){
             List<OptrLogDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByUserIdModified(Long userIdModified, Function<OptrLogDO, T> mapper, String[] fieldNames){
             List<OptrLogDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(@Param("updateDO") OptrLogDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(@Param("updateDO") OptrLogDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer deleteByUserIdModified(@Param("userIdModified") Long userIdModified);




        public List<OptrLogDO> listByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,OptrLogDO> mapByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public default OptrLogDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String[] fieldNames){
             List<OptrLogDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<OptrLogDO, T> mapper, String[] fieldNames){
             List<OptrLogDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdModified(@Param("updateDO") OptrLogDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer updateAllFieldsByInUserIdModified(@Param("updateDO") OptrLogDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer deleteByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);


}
