package com.lzw.wind.tibmas.log.daomanager.immutable;

import com.lzw.common.dao.daomanager.CommonDaoManager;
import com.lzw.wind.tibmas.log.dbo.OptrLogDO;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public interface ImmutableOptrLogDaoManager extends CommonDaoManager<OptrLogDO,Long> {


        public List<OptrLogDO> listByUserId(Long userId, String... fieldNames);

        public Map<Long,OptrLogDO> mapByUserId(Long userId, String... fieldNames);

        public Integer countByUserId(Long userId);

        public default OptrLogDO singleResultByUserId(Long userId, String... fieldNames){
             List<OptrLogDO> list=this.listByUserId(userId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByUserId(Long userId, Function<OptrLogDO, T> mapper, String... fieldNames){
             List<OptrLogDO> list=this.listByUserId(userId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserId(OptrLogDO updateDO, Long userId);

        public Integer updateAllFieldsByUserId(OptrLogDO updateDO, Long userId);

        public Integer deleteByUserId(Long userId);






        public List<OptrLogDO> listByInUserId(Collection<Long> userIdList, String... fieldNames);

         public Map<Long,OptrLogDO> mapByInUserId(Collection<Long> userIdList, String... fieldNames);

         public Integer countByInUserId(Collection<Long> userIdList);

         public default OptrLogDO singleResultByInUserId(Collection<Long> userIdList, String... fieldNames){
              List<OptrLogDO> list=this.listByInUserId(userIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<OptrLogDO>> groupingByInUserId(Collection<Long> userIdList, Function<OptrLogDO, T> mapper, String... fieldNames){
              List<OptrLogDO> list=this.listByInUserId(userIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserId(OptrLogDO updateDO, Collection<Long> userIdList);

         public Integer updateAllFieldsByInUserId(OptrLogDO updateDO, Collection<Long> userIdList);

         public Integer deleteByInUserId(Collection<Long> userIdList);
        public List<OptrLogDO> listByDeptId(Long deptId, String... fieldNames);

        public Map<Long,OptrLogDO> mapByDeptId(Long deptId, String... fieldNames);

        public Integer countByDeptId(Long deptId);

        public default OptrLogDO singleResultByDeptId(Long deptId, String... fieldNames){
             List<OptrLogDO> list=this.listByDeptId(deptId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByDeptId(Long deptId, Function<OptrLogDO, T> mapper, String... fieldNames){
             List<OptrLogDO> list=this.listByDeptId(deptId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeptId(OptrLogDO updateDO, Long deptId);

        public Integer updateAllFieldsByDeptId(OptrLogDO updateDO, Long deptId);

        public Integer deleteByDeptId(Long deptId);






        public List<OptrLogDO> listByInDeptId(Collection<Long> deptIdList, String... fieldNames);

         public Map<Long,OptrLogDO> mapByInDeptId(Collection<Long> deptIdList, String... fieldNames);

         public Integer countByInDeptId(Collection<Long> deptIdList);

         public default OptrLogDO singleResultByInDeptId(Collection<Long> deptIdList, String... fieldNames){
              List<OptrLogDO> list=this.listByInDeptId(deptIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<OptrLogDO>> groupingByInDeptId(Collection<Long> deptIdList, Function<OptrLogDO, T> mapper, String... fieldNames){
              List<OptrLogDO> list=this.listByInDeptId(deptIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInDeptId(OptrLogDO updateDO, Collection<Long> deptIdList);

         public Integer updateAllFieldsByInDeptId(OptrLogDO updateDO, Collection<Long> deptIdList);

         public Integer deleteByInDeptId(Collection<Long> deptIdList);
        public List<OptrLogDO> listByAppId(Long appId, String... fieldNames);

        public Map<Long,OptrLogDO> mapByAppId(Long appId, String... fieldNames);

        public Integer countByAppId(Long appId);

        public default OptrLogDO singleResultByAppId(Long appId, String... fieldNames){
             List<OptrLogDO> list=this.listByAppId(appId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByAppId(Long appId, Function<OptrLogDO, T> mapper, String... fieldNames){
             List<OptrLogDO> list=this.listByAppId(appId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAppId(OptrLogDO updateDO, Long appId);

        public Integer updateAllFieldsByAppId(OptrLogDO updateDO, Long appId);

        public Integer deleteByAppId(Long appId);






        public List<OptrLogDO> listByInAppId(Collection<Long> appIdList, String... fieldNames);

         public Map<Long,OptrLogDO> mapByInAppId(Collection<Long> appIdList, String... fieldNames);

         public Integer countByInAppId(Collection<Long> appIdList);

         public default OptrLogDO singleResultByInAppId(Collection<Long> appIdList, String... fieldNames){
              List<OptrLogDO> list=this.listByInAppId(appIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<OptrLogDO>> groupingByInAppId(Collection<Long> appIdList, Function<OptrLogDO, T> mapper, String... fieldNames){
              List<OptrLogDO> list=this.listByInAppId(appIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInAppId(OptrLogDO updateDO, Collection<Long> appIdList);

         public Integer updateAllFieldsByInAppId(OptrLogDO updateDO, Collection<Long> appIdList);

         public Integer deleteByInAppId(Collection<Long> appIdList);
        public List<OptrLogDO> listByMainModel(String mainModel, String... fieldNames);

        public Map<Long,OptrLogDO> mapByMainModel(String mainModel, String... fieldNames);

        public Integer countByMainModel(String mainModel);

        public default OptrLogDO singleResultByMainModel(String mainModel, String... fieldNames){
             List<OptrLogDO> list=this.listByMainModel(mainModel,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByMainModel(String mainModel, Function<OptrLogDO, T> mapper, String... fieldNames){
             List<OptrLogDO> list=this.listByMainModel(mainModel,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByMainModel(OptrLogDO updateDO, String mainModel);

        public Integer updateAllFieldsByMainModel(OptrLogDO updateDO, String mainModel);

        public Integer deleteByMainModel(String mainModel);






        public List<OptrLogDO> listByInMainModel(Collection<String> mainModelList, String... fieldNames);

         public Map<Long,OptrLogDO> mapByInMainModel(Collection<String> mainModelList, String... fieldNames);

         public Integer countByInMainModel(Collection<String> mainModelList);

         public default OptrLogDO singleResultByInMainModel(Collection<String> mainModelList, String... fieldNames){
              List<OptrLogDO> list=this.listByInMainModel(mainModelList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<OptrLogDO>> groupingByInMainModel(Collection<String> mainModelList, Function<OptrLogDO, T> mapper, String... fieldNames){
              List<OptrLogDO> list=this.listByInMainModel(mainModelList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInMainModel(OptrLogDO updateDO, Collection<String> mainModelList);

         public Integer updateAllFieldsByInMainModel(OptrLogDO updateDO, Collection<String> mainModelList);

         public Integer deleteByInMainModel(Collection<String> mainModelList);
        public List<OptrLogDO> listBySubModel(String subModel, String... fieldNames);

        public Map<Long,OptrLogDO> mapBySubModel(String subModel, String... fieldNames);

        public Integer countBySubModel(String subModel);

        public default OptrLogDO singleResultBySubModel(String subModel, String... fieldNames){
             List<OptrLogDO> list=this.listBySubModel(subModel,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingBySubModel(String subModel, Function<OptrLogDO, T> mapper, String... fieldNames){
             List<OptrLogDO> list=this.listBySubModel(subModel,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsBySubModel(OptrLogDO updateDO, String subModel);

        public Integer updateAllFieldsBySubModel(OptrLogDO updateDO, String subModel);

        public Integer deleteBySubModel(String subModel);






        public List<OptrLogDO> listByInSubModel(Collection<String> subModelList, String... fieldNames);

         public Map<Long,OptrLogDO> mapByInSubModel(Collection<String> subModelList, String... fieldNames);

         public Integer countByInSubModel(Collection<String> subModelList);

         public default OptrLogDO singleResultByInSubModel(Collection<String> subModelList, String... fieldNames){
              List<OptrLogDO> list=this.listByInSubModel(subModelList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<OptrLogDO>> groupingByInSubModel(Collection<String> subModelList, Function<OptrLogDO, T> mapper, String... fieldNames){
              List<OptrLogDO> list=this.listByInSubModel(subModelList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInSubModel(OptrLogDO updateDO, Collection<String> subModelList);

         public Integer updateAllFieldsByInSubModel(OptrLogDO updateDO, Collection<String> subModelList);

         public Integer deleteByInSubModel(Collection<String> subModelList);
        public List<OptrLogDO> listByOptrTarget(String optrTarget, String... fieldNames);

        public Map<Long,OptrLogDO> mapByOptrTarget(String optrTarget, String... fieldNames);

        public Integer countByOptrTarget(String optrTarget);

        public default OptrLogDO singleResultByOptrTarget(String optrTarget, String... fieldNames){
             List<OptrLogDO> list=this.listByOptrTarget(optrTarget,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByOptrTarget(String optrTarget, Function<OptrLogDO, T> mapper, String... fieldNames){
             List<OptrLogDO> list=this.listByOptrTarget(optrTarget,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByOptrTarget(OptrLogDO updateDO, String optrTarget);

        public Integer updateAllFieldsByOptrTarget(OptrLogDO updateDO, String optrTarget);

        public Integer deleteByOptrTarget(String optrTarget);






        public List<OptrLogDO> listByInOptrTarget(Collection<String> optrTargetList, String... fieldNames);

         public Map<Long,OptrLogDO> mapByInOptrTarget(Collection<String> optrTargetList, String... fieldNames);

         public Integer countByInOptrTarget(Collection<String> optrTargetList);

         public default OptrLogDO singleResultByInOptrTarget(Collection<String> optrTargetList, String... fieldNames){
              List<OptrLogDO> list=this.listByInOptrTarget(optrTargetList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<OptrLogDO>> groupingByInOptrTarget(Collection<String> optrTargetList, Function<OptrLogDO, T> mapper, String... fieldNames){
              List<OptrLogDO> list=this.listByInOptrTarget(optrTargetList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInOptrTarget(OptrLogDO updateDO, Collection<String> optrTargetList);

         public Integer updateAllFieldsByInOptrTarget(OptrLogDO updateDO, Collection<String> optrTargetList);

         public Integer deleteByInOptrTarget(Collection<String> optrTargetList);
        public List<OptrLogDO> listByOptrDesc(String optrDesc, String... fieldNames);

        public Map<Long,OptrLogDO> mapByOptrDesc(String optrDesc, String... fieldNames);

        public Integer countByOptrDesc(String optrDesc);

        public default OptrLogDO singleResultByOptrDesc(String optrDesc, String... fieldNames){
             List<OptrLogDO> list=this.listByOptrDesc(optrDesc,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByOptrDesc(String optrDesc, Function<OptrLogDO, T> mapper, String... fieldNames){
             List<OptrLogDO> list=this.listByOptrDesc(optrDesc,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByOptrDesc(OptrLogDO updateDO, String optrDesc);

        public Integer updateAllFieldsByOptrDesc(OptrLogDO updateDO, String optrDesc);

        public Integer deleteByOptrDesc(String optrDesc);






        public List<OptrLogDO> listByInOptrDesc(Collection<String> optrDescList, String... fieldNames);

         public Map<Long,OptrLogDO> mapByInOptrDesc(Collection<String> optrDescList, String... fieldNames);

         public Integer countByInOptrDesc(Collection<String> optrDescList);

         public default OptrLogDO singleResultByInOptrDesc(Collection<String> optrDescList, String... fieldNames){
              List<OptrLogDO> list=this.listByInOptrDesc(optrDescList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<OptrLogDO>> groupingByInOptrDesc(Collection<String> optrDescList, Function<OptrLogDO, T> mapper, String... fieldNames){
              List<OptrLogDO> list=this.listByInOptrDesc(optrDescList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInOptrDesc(OptrLogDO updateDO, Collection<String> optrDescList);

         public Integer updateAllFieldsByInOptrDesc(OptrLogDO updateDO, Collection<String> optrDescList);

         public Integer deleteByInOptrDesc(Collection<String> optrDescList);
        public List<OptrLogDO> listByOptrTime(Date optrTime, String... fieldNames);

        public Map<Long,OptrLogDO> mapByOptrTime(Date optrTime, String... fieldNames);

        public Integer countByOptrTime(Date optrTime);

        public default OptrLogDO singleResultByOptrTime(Date optrTime, String... fieldNames){
             List<OptrLogDO> list=this.listByOptrTime(optrTime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByOptrTime(Date optrTime, Function<OptrLogDO, T> mapper, String... fieldNames){
             List<OptrLogDO> list=this.listByOptrTime(optrTime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByOptrTime(OptrLogDO updateDO, Date optrTime);

        public Integer updateAllFieldsByOptrTime(OptrLogDO updateDO, Date optrTime);

        public Integer deleteByOptrTime(Date optrTime);






        public List<OptrLogDO> listByInOptrTime(Collection<Date> optrTimeList, String... fieldNames);

         public Map<Long,OptrLogDO> mapByInOptrTime(Collection<Date> optrTimeList, String... fieldNames);

         public Integer countByInOptrTime(Collection<Date> optrTimeList);

         public default OptrLogDO singleResultByInOptrTime(Collection<Date> optrTimeList, String... fieldNames){
              List<OptrLogDO> list=this.listByInOptrTime(optrTimeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<OptrLogDO>> groupingByInOptrTime(Collection<Date> optrTimeList, Function<OptrLogDO, T> mapper, String... fieldNames){
              List<OptrLogDO> list=this.listByInOptrTime(optrTimeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInOptrTime(OptrLogDO updateDO, Collection<Date> optrTimeList);

         public Integer updateAllFieldsByInOptrTime(OptrLogDO updateDO, Collection<Date> optrTimeList);

         public Integer deleteByInOptrTime(Collection<Date> optrTimeList);
        public List<OptrLogDO> listByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Map<Long,OptrLogDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Integer countByUserIdCreate(Long userIdCreate);

        public default OptrLogDO singleResultByUserIdCreate(Long userIdCreate, String... fieldNames){
             List<OptrLogDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByUserIdCreate(Long userIdCreate, Function<OptrLogDO, T> mapper, String... fieldNames){
             List<OptrLogDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(OptrLogDO updateDO, Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(OptrLogDO updateDO, Long userIdCreate);

        public Integer deleteByUserIdCreate(Long userIdCreate);






        public List<OptrLogDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Map<Long,OptrLogDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Integer countByInUserIdCreate(Collection<Long> userIdCreateList);

         public default OptrLogDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
              List<OptrLogDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<OptrLogDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<OptrLogDO, T> mapper, String... fieldNames){
              List<OptrLogDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdCreate(OptrLogDO updateDO, Collection<Long> userIdCreateList);

         public Integer updateAllFieldsByInUserIdCreate(OptrLogDO updateDO, Collection<Long> userIdCreateList);

         public Integer deleteByInUserIdCreate(Collection<Long> userIdCreateList);
        public List<OptrLogDO> listByUserIdModified(Long userIdModified, String... fieldNames);

        public Map<Long,OptrLogDO> mapByUserIdModified(Long userIdModified, String... fieldNames);

        public Integer countByUserIdModified(Long userIdModified);

        public default OptrLogDO singleResultByUserIdModified(Long userIdModified, String... fieldNames){
             List<OptrLogDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<OptrLogDO>> groupingByUserIdModified(Long userIdModified, Function<OptrLogDO, T> mapper, String... fieldNames){
             List<OptrLogDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(OptrLogDO updateDO, Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(OptrLogDO updateDO, Long userIdModified);

        public Integer deleteByUserIdModified(Long userIdModified);






        public List<OptrLogDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Map<Long,OptrLogDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Integer countByInUserIdModified(Collection<Long> userIdModifiedList);

         public default OptrLogDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
              List<OptrLogDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<OptrLogDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<OptrLogDO, T> mapper, String... fieldNames){
              List<OptrLogDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdModified(OptrLogDO updateDO, Collection<Long> userIdModifiedList);

         public Integer updateAllFieldsByInUserIdModified(OptrLogDO updateDO, Collection<Long> userIdModifiedList);

         public Integer deleteByInUserIdModified(Collection<Long> userIdModifiedList);


}

