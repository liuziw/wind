package com.lzw.wind.tibmas.core.daomanager.immutable.impl;

import com.hyzs.gz.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.hyzs.tibmas.core.daomanager.immutable.ImmutableRoleDaoManager;
import com.hyzs.tibmas.core.dbo.RoleDO;
import com.hyzs.tibmas.core.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.*;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableRoleDaoManagerImpl extends CommonDaoManagerImpl<RoleDO,Long> implements ImmutableRoleDaoManager {

        @Autowired
        private RoleMapper roleMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(roleMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(RoleDO.ID,RoleDO.DB_ID);
            fieldMap.put(RoleDO.DB_ID,RoleDO.DB_ID);

            fieldMap.put(RoleDO.ROLE_CODE,RoleDO.DB_ROLE_CODE);
            fieldMap.put(RoleDO.DB_ROLE_CODE,RoleDO.DB_ROLE_CODE);

            fieldMap.put(RoleDO.ROLE_NAME,RoleDO.DB_ROLE_NAME);
            fieldMap.put(RoleDO.DB_ROLE_NAME,RoleDO.DB_ROLE_NAME);

            fieldMap.put(RoleDO.ROLE_DESC,RoleDO.DB_ROLE_DESC);
            fieldMap.put(RoleDO.DB_ROLE_DESC,RoleDO.DB_ROLE_DESC);

            fieldMap.put(RoleDO.ROLE_TYPE,RoleDO.DB_ROLE_TYPE);
            fieldMap.put(RoleDO.DB_ROLE_TYPE,RoleDO.DB_ROLE_TYPE);

            fieldMap.put(RoleDO.APP_ID,RoleDO.DB_APP_ID);
            fieldMap.put(RoleDO.DB_APP_ID,RoleDO.DB_APP_ID);

            fieldMap.put(RoleDO.IS_EXTEND,RoleDO.DB_IS_EXTEND);
            fieldMap.put(RoleDO.DB_IS_EXTEND,RoleDO.DB_IS_EXTEND);

            fieldMap.put(RoleDO.IS_DELETED,RoleDO.DB_IS_DELETED);
            fieldMap.put(RoleDO.DB_IS_DELETED,RoleDO.DB_IS_DELETED);

            fieldMap.put(RoleDO.GMT_CREATE,RoleDO.DB_GMT_CREATE);
            fieldMap.put(RoleDO.DB_GMT_CREATE,RoleDO.DB_GMT_CREATE);

            fieldMap.put(RoleDO.GMT_MODIFIED,RoleDO.DB_GMT_MODIFIED);
            fieldMap.put(RoleDO.DB_GMT_MODIFIED,RoleDO.DB_GMT_MODIFIED);

            fieldMap.put(RoleDO.USER_ID_CREATE,RoleDO.DB_USER_ID_CREATE);
            fieldMap.put(RoleDO.DB_USER_ID_CREATE,RoleDO.DB_USER_ID_CREATE);

            fieldMap.put(RoleDO.USER_ID_MODIFIED,RoleDO.DB_USER_ID_MODIFIED);
            fieldMap.put(RoleDO.DB_USER_ID_MODIFIED,RoleDO.DB_USER_ID_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }


        /**
         * 根据主键获取记录
         *
         */
        public RoleDO getById(Long id){
            return this.roleMapper.getById(id);
        }



        public List<RoleDO> listById(Long id, String... fieldNames){
            return this.roleMapper.listById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RoleDO> mapById(Long id, String... fieldNames){
            return this.roleMapper.mapById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countById(Long id){
            return this.roleMapper.countById(id);
        }

        public Integer updateNotNullFieldsById(RoleDO updateDO, Long id){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateNotNullFieldsById(updateDO,id);
        }

        public Integer updateAllFieldsById(RoleDO updateDO,  Long id){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateAllFieldsById(updateDO,id);
        }

        public Integer deleteById( Long id){
            return this.roleMapper.deleteById(id);
        }



        public List<RoleDO> listByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                return new ArrayList<>(0);
            }
            return this.roleMapper.listByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RoleDO> mapByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                 return new HashMap<>();
            }
            return this.roleMapper.mapByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInId(Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                   return 0;
             }
            return this.roleMapper.countByInId(idList);
        }

        public Integer updateNotNullFieldsByInId(RoleDO updateDO, Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateNotNullFieldsByInId(updateDO,idList);
        }

        public Integer updateAllFieldsByInId(RoleDO updateDO,  Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateAllFieldsByInId(updateDO,idList);
        }

        public Integer deleteByInId( Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            return this.roleMapper.deleteByInId(idList);
        }


        public List<RoleDO> listByRoleCode(String roleCode, String... fieldNames){
            return this.roleMapper.listByRoleCode(roleCode,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RoleDO> mapByRoleCode(String roleCode, String... fieldNames){
            return this.roleMapper.mapByRoleCode(roleCode,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByRoleCode(String roleCode){
            return this.roleMapper.countByRoleCode(roleCode);
        }

        public Integer updateNotNullFieldsByRoleCode(RoleDO updateDO, String roleCode){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateNotNullFieldsByRoleCode(updateDO,roleCode);
        }

        public Integer updateAllFieldsByRoleCode(RoleDO updateDO,  String roleCode){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateAllFieldsByRoleCode(updateDO,roleCode);
        }

        public Integer deleteByRoleCode( String roleCode){
            return this.roleMapper.deleteByRoleCode(roleCode);
        }



        public List<RoleDO> listByInRoleCode(Collection<String> roleCodeList, String... fieldNames){
            if(CollectionUtils.isEmpty(roleCodeList)){
                return new ArrayList<>(0);
            }
            return this.roleMapper.listByInRoleCode(roleCodeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RoleDO> mapByInRoleCode(Collection<String> roleCodeList, String... fieldNames){
            if(CollectionUtils.isEmpty(roleCodeList)){
                 return new HashMap<>();
            }
            return this.roleMapper.mapByInRoleCode(roleCodeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInRoleCode(Collection<String> roleCodeList){
            if(CollectionUtils.isEmpty(roleCodeList)){
                   return 0;
             }
            return this.roleMapper.countByInRoleCode(roleCodeList);
        }

        public Integer updateNotNullFieldsByInRoleCode(RoleDO updateDO, Collection<String> roleCodeList){
            if(CollectionUtils.isEmpty(roleCodeList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateNotNullFieldsByInRoleCode(updateDO,roleCodeList);
        }

        public Integer updateAllFieldsByInRoleCode(RoleDO updateDO,  Collection<String> roleCodeList){
            if(CollectionUtils.isEmpty(roleCodeList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateAllFieldsByInRoleCode(updateDO,roleCodeList);
        }

        public Integer deleteByInRoleCode( Collection<String> roleCodeList){
            if(CollectionUtils.isEmpty(roleCodeList)){
                           return 0;
             }
            return this.roleMapper.deleteByInRoleCode(roleCodeList);
        }


        public List<RoleDO> listByRoleName(String roleName, String... fieldNames){
            return this.roleMapper.listByRoleName(roleName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RoleDO> mapByRoleName(String roleName, String... fieldNames){
            return this.roleMapper.mapByRoleName(roleName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByRoleName(String roleName){
            return this.roleMapper.countByRoleName(roleName);
        }

        public Integer updateNotNullFieldsByRoleName(RoleDO updateDO, String roleName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateNotNullFieldsByRoleName(updateDO,roleName);
        }

        public Integer updateAllFieldsByRoleName(RoleDO updateDO,  String roleName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateAllFieldsByRoleName(updateDO,roleName);
        }

        public Integer deleteByRoleName( String roleName){
            return this.roleMapper.deleteByRoleName(roleName);
        }



        public List<RoleDO> listByInRoleName(Collection<String> roleNameList, String... fieldNames){
            if(CollectionUtils.isEmpty(roleNameList)){
                return new ArrayList<>(0);
            }
            return this.roleMapper.listByInRoleName(roleNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RoleDO> mapByInRoleName(Collection<String> roleNameList, String... fieldNames){
            if(CollectionUtils.isEmpty(roleNameList)){
                 return new HashMap<>();
            }
            return this.roleMapper.mapByInRoleName(roleNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInRoleName(Collection<String> roleNameList){
            if(CollectionUtils.isEmpty(roleNameList)){
                   return 0;
             }
            return this.roleMapper.countByInRoleName(roleNameList);
        }

        public Integer updateNotNullFieldsByInRoleName(RoleDO updateDO, Collection<String> roleNameList){
            if(CollectionUtils.isEmpty(roleNameList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateNotNullFieldsByInRoleName(updateDO,roleNameList);
        }

        public Integer updateAllFieldsByInRoleName(RoleDO updateDO,  Collection<String> roleNameList){
            if(CollectionUtils.isEmpty(roleNameList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateAllFieldsByInRoleName(updateDO,roleNameList);
        }

        public Integer deleteByInRoleName( Collection<String> roleNameList){
            if(CollectionUtils.isEmpty(roleNameList)){
                           return 0;
             }
            return this.roleMapper.deleteByInRoleName(roleNameList);
        }


        public List<RoleDO> listByRoleDesc(String roleDesc, String... fieldNames){
            return this.roleMapper.listByRoleDesc(roleDesc,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RoleDO> mapByRoleDesc(String roleDesc, String... fieldNames){
            return this.roleMapper.mapByRoleDesc(roleDesc,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByRoleDesc(String roleDesc){
            return this.roleMapper.countByRoleDesc(roleDesc);
        }

        public Integer updateNotNullFieldsByRoleDesc(RoleDO updateDO, String roleDesc){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateNotNullFieldsByRoleDesc(updateDO,roleDesc);
        }

        public Integer updateAllFieldsByRoleDesc(RoleDO updateDO,  String roleDesc){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateAllFieldsByRoleDesc(updateDO,roleDesc);
        }

        public Integer deleteByRoleDesc( String roleDesc){
            return this.roleMapper.deleteByRoleDesc(roleDesc);
        }



        public List<RoleDO> listByInRoleDesc(Collection<String> roleDescList, String... fieldNames){
            if(CollectionUtils.isEmpty(roleDescList)){
                return new ArrayList<>(0);
            }
            return this.roleMapper.listByInRoleDesc(roleDescList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RoleDO> mapByInRoleDesc(Collection<String> roleDescList, String... fieldNames){
            if(CollectionUtils.isEmpty(roleDescList)){
                 return new HashMap<>();
            }
            return this.roleMapper.mapByInRoleDesc(roleDescList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInRoleDesc(Collection<String> roleDescList){
            if(CollectionUtils.isEmpty(roleDescList)){
                   return 0;
             }
            return this.roleMapper.countByInRoleDesc(roleDescList);
        }

        public Integer updateNotNullFieldsByInRoleDesc(RoleDO updateDO, Collection<String> roleDescList){
            if(CollectionUtils.isEmpty(roleDescList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateNotNullFieldsByInRoleDesc(updateDO,roleDescList);
        }

        public Integer updateAllFieldsByInRoleDesc(RoleDO updateDO,  Collection<String> roleDescList){
            if(CollectionUtils.isEmpty(roleDescList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateAllFieldsByInRoleDesc(updateDO,roleDescList);
        }

        public Integer deleteByInRoleDesc( Collection<String> roleDescList){
            if(CollectionUtils.isEmpty(roleDescList)){
                           return 0;
             }
            return this.roleMapper.deleteByInRoleDesc(roleDescList);
        }


        public List<RoleDO> listByRoleType(Integer roleType, String... fieldNames){
            return this.roleMapper.listByRoleType(roleType,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RoleDO> mapByRoleType(Integer roleType, String... fieldNames){
            return this.roleMapper.mapByRoleType(roleType,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByRoleType(Integer roleType){
            return this.roleMapper.countByRoleType(roleType);
        }

        public Integer updateNotNullFieldsByRoleType(RoleDO updateDO, Integer roleType){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateNotNullFieldsByRoleType(updateDO,roleType);
        }

        public Integer updateAllFieldsByRoleType(RoleDO updateDO,  Integer roleType){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateAllFieldsByRoleType(updateDO,roleType);
        }

        public Integer deleteByRoleType( Integer roleType){
            return this.roleMapper.deleteByRoleType(roleType);
        }



        public List<RoleDO> listByInRoleType(Collection<Integer> roleTypeList, String... fieldNames){
            if(CollectionUtils.isEmpty(roleTypeList)){
                return new ArrayList<>(0);
            }
            return this.roleMapper.listByInRoleType(roleTypeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RoleDO> mapByInRoleType(Collection<Integer> roleTypeList, String... fieldNames){
            if(CollectionUtils.isEmpty(roleTypeList)){
                 return new HashMap<>();
            }
            return this.roleMapper.mapByInRoleType(roleTypeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInRoleType(Collection<Integer> roleTypeList){
            if(CollectionUtils.isEmpty(roleTypeList)){
                   return 0;
             }
            return this.roleMapper.countByInRoleType(roleTypeList);
        }

        public Integer updateNotNullFieldsByInRoleType(RoleDO updateDO, Collection<Integer> roleTypeList){
            if(CollectionUtils.isEmpty(roleTypeList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateNotNullFieldsByInRoleType(updateDO,roleTypeList);
        }

        public Integer updateAllFieldsByInRoleType(RoleDO updateDO,  Collection<Integer> roleTypeList){
            if(CollectionUtils.isEmpty(roleTypeList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateAllFieldsByInRoleType(updateDO,roleTypeList);
        }

        public Integer deleteByInRoleType( Collection<Integer> roleTypeList){
            if(CollectionUtils.isEmpty(roleTypeList)){
                           return 0;
             }
            return this.roleMapper.deleteByInRoleType(roleTypeList);
        }


        public List<RoleDO> listByAppId(Long appId, String... fieldNames){
            return this.roleMapper.listByAppId(appId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RoleDO> mapByAppId(Long appId, String... fieldNames){
            return this.roleMapper.mapByAppId(appId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByAppId(Long appId){
            return this.roleMapper.countByAppId(appId);
        }

        public Integer updateNotNullFieldsByAppId(RoleDO updateDO, Long appId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateNotNullFieldsByAppId(updateDO,appId);
        }

        public Integer updateAllFieldsByAppId(RoleDO updateDO,  Long appId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateAllFieldsByAppId(updateDO,appId);
        }

        public Integer deleteByAppId( Long appId){
            return this.roleMapper.deleteByAppId(appId);
        }



        public List<RoleDO> listByInAppId(Collection<Long> appIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(appIdList)){
                return new ArrayList<>(0);
            }
            return this.roleMapper.listByInAppId(appIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RoleDO> mapByInAppId(Collection<Long> appIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(appIdList)){
                 return new HashMap<>();
            }
            return this.roleMapper.mapByInAppId(appIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInAppId(Collection<Long> appIdList){
            if(CollectionUtils.isEmpty(appIdList)){
                   return 0;
             }
            return this.roleMapper.countByInAppId(appIdList);
        }

        public Integer updateNotNullFieldsByInAppId(RoleDO updateDO, Collection<Long> appIdList){
            if(CollectionUtils.isEmpty(appIdList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateNotNullFieldsByInAppId(updateDO,appIdList);
        }

        public Integer updateAllFieldsByInAppId(RoleDO updateDO,  Collection<Long> appIdList){
            if(CollectionUtils.isEmpty(appIdList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateAllFieldsByInAppId(updateDO,appIdList);
        }

        public Integer deleteByInAppId( Collection<Long> appIdList){
            if(CollectionUtils.isEmpty(appIdList)){
                           return 0;
             }
            return this.roleMapper.deleteByInAppId(appIdList);
        }


        public List<RoleDO> listByIsExtend(Integer isExtend, String... fieldNames){
            return this.roleMapper.listByIsExtend(isExtend,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RoleDO> mapByIsExtend(Integer isExtend, String... fieldNames){
            return this.roleMapper.mapByIsExtend(isExtend,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByIsExtend(Integer isExtend){
            return this.roleMapper.countByIsExtend(isExtend);
        }

        public Integer updateNotNullFieldsByIsExtend(RoleDO updateDO, Integer isExtend){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateNotNullFieldsByIsExtend(updateDO,isExtend);
        }

        public Integer updateAllFieldsByIsExtend(RoleDO updateDO,  Integer isExtend){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateAllFieldsByIsExtend(updateDO,isExtend);
        }

        public Integer deleteByIsExtend( Integer isExtend){
            return this.roleMapper.deleteByIsExtend(isExtend);
        }



        public List<RoleDO> listByInIsExtend(Collection<Integer> isExtendList, String... fieldNames){
            if(CollectionUtils.isEmpty(isExtendList)){
                return new ArrayList<>(0);
            }
            return this.roleMapper.listByInIsExtend(isExtendList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RoleDO> mapByInIsExtend(Collection<Integer> isExtendList, String... fieldNames){
            if(CollectionUtils.isEmpty(isExtendList)){
                 return new HashMap<>();
            }
            return this.roleMapper.mapByInIsExtend(isExtendList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInIsExtend(Collection<Integer> isExtendList){
            if(CollectionUtils.isEmpty(isExtendList)){
                   return 0;
             }
            return this.roleMapper.countByInIsExtend(isExtendList);
        }

        public Integer updateNotNullFieldsByInIsExtend(RoleDO updateDO, Collection<Integer> isExtendList){
            if(CollectionUtils.isEmpty(isExtendList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateNotNullFieldsByInIsExtend(updateDO,isExtendList);
        }

        public Integer updateAllFieldsByInIsExtend(RoleDO updateDO,  Collection<Integer> isExtendList){
            if(CollectionUtils.isEmpty(isExtendList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateAllFieldsByInIsExtend(updateDO,isExtendList);
        }

        public Integer deleteByInIsExtend( Collection<Integer> isExtendList){
            if(CollectionUtils.isEmpty(isExtendList)){
                           return 0;
             }
            return this.roleMapper.deleteByInIsExtend(isExtendList);
        }


        public List<RoleDO> listByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.roleMapper.listByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RoleDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.roleMapper.mapByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdCreate(Long userIdCreate){
            return this.roleMapper.countByUserIdCreate(userIdCreate);
        }

        public Integer updateNotNullFieldsByUserIdCreate(RoleDO updateDO, Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateNotNullFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer updateAllFieldsByUserIdCreate(RoleDO updateDO,  Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateAllFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer deleteByUserIdCreate( Long userIdCreate){
            return this.roleMapper.deleteByUserIdCreate(userIdCreate);
        }



        public List<RoleDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                return new ArrayList<>(0);
            }
            return this.roleMapper.listByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RoleDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                 return new HashMap<>();
            }
            return this.roleMapper.mapByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdCreate(Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                   return 0;
             }
            return this.roleMapper.countByInUserIdCreate(userIdCreateList);
        }

        public Integer updateNotNullFieldsByInUserIdCreate(RoleDO updateDO, Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateNotNullFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer updateAllFieldsByInUserIdCreate(RoleDO updateDO,  Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateAllFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer deleteByInUserIdCreate( Collection<Long> userIdCreateList){
            if(CollectionUtils.isEmpty(userIdCreateList)){
                           return 0;
             }
            return this.roleMapper.deleteByInUserIdCreate(userIdCreateList);
        }


        public List<RoleDO> listByUserIdModified(Long userIdModified, String... fieldNames){
            return this.roleMapper.listByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RoleDO> mapByUserIdModified(Long userIdModified, String... fieldNames){
            return this.roleMapper.mapByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdModified(Long userIdModified){
            return this.roleMapper.countByUserIdModified(userIdModified);
        }

        public Integer updateNotNullFieldsByUserIdModified(RoleDO updateDO, Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateNotNullFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer updateAllFieldsByUserIdModified(RoleDO updateDO,  Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateAllFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer deleteByUserIdModified( Long userIdModified){
            return this.roleMapper.deleteByUserIdModified(userIdModified);
        }



        public List<RoleDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                return new ArrayList<>(0);
            }
            return this.roleMapper.listByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RoleDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                 return new HashMap<>();
            }
            return this.roleMapper.mapByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdModified(Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                   return 0;
             }
            return this.roleMapper.countByInUserIdModified(userIdModifiedList);
        }

        public Integer updateNotNullFieldsByInUserIdModified(RoleDO updateDO, Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateNotNullFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer updateAllFieldsByInUserIdModified(RoleDO updateDO,  Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.roleMapper.updateAllFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer deleteByInUserIdModified( Collection<Long> userIdModifiedList){
            if(CollectionUtils.isEmpty(userIdModifiedList)){
                           return 0;
             }
            return this.roleMapper.deleteByInUserIdModified(userIdModifiedList);
        }


}

