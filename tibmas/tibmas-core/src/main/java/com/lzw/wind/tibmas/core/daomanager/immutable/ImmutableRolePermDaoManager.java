package com.lzw.wind.tibmas.core.daomanager.immutable;

import com.hyzs.gz.common.dao.daomanager.CommonDaoManager;
import com.hyzs.tibmas.core.dbo.RolePermDO;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public interface ImmutableRolePermDaoManager extends CommonDaoManager<RolePermDO,Long> {


        public List<RolePermDO> listByRoleId(Long roleId, String... fieldNames);

        public Map<Long,RolePermDO> mapByRoleId(Long roleId, String... fieldNames);

        public Integer countByRoleId(Long roleId);

        public default RolePermDO singleResultByRoleId(Long roleId, String... fieldNames){
             List<RolePermDO> list=this.listByRoleId(roleId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RolePermDO>> groupingByRoleId(Long roleId, Function<RolePermDO, T> mapper, String... fieldNames){
             List<RolePermDO> list=this.listByRoleId(roleId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRoleId(RolePermDO updateDO, Long roleId);

        public Integer updateAllFieldsByRoleId(RolePermDO updateDO, Long roleId);

        public Integer deleteByRoleId(Long roleId);






        public List<RolePermDO> listByInRoleId(Collection<Long> roleIdList, String... fieldNames);

         public Map<Long,RolePermDO> mapByInRoleId(Collection<Long> roleIdList, String... fieldNames);

         public Integer countByInRoleId(Collection<Long> roleIdList);

         public default RolePermDO singleResultByInRoleId(Collection<Long> roleIdList, String... fieldNames){
              List<RolePermDO> list=this.listByInRoleId(roleIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<RolePermDO>> groupingByInRoleId(Collection<Long> roleIdList, Function<RolePermDO, T> mapper, String... fieldNames){
              List<RolePermDO> list=this.listByInRoleId(roleIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInRoleId(RolePermDO updateDO, Collection<Long> roleIdList);

         public Integer updateAllFieldsByInRoleId(RolePermDO updateDO, Collection<Long> roleIdList);

         public Integer deleteByInRoleId(Collection<Long> roleIdList);
        public List<RolePermDO> listByPermId(Long permId, String... fieldNames);

        public Map<Long,RolePermDO> mapByPermId(Long permId, String... fieldNames);

        public Integer countByPermId(Long permId);

        public default RolePermDO singleResultByPermId(Long permId, String... fieldNames){
             List<RolePermDO> list=this.listByPermId(permId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RolePermDO>> groupingByPermId(Long permId, Function<RolePermDO, T> mapper, String... fieldNames){
             List<RolePermDO> list=this.listByPermId(permId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPermId(RolePermDO updateDO, Long permId);

        public Integer updateAllFieldsByPermId(RolePermDO updateDO, Long permId);

        public Integer deleteByPermId(Long permId);






        public List<RolePermDO> listByInPermId(Collection<Long> permIdList, String... fieldNames);

         public Map<Long,RolePermDO> mapByInPermId(Collection<Long> permIdList, String... fieldNames);

         public Integer countByInPermId(Collection<Long> permIdList);

         public default RolePermDO singleResultByInPermId(Collection<Long> permIdList, String... fieldNames){
              List<RolePermDO> list=this.listByInPermId(permIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<RolePermDO>> groupingByInPermId(Collection<Long> permIdList, Function<RolePermDO, T> mapper, String... fieldNames){
              List<RolePermDO> list=this.listByInPermId(permIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInPermId(RolePermDO updateDO, Collection<Long> permIdList);

         public Integer updateAllFieldsByInPermId(RolePermDO updateDO, Collection<Long> permIdList);

         public Integer deleteByInPermId(Collection<Long> permIdList);
        public List<RolePermDO> listByRelType(Integer relType, String... fieldNames);

        public Map<Long,RolePermDO> mapByRelType(Integer relType, String... fieldNames);

        public Integer countByRelType(Integer relType);

        public default RolePermDO singleResultByRelType(Integer relType, String... fieldNames){
             List<RolePermDO> list=this.listByRelType(relType,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RolePermDO>> groupingByRelType(Integer relType, Function<RolePermDO, T> mapper, String... fieldNames){
             List<RolePermDO> list=this.listByRelType(relType,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRelType(RolePermDO updateDO, Integer relType);

        public Integer updateAllFieldsByRelType(RolePermDO updateDO, Integer relType);

        public Integer deleteByRelType(Integer relType);






        public List<RolePermDO> listByInRelType(Collection<Integer> relTypeList, String... fieldNames);

         public Map<Long,RolePermDO> mapByInRelType(Collection<Integer> relTypeList, String... fieldNames);

         public Integer countByInRelType(Collection<Integer> relTypeList);

         public default RolePermDO singleResultByInRelType(Collection<Integer> relTypeList, String... fieldNames){
              List<RolePermDO> list=this.listByInRelType(relTypeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<RolePermDO>> groupingByInRelType(Collection<Integer> relTypeList, Function<RolePermDO, T> mapper, String... fieldNames){
              List<RolePermDO> list=this.listByInRelType(relTypeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInRelType(RolePermDO updateDO, Collection<Integer> relTypeList);

         public Integer updateAllFieldsByInRelType(RolePermDO updateDO, Collection<Integer> relTypeList);

         public Integer deleteByInRelType(Collection<Integer> relTypeList);
        public List<RolePermDO> listByStartTime(Date startTime, String... fieldNames);

        public Map<Long,RolePermDO> mapByStartTime(Date startTime, String... fieldNames);

        public Integer countByStartTime(Date startTime);

        public default RolePermDO singleResultByStartTime(Date startTime, String... fieldNames){
             List<RolePermDO> list=this.listByStartTime(startTime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RolePermDO>> groupingByStartTime(Date startTime, Function<RolePermDO, T> mapper, String... fieldNames){
             List<RolePermDO> list=this.listByStartTime(startTime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByStartTime(RolePermDO updateDO, Date startTime);

        public Integer updateAllFieldsByStartTime(RolePermDO updateDO, Date startTime);

        public Integer deleteByStartTime(Date startTime);






        public List<RolePermDO> listByInStartTime(Collection<Date> startTimeList, String... fieldNames);

         public Map<Long,RolePermDO> mapByInStartTime(Collection<Date> startTimeList, String... fieldNames);

         public Integer countByInStartTime(Collection<Date> startTimeList);

         public default RolePermDO singleResultByInStartTime(Collection<Date> startTimeList, String... fieldNames){
              List<RolePermDO> list=this.listByInStartTime(startTimeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<RolePermDO>> groupingByInStartTime(Collection<Date> startTimeList, Function<RolePermDO, T> mapper, String... fieldNames){
              List<RolePermDO> list=this.listByInStartTime(startTimeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInStartTime(RolePermDO updateDO, Collection<Date> startTimeList);

         public Integer updateAllFieldsByInStartTime(RolePermDO updateDO, Collection<Date> startTimeList);

         public Integer deleteByInStartTime(Collection<Date> startTimeList);
        public List<RolePermDO> listByEndTime(Date endTime, String... fieldNames);

        public Map<Long,RolePermDO> mapByEndTime(Date endTime, String... fieldNames);

        public Integer countByEndTime(Date endTime);

        public default RolePermDO singleResultByEndTime(Date endTime, String... fieldNames){
             List<RolePermDO> list=this.listByEndTime(endTime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RolePermDO>> groupingByEndTime(Date endTime, Function<RolePermDO, T> mapper, String... fieldNames){
             List<RolePermDO> list=this.listByEndTime(endTime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByEndTime(RolePermDO updateDO, Date endTime);

        public Integer updateAllFieldsByEndTime(RolePermDO updateDO, Date endTime);

        public Integer deleteByEndTime(Date endTime);






        public List<RolePermDO> listByInEndTime(Collection<Date> endTimeList, String... fieldNames);

         public Map<Long,RolePermDO> mapByInEndTime(Collection<Date> endTimeList, String... fieldNames);

         public Integer countByInEndTime(Collection<Date> endTimeList);

         public default RolePermDO singleResultByInEndTime(Collection<Date> endTimeList, String... fieldNames){
              List<RolePermDO> list=this.listByInEndTime(endTimeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<RolePermDO>> groupingByInEndTime(Collection<Date> endTimeList, Function<RolePermDO, T> mapper, String... fieldNames){
              List<RolePermDO> list=this.listByInEndTime(endTimeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInEndTime(RolePermDO updateDO, Collection<Date> endTimeList);

         public Integer updateAllFieldsByInEndTime(RolePermDO updateDO, Collection<Date> endTimeList);

         public Integer deleteByInEndTime(Collection<Date> endTimeList);
        public List<RolePermDO> listByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Map<Long,RolePermDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Integer countByUserIdCreate(Long userIdCreate);

        public default RolePermDO singleResultByUserIdCreate(Long userIdCreate, String... fieldNames){
             List<RolePermDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RolePermDO>> groupingByUserIdCreate(Long userIdCreate, Function<RolePermDO, T> mapper, String... fieldNames){
             List<RolePermDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(RolePermDO updateDO, Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(RolePermDO updateDO, Long userIdCreate);

        public Integer deleteByUserIdCreate(Long userIdCreate);






        public List<RolePermDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Map<Long,RolePermDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Integer countByInUserIdCreate(Collection<Long> userIdCreateList);

         public default RolePermDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
              List<RolePermDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<RolePermDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<RolePermDO, T> mapper, String... fieldNames){
              List<RolePermDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdCreate(RolePermDO updateDO, Collection<Long> userIdCreateList);

         public Integer updateAllFieldsByInUserIdCreate(RolePermDO updateDO, Collection<Long> userIdCreateList);

         public Integer deleteByInUserIdCreate(Collection<Long> userIdCreateList);
        public List<RolePermDO> listByUserIdModified(Long userIdModified, String... fieldNames);

        public Map<Long,RolePermDO> mapByUserIdModified(Long userIdModified, String... fieldNames);

        public Integer countByUserIdModified(Long userIdModified);

        public default RolePermDO singleResultByUserIdModified(Long userIdModified, String... fieldNames){
             List<RolePermDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RolePermDO>> groupingByUserIdModified(Long userIdModified, Function<RolePermDO, T> mapper, String... fieldNames){
             List<RolePermDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(RolePermDO updateDO, Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(RolePermDO updateDO, Long userIdModified);

        public Integer deleteByUserIdModified(Long userIdModified);






        public List<RolePermDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Map<Long,RolePermDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Integer countByInUserIdModified(Collection<Long> userIdModifiedList);

         public default RolePermDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
              List<RolePermDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<RolePermDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<RolePermDO, T> mapper, String... fieldNames){
              List<RolePermDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdModified(RolePermDO updateDO, Collection<Long> userIdModifiedList);

         public Integer updateAllFieldsByInUserIdModified(RolePermDO updateDO, Collection<Long> userIdModifiedList);

         public Integer deleteByInUserIdModified(Collection<Long> userIdModifiedList);


}

