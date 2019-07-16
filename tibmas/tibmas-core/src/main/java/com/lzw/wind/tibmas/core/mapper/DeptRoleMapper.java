package com.lzw.wind.tibmas.core.mapper;

import com.hyzs.gz.common.dao.mapper.CommonMapper;
import com.hyzs.tibmas.core.dbo.DeptRoleDO;
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
public interface DeptRoleMapper extends CommonMapper<DeptRoleDO,Long> {

        public List<DeptRoleDO> listByDeptId(@Param("deptId") Long deptId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptRoleDO> mapByDeptId(@Param("deptId") Long deptId, @Param("fieldNames") String[] fieldNames);

        public Integer countByDeptId(@Param("deptId") Long deptId);

        public default DeptRoleDO singleResultByDeptId(Long deptId, String[] fieldNames){
             List<DeptRoleDO> list=this.listByDeptId(deptId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptRoleDO>> groupingByDeptId(Long deptId, Function<DeptRoleDO, T> mapper, String[] fieldNames){
             List<DeptRoleDO> list=this.listByDeptId(deptId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByDeptId(@Param("updateDO") DeptRoleDO updateDO, @Param("deptId") Long deptId);

        public Integer updateAllFieldsByDeptId(@Param("updateDO") DeptRoleDO updateDO, @Param("deptId") Long deptId);

        public Integer deleteByDeptId(@Param("deptId") Long deptId);




        public List<DeptRoleDO> listByInDeptId(@Param("deptIdList") Collection<Long> deptIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptRoleDO> mapByInDeptId(@Param("deptIdList") Collection<Long> deptIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInDeptId(@Param("deptIdList") Collection<Long> deptIdList);

        public default DeptRoleDO singleResultByInDeptId(Collection<Long> deptIdList, String[] fieldNames){
             List<DeptRoleDO> list=this.listByInDeptId(deptIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptRoleDO>> groupingByInDeptId(Collection<Long> deptIdList, Function<DeptRoleDO, T> mapper, String[] fieldNames){
             List<DeptRoleDO> list=this.listByInDeptId(deptIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInDeptId(@Param("updateDO") DeptRoleDO updateDO, @Param("deptIdList") Collection<Long> deptIdList);

        public Integer updateAllFieldsByInDeptId(@Param("updateDO") DeptRoleDO updateDO, @Param("deptIdList") Collection<Long> deptIdList);

        public Integer deleteByInDeptId(@Param("deptIdList") Collection<Long> deptIdList);

        public List<DeptRoleDO> listByRoleId(@Param("roleId") Long roleId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptRoleDO> mapByRoleId(@Param("roleId") Long roleId, @Param("fieldNames") String[] fieldNames);

        public Integer countByRoleId(@Param("roleId") Long roleId);

        public default DeptRoleDO singleResultByRoleId(Long roleId, String[] fieldNames){
             List<DeptRoleDO> list=this.listByRoleId(roleId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptRoleDO>> groupingByRoleId(Long roleId, Function<DeptRoleDO, T> mapper, String[] fieldNames){
             List<DeptRoleDO> list=this.listByRoleId(roleId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRoleId(@Param("updateDO") DeptRoleDO updateDO, @Param("roleId") Long roleId);

        public Integer updateAllFieldsByRoleId(@Param("updateDO") DeptRoleDO updateDO, @Param("roleId") Long roleId);

        public Integer deleteByRoleId(@Param("roleId") Long roleId);




        public List<DeptRoleDO> listByInRoleId(@Param("roleIdList") Collection<Long> roleIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptRoleDO> mapByInRoleId(@Param("roleIdList") Collection<Long> roleIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInRoleId(@Param("roleIdList") Collection<Long> roleIdList);

        public default DeptRoleDO singleResultByInRoleId(Collection<Long> roleIdList, String[] fieldNames){
             List<DeptRoleDO> list=this.listByInRoleId(roleIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptRoleDO>> groupingByInRoleId(Collection<Long> roleIdList, Function<DeptRoleDO, T> mapper, String[] fieldNames){
             List<DeptRoleDO> list=this.listByInRoleId(roleIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInRoleId(@Param("updateDO") DeptRoleDO updateDO, @Param("roleIdList") Collection<Long> roleIdList);

        public Integer updateAllFieldsByInRoleId(@Param("updateDO") DeptRoleDO updateDO, @Param("roleIdList") Collection<Long> roleIdList);

        public Integer deleteByInRoleId(@Param("roleIdList") Collection<Long> roleIdList);

        public List<DeptRoleDO> listByStartTime(@Param("startTime") Date startTime, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptRoleDO> mapByStartTime(@Param("startTime") Date startTime, @Param("fieldNames") String[] fieldNames);

        public Integer countByStartTime(@Param("startTime") Date startTime);

        public default DeptRoleDO singleResultByStartTime(Date startTime, String[] fieldNames){
             List<DeptRoleDO> list=this.listByStartTime(startTime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptRoleDO>> groupingByStartTime(Date startTime, Function<DeptRoleDO, T> mapper, String[] fieldNames){
             List<DeptRoleDO> list=this.listByStartTime(startTime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByStartTime(@Param("updateDO") DeptRoleDO updateDO, @Param("startTime") Date startTime);

        public Integer updateAllFieldsByStartTime(@Param("updateDO") DeptRoleDO updateDO, @Param("startTime") Date startTime);

        public Integer deleteByStartTime(@Param("startTime") Date startTime);




        public List<DeptRoleDO> listByInStartTime(@Param("startTimeList") Collection<Date> startTimeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptRoleDO> mapByInStartTime(@Param("startTimeList") Collection<Date> startTimeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInStartTime(@Param("startTimeList") Collection<Date> startTimeList);

        public default DeptRoleDO singleResultByInStartTime(Collection<Date> startTimeList, String[] fieldNames){
             List<DeptRoleDO> list=this.listByInStartTime(startTimeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptRoleDO>> groupingByInStartTime(Collection<Date> startTimeList, Function<DeptRoleDO, T> mapper, String[] fieldNames){
             List<DeptRoleDO> list=this.listByInStartTime(startTimeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInStartTime(@Param("updateDO") DeptRoleDO updateDO, @Param("startTimeList") Collection<Date> startTimeList);

        public Integer updateAllFieldsByInStartTime(@Param("updateDO") DeptRoleDO updateDO, @Param("startTimeList") Collection<Date> startTimeList);

        public Integer deleteByInStartTime(@Param("startTimeList") Collection<Date> startTimeList);

        public List<DeptRoleDO> listByEndTime(@Param("endTime") Date endTime, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptRoleDO> mapByEndTime(@Param("endTime") Date endTime, @Param("fieldNames") String[] fieldNames);

        public Integer countByEndTime(@Param("endTime") Date endTime);

        public default DeptRoleDO singleResultByEndTime(Date endTime, String[] fieldNames){
             List<DeptRoleDO> list=this.listByEndTime(endTime,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptRoleDO>> groupingByEndTime(Date endTime, Function<DeptRoleDO, T> mapper, String[] fieldNames){
             List<DeptRoleDO> list=this.listByEndTime(endTime,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByEndTime(@Param("updateDO") DeptRoleDO updateDO, @Param("endTime") Date endTime);

        public Integer updateAllFieldsByEndTime(@Param("updateDO") DeptRoleDO updateDO, @Param("endTime") Date endTime);

        public Integer deleteByEndTime(@Param("endTime") Date endTime);




        public List<DeptRoleDO> listByInEndTime(@Param("endTimeList") Collection<Date> endTimeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptRoleDO> mapByInEndTime(@Param("endTimeList") Collection<Date> endTimeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInEndTime(@Param("endTimeList") Collection<Date> endTimeList);

        public default DeptRoleDO singleResultByInEndTime(Collection<Date> endTimeList, String[] fieldNames){
             List<DeptRoleDO> list=this.listByInEndTime(endTimeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptRoleDO>> groupingByInEndTime(Collection<Date> endTimeList, Function<DeptRoleDO, T> mapper, String[] fieldNames){
             List<DeptRoleDO> list=this.listByInEndTime(endTimeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInEndTime(@Param("updateDO") DeptRoleDO updateDO, @Param("endTimeList") Collection<Date> endTimeList);

        public Integer updateAllFieldsByInEndTime(@Param("updateDO") DeptRoleDO updateDO, @Param("endTimeList") Collection<Date> endTimeList);

        public Integer deleteByInEndTime(@Param("endTimeList") Collection<Date> endTimeList);

        public List<DeptRoleDO> listByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptRoleDO> mapByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdCreate(@Param("userIdCreate") Long userIdCreate);

        public default DeptRoleDO singleResultByUserIdCreate(Long userIdCreate, String[] fieldNames){
             List<DeptRoleDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptRoleDO>> groupingByUserIdCreate(Long userIdCreate, Function<DeptRoleDO, T> mapper, String[] fieldNames){
             List<DeptRoleDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(@Param("updateDO") DeptRoleDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(@Param("updateDO") DeptRoleDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer deleteByUserIdCreate(@Param("userIdCreate") Long userIdCreate);




        public List<DeptRoleDO> listByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptRoleDO> mapByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public default DeptRoleDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String[] fieldNames){
             List<DeptRoleDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptRoleDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<DeptRoleDO, T> mapper, String[] fieldNames){
             List<DeptRoleDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdCreate(@Param("updateDO") DeptRoleDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer updateAllFieldsByInUserIdCreate(@Param("updateDO") DeptRoleDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer deleteByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public List<DeptRoleDO> listByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptRoleDO> mapByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdModified(@Param("userIdModified") Long userIdModified);

        public default DeptRoleDO singleResultByUserIdModified(Long userIdModified, String[] fieldNames){
             List<DeptRoleDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptRoleDO>> groupingByUserIdModified(Long userIdModified, Function<DeptRoleDO, T> mapper, String[] fieldNames){
             List<DeptRoleDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(@Param("updateDO") DeptRoleDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(@Param("updateDO") DeptRoleDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer deleteByUserIdModified(@Param("userIdModified") Long userIdModified);




        public List<DeptRoleDO> listByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,DeptRoleDO> mapByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public default DeptRoleDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String[] fieldNames){
             List<DeptRoleDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<DeptRoleDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<DeptRoleDO, T> mapper, String[] fieldNames){
             List<DeptRoleDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdModified(@Param("updateDO") DeptRoleDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer updateAllFieldsByInUserIdModified(@Param("updateDO") DeptRoleDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer deleteByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);


}
