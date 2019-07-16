package com.lzw.wind.tibmas.core.daomanager.immutable;

import com.hyzs.gz.common.dao.daomanager.CommonDaoManager;
import com.hyzs.tibmas.core.dbo.RoleDO;
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
public interface ImmutableRoleDaoManager extends CommonDaoManager<RoleDO,Long> {


        /**
         * 根据主键获取记录
         *
         */
        public RoleDO getById(Long id);

        public List<RoleDO> listById(Long id, String... fieldNames);

        public Map<Long,RoleDO> mapById(Long id, String... fieldNames);

        public Integer countById(Long id);

        public default RoleDO singleResultById(Long id, String... fieldNames){
             List<RoleDO> list=this.listById(id,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingById(Long id, Function<RoleDO, T> mapper, String... fieldNames){
             List<RoleDO> list=this.listById(id,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsById(RoleDO updateDO, Long id);

        public Integer updateAllFieldsById(RoleDO updateDO, Long id);

        public Integer deleteById(Long id);






        public List<RoleDO> listByInId(Collection<Long> idList, String... fieldNames);

         public Map<Long,RoleDO> mapByInId(Collection<Long> idList, String... fieldNames);

         public Integer countByInId(Collection<Long> idList);

         public default RoleDO singleResultByInId(Collection<Long> idList, String... fieldNames){
              List<RoleDO> list=this.listByInId(idList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<RoleDO>> groupingByInId(Collection<Long> idList, Function<RoleDO, T> mapper, String... fieldNames){
              List<RoleDO> list=this.listByInId(idList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInId(RoleDO updateDO, Collection<Long> idList);

         public Integer updateAllFieldsByInId(RoleDO updateDO, Collection<Long> idList);

         public Integer deleteByInId(Collection<Long> idList);
        public List<RoleDO> listByRoleCode(String roleCode, String... fieldNames);

        public Map<Long,RoleDO> mapByRoleCode(String roleCode, String... fieldNames);

        public Integer countByRoleCode(String roleCode);

        public default RoleDO singleResultByRoleCode(String roleCode, String... fieldNames){
             List<RoleDO> list=this.listByRoleCode(roleCode,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByRoleCode(String roleCode, Function<RoleDO, T> mapper, String... fieldNames){
             List<RoleDO> list=this.listByRoleCode(roleCode,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRoleCode(RoleDO updateDO, String roleCode);

        public Integer updateAllFieldsByRoleCode(RoleDO updateDO, String roleCode);

        public Integer deleteByRoleCode(String roleCode);






        public List<RoleDO> listByInRoleCode(Collection<String> roleCodeList, String... fieldNames);

         public Map<Long,RoleDO> mapByInRoleCode(Collection<String> roleCodeList, String... fieldNames);

         public Integer countByInRoleCode(Collection<String> roleCodeList);

         public default RoleDO singleResultByInRoleCode(Collection<String> roleCodeList, String... fieldNames){
              List<RoleDO> list=this.listByInRoleCode(roleCodeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<RoleDO>> groupingByInRoleCode(Collection<String> roleCodeList, Function<RoleDO, T> mapper, String... fieldNames){
              List<RoleDO> list=this.listByInRoleCode(roleCodeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInRoleCode(RoleDO updateDO, Collection<String> roleCodeList);

         public Integer updateAllFieldsByInRoleCode(RoleDO updateDO, Collection<String> roleCodeList);

         public Integer deleteByInRoleCode(Collection<String> roleCodeList);
        public List<RoleDO> listByRoleName(String roleName, String... fieldNames);

        public Map<Long,RoleDO> mapByRoleName(String roleName, String... fieldNames);

        public Integer countByRoleName(String roleName);

        public default RoleDO singleResultByRoleName(String roleName, String... fieldNames){
             List<RoleDO> list=this.listByRoleName(roleName,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByRoleName(String roleName, Function<RoleDO, T> mapper, String... fieldNames){
             List<RoleDO> list=this.listByRoleName(roleName,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRoleName(RoleDO updateDO, String roleName);

        public Integer updateAllFieldsByRoleName(RoleDO updateDO, String roleName);

        public Integer deleteByRoleName(String roleName);






        public List<RoleDO> listByInRoleName(Collection<String> roleNameList, String... fieldNames);

         public Map<Long,RoleDO> mapByInRoleName(Collection<String> roleNameList, String... fieldNames);

         public Integer countByInRoleName(Collection<String> roleNameList);

         public default RoleDO singleResultByInRoleName(Collection<String> roleNameList, String... fieldNames){
              List<RoleDO> list=this.listByInRoleName(roleNameList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<RoleDO>> groupingByInRoleName(Collection<String> roleNameList, Function<RoleDO, T> mapper, String... fieldNames){
              List<RoleDO> list=this.listByInRoleName(roleNameList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInRoleName(RoleDO updateDO, Collection<String> roleNameList);

         public Integer updateAllFieldsByInRoleName(RoleDO updateDO, Collection<String> roleNameList);

         public Integer deleteByInRoleName(Collection<String> roleNameList);
        public List<RoleDO> listByRoleDesc(String roleDesc, String... fieldNames);

        public Map<Long,RoleDO> mapByRoleDesc(String roleDesc, String... fieldNames);

        public Integer countByRoleDesc(String roleDesc);

        public default RoleDO singleResultByRoleDesc(String roleDesc, String... fieldNames){
             List<RoleDO> list=this.listByRoleDesc(roleDesc,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByRoleDesc(String roleDesc, Function<RoleDO, T> mapper, String... fieldNames){
             List<RoleDO> list=this.listByRoleDesc(roleDesc,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRoleDesc(RoleDO updateDO, String roleDesc);

        public Integer updateAllFieldsByRoleDesc(RoleDO updateDO, String roleDesc);

        public Integer deleteByRoleDesc(String roleDesc);






        public List<RoleDO> listByInRoleDesc(Collection<String> roleDescList, String... fieldNames);

         public Map<Long,RoleDO> mapByInRoleDesc(Collection<String> roleDescList, String... fieldNames);

         public Integer countByInRoleDesc(Collection<String> roleDescList);

         public default RoleDO singleResultByInRoleDesc(Collection<String> roleDescList, String... fieldNames){
              List<RoleDO> list=this.listByInRoleDesc(roleDescList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<RoleDO>> groupingByInRoleDesc(Collection<String> roleDescList, Function<RoleDO, T> mapper, String... fieldNames){
              List<RoleDO> list=this.listByInRoleDesc(roleDescList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInRoleDesc(RoleDO updateDO, Collection<String> roleDescList);

         public Integer updateAllFieldsByInRoleDesc(RoleDO updateDO, Collection<String> roleDescList);

         public Integer deleteByInRoleDesc(Collection<String> roleDescList);
        public List<RoleDO> listByRoleType(Integer roleType, String... fieldNames);

        public Map<Long,RoleDO> mapByRoleType(Integer roleType, String... fieldNames);

        public Integer countByRoleType(Integer roleType);

        public default RoleDO singleResultByRoleType(Integer roleType, String... fieldNames){
             List<RoleDO> list=this.listByRoleType(roleType,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByRoleType(Integer roleType, Function<RoleDO, T> mapper, String... fieldNames){
             List<RoleDO> list=this.listByRoleType(roleType,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByRoleType(RoleDO updateDO, Integer roleType);

        public Integer updateAllFieldsByRoleType(RoleDO updateDO, Integer roleType);

        public Integer deleteByRoleType(Integer roleType);






        public List<RoleDO> listByInRoleType(Collection<Integer> roleTypeList, String... fieldNames);

         public Map<Long,RoleDO> mapByInRoleType(Collection<Integer> roleTypeList, String... fieldNames);

         public Integer countByInRoleType(Collection<Integer> roleTypeList);

         public default RoleDO singleResultByInRoleType(Collection<Integer> roleTypeList, String... fieldNames){
              List<RoleDO> list=this.listByInRoleType(roleTypeList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<RoleDO>> groupingByInRoleType(Collection<Integer> roleTypeList, Function<RoleDO, T> mapper, String... fieldNames){
              List<RoleDO> list=this.listByInRoleType(roleTypeList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInRoleType(RoleDO updateDO, Collection<Integer> roleTypeList);

         public Integer updateAllFieldsByInRoleType(RoleDO updateDO, Collection<Integer> roleTypeList);

         public Integer deleteByInRoleType(Collection<Integer> roleTypeList);
        public List<RoleDO> listByAppId(Long appId, String... fieldNames);

        public Map<Long,RoleDO> mapByAppId(Long appId, String... fieldNames);

        public Integer countByAppId(Long appId);

        public default RoleDO singleResultByAppId(Long appId, String... fieldNames){
             List<RoleDO> list=this.listByAppId(appId,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByAppId(Long appId, Function<RoleDO, T> mapper, String... fieldNames){
             List<RoleDO> list=this.listByAppId(appId,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByAppId(RoleDO updateDO, Long appId);

        public Integer updateAllFieldsByAppId(RoleDO updateDO, Long appId);

        public Integer deleteByAppId(Long appId);






        public List<RoleDO> listByInAppId(Collection<Long> appIdList, String... fieldNames);

         public Map<Long,RoleDO> mapByInAppId(Collection<Long> appIdList, String... fieldNames);

         public Integer countByInAppId(Collection<Long> appIdList);

         public default RoleDO singleResultByInAppId(Collection<Long> appIdList, String... fieldNames){
              List<RoleDO> list=this.listByInAppId(appIdList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<RoleDO>> groupingByInAppId(Collection<Long> appIdList, Function<RoleDO, T> mapper, String... fieldNames){
              List<RoleDO> list=this.listByInAppId(appIdList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInAppId(RoleDO updateDO, Collection<Long> appIdList);

         public Integer updateAllFieldsByInAppId(RoleDO updateDO, Collection<Long> appIdList);

         public Integer deleteByInAppId(Collection<Long> appIdList);
        public List<RoleDO> listByIsExtend(Integer isExtend, String... fieldNames);

        public Map<Long,RoleDO> mapByIsExtend(Integer isExtend, String... fieldNames);

        public Integer countByIsExtend(Integer isExtend);

        public default RoleDO singleResultByIsExtend(Integer isExtend, String... fieldNames){
             List<RoleDO> list=this.listByIsExtend(isExtend,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByIsExtend(Integer isExtend, Function<RoleDO, T> mapper, String... fieldNames){
             List<RoleDO> list=this.listByIsExtend(isExtend,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByIsExtend(RoleDO updateDO, Integer isExtend);

        public Integer updateAllFieldsByIsExtend(RoleDO updateDO, Integer isExtend);

        public Integer deleteByIsExtend(Integer isExtend);






        public List<RoleDO> listByInIsExtend(Collection<Integer> isExtendList, String... fieldNames);

         public Map<Long,RoleDO> mapByInIsExtend(Collection<Integer> isExtendList, String... fieldNames);

         public Integer countByInIsExtend(Collection<Integer> isExtendList);

         public default RoleDO singleResultByInIsExtend(Collection<Integer> isExtendList, String... fieldNames){
              List<RoleDO> list=this.listByInIsExtend(isExtendList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<RoleDO>> groupingByInIsExtend(Collection<Integer> isExtendList, Function<RoleDO, T> mapper, String... fieldNames){
              List<RoleDO> list=this.listByInIsExtend(isExtendList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInIsExtend(RoleDO updateDO, Collection<Integer> isExtendList);

         public Integer updateAllFieldsByInIsExtend(RoleDO updateDO, Collection<Integer> isExtendList);

         public Integer deleteByInIsExtend(Collection<Integer> isExtendList);
        public List<RoleDO> listByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Map<Long,RoleDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames);

        public Integer countByUserIdCreate(Long userIdCreate);

        public default RoleDO singleResultByUserIdCreate(Long userIdCreate, String... fieldNames){
             List<RoleDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByUserIdCreate(Long userIdCreate, Function<RoleDO, T> mapper, String... fieldNames){
             List<RoleDO> list=this.listByUserIdCreate(userIdCreate,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdCreate(RoleDO updateDO, Long userIdCreate);

        public Integer updateAllFieldsByUserIdCreate(RoleDO updateDO, Long userIdCreate);

        public Integer deleteByUserIdCreate(Long userIdCreate);






        public List<RoleDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Map<Long,RoleDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames);

         public Integer countByInUserIdCreate(Collection<Long> userIdCreateList);

         public default RoleDO singleResultByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
              List<RoleDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<RoleDO>> groupingByInUserIdCreate(Collection<Long> userIdCreateList, Function<RoleDO, T> mapper, String... fieldNames){
              List<RoleDO> list=this.listByInUserIdCreate(userIdCreateList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdCreate(RoleDO updateDO, Collection<Long> userIdCreateList);

         public Integer updateAllFieldsByInUserIdCreate(RoleDO updateDO, Collection<Long> userIdCreateList);

         public Integer deleteByInUserIdCreate(Collection<Long> userIdCreateList);
        public List<RoleDO> listByUserIdModified(Long userIdModified, String... fieldNames);

        public Map<Long,RoleDO> mapByUserIdModified(Long userIdModified, String... fieldNames);

        public Integer countByUserIdModified(Long userIdModified);

        public default RoleDO singleResultByUserIdModified(Long userIdModified, String... fieldNames){
             List<RoleDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             return CollectionUtils.isEmpty(list)?null:list.get(0);
        }

         public default <T> Map<T,List<RoleDO>> groupingByUserIdModified(Long userIdModified, Function<RoleDO, T> mapper, String... fieldNames){
             List<RoleDO> list=this.listByUserIdModified(userIdModified,fieldNames);
             if(CollectionUtils.isEmpty(list)){
                return new HashMap<>();
             }
             return list.stream().collect(Collectors.groupingBy(mapper));
         }

        public Integer updateNotNullFieldsByUserIdModified(RoleDO updateDO, Long userIdModified);

        public Integer updateAllFieldsByUserIdModified(RoleDO updateDO, Long userIdModified);

        public Integer deleteByUserIdModified(Long userIdModified);






        public List<RoleDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Map<Long,RoleDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames);

         public Integer countByInUserIdModified(Collection<Long> userIdModifiedList);

         public default RoleDO singleResultByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
              List<RoleDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              return CollectionUtils.isEmpty(list)?null:list.get(0);
         }

          public default <T> Map<T,List<RoleDO>> groupingByInUserIdModified(Collection<Long> userIdModifiedList, Function<RoleDO, T> mapper, String... fieldNames){
              List<RoleDO> list=this.listByInUserIdModified(userIdModifiedList,fieldNames);
              if(CollectionUtils.isEmpty(list)){
                 return new HashMap<>();
              }
              return list.stream().collect(Collectors.groupingBy(mapper));
          }

         public Integer updateNotNullFieldsByInUserIdModified(RoleDO updateDO, Collection<Long> userIdModifiedList);

         public Integer updateAllFieldsByInUserIdModified(RoleDO updateDO, Collection<Long> userIdModifiedList);

         public Integer deleteByInUserIdModified(Collection<Long> userIdModifiedList);


}

