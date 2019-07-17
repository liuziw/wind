package com.lzw.wind.tibmas.core.daomanager.immutable.impl;

import com.lzw.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.lzw.wind.tibmas.core.daomanager.immutable.ImmutableRolePermDaoManager;
import com.lzw.wind.tibmas.core.dbo.RolePermDO;
import com.lzw.wind.tibmas.core.mapper.RolePermMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.*;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableRolePermDaoManagerImpl extends CommonDaoManagerImpl<RolePermDO,Long> implements ImmutableRolePermDaoManager {

        @Autowired
        private RolePermMapper rolePermMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(rolePermMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(RolePermDO.ID,RolePermDO.DB_ID);
            fieldMap.put(RolePermDO.DB_ID,RolePermDO.DB_ID);

            fieldMap.put(RolePermDO.ROLE_ID,RolePermDO.DB_ROLE_ID);
            fieldMap.put(RolePermDO.DB_ROLE_ID,RolePermDO.DB_ROLE_ID);

            fieldMap.put(RolePermDO.PERM_ID,RolePermDO.DB_PERM_ID);
            fieldMap.put(RolePermDO.DB_PERM_ID,RolePermDO.DB_PERM_ID);

            fieldMap.put(RolePermDO.REL_TYPE,RolePermDO.DB_REL_TYPE);
            fieldMap.put(RolePermDO.DB_REL_TYPE,RolePermDO.DB_REL_TYPE);

            fieldMap.put(RolePermDO.START_TIME,RolePermDO.DB_START_TIME);
            fieldMap.put(RolePermDO.DB_START_TIME,RolePermDO.DB_START_TIME);

            fieldMap.put(RolePermDO.END_TIME,RolePermDO.DB_END_TIME);
            fieldMap.put(RolePermDO.DB_END_TIME,RolePermDO.DB_END_TIME);

            fieldMap.put(RolePermDO.IS_DELETED,RolePermDO.DB_IS_DELETED);
            fieldMap.put(RolePermDO.DB_IS_DELETED,RolePermDO.DB_IS_DELETED);

            fieldMap.put(RolePermDO.GMT_CREATE,RolePermDO.DB_GMT_CREATE);
            fieldMap.put(RolePermDO.DB_GMT_CREATE,RolePermDO.DB_GMT_CREATE);

            fieldMap.put(RolePermDO.GMT_MODIFIED,RolePermDO.DB_GMT_MODIFIED);
            fieldMap.put(RolePermDO.DB_GMT_MODIFIED,RolePermDO.DB_GMT_MODIFIED);

            fieldMap.put(RolePermDO.USER_ID_CREATE,RolePermDO.DB_USER_ID_CREATE);
            fieldMap.put(RolePermDO.DB_USER_ID_CREATE,RolePermDO.DB_USER_ID_CREATE);

            fieldMap.put(RolePermDO.USER_ID_MODIFIED,RolePermDO.DB_USER_ID_MODIFIED);
            fieldMap.put(RolePermDO.DB_USER_ID_MODIFIED,RolePermDO.DB_USER_ID_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }



        public List<RolePermDO> listByRoleId(Long roleId, String... fieldNames){
            return this.rolePermMapper.listByRoleId(roleId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RolePermDO> mapByRoleId(Long roleId, String... fieldNames){
            return this.rolePermMapper.mapByRoleId(roleId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByRoleId(Long roleId){
            return this.rolePermMapper.countByRoleId(roleId);
        }

        public Integer updateNotNullFieldsByRoleId(RolePermDO updateDO, Long roleId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateNotNullFieldsByRoleId(updateDO,roleId);
        }

        public Integer updateAllFieldsByRoleId(RolePermDO updateDO,  Long roleId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateAllFieldsByRoleId(updateDO,roleId);
        }

        public Integer deleteByRoleId( Long roleId){
            return this.rolePermMapper.deleteByRoleId(roleId);
        }



        public List<RolePermDO> listByInRoleId(Collection<Long> roleIdList, String... fieldNames){
            return this.rolePermMapper.listByInRoleId(roleIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RolePermDO> mapByInRoleId(Collection<Long> roleIdList, String... fieldNames){
            return this.rolePermMapper.mapByInRoleId(roleIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInRoleId(Collection<Long> roleIdList){
            return this.rolePermMapper.countByInRoleId(roleIdList);
        }

        public Integer updateNotNullFieldsByInRoleId(RolePermDO updateDO, Collection<Long> roleIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateNotNullFieldsByInRoleId(updateDO,roleIdList);
        }

        public Integer updateAllFieldsByInRoleId(RolePermDO updateDO,  Collection<Long> roleIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateAllFieldsByInRoleId(updateDO,roleIdList);
        }

        public Integer deleteByInRoleId( Collection<Long> roleIdList){
            return this.rolePermMapper.deleteByInRoleId(roleIdList);
        }


        public List<RolePermDO> listByPermId(Long permId, String... fieldNames){
            return this.rolePermMapper.listByPermId(permId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RolePermDO> mapByPermId(Long permId, String... fieldNames){
            return this.rolePermMapper.mapByPermId(permId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPermId(Long permId){
            return this.rolePermMapper.countByPermId(permId);
        }

        public Integer updateNotNullFieldsByPermId(RolePermDO updateDO, Long permId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateNotNullFieldsByPermId(updateDO,permId);
        }

        public Integer updateAllFieldsByPermId(RolePermDO updateDO,  Long permId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateAllFieldsByPermId(updateDO,permId);
        }

        public Integer deleteByPermId( Long permId){
            return this.rolePermMapper.deleteByPermId(permId);
        }



        public List<RolePermDO> listByInPermId(Collection<Long> permIdList, String... fieldNames){
            return this.rolePermMapper.listByInPermId(permIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RolePermDO> mapByInPermId(Collection<Long> permIdList, String... fieldNames){
            return this.rolePermMapper.mapByInPermId(permIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPermId(Collection<Long> permIdList){
            return this.rolePermMapper.countByInPermId(permIdList);
        }

        public Integer updateNotNullFieldsByInPermId(RolePermDO updateDO, Collection<Long> permIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateNotNullFieldsByInPermId(updateDO,permIdList);
        }

        public Integer updateAllFieldsByInPermId(RolePermDO updateDO,  Collection<Long> permIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateAllFieldsByInPermId(updateDO,permIdList);
        }

        public Integer deleteByInPermId( Collection<Long> permIdList){
            return this.rolePermMapper.deleteByInPermId(permIdList);
        }


        public List<RolePermDO> listByRelType(Integer relType, String... fieldNames){
            return this.rolePermMapper.listByRelType(relType,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RolePermDO> mapByRelType(Integer relType, String... fieldNames){
            return this.rolePermMapper.mapByRelType(relType,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByRelType(Integer relType){
            return this.rolePermMapper.countByRelType(relType);
        }

        public Integer updateNotNullFieldsByRelType(RolePermDO updateDO, Integer relType){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateNotNullFieldsByRelType(updateDO,relType);
        }

        public Integer updateAllFieldsByRelType(RolePermDO updateDO,  Integer relType){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateAllFieldsByRelType(updateDO,relType);
        }

        public Integer deleteByRelType( Integer relType){
            return this.rolePermMapper.deleteByRelType(relType);
        }



        public List<RolePermDO> listByInRelType(Collection<Integer> relTypeList, String... fieldNames){
            return this.rolePermMapper.listByInRelType(relTypeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RolePermDO> mapByInRelType(Collection<Integer> relTypeList, String... fieldNames){
            return this.rolePermMapper.mapByInRelType(relTypeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInRelType(Collection<Integer> relTypeList){
            return this.rolePermMapper.countByInRelType(relTypeList);
        }

        public Integer updateNotNullFieldsByInRelType(RolePermDO updateDO, Collection<Integer> relTypeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateNotNullFieldsByInRelType(updateDO,relTypeList);
        }

        public Integer updateAllFieldsByInRelType(RolePermDO updateDO,  Collection<Integer> relTypeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateAllFieldsByInRelType(updateDO,relTypeList);
        }

        public Integer deleteByInRelType( Collection<Integer> relTypeList){
            return this.rolePermMapper.deleteByInRelType(relTypeList);
        }


        public List<RolePermDO> listByStartTime(Date startTime, String... fieldNames){
            return this.rolePermMapper.listByStartTime(startTime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RolePermDO> mapByStartTime(Date startTime, String... fieldNames){
            return this.rolePermMapper.mapByStartTime(startTime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByStartTime(Date startTime){
            return this.rolePermMapper.countByStartTime(startTime);
        }

        public Integer updateNotNullFieldsByStartTime(RolePermDO updateDO, Date startTime){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateNotNullFieldsByStartTime(updateDO,startTime);
        }

        public Integer updateAllFieldsByStartTime(RolePermDO updateDO,  Date startTime){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateAllFieldsByStartTime(updateDO,startTime);
        }

        public Integer deleteByStartTime( Date startTime){
            return this.rolePermMapper.deleteByStartTime(startTime);
        }



        public List<RolePermDO> listByInStartTime(Collection<Date> startTimeList, String... fieldNames){
            return this.rolePermMapper.listByInStartTime(startTimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RolePermDO> mapByInStartTime(Collection<Date> startTimeList, String... fieldNames){
            return this.rolePermMapper.mapByInStartTime(startTimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInStartTime(Collection<Date> startTimeList){
            return this.rolePermMapper.countByInStartTime(startTimeList);
        }

        public Integer updateNotNullFieldsByInStartTime(RolePermDO updateDO, Collection<Date> startTimeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateNotNullFieldsByInStartTime(updateDO,startTimeList);
        }

        public Integer updateAllFieldsByInStartTime(RolePermDO updateDO,  Collection<Date> startTimeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateAllFieldsByInStartTime(updateDO,startTimeList);
        }

        public Integer deleteByInStartTime( Collection<Date> startTimeList){
            return this.rolePermMapper.deleteByInStartTime(startTimeList);
        }


        public List<RolePermDO> listByEndTime(Date endTime, String... fieldNames){
            return this.rolePermMapper.listByEndTime(endTime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RolePermDO> mapByEndTime(Date endTime, String... fieldNames){
            return this.rolePermMapper.mapByEndTime(endTime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByEndTime(Date endTime){
            return this.rolePermMapper.countByEndTime(endTime);
        }

        public Integer updateNotNullFieldsByEndTime(RolePermDO updateDO, Date endTime){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateNotNullFieldsByEndTime(updateDO,endTime);
        }

        public Integer updateAllFieldsByEndTime(RolePermDO updateDO,  Date endTime){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateAllFieldsByEndTime(updateDO,endTime);
        }

        public Integer deleteByEndTime( Date endTime){
            return this.rolePermMapper.deleteByEndTime(endTime);
        }



        public List<RolePermDO> listByInEndTime(Collection<Date> endTimeList, String... fieldNames){
            return this.rolePermMapper.listByInEndTime(endTimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RolePermDO> mapByInEndTime(Collection<Date> endTimeList, String... fieldNames){
            return this.rolePermMapper.mapByInEndTime(endTimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInEndTime(Collection<Date> endTimeList){
            return this.rolePermMapper.countByInEndTime(endTimeList);
        }

        public Integer updateNotNullFieldsByInEndTime(RolePermDO updateDO, Collection<Date> endTimeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateNotNullFieldsByInEndTime(updateDO,endTimeList);
        }

        public Integer updateAllFieldsByInEndTime(RolePermDO updateDO,  Collection<Date> endTimeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateAllFieldsByInEndTime(updateDO,endTimeList);
        }

        public Integer deleteByInEndTime( Collection<Date> endTimeList){
            return this.rolePermMapper.deleteByInEndTime(endTimeList);
        }


        public List<RolePermDO> listByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.rolePermMapper.listByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RolePermDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.rolePermMapper.mapByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdCreate(Long userIdCreate){
            return this.rolePermMapper.countByUserIdCreate(userIdCreate);
        }

        public Integer updateNotNullFieldsByUserIdCreate(RolePermDO updateDO, Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateNotNullFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer updateAllFieldsByUserIdCreate(RolePermDO updateDO,  Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateAllFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer deleteByUserIdCreate( Long userIdCreate){
            return this.rolePermMapper.deleteByUserIdCreate(userIdCreate);
        }



        public List<RolePermDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.rolePermMapper.listByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RolePermDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.rolePermMapper.mapByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdCreate(Collection<Long> userIdCreateList){
            return this.rolePermMapper.countByInUserIdCreate(userIdCreateList);
        }

        public Integer updateNotNullFieldsByInUserIdCreate(RolePermDO updateDO, Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateNotNullFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer updateAllFieldsByInUserIdCreate(RolePermDO updateDO,  Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateAllFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer deleteByInUserIdCreate( Collection<Long> userIdCreateList){
            return this.rolePermMapper.deleteByInUserIdCreate(userIdCreateList);
        }


        public List<RolePermDO> listByUserIdModified(Long userIdModified, String... fieldNames){
            return this.rolePermMapper.listByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RolePermDO> mapByUserIdModified(Long userIdModified, String... fieldNames){
            return this.rolePermMapper.mapByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdModified(Long userIdModified){
            return this.rolePermMapper.countByUserIdModified(userIdModified);
        }

        public Integer updateNotNullFieldsByUserIdModified(RolePermDO updateDO, Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateNotNullFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer updateAllFieldsByUserIdModified(RolePermDO updateDO,  Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateAllFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer deleteByUserIdModified( Long userIdModified){
            return this.rolePermMapper.deleteByUserIdModified(userIdModified);
        }



        public List<RolePermDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.rolePermMapper.listByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,RolePermDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.rolePermMapper.mapByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdModified(Collection<Long> userIdModifiedList){
            return this.rolePermMapper.countByInUserIdModified(userIdModifiedList);
        }

        public Integer updateNotNullFieldsByInUserIdModified(RolePermDO updateDO, Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateNotNullFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer updateAllFieldsByInUserIdModified(RolePermDO updateDO,  Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.rolePermMapper.updateAllFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer deleteByInUserIdModified( Collection<Long> userIdModifiedList){
            return this.rolePermMapper.deleteByInUserIdModified(userIdModifiedList);
        }


}

