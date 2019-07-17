package com.lzw.wind.tibmas.core.daomanager.immutable;

import com.lzw.common.dao.daomanager.CommonDaoManager;
import com.lzw.wind.tibmas.core.dbo.DeptRoleDO;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public interface ImmutableDeptRoleDaoManager extends CommonDaoManager<DeptRoleDO,Long> {


        public List<DeptRoleDO> listByDeptId(Long deptId, String... fieldNames);

        public Map<Long,DeptRoleDO> mapByDeptId(Long deptId, String... fieldNames);

        public Integer countByDeptId(Long deptId);

        public default DeptRoleDO singleResultByDeptId(Long deptId, String... fieldNames){
             List<DeptRoleDO> list=this.listByDeptId(deptId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptRoleDO>> groupingByDeptId(Long deptId, Function<DeptRoleDO, T> mapper, String... fieldNames){
             List<DeptRoleDO> list=this.listByDeptId(deptId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeptId(DeptRoleDO updateDO, Long deptId);

        public Integer updateAllFieldsByDeptId(DeptRoleDO updateDO, Long deptId);

        public Integer deleteByDeptId(Long deptId);






        public List<DeptRoleDO> listByInDeptId(Collection<Long> deptIdList, String... fieldNames);

         public Map<Long,DeptRoleDO> mapByInDeptId(Collection<Long> deptIdList, String... fieldNames);

         public Integer countByInDeptId(Collection<Long> deptIdList);

         public default DeptRoleDO singleResultByInDeptId(Collection<Long> deptIdList, String... fieldNames){
              List<DeptRoleDO> list=this.listByInDeptId(deptIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptRoleDO>> groupingByInDeptId(Collection<Long> deptIdList, Function<DeptRoleDO, T> mapper, String... fieldNames){
              List<DeptRoleDO> list=this.listByInDeptId(deptIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInDeptId(DeptRoleDO updateDO, Collection<Long> deptIdList);

         public Integer updateAllFieldsByInDeptId(DeptRoleDO updateDO, Collection<Long> deptIdList);

         public Integer deleteByInDeptId(Collection<Long> deptIdList);
        public List<DeptRoleDO> listByRoleId(Long roleId, String... fieldNames);

        public Map<Long,DeptRoleDO> mapByRoleId(Long roleId, String... fieldNames);

        public Integer countByRoleId(Long roleId);

        public default DeptRoleDO singleResultByRoleId(Long roleId, String... fieldNames){
             List<DeptRoleDO> list=this.listByRoleId(roleId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptRoleDO>> groupingByRoleId(Long roleId, Function<DeptRoleDO, T> mapper, String... fieldNames){
             List<DeptRoleDO> list=this.listByRoleId(roleId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRoleId(DeptRoleDO updateDO, Long roleId);

        public Integer updateAllFieldsByRoleId(DeptRoleDO updateDO, Long roleId);

        public Integer deleteByRoleId(Long roleId);






        public List<DeptRoleDO> listByInRoleId(Collection<Long> roleIdList, String... fieldNames);

         public Map<Long,DeptRoleDO> mapByInRoleId(Collection<Long> roleIdList, String... fieldNames);

         public Integer countByInRoleId(Collection<Long> roleIdList);

         public default DeptRoleDO singleResultByInRoleId(Collection<Long> roleIdList, String... fieldNames){
              List<DeptRoleDO> list=this.listByInRoleId(roleIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptRoleDO>> groupingByInRoleId(Collection<Long> roleIdList, Function<DeptRoleDO, T> mapper, String... fieldNames){
              List<DeptRoleDO> list=this.listByInRoleId(roleIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInRoleId(DeptRoleDO updateDO, Collection<Long> roleIdList);

         public Integer updateAllFieldsByInRoleId(DeptRoleDO updateDO, Collection<Long> roleIdList);

         public Integer deleteByInRoleId(Collection<Long> roleIdList);
        public List<DeptRoleDO> listByStartTime(Date startTime, String... fieldNames);

        public Map<Long,DeptRoleDO> mapByStartTime(Date startTime, String... fieldNames);

        public Integer countByStartTime(Date startTime);

        public default DeptRoleDO singleResultByStartTime(Date startTime, String... fieldNames){
             List<DeptRoleDO> list=this.listByStartTime(startTime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptRoleDO>> groupingByStartTime(Date startTime, Function<DeptRoleDO, T> mapper, String... fieldNames){
             List<DeptRoleDO> list=this.listByStartTime(startTime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByStartTime(DeptRoleDO updateDO, Date startTime);

        public Integer updateAllFieldsByStartTime(DeptRoleDO updateDO, Date startTime);

        public Integer deleteByStartTime(Date startTime);






        public List<DeptRoleDO> listByInStartTime(Collection<Date> startTimeList, String... fieldNames);

         public Map<Long,DeptRoleDO> mapByInStartTime(Collection<Date> startTimeList, String... fieldNames);

         public Integer countByInStartTime(Collection<Date> startTimeList);

         public default DeptRoleDO singleResultByInStartTime(Collection<Date> startTimeList, String... fieldNames){
              List<DeptRoleDO> list=this.listByInStartTime(startTimeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptRoleDO>> groupingByInStartTime(Collection<Date> startTimeList, Function<DeptRoleDO, T> mapper, String... fieldNames){
              List<DeptRoleDO> list=this.listByInStartTime(startTimeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInStartTime(DeptRoleDO updateDO, Collection<Date> startTimeList);

         public Integer updateAllFieldsByInStartTime(DeptRoleDO updateDO, Collection<Date> startTimeList);

         public Integer deleteByInStartTime(Collection<Date> startTimeList);
        public List<DeptRoleDO> listByEndTime(Date endTime, String... fieldNames);

        public Map<Long,DeptRoleDO> mapByEndTime(Date endTime, String... fieldNames);

        public Integer countByEndTime(Date endTime);

        public default DeptRoleDO singleResultByEndTime(Date endTime, String... fieldNames){
             List<DeptRoleDO> list=this.listByEndTime(endTime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptRoleDO>> groupingByEndTime(Date endTime, Function<DeptRoleDO, T> mapper, String... fieldNames){
             List<DeptRoleDO> list=this.listByEndTime(endTime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByEndTime(DeptRoleDO updateDO, Date endTime);

        public Integer updateAllFieldsByEndTime(DeptRoleDO updateDO, Date endTime);

        public Integer deleteByEndTime(Date endTime);






        public List<DeptRoleDO> listByInEndTime(Collection<Date> endTimeList, String... fieldNames);

         public Map<Long,DeptRoleDO> mapByInEndTime(Collection<Date> endTimeList, String... fieldNames);

         public Integer countByInEndTime(Collection<Date> endTimeList);

         public default DeptRoleDO singleResultByInEndTime(Collection<Date> endTimeList, String... fieldNames){
              List<DeptRoleDO> list=this.listByInEndTime(endTimeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptRoleDO>> groupingByInEndTime(Collection<Date> endTimeList, Function<DeptRoleDO, T> mapper, String... fieldNames){
              List<DeptRoleDO> list=this.listByInEndTime(endTimeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInEndTime(DeptRoleDO updateDO, Collection<Date> endTimeList);

         public Integer updateAllFieldsByInEndTime(DeptRoleDO updateDO, Collection<Date> endTimeList);

         public Integer deleteByInEndTime(Collection<Date> endTimeList);
        public List<DeptRoleDO> listByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Map<Long,DeptRoleDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Integer countByUserIdCreate(Long userIdCreate);

        public default DeptRoleDO singleResultByUserIdCreate(Long userIdCreate, String... fieldNames){
             List<DeptRoleDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptRoleDO>> groupingByUserIdCreate(Long userIdCreate, Function<DeptRoleDO, T> mapper, String... fieldNames){
             List<DeptRoleDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(DeptRoleDO updateDO, Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(DeptRoleDO updateDO, Long userIdCreate);

        public Integer deleteByUserIdCreate(Long userIdCreate);






        public List<DeptRoleDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Map<Long,DeptRoleDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Integer countByInUserIdCreate(Collection<Long> userIdCreateList);

         public default DeptRoleDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
              List<DeptRoleDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptRoleDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<DeptRoleDO, T> mapper, String... fieldNames){
              List<DeptRoleDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdCreate(DeptRoleDO updateDO, Collection<Long> userIdCreateList);

         public Integer updateAllFieldsByInUserIdCreate(DeptRoleDO updateDO, Collection<Long> userIdCreateList);

         public Integer deleteByInUserIdCreate(Collection<Long> userIdCreateList);
        public List<DeptRoleDO> listByUserIdModified(Long userIdModified, String... fieldNames);

        public Map<Long,DeptRoleDO> mapByUserIdModified(Long userIdModified, String... fieldNames);

        public Integer countByUserIdModified(Long userIdModified);

        public default DeptRoleDO singleResultByUserIdModified(Long userIdModified, String... fieldNames){
             List<DeptRoleDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptRoleDO>> groupingByUserIdModified(Long userIdModified, Function<DeptRoleDO, T> mapper, String... fieldNames){
             List<DeptRoleDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(DeptRoleDO updateDO, Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(DeptRoleDO updateDO, Long userIdModified);

        public Integer deleteByUserIdModified(Long userIdModified);






        public List<DeptRoleDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Map<Long,DeptRoleDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Integer countByInUserIdModified(Collection<Long> userIdModifiedList);

         public default DeptRoleDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
              List<DeptRoleDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<DeptRoleDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<DeptRoleDO, T> mapper, String... fieldNames){
              List<DeptRoleDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdModified(DeptRoleDO updateDO, Collection<Long> userIdModifiedList);

         public Integer updateAllFieldsByInUserIdModified(DeptRoleDO updateDO, Collection<Long> userIdModifiedList);

         public Integer deleteByInUserIdModified(Collection<Long> userIdModifiedList);


}

