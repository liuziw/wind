package com.lzw.wind.tibmas.core.daomanager.immutable;

import com.lzw.common.dao.daomanager.CommonDaoManager;
import com.lzw.wind.tibmas.core.dbo.UserRoleDO;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public interface ImmutableUserRoleDaoManager extends CommonDaoManager<UserRoleDO,Long> {


        public List<UserRoleDO> listByUserId(Long userId, String... fieldNames);

        public Map<Long,UserRoleDO> mapByUserId(Long userId, String... fieldNames);

        public Integer countByUserId(Long userId);

        public default UserRoleDO singleResultByUserId(Long userId, String... fieldNames){
             List<UserRoleDO> list=this.listByUserId(userId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRoleDO>> groupingByUserId(Long userId, Function<UserRoleDO, T> mapper, String... fieldNames){
             List<UserRoleDO> list=this.listByUserId(userId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserId(UserRoleDO updateDO, Long userId);

        public Integer updateAllFieldsByUserId(UserRoleDO updateDO, Long userId);

        public Integer deleteByUserId(Long userId);






        public List<UserRoleDO> listByInUserId(Collection<Long> userIdList, String... fieldNames);

         public Map<Long,UserRoleDO> mapByInUserId(Collection<Long> userIdList, String... fieldNames);

         public Integer countByInUserId(Collection<Long> userIdList);

         public default UserRoleDO singleResultByInUserId(Collection<Long> userIdList, String... fieldNames){
              List<UserRoleDO> list=this.listByInUserId(userIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRoleDO>> groupingByInUserId(Collection<Long> userIdList, Function<UserRoleDO, T> mapper, String... fieldNames){
              List<UserRoleDO> list=this.listByInUserId(userIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserId(UserRoleDO updateDO, Collection<Long> userIdList);

         public Integer updateAllFieldsByInUserId(UserRoleDO updateDO, Collection<Long> userIdList);

         public Integer deleteByInUserId(Collection<Long> userIdList);
        public List<UserRoleDO> listByRoleId(Long roleId, String... fieldNames);

        public Map<Long,UserRoleDO> mapByRoleId(Long roleId, String... fieldNames);

        public Integer countByRoleId(Long roleId);

        public default UserRoleDO singleResultByRoleId(Long roleId, String... fieldNames){
             List<UserRoleDO> list=this.listByRoleId(roleId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRoleDO>> groupingByRoleId(Long roleId, Function<UserRoleDO, T> mapper, String... fieldNames){
             List<UserRoleDO> list=this.listByRoleId(roleId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRoleId(UserRoleDO updateDO, Long roleId);

        public Integer updateAllFieldsByRoleId(UserRoleDO updateDO, Long roleId);

        public Integer deleteByRoleId(Long roleId);






        public List<UserRoleDO> listByInRoleId(Collection<Long> roleIdList, String... fieldNames);

         public Map<Long,UserRoleDO> mapByInRoleId(Collection<Long> roleIdList, String... fieldNames);

         public Integer countByInRoleId(Collection<Long> roleIdList);

         public default UserRoleDO singleResultByInRoleId(Collection<Long> roleIdList, String... fieldNames){
              List<UserRoleDO> list=this.listByInRoleId(roleIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRoleDO>> groupingByInRoleId(Collection<Long> roleIdList, Function<UserRoleDO, T> mapper, String... fieldNames){
              List<UserRoleDO> list=this.listByInRoleId(roleIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInRoleId(UserRoleDO updateDO, Collection<Long> roleIdList);

         public Integer updateAllFieldsByInRoleId(UserRoleDO updateDO, Collection<Long> roleIdList);

         public Integer deleteByInRoleId(Collection<Long> roleIdList);
        public List<UserRoleDO> listByStartTime(Date startTime, String... fieldNames);

        public Map<Long,UserRoleDO> mapByStartTime(Date startTime, String... fieldNames);

        public Integer countByStartTime(Date startTime);

        public default UserRoleDO singleResultByStartTime(Date startTime, String... fieldNames){
             List<UserRoleDO> list=this.listByStartTime(startTime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRoleDO>> groupingByStartTime(Date startTime, Function<UserRoleDO, T> mapper, String... fieldNames){
             List<UserRoleDO> list=this.listByStartTime(startTime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByStartTime(UserRoleDO updateDO, Date startTime);

        public Integer updateAllFieldsByStartTime(UserRoleDO updateDO, Date startTime);

        public Integer deleteByStartTime(Date startTime);






        public List<UserRoleDO> listByInStartTime(Collection<Date> startTimeList, String... fieldNames);

         public Map<Long,UserRoleDO> mapByInStartTime(Collection<Date> startTimeList, String... fieldNames);

         public Integer countByInStartTime(Collection<Date> startTimeList);

         public default UserRoleDO singleResultByInStartTime(Collection<Date> startTimeList, String... fieldNames){
              List<UserRoleDO> list=this.listByInStartTime(startTimeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRoleDO>> groupingByInStartTime(Collection<Date> startTimeList, Function<UserRoleDO, T> mapper, String... fieldNames){
              List<UserRoleDO> list=this.listByInStartTime(startTimeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInStartTime(UserRoleDO updateDO, Collection<Date> startTimeList);

         public Integer updateAllFieldsByInStartTime(UserRoleDO updateDO, Collection<Date> startTimeList);

         public Integer deleteByInStartTime(Collection<Date> startTimeList);
        public List<UserRoleDO> listByEndTime(Date endTime, String... fieldNames);

        public Map<Long,UserRoleDO> mapByEndTime(Date endTime, String... fieldNames);

        public Integer countByEndTime(Date endTime);

        public default UserRoleDO singleResultByEndTime(Date endTime, String... fieldNames){
             List<UserRoleDO> list=this.listByEndTime(endTime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRoleDO>> groupingByEndTime(Date endTime, Function<UserRoleDO, T> mapper, String... fieldNames){
             List<UserRoleDO> list=this.listByEndTime(endTime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByEndTime(UserRoleDO updateDO, Date endTime);

        public Integer updateAllFieldsByEndTime(UserRoleDO updateDO, Date endTime);

        public Integer deleteByEndTime(Date endTime);






        public List<UserRoleDO> listByInEndTime(Collection<Date> endTimeList, String... fieldNames);

         public Map<Long,UserRoleDO> mapByInEndTime(Collection<Date> endTimeList, String... fieldNames);

         public Integer countByInEndTime(Collection<Date> endTimeList);

         public default UserRoleDO singleResultByInEndTime(Collection<Date> endTimeList, String... fieldNames){
              List<UserRoleDO> list=this.listByInEndTime(endTimeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRoleDO>> groupingByInEndTime(Collection<Date> endTimeList, Function<UserRoleDO, T> mapper, String... fieldNames){
              List<UserRoleDO> list=this.listByInEndTime(endTimeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInEndTime(UserRoleDO updateDO, Collection<Date> endTimeList);

         public Integer updateAllFieldsByInEndTime(UserRoleDO updateDO, Collection<Date> endTimeList);

         public Integer deleteByInEndTime(Collection<Date> endTimeList);
        public List<UserRoleDO> listByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Map<Long,UserRoleDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Integer countByUserIdCreate(Long userIdCreate);

        public default UserRoleDO singleResultByUserIdCreate(Long userIdCreate, String... fieldNames){
             List<UserRoleDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRoleDO>> groupingByUserIdCreate(Long userIdCreate, Function<UserRoleDO, T> mapper, String... fieldNames){
             List<UserRoleDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(UserRoleDO updateDO, Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(UserRoleDO updateDO, Long userIdCreate);

        public Integer deleteByUserIdCreate(Long userIdCreate);






        public List<UserRoleDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Map<Long,UserRoleDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Integer countByInUserIdCreate(Collection<Long> userIdCreateList);

         public default UserRoleDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
              List<UserRoleDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRoleDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<UserRoleDO, T> mapper, String... fieldNames){
              List<UserRoleDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdCreate(UserRoleDO updateDO, Collection<Long> userIdCreateList);

         public Integer updateAllFieldsByInUserIdCreate(UserRoleDO updateDO, Collection<Long> userIdCreateList);

         public Integer deleteByInUserIdCreate(Collection<Long> userIdCreateList);
        public List<UserRoleDO> listByUserIdModified(Long userIdModified, String... fieldNames);

        public Map<Long,UserRoleDO> mapByUserIdModified(Long userIdModified, String... fieldNames);

        public Integer countByUserIdModified(Long userIdModified);

        public default UserRoleDO singleResultByUserIdModified(Long userIdModified, String... fieldNames){
             List<UserRoleDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRoleDO>> groupingByUserIdModified(Long userIdModified, Function<UserRoleDO, T> mapper, String... fieldNames){
             List<UserRoleDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(UserRoleDO updateDO, Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(UserRoleDO updateDO, Long userIdModified);

        public Integer deleteByUserIdModified(Long userIdModified);






        public List<UserRoleDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Map<Long,UserRoleDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Integer countByInUserIdModified(Collection<Long> userIdModifiedList);

         public default UserRoleDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
              List<UserRoleDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<UserRoleDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<UserRoleDO, T> mapper, String... fieldNames){
              List<UserRoleDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdModified(UserRoleDO updateDO, Collection<Long> userIdModifiedList);

         public Integer updateAllFieldsByInUserIdModified(UserRoleDO updateDO, Collection<Long> userIdModifiedList);

         public Integer deleteByInUserIdModified(Collection<Long> userIdModifiedList);


}

