package com.lzw.wind.tibmas.core.daomanager.immutable.impl;

import com.hyzs.gz.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.hyzs.tibmas.core.daomanager.immutable.ImmutableUserRoleDaoManager;
import com.hyzs.tibmas.core.dbo.UserRoleDO;
import com.hyzs.tibmas.core.mapper.UserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.*;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableUserRoleDaoManagerImpl extends CommonDaoManagerImpl<UserRoleDO,Long> implements ImmutableUserRoleDaoManager {

        @Autowired
        private UserRoleMapper userRoleMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(userRoleMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(UserRoleDO.ID,UserRoleDO.DB_ID);
            fieldMap.put(UserRoleDO.DB_ID,UserRoleDO.DB_ID);

            fieldMap.put(UserRoleDO.USER_ID,UserRoleDO.DB_USER_ID);
            fieldMap.put(UserRoleDO.DB_USER_ID,UserRoleDO.DB_USER_ID);

            fieldMap.put(UserRoleDO.ROLE_ID,UserRoleDO.DB_ROLE_ID);
            fieldMap.put(UserRoleDO.DB_ROLE_ID,UserRoleDO.DB_ROLE_ID);

            fieldMap.put(UserRoleDO.START_TIME,UserRoleDO.DB_START_TIME);
            fieldMap.put(UserRoleDO.DB_START_TIME,UserRoleDO.DB_START_TIME);

            fieldMap.put(UserRoleDO.END_TIME,UserRoleDO.DB_END_TIME);
            fieldMap.put(UserRoleDO.DB_END_TIME,UserRoleDO.DB_END_TIME);

            fieldMap.put(UserRoleDO.IS_DELETED,UserRoleDO.DB_IS_DELETED);
            fieldMap.put(UserRoleDO.DB_IS_DELETED,UserRoleDO.DB_IS_DELETED);

            fieldMap.put(UserRoleDO.GMT_CREATE,UserRoleDO.DB_GMT_CREATE);
            fieldMap.put(UserRoleDO.DB_GMT_CREATE,UserRoleDO.DB_GMT_CREATE);

            fieldMap.put(UserRoleDO.GMT_MODIFIED,UserRoleDO.DB_GMT_MODIFIED);
            fieldMap.put(UserRoleDO.DB_GMT_MODIFIED,UserRoleDO.DB_GMT_MODIFIED);

            fieldMap.put(UserRoleDO.USER_ID_CREATE,UserRoleDO.DB_USER_ID_CREATE);
            fieldMap.put(UserRoleDO.DB_USER_ID_CREATE,UserRoleDO.DB_USER_ID_CREATE);

            fieldMap.put(UserRoleDO.USER_ID_MODIFIED,UserRoleDO.DB_USER_ID_MODIFIED);
            fieldMap.put(UserRoleDO.DB_USER_ID_MODIFIED,UserRoleDO.DB_USER_ID_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }



        public List<UserRoleDO> listByUserId(Long userId, String... fieldNames){
            return this.userRoleMapper.listByUserId(userId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRoleDO> mapByUserId(Long userId, String... fieldNames){
            return this.userRoleMapper.mapByUserId(userId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserId(Long userId){
            return this.userRoleMapper.countByUserId(userId);
        }

        public Integer updateNotNullFieldsByUserId(UserRoleDO updateDO, Long userId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateNotNullFieldsByUserId(updateDO,userId);
        }

        public Integer updateAllFieldsByUserId(UserRoleDO updateDO,  Long userId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateAllFieldsByUserId(updateDO,userId);
        }

        public Integer deleteByUserId( Long userId){
            return this.userRoleMapper.deleteByUserId(userId);
        }



        public List<UserRoleDO> listByInUserId(Collection<Long> userIdList, String... fieldNames){
            return this.userRoleMapper.listByInUserId(userIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRoleDO> mapByInUserId(Collection<Long> userIdList, String... fieldNames){
            return this.userRoleMapper.mapByInUserId(userIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserId(Collection<Long> userIdList){
            return this.userRoleMapper.countByInUserId(userIdList);
        }

        public Integer updateNotNullFieldsByInUserId(UserRoleDO updateDO, Collection<Long> userIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateNotNullFieldsByInUserId(updateDO,userIdList);
        }

        public Integer updateAllFieldsByInUserId(UserRoleDO updateDO,  Collection<Long> userIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateAllFieldsByInUserId(updateDO,userIdList);
        }

        public Integer deleteByInUserId( Collection<Long> userIdList){
            return this.userRoleMapper.deleteByInUserId(userIdList);
        }


        public List<UserRoleDO> listByRoleId(Long roleId, String... fieldNames){
            return this.userRoleMapper.listByRoleId(roleId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRoleDO> mapByRoleId(Long roleId, String... fieldNames){
            return this.userRoleMapper.mapByRoleId(roleId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByRoleId(Long roleId){
            return this.userRoleMapper.countByRoleId(roleId);
        }

        public Integer updateNotNullFieldsByRoleId(UserRoleDO updateDO, Long roleId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateNotNullFieldsByRoleId(updateDO,roleId);
        }

        public Integer updateAllFieldsByRoleId(UserRoleDO updateDO,  Long roleId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateAllFieldsByRoleId(updateDO,roleId);
        }

        public Integer deleteByRoleId( Long roleId){
            return this.userRoleMapper.deleteByRoleId(roleId);
        }



        public List<UserRoleDO> listByInRoleId(Collection<Long> roleIdList, String... fieldNames){
            return this.userRoleMapper.listByInRoleId(roleIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRoleDO> mapByInRoleId(Collection<Long> roleIdList, String... fieldNames){
            return this.userRoleMapper.mapByInRoleId(roleIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInRoleId(Collection<Long> roleIdList){
            return this.userRoleMapper.countByInRoleId(roleIdList);
        }

        public Integer updateNotNullFieldsByInRoleId(UserRoleDO updateDO, Collection<Long> roleIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateNotNullFieldsByInRoleId(updateDO,roleIdList);
        }

        public Integer updateAllFieldsByInRoleId(UserRoleDO updateDO,  Collection<Long> roleIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateAllFieldsByInRoleId(updateDO,roleIdList);
        }

        public Integer deleteByInRoleId( Collection<Long> roleIdList){
            return this.userRoleMapper.deleteByInRoleId(roleIdList);
        }


        public List<UserRoleDO> listByStartTime(Date startTime, String... fieldNames){
            return this.userRoleMapper.listByStartTime(startTime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRoleDO> mapByStartTime(Date startTime, String... fieldNames){
            return this.userRoleMapper.mapByStartTime(startTime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByStartTime(Date startTime){
            return this.userRoleMapper.countByStartTime(startTime);
        }

        public Integer updateNotNullFieldsByStartTime(UserRoleDO updateDO, Date startTime){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateNotNullFieldsByStartTime(updateDO,startTime);
        }

        public Integer updateAllFieldsByStartTime(UserRoleDO updateDO,  Date startTime){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateAllFieldsByStartTime(updateDO,startTime);
        }

        public Integer deleteByStartTime( Date startTime){
            return this.userRoleMapper.deleteByStartTime(startTime);
        }



        public List<UserRoleDO> listByInStartTime(Collection<Date> startTimeList, String... fieldNames){
            return this.userRoleMapper.listByInStartTime(startTimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRoleDO> mapByInStartTime(Collection<Date> startTimeList, String... fieldNames){
            return this.userRoleMapper.mapByInStartTime(startTimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInStartTime(Collection<Date> startTimeList){
            return this.userRoleMapper.countByInStartTime(startTimeList);
        }

        public Integer updateNotNullFieldsByInStartTime(UserRoleDO updateDO, Collection<Date> startTimeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateNotNullFieldsByInStartTime(updateDO,startTimeList);
        }

        public Integer updateAllFieldsByInStartTime(UserRoleDO updateDO,  Collection<Date> startTimeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateAllFieldsByInStartTime(updateDO,startTimeList);
        }

        public Integer deleteByInStartTime( Collection<Date> startTimeList){
            return this.userRoleMapper.deleteByInStartTime(startTimeList);
        }


        public List<UserRoleDO> listByEndTime(Date endTime, String... fieldNames){
            return this.userRoleMapper.listByEndTime(endTime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRoleDO> mapByEndTime(Date endTime, String... fieldNames){
            return this.userRoleMapper.mapByEndTime(endTime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByEndTime(Date endTime){
            return this.userRoleMapper.countByEndTime(endTime);
        }

        public Integer updateNotNullFieldsByEndTime(UserRoleDO updateDO, Date endTime){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateNotNullFieldsByEndTime(updateDO,endTime);
        }

        public Integer updateAllFieldsByEndTime(UserRoleDO updateDO,  Date endTime){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateAllFieldsByEndTime(updateDO,endTime);
        }

        public Integer deleteByEndTime( Date endTime){
            return this.userRoleMapper.deleteByEndTime(endTime);
        }



        public List<UserRoleDO> listByInEndTime(Collection<Date> endTimeList, String... fieldNames){
            return this.userRoleMapper.listByInEndTime(endTimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRoleDO> mapByInEndTime(Collection<Date> endTimeList, String... fieldNames){
            return this.userRoleMapper.mapByInEndTime(endTimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInEndTime(Collection<Date> endTimeList){
            return this.userRoleMapper.countByInEndTime(endTimeList);
        }

        public Integer updateNotNullFieldsByInEndTime(UserRoleDO updateDO, Collection<Date> endTimeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateNotNullFieldsByInEndTime(updateDO,endTimeList);
        }

        public Integer updateAllFieldsByInEndTime(UserRoleDO updateDO,  Collection<Date> endTimeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateAllFieldsByInEndTime(updateDO,endTimeList);
        }

        public Integer deleteByInEndTime( Collection<Date> endTimeList){
            return this.userRoleMapper.deleteByInEndTime(endTimeList);
        }


        public List<UserRoleDO> listByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.userRoleMapper.listByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRoleDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.userRoleMapper.mapByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdCreate(Long userIdCreate){
            return this.userRoleMapper.countByUserIdCreate(userIdCreate);
        }

        public Integer updateNotNullFieldsByUserIdCreate(UserRoleDO updateDO, Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateNotNullFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer updateAllFieldsByUserIdCreate(UserRoleDO updateDO,  Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateAllFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer deleteByUserIdCreate( Long userIdCreate){
            return this.userRoleMapper.deleteByUserIdCreate(userIdCreate);
        }



        public List<UserRoleDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.userRoleMapper.listByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRoleDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.userRoleMapper.mapByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdCreate(Collection<Long> userIdCreateList){
            return this.userRoleMapper.countByInUserIdCreate(userIdCreateList);
        }

        public Integer updateNotNullFieldsByInUserIdCreate(UserRoleDO updateDO, Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateNotNullFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer updateAllFieldsByInUserIdCreate(UserRoleDO updateDO,  Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateAllFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer deleteByInUserIdCreate( Collection<Long> userIdCreateList){
            return this.userRoleMapper.deleteByInUserIdCreate(userIdCreateList);
        }


        public List<UserRoleDO> listByUserIdModified(Long userIdModified, String... fieldNames){
            return this.userRoleMapper.listByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRoleDO> mapByUserIdModified(Long userIdModified, String... fieldNames){
            return this.userRoleMapper.mapByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdModified(Long userIdModified){
            return this.userRoleMapper.countByUserIdModified(userIdModified);
        }

        public Integer updateNotNullFieldsByUserIdModified(UserRoleDO updateDO, Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateNotNullFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer updateAllFieldsByUserIdModified(UserRoleDO updateDO,  Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateAllFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer deleteByUserIdModified( Long userIdModified){
            return this.userRoleMapper.deleteByUserIdModified(userIdModified);
        }



        public List<UserRoleDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.userRoleMapper.listByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,UserRoleDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.userRoleMapper.mapByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdModified(Collection<Long> userIdModifiedList){
            return this.userRoleMapper.countByInUserIdModified(userIdModifiedList);
        }

        public Integer updateNotNullFieldsByInUserIdModified(UserRoleDO updateDO, Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateNotNullFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer updateAllFieldsByInUserIdModified(UserRoleDO updateDO,  Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.userRoleMapper.updateAllFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer deleteByInUserIdModified( Collection<Long> userIdModifiedList){
            return this.userRoleMapper.deleteByInUserIdModified(userIdModifiedList);
        }


}

