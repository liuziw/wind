package com.lzw.wind.tibmas.core.daomanager.immutable.impl;

import com.hyzs.gz.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.hyzs.tibmas.core.daomanager.immutable.ImmutableDeptRoleDaoManager;
import com.hyzs.tibmas.core.dbo.DeptRoleDO;
import com.hyzs.tibmas.core.mapper.DeptRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.*;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableDeptRoleDaoManagerImpl extends CommonDaoManagerImpl<DeptRoleDO,Long> implements ImmutableDeptRoleDaoManager {

        @Autowired
        private DeptRoleMapper deptRoleMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(deptRoleMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(DeptRoleDO.ID,DeptRoleDO.DB_ID);
            fieldMap.put(DeptRoleDO.DB_ID,DeptRoleDO.DB_ID);

            fieldMap.put(DeptRoleDO.DEPT_ID,DeptRoleDO.DB_DEPT_ID);
            fieldMap.put(DeptRoleDO.DB_DEPT_ID,DeptRoleDO.DB_DEPT_ID);

            fieldMap.put(DeptRoleDO.ROLE_ID,DeptRoleDO.DB_ROLE_ID);
            fieldMap.put(DeptRoleDO.DB_ROLE_ID,DeptRoleDO.DB_ROLE_ID);

            fieldMap.put(DeptRoleDO.START_TIME,DeptRoleDO.DB_START_TIME);
            fieldMap.put(DeptRoleDO.DB_START_TIME,DeptRoleDO.DB_START_TIME);

            fieldMap.put(DeptRoleDO.END_TIME,DeptRoleDO.DB_END_TIME);
            fieldMap.put(DeptRoleDO.DB_END_TIME,DeptRoleDO.DB_END_TIME);

            fieldMap.put(DeptRoleDO.IS_DELETED,DeptRoleDO.DB_IS_DELETED);
            fieldMap.put(DeptRoleDO.DB_IS_DELETED,DeptRoleDO.DB_IS_DELETED);

            fieldMap.put(DeptRoleDO.GMT_CREATE,DeptRoleDO.DB_GMT_CREATE);
            fieldMap.put(DeptRoleDO.DB_GMT_CREATE,DeptRoleDO.DB_GMT_CREATE);

            fieldMap.put(DeptRoleDO.GMT_MODIFIED,DeptRoleDO.DB_GMT_MODIFIED);
            fieldMap.put(DeptRoleDO.DB_GMT_MODIFIED,DeptRoleDO.DB_GMT_MODIFIED);

            fieldMap.put(DeptRoleDO.USER_ID_CREATE,DeptRoleDO.DB_USER_ID_CREATE);
            fieldMap.put(DeptRoleDO.DB_USER_ID_CREATE,DeptRoleDO.DB_USER_ID_CREATE);

            fieldMap.put(DeptRoleDO.USER_ID_MODIFIED,DeptRoleDO.DB_USER_ID_MODIFIED);
            fieldMap.put(DeptRoleDO.DB_USER_ID_MODIFIED,DeptRoleDO.DB_USER_ID_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }



        public List<DeptRoleDO> listByDeptId(Long deptId, String... fieldNames){
            return this.deptRoleMapper.listByDeptId(deptId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptRoleDO> mapByDeptId(Long deptId, String... fieldNames){
            return this.deptRoleMapper.mapByDeptId(deptId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByDeptId(Long deptId){
            return this.deptRoleMapper.countByDeptId(deptId);
        }

        public Integer updateNotNullFieldsByDeptId(DeptRoleDO updateDO, Long deptId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateNotNullFieldsByDeptId(updateDO,deptId);
        }

        public Integer updateAllFieldsByDeptId(DeptRoleDO updateDO,  Long deptId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateAllFieldsByDeptId(updateDO,deptId);
        }

        public Integer deleteByDeptId( Long deptId){
            return this.deptRoleMapper.deleteByDeptId(deptId);
        }



        public List<DeptRoleDO> listByInDeptId(Collection<Long> deptIdList, String... fieldNames){
            return this.deptRoleMapper.listByInDeptId(deptIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptRoleDO> mapByInDeptId(Collection<Long> deptIdList, String... fieldNames){
            return this.deptRoleMapper.mapByInDeptId(deptIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInDeptId(Collection<Long> deptIdList){
            return this.deptRoleMapper.countByInDeptId(deptIdList);
        }

        public Integer updateNotNullFieldsByInDeptId(DeptRoleDO updateDO, Collection<Long> deptIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateNotNullFieldsByInDeptId(updateDO,deptIdList);
        }

        public Integer updateAllFieldsByInDeptId(DeptRoleDO updateDO,  Collection<Long> deptIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateAllFieldsByInDeptId(updateDO,deptIdList);
        }

        public Integer deleteByInDeptId( Collection<Long> deptIdList){
            return this.deptRoleMapper.deleteByInDeptId(deptIdList);
        }


        public List<DeptRoleDO> listByRoleId(Long roleId, String... fieldNames){
            return this.deptRoleMapper.listByRoleId(roleId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptRoleDO> mapByRoleId(Long roleId, String... fieldNames){
            return this.deptRoleMapper.mapByRoleId(roleId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByRoleId(Long roleId){
            return this.deptRoleMapper.countByRoleId(roleId);
        }

        public Integer updateNotNullFieldsByRoleId(DeptRoleDO updateDO, Long roleId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateNotNullFieldsByRoleId(updateDO,roleId);
        }

        public Integer updateAllFieldsByRoleId(DeptRoleDO updateDO,  Long roleId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateAllFieldsByRoleId(updateDO,roleId);
        }

        public Integer deleteByRoleId( Long roleId){
            return this.deptRoleMapper.deleteByRoleId(roleId);
        }



        public List<DeptRoleDO> listByInRoleId(Collection<Long> roleIdList, String... fieldNames){
            return this.deptRoleMapper.listByInRoleId(roleIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptRoleDO> mapByInRoleId(Collection<Long> roleIdList, String... fieldNames){
            return this.deptRoleMapper.mapByInRoleId(roleIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInRoleId(Collection<Long> roleIdList){
            return this.deptRoleMapper.countByInRoleId(roleIdList);
        }

        public Integer updateNotNullFieldsByInRoleId(DeptRoleDO updateDO, Collection<Long> roleIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateNotNullFieldsByInRoleId(updateDO,roleIdList);
        }

        public Integer updateAllFieldsByInRoleId(DeptRoleDO updateDO,  Collection<Long> roleIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateAllFieldsByInRoleId(updateDO,roleIdList);
        }

        public Integer deleteByInRoleId( Collection<Long> roleIdList){
            return this.deptRoleMapper.deleteByInRoleId(roleIdList);
        }


        public List<DeptRoleDO> listByStartTime(Date startTime, String... fieldNames){
            return this.deptRoleMapper.listByStartTime(startTime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptRoleDO> mapByStartTime(Date startTime, String... fieldNames){
            return this.deptRoleMapper.mapByStartTime(startTime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByStartTime(Date startTime){
            return this.deptRoleMapper.countByStartTime(startTime);
        }

        public Integer updateNotNullFieldsByStartTime(DeptRoleDO updateDO, Date startTime){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateNotNullFieldsByStartTime(updateDO,startTime);
        }

        public Integer updateAllFieldsByStartTime(DeptRoleDO updateDO,  Date startTime){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateAllFieldsByStartTime(updateDO,startTime);
        }

        public Integer deleteByStartTime( Date startTime){
            return this.deptRoleMapper.deleteByStartTime(startTime);
        }



        public List<DeptRoleDO> listByInStartTime(Collection<Date> startTimeList, String... fieldNames){
            return this.deptRoleMapper.listByInStartTime(startTimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptRoleDO> mapByInStartTime(Collection<Date> startTimeList, String... fieldNames){
            return this.deptRoleMapper.mapByInStartTime(startTimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInStartTime(Collection<Date> startTimeList){
            return this.deptRoleMapper.countByInStartTime(startTimeList);
        }

        public Integer updateNotNullFieldsByInStartTime(DeptRoleDO updateDO, Collection<Date> startTimeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateNotNullFieldsByInStartTime(updateDO,startTimeList);
        }

        public Integer updateAllFieldsByInStartTime(DeptRoleDO updateDO,  Collection<Date> startTimeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateAllFieldsByInStartTime(updateDO,startTimeList);
        }

        public Integer deleteByInStartTime( Collection<Date> startTimeList){
            return this.deptRoleMapper.deleteByInStartTime(startTimeList);
        }


        public List<DeptRoleDO> listByEndTime(Date endTime, String... fieldNames){
            return this.deptRoleMapper.listByEndTime(endTime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptRoleDO> mapByEndTime(Date endTime, String... fieldNames){
            return this.deptRoleMapper.mapByEndTime(endTime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByEndTime(Date endTime){
            return this.deptRoleMapper.countByEndTime(endTime);
        }

        public Integer updateNotNullFieldsByEndTime(DeptRoleDO updateDO, Date endTime){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateNotNullFieldsByEndTime(updateDO,endTime);
        }

        public Integer updateAllFieldsByEndTime(DeptRoleDO updateDO,  Date endTime){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateAllFieldsByEndTime(updateDO,endTime);
        }

        public Integer deleteByEndTime( Date endTime){
            return this.deptRoleMapper.deleteByEndTime(endTime);
        }



        public List<DeptRoleDO> listByInEndTime(Collection<Date> endTimeList, String... fieldNames){
            return this.deptRoleMapper.listByInEndTime(endTimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptRoleDO> mapByInEndTime(Collection<Date> endTimeList, String... fieldNames){
            return this.deptRoleMapper.mapByInEndTime(endTimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInEndTime(Collection<Date> endTimeList){
            return this.deptRoleMapper.countByInEndTime(endTimeList);
        }

        public Integer updateNotNullFieldsByInEndTime(DeptRoleDO updateDO, Collection<Date> endTimeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateNotNullFieldsByInEndTime(updateDO,endTimeList);
        }

        public Integer updateAllFieldsByInEndTime(DeptRoleDO updateDO,  Collection<Date> endTimeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateAllFieldsByInEndTime(updateDO,endTimeList);
        }

        public Integer deleteByInEndTime( Collection<Date> endTimeList){
            return this.deptRoleMapper.deleteByInEndTime(endTimeList);
        }


        public List<DeptRoleDO> listByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.deptRoleMapper.listByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptRoleDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.deptRoleMapper.mapByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdCreate(Long userIdCreate){
            return this.deptRoleMapper.countByUserIdCreate(userIdCreate);
        }

        public Integer updateNotNullFieldsByUserIdCreate(DeptRoleDO updateDO, Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateNotNullFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer updateAllFieldsByUserIdCreate(DeptRoleDO updateDO,  Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateAllFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer deleteByUserIdCreate( Long userIdCreate){
            return this.deptRoleMapper.deleteByUserIdCreate(userIdCreate);
        }



        public List<DeptRoleDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.deptRoleMapper.listByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptRoleDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.deptRoleMapper.mapByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdCreate(Collection<Long> userIdCreateList){
            return this.deptRoleMapper.countByInUserIdCreate(userIdCreateList);
        }

        public Integer updateNotNullFieldsByInUserIdCreate(DeptRoleDO updateDO, Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateNotNullFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer updateAllFieldsByInUserIdCreate(DeptRoleDO updateDO,  Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateAllFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer deleteByInUserIdCreate( Collection<Long> userIdCreateList){
            return this.deptRoleMapper.deleteByInUserIdCreate(userIdCreateList);
        }


        public List<DeptRoleDO> listByUserIdModified(Long userIdModified, String... fieldNames){
            return this.deptRoleMapper.listByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptRoleDO> mapByUserIdModified(Long userIdModified, String... fieldNames){
            return this.deptRoleMapper.mapByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdModified(Long userIdModified){
            return this.deptRoleMapper.countByUserIdModified(userIdModified);
        }

        public Integer updateNotNullFieldsByUserIdModified(DeptRoleDO updateDO, Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateNotNullFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer updateAllFieldsByUserIdModified(DeptRoleDO updateDO,  Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateAllFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer deleteByUserIdModified( Long userIdModified){
            return this.deptRoleMapper.deleteByUserIdModified(userIdModified);
        }



        public List<DeptRoleDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.deptRoleMapper.listByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DeptRoleDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.deptRoleMapper.mapByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdModified(Collection<Long> userIdModifiedList){
            return this.deptRoleMapper.countByInUserIdModified(userIdModifiedList);
        }

        public Integer updateNotNullFieldsByInUserIdModified(DeptRoleDO updateDO, Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateNotNullFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer updateAllFieldsByInUserIdModified(DeptRoleDO updateDO,  Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.deptRoleMapper.updateAllFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer deleteByInUserIdModified( Collection<Long> userIdModifiedList){
            return this.deptRoleMapper.deleteByInUserIdModified(userIdModifiedList);
        }


}

