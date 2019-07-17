package com.lzw.wind.tibmas.core.mapper;

import com.lzw.common.dao.mapper.CommonMapper;
import com.lzw.wind.tibmas.core.dbo.RoleDO;
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
public interface RoleMapper extends CommonMapper<RoleDO,Long> {


        public RoleDO getById(@Param("id") Long id, @Param("fieldNames") String... fieldNames);



        public List<RoleDO> listById(@Param("id") Long id, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleDO> mapById(@Param("id") Long id, @Param("fieldNames") String[] fieldNames);

        public Integer countById(@Param("id") Long id);

        public default RoleDO singleResultById(Long id, String[] fieldNames){
             List<RoleDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingById(Long id, Function<RoleDO, T> mapper, String[] fieldNames){
             List<RoleDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(@Param("updateDO") RoleDO updateDO, @Param("id") Long id);

        public Integer updateAllFieldsById(@Param("updateDO") RoleDO updateDO, @Param("id") Long id);

        public Integer deleteById(@Param("id") Long id);




        public List<RoleDO> listByInId(@Param("idList") Collection<Long> idList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleDO> mapByInId(@Param("idList") Collection<Long> idList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInId(@Param("idList") Collection<Long> idList);

        public default RoleDO singleResultByInId(Collection<Long> idList, String[] fieldNames){
             List<RoleDO> list=this.listByInId(idList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByInId(Collection<Long> idList, Function<RoleDO, T> mapper, String[] fieldNames){
             List<RoleDO> list=this.listByInId(idList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInId(@Param("updateDO") RoleDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer updateAllFieldsByInId(@Param("updateDO") RoleDO updateDO, @Param("idList") Collection<Long> idList);

        public Integer deleteByInId(@Param("idList") Collection<Long> idList);

        public List<RoleDO> listByRoleCode(@Param("roleCode") String roleCode, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleDO> mapByRoleCode(@Param("roleCode") String roleCode, @Param("fieldNames") String[] fieldNames);

        public Integer countByRoleCode(@Param("roleCode") String roleCode);

        public default RoleDO singleResultByRoleCode(String roleCode, String[] fieldNames){
             List<RoleDO> list=this.listByRoleCode(roleCode,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByRoleCode(String roleCode, Function<RoleDO, T> mapper, String[] fieldNames){
             List<RoleDO> list=this.listByRoleCode(roleCode,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRoleCode(@Param("updateDO") RoleDO updateDO, @Param("roleCode") String roleCode);

        public Integer updateAllFieldsByRoleCode(@Param("updateDO") RoleDO updateDO, @Param("roleCode") String roleCode);

        public Integer deleteByRoleCode(@Param("roleCode") String roleCode);




        public List<RoleDO> listByInRoleCode(@Param("roleCodeList") Collection<String> roleCodeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleDO> mapByInRoleCode(@Param("roleCodeList") Collection<String> roleCodeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInRoleCode(@Param("roleCodeList") Collection<String> roleCodeList);

        public default RoleDO singleResultByInRoleCode(Collection<String> roleCodeList, String[] fieldNames){
             List<RoleDO> list=this.listByInRoleCode(roleCodeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByInRoleCode(Collection<String> roleCodeList, Function<RoleDO, T> mapper, String[] fieldNames){
             List<RoleDO> list=this.listByInRoleCode(roleCodeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInRoleCode(@Param("updateDO") RoleDO updateDO, @Param("roleCodeList") Collection<String> roleCodeList);

        public Integer updateAllFieldsByInRoleCode(@Param("updateDO") RoleDO updateDO, @Param("roleCodeList") Collection<String> roleCodeList);

        public Integer deleteByInRoleCode(@Param("roleCodeList") Collection<String> roleCodeList);

        public List<RoleDO> listByRoleName(@Param("roleName") String roleName, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleDO> mapByRoleName(@Param("roleName") String roleName, @Param("fieldNames") String[] fieldNames);

        public Integer countByRoleName(@Param("roleName") String roleName);

        public default RoleDO singleResultByRoleName(String roleName, String[] fieldNames){
             List<RoleDO> list=this.listByRoleName(roleName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByRoleName(String roleName, Function<RoleDO, T> mapper, String[] fieldNames){
             List<RoleDO> list=this.listByRoleName(roleName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRoleName(@Param("updateDO") RoleDO updateDO, @Param("roleName") String roleName);

        public Integer updateAllFieldsByRoleName(@Param("updateDO") RoleDO updateDO, @Param("roleName") String roleName);

        public Integer deleteByRoleName(@Param("roleName") String roleName);




        public List<RoleDO> listByInRoleName(@Param("roleNameList") Collection<String> roleNameList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleDO> mapByInRoleName(@Param("roleNameList") Collection<String> roleNameList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInRoleName(@Param("roleNameList") Collection<String> roleNameList);

        public default RoleDO singleResultByInRoleName(Collection<String> roleNameList, String[] fieldNames){
             List<RoleDO> list=this.listByInRoleName(roleNameList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByInRoleName(Collection<String> roleNameList, Function<RoleDO, T> mapper, String[] fieldNames){
             List<RoleDO> list=this.listByInRoleName(roleNameList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInRoleName(@Param("updateDO") RoleDO updateDO, @Param("roleNameList") Collection<String> roleNameList);

        public Integer updateAllFieldsByInRoleName(@Param("updateDO") RoleDO updateDO, @Param("roleNameList") Collection<String> roleNameList);

        public Integer deleteByInRoleName(@Param("roleNameList") Collection<String> roleNameList);

        public List<RoleDO> listByRoleDesc(@Param("roleDesc") String roleDesc, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleDO> mapByRoleDesc(@Param("roleDesc") String roleDesc, @Param("fieldNames") String[] fieldNames);

        public Integer countByRoleDesc(@Param("roleDesc") String roleDesc);

        public default RoleDO singleResultByRoleDesc(String roleDesc, String[] fieldNames){
             List<RoleDO> list=this.listByRoleDesc(roleDesc,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByRoleDesc(String roleDesc, Function<RoleDO, T> mapper, String[] fieldNames){
             List<RoleDO> list=this.listByRoleDesc(roleDesc,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRoleDesc(@Param("updateDO") RoleDO updateDO, @Param("roleDesc") String roleDesc);

        public Integer updateAllFieldsByRoleDesc(@Param("updateDO") RoleDO updateDO, @Param("roleDesc") String roleDesc);

        public Integer deleteByRoleDesc(@Param("roleDesc") String roleDesc);




        public List<RoleDO> listByInRoleDesc(@Param("roleDescList") Collection<String> roleDescList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleDO> mapByInRoleDesc(@Param("roleDescList") Collection<String> roleDescList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInRoleDesc(@Param("roleDescList") Collection<String> roleDescList);

        public default RoleDO singleResultByInRoleDesc(Collection<String> roleDescList, String[] fieldNames){
             List<RoleDO> list=this.listByInRoleDesc(roleDescList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByInRoleDesc(Collection<String> roleDescList, Function<RoleDO, T> mapper, String[] fieldNames){
             List<RoleDO> list=this.listByInRoleDesc(roleDescList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInRoleDesc(@Param("updateDO") RoleDO updateDO, @Param("roleDescList") Collection<String> roleDescList);

        public Integer updateAllFieldsByInRoleDesc(@Param("updateDO") RoleDO updateDO, @Param("roleDescList") Collection<String> roleDescList);

        public Integer deleteByInRoleDesc(@Param("roleDescList") Collection<String> roleDescList);

        public List<RoleDO> listByRoleType(@Param("roleType") Integer roleType, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleDO> mapByRoleType(@Param("roleType") Integer roleType, @Param("fieldNames") String[] fieldNames);

        public Integer countByRoleType(@Param("roleType") Integer roleType);

        public default RoleDO singleResultByRoleType(Integer roleType, String[] fieldNames){
             List<RoleDO> list=this.listByRoleType(roleType,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByRoleType(Integer roleType, Function<RoleDO, T> mapper, String[] fieldNames){
             List<RoleDO> list=this.listByRoleType(roleType,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRoleType(@Param("updateDO") RoleDO updateDO, @Param("roleType") Integer roleType);

        public Integer updateAllFieldsByRoleType(@Param("updateDO") RoleDO updateDO, @Param("roleType") Integer roleType);

        public Integer deleteByRoleType(@Param("roleType") Integer roleType);




        public List<RoleDO> listByInRoleType(@Param("roleTypeList") Collection<Integer> roleTypeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleDO> mapByInRoleType(@Param("roleTypeList") Collection<Integer> roleTypeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInRoleType(@Param("roleTypeList") Collection<Integer> roleTypeList);

        public default RoleDO singleResultByInRoleType(Collection<Integer> roleTypeList, String[] fieldNames){
             List<RoleDO> list=this.listByInRoleType(roleTypeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByInRoleType(Collection<Integer> roleTypeList, Function<RoleDO, T> mapper, String[] fieldNames){
             List<RoleDO> list=this.listByInRoleType(roleTypeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInRoleType(@Param("updateDO") RoleDO updateDO, @Param("roleTypeList") Collection<Integer> roleTypeList);

        public Integer updateAllFieldsByInRoleType(@Param("updateDO") RoleDO updateDO, @Param("roleTypeList") Collection<Integer> roleTypeList);

        public Integer deleteByInRoleType(@Param("roleTypeList") Collection<Integer> roleTypeList);

        public List<RoleDO> listByAppId(@Param("appId") Long appId, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleDO> mapByAppId(@Param("appId") Long appId, @Param("fieldNames") String[] fieldNames);

        public Integer countByAppId(@Param("appId") Long appId);

        public default RoleDO singleResultByAppId(Long appId, String[] fieldNames){
             List<RoleDO> list=this.listByAppId(appId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByAppId(Long appId, Function<RoleDO, T> mapper, String[] fieldNames){
             List<RoleDO> list=this.listByAppId(appId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAppId(@Param("updateDO") RoleDO updateDO, @Param("appId") Long appId);

        public Integer updateAllFieldsByAppId(@Param("updateDO") RoleDO updateDO, @Param("appId") Long appId);

        public Integer deleteByAppId(@Param("appId") Long appId);




        public List<RoleDO> listByInAppId(@Param("appIdList") Collection<Long> appIdList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleDO> mapByInAppId(@Param("appIdList") Collection<Long> appIdList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInAppId(@Param("appIdList") Collection<Long> appIdList);

        public default RoleDO singleResultByInAppId(Collection<Long> appIdList, String[] fieldNames){
             List<RoleDO> list=this.listByInAppId(appIdList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByInAppId(Collection<Long> appIdList, Function<RoleDO, T> mapper, String[] fieldNames){
             List<RoleDO> list=this.listByInAppId(appIdList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInAppId(@Param("updateDO") RoleDO updateDO, @Param("appIdList") Collection<Long> appIdList);

        public Integer updateAllFieldsByInAppId(@Param("updateDO") RoleDO updateDO, @Param("appIdList") Collection<Long> appIdList);

        public Integer deleteByInAppId(@Param("appIdList") Collection<Long> appIdList);

        public List<RoleDO> listByIsExtend(@Param("isExtend") Integer isExtend, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleDO> mapByIsExtend(@Param("isExtend") Integer isExtend, @Param("fieldNames") String[] fieldNames);

        public Integer countByIsExtend(@Param("isExtend") Integer isExtend);

        public default RoleDO singleResultByIsExtend(Integer isExtend, String[] fieldNames){
             List<RoleDO> list=this.listByIsExtend(isExtend,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByIsExtend(Integer isExtend, Function<RoleDO, T> mapper, String[] fieldNames){
             List<RoleDO> list=this.listByIsExtend(isExtend,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByIsExtend(@Param("updateDO") RoleDO updateDO, @Param("isExtend") Integer isExtend);

        public Integer updateAllFieldsByIsExtend(@Param("updateDO") RoleDO updateDO, @Param("isExtend") Integer isExtend);

        public Integer deleteByIsExtend(@Param("isExtend") Integer isExtend);




        public List<RoleDO> listByInIsExtend(@Param("isExtendList") Collection<Integer> isExtendList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleDO> mapByInIsExtend(@Param("isExtendList") Collection<Integer> isExtendList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInIsExtend(@Param("isExtendList") Collection<Integer> isExtendList);

        public default RoleDO singleResultByInIsExtend(Collection<Integer> isExtendList, String[] fieldNames){
             List<RoleDO> list=this.listByInIsExtend(isExtendList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByInIsExtend(Collection<Integer> isExtendList, Function<RoleDO, T> mapper, String[] fieldNames){
             List<RoleDO> list=this.listByInIsExtend(isExtendList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInIsExtend(@Param("updateDO") RoleDO updateDO, @Param("isExtendList") Collection<Integer> isExtendList);

        public Integer updateAllFieldsByInIsExtend(@Param("updateDO") RoleDO updateDO, @Param("isExtendList") Collection<Integer> isExtendList);

        public Integer deleteByInIsExtend(@Param("isExtendList") Collection<Integer> isExtendList);

        public List<RoleDO> listByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleDO> mapByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdCreate(@Param("userIdCreate") Long userIdCreate);

        public default RoleDO singleResultByUserIdCreate(Long userIdCreate, String[] fieldNames){
             List<RoleDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByUserIdCreate(Long userIdCreate, Function<RoleDO, T> mapper, String[] fieldNames){
             List<RoleDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(@Param("updateDO") RoleDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(@Param("updateDO") RoleDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer deleteByUserIdCreate(@Param("userIdCreate") Long userIdCreate);




        public List<RoleDO> listByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleDO> mapByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public default RoleDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String[] fieldNames){
             List<RoleDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<RoleDO, T> mapper, String[] fieldNames){
             List<RoleDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdCreate(@Param("updateDO") RoleDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer updateAllFieldsByInUserIdCreate(@Param("updateDO") RoleDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer deleteByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public List<RoleDO> listByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleDO> mapByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdModified(@Param("userIdModified") Long userIdModified);

        public default RoleDO singleResultByUserIdModified(Long userIdModified, String[] fieldNames){
             List<RoleDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByUserIdModified(Long userIdModified, Function<RoleDO, T> mapper, String[] fieldNames){
             List<RoleDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(@Param("updateDO") RoleDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(@Param("updateDO") RoleDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer deleteByUserIdModified(@Param("userIdModified") Long userIdModified);




        public List<RoleDO> listByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleDO> mapByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public default RoleDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String[] fieldNames){
             List<RoleDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<RoleDO, T> mapper, String[] fieldNames){
             List<RoleDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdModified(@Param("updateDO") RoleDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer updateAllFieldsByInUserIdModified(@Param("updateDO") RoleDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer deleteByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);


}
