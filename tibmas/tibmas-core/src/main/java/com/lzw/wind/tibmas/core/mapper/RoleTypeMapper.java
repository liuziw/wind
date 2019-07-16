package com.lzw.wind.tibmas.core.mapper;

import com.hyzs.gz.common.dao.mapper.CommonMapper;
import com.hyzs.tibmas.core.dbo.RoleTypeDO;
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
public interface RoleTypeMapper extends CommonMapper<RoleTypeDO,Long> {

        public List<RoleTypeDO> listByRoleTypeCode(@Param("roleTypeCode") String roleTypeCode, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleTypeDO> mapByRoleTypeCode(@Param("roleTypeCode") String roleTypeCode, @Param("fieldNames") String[] fieldNames);

        public Integer countByRoleTypeCode(@Param("roleTypeCode") String roleTypeCode);

        public default RoleTypeDO singleResultByRoleTypeCode(String roleTypeCode, String[] fieldNames){
             List<RoleTypeDO> list=this.listByRoleTypeCode(roleTypeCode,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleTypeDO>> groupingByRoleTypeCode(String roleTypeCode, Function<RoleTypeDO, T> mapper, String[] fieldNames){
             List<RoleTypeDO> list=this.listByRoleTypeCode(roleTypeCode,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRoleTypeCode(@Param("updateDO") RoleTypeDO updateDO, @Param("roleTypeCode") String roleTypeCode);

        public Integer updateAllFieldsByRoleTypeCode(@Param("updateDO") RoleTypeDO updateDO, @Param("roleTypeCode") String roleTypeCode);

        public Integer deleteByRoleTypeCode(@Param("roleTypeCode") String roleTypeCode);




        public List<RoleTypeDO> listByInRoleTypeCode(@Param("roleTypeCodeList") Collection<String> roleTypeCodeList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleTypeDO> mapByInRoleTypeCode(@Param("roleTypeCodeList") Collection<String> roleTypeCodeList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInRoleTypeCode(@Param("roleTypeCodeList") Collection<String> roleTypeCodeList);

        public default RoleTypeDO singleResultByInRoleTypeCode(Collection<String> roleTypeCodeList, String[] fieldNames){
             List<RoleTypeDO> list=this.listByInRoleTypeCode(roleTypeCodeList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleTypeDO>> groupingByInRoleTypeCode(Collection<String> roleTypeCodeList, Function<RoleTypeDO, T> mapper, String[] fieldNames){
             List<RoleTypeDO> list=this.listByInRoleTypeCode(roleTypeCodeList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInRoleTypeCode(@Param("updateDO") RoleTypeDO updateDO, @Param("roleTypeCodeList") Collection<String> roleTypeCodeList);

        public Integer updateAllFieldsByInRoleTypeCode(@Param("updateDO") RoleTypeDO updateDO, @Param("roleTypeCodeList") Collection<String> roleTypeCodeList);

        public Integer deleteByInRoleTypeCode(@Param("roleTypeCodeList") Collection<String> roleTypeCodeList);

        public List<RoleTypeDO> listByRoleTypeDesc(@Param("roleTypeDesc") String roleTypeDesc, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleTypeDO> mapByRoleTypeDesc(@Param("roleTypeDesc") String roleTypeDesc, @Param("fieldNames") String[] fieldNames);

        public Integer countByRoleTypeDesc(@Param("roleTypeDesc") String roleTypeDesc);

        public default RoleTypeDO singleResultByRoleTypeDesc(String roleTypeDesc, String[] fieldNames){
             List<RoleTypeDO> list=this.listByRoleTypeDesc(roleTypeDesc,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleTypeDO>> groupingByRoleTypeDesc(String roleTypeDesc, Function<RoleTypeDO, T> mapper, String[] fieldNames){
             List<RoleTypeDO> list=this.listByRoleTypeDesc(roleTypeDesc,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRoleTypeDesc(@Param("updateDO") RoleTypeDO updateDO, @Param("roleTypeDesc") String roleTypeDesc);

        public Integer updateAllFieldsByRoleTypeDesc(@Param("updateDO") RoleTypeDO updateDO, @Param("roleTypeDesc") String roleTypeDesc);

        public Integer deleteByRoleTypeDesc(@Param("roleTypeDesc") String roleTypeDesc);




        public List<RoleTypeDO> listByInRoleTypeDesc(@Param("roleTypeDescList") Collection<String> roleTypeDescList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleTypeDO> mapByInRoleTypeDesc(@Param("roleTypeDescList") Collection<String> roleTypeDescList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInRoleTypeDesc(@Param("roleTypeDescList") Collection<String> roleTypeDescList);

        public default RoleTypeDO singleResultByInRoleTypeDesc(Collection<String> roleTypeDescList, String[] fieldNames){
             List<RoleTypeDO> list=this.listByInRoleTypeDesc(roleTypeDescList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleTypeDO>> groupingByInRoleTypeDesc(Collection<String> roleTypeDescList, Function<RoleTypeDO, T> mapper, String[] fieldNames){
             List<RoleTypeDO> list=this.listByInRoleTypeDesc(roleTypeDescList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInRoleTypeDesc(@Param("updateDO") RoleTypeDO updateDO, @Param("roleTypeDescList") Collection<String> roleTypeDescList);

        public Integer updateAllFieldsByInRoleTypeDesc(@Param("updateDO") RoleTypeDO updateDO, @Param("roleTypeDescList") Collection<String> roleTypeDescList);

        public Integer deleteByInRoleTypeDesc(@Param("roleTypeDescList") Collection<String> roleTypeDescList);

        public List<RoleTypeDO> listByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleTypeDO> mapByUserIdCreate(@Param("userIdCreate") Long userIdCreate, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdCreate(@Param("userIdCreate") Long userIdCreate);

        public default RoleTypeDO singleResultByUserIdCreate(Long userIdCreate, String[] fieldNames){
             List<RoleTypeDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleTypeDO>> groupingByUserIdCreate(Long userIdCreate, Function<RoleTypeDO, T> mapper, String[] fieldNames){
             List<RoleTypeDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(@Param("updateDO") RoleTypeDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(@Param("updateDO") RoleTypeDO updateDO, @Param("userIdCreate") Long userIdCreate);

        public Integer deleteByUserIdCreate(@Param("userIdCreate") Long userIdCreate);




        public List<RoleTypeDO> listByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleTypeDO> mapByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public default RoleTypeDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String[] fieldNames){
             List<RoleTypeDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleTypeDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<RoleTypeDO, T> mapper, String[] fieldNames){
             List<RoleTypeDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdCreate(@Param("updateDO") RoleTypeDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer updateAllFieldsByInUserIdCreate(@Param("updateDO") RoleTypeDO updateDO, @Param("userIdCreateList") Collection<Long> userIdCreateList);

        public Integer deleteByInUserIdCreate(@Param("userIdCreateList") Collection<Long> userIdCreateList);

        public List<RoleTypeDO> listByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleTypeDO> mapByUserIdModified(@Param("userIdModified") Long userIdModified, @Param("fieldNames") String[] fieldNames);

        public Integer countByUserIdModified(@Param("userIdModified") Long userIdModified);

        public default RoleTypeDO singleResultByUserIdModified(Long userIdModified, String[] fieldNames){
             List<RoleTypeDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleTypeDO>> groupingByUserIdModified(Long userIdModified, Function<RoleTypeDO, T> mapper, String[] fieldNames){
             List<RoleTypeDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(@Param("updateDO") RoleTypeDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(@Param("updateDO") RoleTypeDO updateDO, @Param("userIdModified") Long userIdModified);

        public Integer deleteByUserIdModified(@Param("userIdModified") Long userIdModified);




        public List<RoleTypeDO> listByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        @MapKey("id")
        public Map<Long,RoleTypeDO> mapByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList, @Param("fieldNames") String[] fieldNames);

        public Integer countByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public default RoleTypeDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String[] fieldNames){
             List<RoleTypeDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleTypeDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<RoleTypeDO, T> mapper, String[] fieldNames){
             List<RoleTypeDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByInUserIdModified(@Param("updateDO") RoleTypeDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer updateAllFieldsByInUserIdModified(@Param("updateDO") RoleTypeDO updateDO, @Param("userIdModifiedList") Collection<Long> userIdModifiedList);

        public Integer deleteByInUserIdModified(@Param("userIdModifiedList") Collection<Long> userIdModifiedList);


}
