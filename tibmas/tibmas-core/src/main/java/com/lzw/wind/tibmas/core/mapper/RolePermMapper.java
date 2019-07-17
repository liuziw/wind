package com.lzw.wind.tibmas.core.mapper;

import com.lzw.common.dao.mapper.CommonMapper;
import com.lzw.wind.tibmas.core.dbo.RolePermDO;
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
public interface RolePermMapper extends CommonMapper<RolePermDO,Long> {

        public List<RolePermDO> listByRoleId(@Param("roleId") Long roleId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RolePermDO> mapByRoleId(@Param("roleId") Long roleId, @Param("fieldNames") String[] fieldNames);

        public Integer countByRoleId(@Param("roleId") Long roleId);

        public default RolePermDO singleResultByRoleId(Long roleId, String[] fieldNames){
             List<RolePermDO> list=this.listByRoleId(roleId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RolePermDO>> groupingByRoleId(Long roleId, Function<RolePermDO, T> mapper, String[] fieldNames){
             List<RolePermDO> list=this.listByRoleId(roleId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRoleId(@Param("updateDO") RolePermDO updateDO, @Param("roleId") Long roleId);

        public Integer updateAllFieldsByRoleId(@Param("updateDO") RolePermDO updateDO, @Param("roleId") Long roleId);

        public Integer deleteByRoleId(@Param("roleId") Long roleId);




        public List<RolePermDO> listByInRoleId(@Param("roleIdList") Collection<Long> roleIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RolePermDO> mapByInRoleId(@Param("roleIdList") Collection<Long> roleIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInRoleId(@Param("roleIdList") Collection<Long> roleIdList);

        public default RolePermDO singleResultByInRoleId(Collection<Long> roleIdList, String[] fieldNames){
             List<RolePermDO> list=this.listByInRoleId(roleIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RolePermDO>> groupingByInRoleId(Collection<Long> roleIdList, Function<RolePermDO, T> mapper, String[] fieldNames){
             List<RolePermDO> list=this.listByInRoleId(roleIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInRoleId(@Param("updateDO") RolePermDO updateDO, @Param("roleIdList") Collection<Long> roleIdList);

        public Integer updateAllFieldsByInRoleId(@Param("updateDO") RolePermDO updateDO, @Param("roleIdList") Collection<Long> roleIdList);

        public Integer deleteByInRoleId(@Param("roleIdList") Collection<Long> roleIdList);

        public List<RolePermDO> listByPermId(@Param("permId") Long permId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RolePermDO> mapByPermId(@Param("permId") Long permId, @Param("fieldNames") String[] fieldNames);

        public Integer countByPermId(@Param("permId") Long permId);

        public default RolePermDO singleResultByPermId(Long permId, String[] fieldNames){
             List<RolePermDO> list=this.listByPermId(permId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RolePermDO>> groupingByPermId(Long permId, Function<RolePermDO, T> mapper, String[] fieldNames){
             List<RolePermDO> list=this.listByPermId(permId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByPermId(@Param("updateDO") RolePermDO updateDO, @Param("permId") Long permId);

        public Integer updateAllFieldsByPermId(@Param("updateDO") RolePermDO updateDO, @Param("permId") Long permId);

        public Integer deleteByPermId(@Param("permId") Long permId);




        public List<RolePermDO> listByInPermId(@Param("permIdList") Collection<Long> permIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RolePermDO> mapByInPermId(@Param("permIdList") Collection<Long> permIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInPermId(@Param("permIdList") Collection<Long> permIdList);

        public default RolePermDO singleResultByInPermId(Collection<Long> permIdList, String[] fieldNames){
             List<RolePermDO> list=this.listByInPermId(permIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RolePermDO>> groupingByInPermId(Collection<Long> permIdList, Function<RolePermDO, T> mapper, String[] fieldNames){
             List<RolePermDO> list=this.listByInPermId(permIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInPermId(@Param("updateDO") RolePermDO updateDO, @Param("permIdList") Collection<Long> permIdList);

        public Integer updateAllFieldsByInPermId(@Param("updateDO") RolePermDO updateDO, @Param("permIdList") Collection<Long> permIdList);

        public Integer deleteByInPermId(@Param("permIdList") Collection<Long> permIdList);

        public List<RolePermDO> listByRelType(@Param("relType") Integer relType, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RolePermDO> mapByRelType(@Param("relType") Integer relType, @Param("fieldNames") String[] fieldNames);

        public Integer countByRelType(@Param("relType") Integer relType);

        public default RolePermDO singleResultByRelType(Integer relType, String[] fieldNames){
             List<RolePermDO> list=this.listByRelType(relType,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RolePermDO>> groupingByRelType(Integer relType, Function<RolePermDO, T> mapper, String[] fieldNames){
             List<RolePermDO> list=this.listByRelType(relType,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRelType(@Param("updateDO") RolePermDO updateDO, @Param("relType") Integer relType);

        public Integer updateAllFieldsByRelType(@Param("updateDO") RolePermDO updateDO, @Param("relType") Integer relType);

        public Integer deleteByRelType(@Param("relType") Integer relType);




        public List<RolePermDO> listByInRelType(@Param("relTypeList") Collection<Integer> relTypeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RolePermDO> mapByInRelType(@Param("relTypeList") Collection<Integer> relTypeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInRelType(@Param("relTypeList") Collection<Integer> relTypeList);

        public default RolePermDO singleResultByInRelType(Collection<Integer> relTypeList, String[] fieldNames){
             List<RolePermDO> list=this.listByInRelType(relTypeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RolePermDO>> groupingByInRelType(Collection<Integer> relTypeList, Function<RolePermDO, T> mapper, String[] fieldNames){
             List<RolePermDO> list=this.listByInRelType(relTypeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInRelType(@Param("updateDO") RolePermDO updateDO, @Param("relTypeList") Collection<Integer> relTypeList);

        public Integer updateAllFieldsByInRelType(@Param("updateDO") RolePermDO updateDO, @Param("relTypeList") Collection<Integer> relTypeList);

        public Integer deleteByInRelType(@Param("relTypeList") Collection<Integer> relTypeList);

        public List<RolePermDO> listByStartTime(@Param("startTime") Date startTime, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RolePermDO> mapByStartTime(@Param("startTime") Date startTime, @Param("fieldNames") String[] fieldNames);

        public Integer countByStartTime(@Param("startTime") Date startTime);

        public default RolePermDO singleResultByStartTime(Date startTime, String[] fieldNames){
             List<RolePermDO> list=this.listByStartTime(startTime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RolePermDO>> groupingByStartTime(Date startTime, Function<RolePermDO, T> mapper, String[] fieldNames){
             List<RolePermDO> list=this.listByStartTime(startTime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByStartTime(@Param("updateDO") RolePermDO updateDO, @Param("startTime") Date startTime);

        public Integer updateAllFieldsByStartTime(@Param("updateDO") RolePermDO updateDO, @Param("startTime") Date startTime);

        public Integer deleteByStartTime(@Param("startTime") Date startTime);




        public List<RolePermDO> listByInStartTime(@Param("startTimeList") Collection<Date> startTimeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RolePermDO> mapByInStartTime(@Param("startTimeList") Collection<Date> startTimeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInStartTime(@Param("startTimeList") Collection<Date> startTimeList);

        public default RolePermDO singleResultByInStartTime(Collection<Date> startTimeList, String[] fieldNames){
             List<RolePermDO> list=this.listByInStartTime(startTimeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RolePermDO>> groupingByInStartTime(Collection<Date> startTimeList, Function<RolePermDO, T> mapper, String[] fieldNames){
             List<RolePermDO> list=this.listByInStartTime(startTimeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInStartTime(@Param("updateDO") RolePermDO updateDO, @Param("startTimeList") Collection<Date> startTimeList);

        public Integer updateAllFieldsByInStartTime(@Param("updateDO") RolePermDO updateDO, @Param("startTimeList") Collection<Date> startTimeList);

        public Integer deleteByInStartTime(@Param("startTimeList") Collection<Date> startTimeList);

        public List<RolePermDO> listByEndTime(@Param("endTime") Date endTime, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RolePermDO> mapByEndTime(@Param("endTime") Date endTime, @Param("fieldNames") String[] fieldNames);

        public Integer countByEndTime(@Param("endTime") Date endTime);

        public default RolePermDO singleResultByEndTime(Date endTime, String[] fieldNames){
             List<RolePermDO> list=this.listByEndTime(endTime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RolePermDO>> groupingByEndTime(Date endTime, Function<RolePermDO, T> mapper, String[] fieldNames){
             List<RolePermDO> list=this.listByEndTime(endTime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByEndTime(@Param("updateDO") RolePermDO updateDO, @Param("endTime") Date endTime);

        public Integer updateAllFieldsByEndTime(@Param("updateDO") RolePermDO updateDO, @Param("endTime") Date endTime);

        public Integer deleteByEndTime(@Param("endTime") Date endTime);




        public List<RolePermDO> listByInEndTime(@Param("endTimeList") Collection<Date> endTimeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RolePermDO> mapByInEndTime(@Param("endTimeList") Collection<Date> endTimeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInEndTime(@Param("endTimeList") Collection<Date> endTimeList);

        public default RolePermDO singleResultByInEndTime(Collection<Date> endTimeList, String[] fieldNames){
             List<RolePermDO> list=this.listByInEndTime(endTimeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RolePermDO>> groupingByInEndTime(Collection<Date> endTimeList, Function<RolePermDO, T> mapper, String[] fieldNames){
             List<RolePermDO> list=this.listByInEndTime(endTimeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInEndTime(@Param("updateDO") RolePermDO updateDO, @Param("endTimeList") Collection<Date> endTimeList);

        public Integer updateAllFieldsByInEndTime(@Param("updateDO") RolePermDO updateDO, @Param("endTimeList") Collection<Date> endTimeList);

        public Integer deleteByInEndTime(@Param("endTimeList") Collection<Date> endTimeList);

        public List<RolePermDO> listByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RolePermDO> mapByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdCreate(@Param("userIdCreate") Long userIdCreate);

        public default RolePermDO singleResultByUserIdCreate(Long userIdCreate, String[] fieldNames){
             List<RolePermDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RolePermDO>> groupingByUserIdCreate(Long userIdCreate, Function<RolePermDO, T> mapper, String[] fieldNames){
             List<RolePermDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(@Param("updateDO") RolePermDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(@Param("updateDO") RolePermDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer deleteByUserIdCreate(@Param("userIdCreate") Long userIdCreate);




        public List<RolePermDO> listByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RolePermDO> mapByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public default RolePermDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String[] fieldNames){
             List<RolePermDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RolePermDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<RolePermDO, T> mapper, String[] fieldNames){
             List<RolePermDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdCreate(@Param("updateDO") RolePermDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer updateAllFieldsByInUserIdCreate(@Param("updateDO") RolePermDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer deleteByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public List<RolePermDO> listByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RolePermDO> mapByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdModified(@Param("userIdModified") Long userIdModified);

        public default RolePermDO singleResultByUserIdModified(Long userIdModified, String[] fieldNames){
             List<RolePermDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RolePermDO>> groupingByUserIdModified(Long userIdModified, Function<RolePermDO, T> mapper, String[] fieldNames){
             List<RolePermDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(@Param("updateDO") RolePermDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(@Param("updateDO") RolePermDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer deleteByUserIdModified(@Param("userIdModified") Long userIdModified);




        public List<RolePermDO> listByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RolePermDO> mapByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public default RolePermDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String[] fieldNames){
             List<RolePermDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RolePermDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<RolePermDO, T> mapper, String[] fieldNames){
             List<RolePermDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdModified(@Param("updateDO") RolePermDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer updateAllFieldsByInUserIdModified(@Param("updateDO") RolePermDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer deleteByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);


}
