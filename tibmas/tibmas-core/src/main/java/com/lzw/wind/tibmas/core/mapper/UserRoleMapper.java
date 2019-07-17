package com.lzw.wind.tibmas.core.mapper;

import com.lzw.common.dao.mapper.CommonMapper;
import com.lzw.wind.tibmas.core.dbo.UserRoleDO;
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
public interface UserRoleMapper extends CommonMapper<UserRoleDO,Long> {

        public List<UserRoleDO> listByUserId(@Param("userId") Long userId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRoleDO> mapByUserId(@Param("userId") Long userId, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserId(@Param("userId") Long userId);

        public default UserRoleDO singleResultByUserId(Long userId, String[] fieldNames){
             List<UserRoleDO> list=this.listByUserId(userId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRoleDO>> groupingByUserId(Long userId, Function<UserRoleDO, T> mapper, String[] fieldNames){
             List<UserRoleDO> list=this.listByUserId(userId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserId(@Param("updateDO") UserRoleDO updateDO, @Param("userId") Long userId);

        public Integer updateAllFieldsByUserId(@Param("updateDO") UserRoleDO updateDO, @Param("userId") Long userId);

        public Integer deleteByUserId(@Param("userId") Long userId);




        public List<UserRoleDO> listByInUserId(@Param("userIdList") Collection<Long> userIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRoleDO> mapByInUserId(@Param("userIdList") Collection<Long> userIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserId(@Param("userIdList") Collection<Long> userIdList);

        public default UserRoleDO singleResultByInUserId(Collection<Long> userIdList, String[] fieldNames){
             List<UserRoleDO> list=this.listByInUserId(userIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRoleDO>> groupingByInUserId(Collection<Long> userIdList, Function<UserRoleDO, T> mapper, String[] fieldNames){
             List<UserRoleDO> list=this.listByInUserId(userIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserId(@Param("updateDO") UserRoleDO updateDO, @Param("userIdList") Collection<Long> userIdList);

        public Integer updateAllFieldsByInUserId(@Param("updateDO") UserRoleDO updateDO, @Param("userIdList") Collection<Long> userIdList);

        public Integer deleteByInUserId(@Param("userIdList") Collection<Long> userIdList);

        public List<UserRoleDO> listByRoleId(@Param("roleId") Long roleId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRoleDO> mapByRoleId(@Param("roleId") Long roleId, @Param("fieldNames") String[] fieldNames);

        public Integer countByRoleId(@Param("roleId") Long roleId);

        public default UserRoleDO singleResultByRoleId(Long roleId, String[] fieldNames){
             List<UserRoleDO> list=this.listByRoleId(roleId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRoleDO>> groupingByRoleId(Long roleId, Function<UserRoleDO, T> mapper, String[] fieldNames){
             List<UserRoleDO> list=this.listByRoleId(roleId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRoleId(@Param("updateDO") UserRoleDO updateDO, @Param("roleId") Long roleId);

        public Integer updateAllFieldsByRoleId(@Param("updateDO") UserRoleDO updateDO, @Param("roleId") Long roleId);

        public Integer deleteByRoleId(@Param("roleId") Long roleId);




        public List<UserRoleDO> listByInRoleId(@Param("roleIdList") Collection<Long> roleIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRoleDO> mapByInRoleId(@Param("roleIdList") Collection<Long> roleIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInRoleId(@Param("roleIdList") Collection<Long> roleIdList);

        public default UserRoleDO singleResultByInRoleId(Collection<Long> roleIdList, String[] fieldNames){
             List<UserRoleDO> list=this.listByInRoleId(roleIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRoleDO>> groupingByInRoleId(Collection<Long> roleIdList, Function<UserRoleDO, T> mapper, String[] fieldNames){
             List<UserRoleDO> list=this.listByInRoleId(roleIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInRoleId(@Param("updateDO") UserRoleDO updateDO, @Param("roleIdList") Collection<Long> roleIdList);

        public Integer updateAllFieldsByInRoleId(@Param("updateDO") UserRoleDO updateDO, @Param("roleIdList") Collection<Long> roleIdList);

        public Integer deleteByInRoleId(@Param("roleIdList") Collection<Long> roleIdList);

        public List<UserRoleDO> listByStartTime(@Param("startTime") Date startTime, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRoleDO> mapByStartTime(@Param("startTime") Date startTime, @Param("fieldNames") String[] fieldNames);

        public Integer countByStartTime(@Param("startTime") Date startTime);

        public default UserRoleDO singleResultByStartTime(Date startTime, String[] fieldNames){
             List<UserRoleDO> list=this.listByStartTime(startTime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRoleDO>> groupingByStartTime(Date startTime, Function<UserRoleDO, T> mapper, String[] fieldNames){
             List<UserRoleDO> list=this.listByStartTime(startTime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByStartTime(@Param("updateDO") UserRoleDO updateDO, @Param("startTime") Date startTime);

        public Integer updateAllFieldsByStartTime(@Param("updateDO") UserRoleDO updateDO, @Param("startTime") Date startTime);

        public Integer deleteByStartTime(@Param("startTime") Date startTime);




        public List<UserRoleDO> listByInStartTime(@Param("startTimeList") Collection<Date> startTimeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRoleDO> mapByInStartTime(@Param("startTimeList") Collection<Date> startTimeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInStartTime(@Param("startTimeList") Collection<Date> startTimeList);

        public default UserRoleDO singleResultByInStartTime(Collection<Date> startTimeList, String[] fieldNames){
             List<UserRoleDO> list=this.listByInStartTime(startTimeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRoleDO>> groupingByInStartTime(Collection<Date> startTimeList, Function<UserRoleDO, T> mapper, String[] fieldNames){
             List<UserRoleDO> list=this.listByInStartTime(startTimeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInStartTime(@Param("updateDO") UserRoleDO updateDO, @Param("startTimeList") Collection<Date> startTimeList);

        public Integer updateAllFieldsByInStartTime(@Param("updateDO") UserRoleDO updateDO, @Param("startTimeList") Collection<Date> startTimeList);

        public Integer deleteByInStartTime(@Param("startTimeList") Collection<Date> startTimeList);

        public List<UserRoleDO> listByEndTime(@Param("endTime") Date endTime, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRoleDO> mapByEndTime(@Param("endTime") Date endTime, @Param("fieldNames") String[] fieldNames);

        public Integer countByEndTime(@Param("endTime") Date endTime);

        public default UserRoleDO singleResultByEndTime(Date endTime, String[] fieldNames){
             List<UserRoleDO> list=this.listByEndTime(endTime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRoleDO>> groupingByEndTime(Date endTime, Function<UserRoleDO, T> mapper, String[] fieldNames){
             List<UserRoleDO> list=this.listByEndTime(endTime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByEndTime(@Param("updateDO") UserRoleDO updateDO, @Param("endTime") Date endTime);

        public Integer updateAllFieldsByEndTime(@Param("updateDO") UserRoleDO updateDO, @Param("endTime") Date endTime);

        public Integer deleteByEndTime(@Param("endTime") Date endTime);




        public List<UserRoleDO> listByInEndTime(@Param("endTimeList") Collection<Date> endTimeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRoleDO> mapByInEndTime(@Param("endTimeList") Collection<Date> endTimeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInEndTime(@Param("endTimeList") Collection<Date> endTimeList);

        public default UserRoleDO singleResultByInEndTime(Collection<Date> endTimeList, String[] fieldNames){
             List<UserRoleDO> list=this.listByInEndTime(endTimeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRoleDO>> groupingByInEndTime(Collection<Date> endTimeList, Function<UserRoleDO, T> mapper, String[] fieldNames){
             List<UserRoleDO> list=this.listByInEndTime(endTimeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInEndTime(@Param("updateDO") UserRoleDO updateDO, @Param("endTimeList") Collection<Date> endTimeList);

        public Integer updateAllFieldsByInEndTime(@Param("updateDO") UserRoleDO updateDO, @Param("endTimeList") Collection<Date> endTimeList);

        public Integer deleteByInEndTime(@Param("endTimeList") Collection<Date> endTimeList);

        public List<UserRoleDO> listByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRoleDO> mapByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdCreate(@Param("userIdCreate") Long userIdCreate);

        public default UserRoleDO singleResultByUserIdCreate(Long userIdCreate, String[] fieldNames){
             List<UserRoleDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRoleDO>> groupingByUserIdCreate(Long userIdCreate, Function<UserRoleDO, T> mapper, String[] fieldNames){
             List<UserRoleDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(@Param("updateDO") UserRoleDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(@Param("updateDO") UserRoleDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer deleteByUserIdCreate(@Param("userIdCreate") Long userIdCreate);




        public List<UserRoleDO> listByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRoleDO> mapByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public default UserRoleDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String[] fieldNames){
             List<UserRoleDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRoleDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<UserRoleDO, T> mapper, String[] fieldNames){
             List<UserRoleDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdCreate(@Param("updateDO") UserRoleDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer updateAllFieldsByInUserIdCreate(@Param("updateDO") UserRoleDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer deleteByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public List<UserRoleDO> listByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRoleDO> mapByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdModified(@Param("userIdModified") Long userIdModified);

        public default UserRoleDO singleResultByUserIdModified(Long userIdModified, String[] fieldNames){
             List<UserRoleDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRoleDO>> groupingByUserIdModified(Long userIdModified, Function<UserRoleDO, T> mapper, String[] fieldNames){
             List<UserRoleDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(@Param("updateDO") UserRoleDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(@Param("updateDO") UserRoleDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer deleteByUserIdModified(@Param("userIdModified") Long userIdModified);




        public List<UserRoleDO> listByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,UserRoleDO> mapByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public default UserRoleDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String[] fieldNames){
             List<UserRoleDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<UserRoleDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<UserRoleDO, T> mapper, String[] fieldNames){
             List<UserRoleDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdModified(@Param("updateDO") UserRoleDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer updateAllFieldsByInUserIdModified(@Param("updateDO") UserRoleDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer deleteByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);


}
