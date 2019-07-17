package com.lzw.wind.tibmas.log.daomanager.immutable.impl;

import com.lzw.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.lzw.wind.tibmas.log.daomanager.immutable.ImmutableOptrLogDaoManager;
import com.lzw.wind.tibmas.log.dbo.OptrLogDO;
import com.lzw.wind.tibmas.log.mapper.OptrLogMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.*;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableOptrLogDaoManagerImpl extends CommonDaoManagerImpl<OptrLogDO,Long> implements ImmutableOptrLogDaoManager {

        @Autowired
        private OptrLogMapper optrLogMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(optrLogMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(OptrLogDO.ID, OptrLogDO.DB_ID);
            fieldMap.put(OptrLogDO.DB_ID, OptrLogDO.DB_ID);

            fieldMap.put(OptrLogDO.USER_ID, OptrLogDO.DB_USER_ID);
            fieldMap.put(OptrLogDO.DB_USER_ID, OptrLogDO.DB_USER_ID);

            fieldMap.put(OptrLogDO.DEPT_ID, OptrLogDO.DB_DEPT_ID);
            fieldMap.put(OptrLogDO.DB_DEPT_ID, OptrLogDO.DB_DEPT_ID);

            fieldMap.put(OptrLogDO.APP_ID, OptrLogDO.DB_APP_ID);
            fieldMap.put(OptrLogDO.DB_APP_ID, OptrLogDO.DB_APP_ID);

            fieldMap.put(OptrLogDO.MAIN_MODEL, OptrLogDO.DB_MAIN_MODEL);
            fieldMap.put(OptrLogDO.DB_MAIN_MODEL, OptrLogDO.DB_MAIN_MODEL);

            fieldMap.put(OptrLogDO.SUB_MODEL, OptrLogDO.DB_SUB_MODEL);
            fieldMap.put(OptrLogDO.DB_SUB_MODEL, OptrLogDO.DB_SUB_MODEL);

            fieldMap.put(OptrLogDO.OPTR_TARGET, OptrLogDO.DB_OPTR_TARGET);
            fieldMap.put(OptrLogDO.DB_OPTR_TARGET, OptrLogDO.DB_OPTR_TARGET);

            fieldMap.put(OptrLogDO.OPTR_DESC, OptrLogDO.DB_OPTR_DESC);
            fieldMap.put(OptrLogDO.DB_OPTR_DESC, OptrLogDO.DB_OPTR_DESC);

            fieldMap.put(OptrLogDO.OPTR_TIME, OptrLogDO.DB_OPTR_TIME);
            fieldMap.put(OptrLogDO.DB_OPTR_TIME, OptrLogDO.DB_OPTR_TIME);

            fieldMap.put(OptrLogDO.IS_DELETED, OptrLogDO.DB_IS_DELETED);
            fieldMap.put(OptrLogDO.DB_IS_DELETED, OptrLogDO.DB_IS_DELETED);

            fieldMap.put(OptrLogDO.GMT_CREATE, OptrLogDO.DB_GMT_CREATE);
            fieldMap.put(OptrLogDO.DB_GMT_CREATE, OptrLogDO.DB_GMT_CREATE);

            fieldMap.put(OptrLogDO.GMT_MODIFIED, OptrLogDO.DB_GMT_MODIFIED);
            fieldMap.put(OptrLogDO.DB_GMT_MODIFIED, OptrLogDO.DB_GMT_MODIFIED);

            fieldMap.put(OptrLogDO.USER_ID_CREATE, OptrLogDO.DB_USER_ID_CREATE);
            fieldMap.put(OptrLogDO.DB_USER_ID_CREATE, OptrLogDO.DB_USER_ID_CREATE);

            fieldMap.put(OptrLogDO.USER_ID_MODIFIED, OptrLogDO.DB_USER_ID_MODIFIED);
            fieldMap.put(OptrLogDO.DB_USER_ID_MODIFIED, OptrLogDO.DB_USER_ID_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }



        public List<OptrLogDO> listByUserId(Long userId, String... fieldNames){
            return this.optrLogMapper.listByUserId(userId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OptrLogDO> mapByUserId(Long userId, String... fieldNames){
            return this.optrLogMapper.mapByUserId(userId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserId(Long userId){
            return this.optrLogMapper.countByUserId(userId);
        }

        public Integer updateNotNullFieldsByUserId(OptrLogDO updateDO, Long userId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateNotNullFieldsByUserId(updateDO,userId);
        }

        public Integer updateAllFieldsByUserId(OptrLogDO updateDO, Long userId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateAllFieldsByUserId(updateDO,userId);
        }

        public Integer deleteByUserId( Long userId){
            return this.optrLogMapper.deleteByUserId(userId);
        }



        public List<OptrLogDO> listByInUserId(Collection<Long> userIdList, String... fieldNames){
            return this.optrLogMapper.listByInUserId(userIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OptrLogDO> mapByInUserId(Collection<Long> userIdList, String... fieldNames){
            return this.optrLogMapper.mapByInUserId(userIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserId(Collection<Long> userIdList){
            return this.optrLogMapper.countByInUserId(userIdList);
        }

        public Integer updateNotNullFieldsByInUserId(OptrLogDO updateDO, Collection<Long> userIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateNotNullFieldsByInUserId(updateDO,userIdList);
        }

        public Integer updateAllFieldsByInUserId(OptrLogDO updateDO, Collection<Long> userIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateAllFieldsByInUserId(updateDO,userIdList);
        }

        public Integer deleteByInUserId( Collection<Long> userIdList){
            return this.optrLogMapper.deleteByInUserId(userIdList);
        }


        public List<OptrLogDO> listByDeptId(Long deptId, String... fieldNames){
            return this.optrLogMapper.listByDeptId(deptId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OptrLogDO> mapByDeptId(Long deptId, String... fieldNames){
            return this.optrLogMapper.mapByDeptId(deptId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByDeptId(Long deptId){
            return this.optrLogMapper.countByDeptId(deptId);
        }

        public Integer updateNotNullFieldsByDeptId(OptrLogDO updateDO, Long deptId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateNotNullFieldsByDeptId(updateDO,deptId);
        }

        public Integer updateAllFieldsByDeptId(OptrLogDO updateDO, Long deptId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateAllFieldsByDeptId(updateDO,deptId);
        }

        public Integer deleteByDeptId( Long deptId){
            return this.optrLogMapper.deleteByDeptId(deptId);
        }



        public List<OptrLogDO> listByInDeptId(Collection<Long> deptIdList, String... fieldNames){
            return this.optrLogMapper.listByInDeptId(deptIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OptrLogDO> mapByInDeptId(Collection<Long> deptIdList, String... fieldNames){
            return this.optrLogMapper.mapByInDeptId(deptIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInDeptId(Collection<Long> deptIdList){
            return this.optrLogMapper.countByInDeptId(deptIdList);
        }

        public Integer updateNotNullFieldsByInDeptId(OptrLogDO updateDO, Collection<Long> deptIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateNotNullFieldsByInDeptId(updateDO,deptIdList);
        }

        public Integer updateAllFieldsByInDeptId(OptrLogDO updateDO, Collection<Long> deptIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateAllFieldsByInDeptId(updateDO,deptIdList);
        }

        public Integer deleteByInDeptId( Collection<Long> deptIdList){
            return this.optrLogMapper.deleteByInDeptId(deptIdList);
        }


        public List<OptrLogDO> listByAppId(Long appId, String... fieldNames){
            return this.optrLogMapper.listByAppId(appId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OptrLogDO> mapByAppId(Long appId, String... fieldNames){
            return this.optrLogMapper.mapByAppId(appId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByAppId(Long appId){
            return this.optrLogMapper.countByAppId(appId);
        }

        public Integer updateNotNullFieldsByAppId(OptrLogDO updateDO, Long appId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateNotNullFieldsByAppId(updateDO,appId);
        }

        public Integer updateAllFieldsByAppId(OptrLogDO updateDO, Long appId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateAllFieldsByAppId(updateDO,appId);
        }

        public Integer deleteByAppId( Long appId){
            return this.optrLogMapper.deleteByAppId(appId);
        }



        public List<OptrLogDO> listByInAppId(Collection<Long> appIdList, String... fieldNames){
            return this.optrLogMapper.listByInAppId(appIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OptrLogDO> mapByInAppId(Collection<Long> appIdList, String... fieldNames){
            return this.optrLogMapper.mapByInAppId(appIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInAppId(Collection<Long> appIdList){
            return this.optrLogMapper.countByInAppId(appIdList);
        }

        public Integer updateNotNullFieldsByInAppId(OptrLogDO updateDO, Collection<Long> appIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateNotNullFieldsByInAppId(updateDO,appIdList);
        }

        public Integer updateAllFieldsByInAppId(OptrLogDO updateDO, Collection<Long> appIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateAllFieldsByInAppId(updateDO,appIdList);
        }

        public Integer deleteByInAppId( Collection<Long> appIdList){
            return this.optrLogMapper.deleteByInAppId(appIdList);
        }


        public List<OptrLogDO> listByMainModel(String mainModel, String... fieldNames){
            return this.optrLogMapper.listByMainModel(mainModel,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OptrLogDO> mapByMainModel(String mainModel, String... fieldNames){
            return this.optrLogMapper.mapByMainModel(mainModel,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByMainModel(String mainModel){
            return this.optrLogMapper.countByMainModel(mainModel);
        }

        public Integer updateNotNullFieldsByMainModel(OptrLogDO updateDO, String mainModel){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateNotNullFieldsByMainModel(updateDO,mainModel);
        }

        public Integer updateAllFieldsByMainModel(OptrLogDO updateDO, String mainModel){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateAllFieldsByMainModel(updateDO,mainModel);
        }

        public Integer deleteByMainModel( String mainModel){
            return this.optrLogMapper.deleteByMainModel(mainModel);
        }



        public List<OptrLogDO> listByInMainModel(Collection<String> mainModelList, String... fieldNames){
            return this.optrLogMapper.listByInMainModel(mainModelList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OptrLogDO> mapByInMainModel(Collection<String> mainModelList, String... fieldNames){
            return this.optrLogMapper.mapByInMainModel(mainModelList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInMainModel(Collection<String> mainModelList){
            return this.optrLogMapper.countByInMainModel(mainModelList);
        }

        public Integer updateNotNullFieldsByInMainModel(OptrLogDO updateDO, Collection<String> mainModelList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateNotNullFieldsByInMainModel(updateDO,mainModelList);
        }

        public Integer updateAllFieldsByInMainModel(OptrLogDO updateDO, Collection<String> mainModelList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateAllFieldsByInMainModel(updateDO,mainModelList);
        }

        public Integer deleteByInMainModel( Collection<String> mainModelList){
            return this.optrLogMapper.deleteByInMainModel(mainModelList);
        }


        public List<OptrLogDO> listBySubModel(String subModel, String... fieldNames){
            return this.optrLogMapper.listBySubModel(subModel,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OptrLogDO> mapBySubModel(String subModel, String... fieldNames){
            return this.optrLogMapper.mapBySubModel(subModel,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countBySubModel(String subModel){
            return this.optrLogMapper.countBySubModel(subModel);
        }

        public Integer updateNotNullFieldsBySubModel(OptrLogDO updateDO, String subModel){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateNotNullFieldsBySubModel(updateDO,subModel);
        }

        public Integer updateAllFieldsBySubModel(OptrLogDO updateDO, String subModel){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateAllFieldsBySubModel(updateDO,subModel);
        }

        public Integer deleteBySubModel( String subModel){
            return this.optrLogMapper.deleteBySubModel(subModel);
        }



        public List<OptrLogDO> listByInSubModel(Collection<String> subModelList, String... fieldNames){
            return this.optrLogMapper.listByInSubModel(subModelList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OptrLogDO> mapByInSubModel(Collection<String> subModelList, String... fieldNames){
            return this.optrLogMapper.mapByInSubModel(subModelList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInSubModel(Collection<String> subModelList){
            return this.optrLogMapper.countByInSubModel(subModelList);
        }

        public Integer updateNotNullFieldsByInSubModel(OptrLogDO updateDO, Collection<String> subModelList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateNotNullFieldsByInSubModel(updateDO,subModelList);
        }

        public Integer updateAllFieldsByInSubModel(OptrLogDO updateDO, Collection<String> subModelList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateAllFieldsByInSubModel(updateDO,subModelList);
        }

        public Integer deleteByInSubModel( Collection<String> subModelList){
            return this.optrLogMapper.deleteByInSubModel(subModelList);
        }


        public List<OptrLogDO> listByOptrTarget(String optrTarget, String... fieldNames){
            return this.optrLogMapper.listByOptrTarget(optrTarget,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OptrLogDO> mapByOptrTarget(String optrTarget, String... fieldNames){
            return this.optrLogMapper.mapByOptrTarget(optrTarget,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByOptrTarget(String optrTarget){
            return this.optrLogMapper.countByOptrTarget(optrTarget);
        }

        public Integer updateNotNullFieldsByOptrTarget(OptrLogDO updateDO, String optrTarget){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateNotNullFieldsByOptrTarget(updateDO,optrTarget);
        }

        public Integer updateAllFieldsByOptrTarget(OptrLogDO updateDO, String optrTarget){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateAllFieldsByOptrTarget(updateDO,optrTarget);
        }

        public Integer deleteByOptrTarget( String optrTarget){
            return this.optrLogMapper.deleteByOptrTarget(optrTarget);
        }



        public List<OptrLogDO> listByInOptrTarget(Collection<String> optrTargetList, String... fieldNames){
            return this.optrLogMapper.listByInOptrTarget(optrTargetList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OptrLogDO> mapByInOptrTarget(Collection<String> optrTargetList, String... fieldNames){
            return this.optrLogMapper.mapByInOptrTarget(optrTargetList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInOptrTarget(Collection<String> optrTargetList){
            return this.optrLogMapper.countByInOptrTarget(optrTargetList);
        }

        public Integer updateNotNullFieldsByInOptrTarget(OptrLogDO updateDO, Collection<String> optrTargetList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateNotNullFieldsByInOptrTarget(updateDO,optrTargetList);
        }

        public Integer updateAllFieldsByInOptrTarget(OptrLogDO updateDO, Collection<String> optrTargetList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateAllFieldsByInOptrTarget(updateDO,optrTargetList);
        }

        public Integer deleteByInOptrTarget( Collection<String> optrTargetList){
            return this.optrLogMapper.deleteByInOptrTarget(optrTargetList);
        }


        public List<OptrLogDO> listByOptrDesc(String optrDesc, String... fieldNames){
            return this.optrLogMapper.listByOptrDesc(optrDesc,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OptrLogDO> mapByOptrDesc(String optrDesc, String... fieldNames){
            return this.optrLogMapper.mapByOptrDesc(optrDesc,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByOptrDesc(String optrDesc){
            return this.optrLogMapper.countByOptrDesc(optrDesc);
        }

        public Integer updateNotNullFieldsByOptrDesc(OptrLogDO updateDO, String optrDesc){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateNotNullFieldsByOptrDesc(updateDO,optrDesc);
        }

        public Integer updateAllFieldsByOptrDesc(OptrLogDO updateDO, String optrDesc){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateAllFieldsByOptrDesc(updateDO,optrDesc);
        }

        public Integer deleteByOptrDesc( String optrDesc){
            return this.optrLogMapper.deleteByOptrDesc(optrDesc);
        }



        public List<OptrLogDO> listByInOptrDesc(Collection<String> optrDescList, String... fieldNames){
            return this.optrLogMapper.listByInOptrDesc(optrDescList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OptrLogDO> mapByInOptrDesc(Collection<String> optrDescList, String... fieldNames){
            return this.optrLogMapper.mapByInOptrDesc(optrDescList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInOptrDesc(Collection<String> optrDescList){
            return this.optrLogMapper.countByInOptrDesc(optrDescList);
        }

        public Integer updateNotNullFieldsByInOptrDesc(OptrLogDO updateDO, Collection<String> optrDescList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateNotNullFieldsByInOptrDesc(updateDO,optrDescList);
        }

        public Integer updateAllFieldsByInOptrDesc(OptrLogDO updateDO, Collection<String> optrDescList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateAllFieldsByInOptrDesc(updateDO,optrDescList);
        }

        public Integer deleteByInOptrDesc( Collection<String> optrDescList){
            return this.optrLogMapper.deleteByInOptrDesc(optrDescList);
        }


        public List<OptrLogDO> listByOptrTime(Date optrTime, String... fieldNames){
            return this.optrLogMapper.listByOptrTime(optrTime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OptrLogDO> mapByOptrTime(Date optrTime, String... fieldNames){
            return this.optrLogMapper.mapByOptrTime(optrTime,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByOptrTime(Date optrTime){
            return this.optrLogMapper.countByOptrTime(optrTime);
        }

        public Integer updateNotNullFieldsByOptrTime(OptrLogDO updateDO, Date optrTime){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateNotNullFieldsByOptrTime(updateDO,optrTime);
        }

        public Integer updateAllFieldsByOptrTime(OptrLogDO updateDO, Date optrTime){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateAllFieldsByOptrTime(updateDO,optrTime);
        }

        public Integer deleteByOptrTime( Date optrTime){
            return this.optrLogMapper.deleteByOptrTime(optrTime);
        }



        public List<OptrLogDO> listByInOptrTime(Collection<Date> optrTimeList, String... fieldNames){
            return this.optrLogMapper.listByInOptrTime(optrTimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OptrLogDO> mapByInOptrTime(Collection<Date> optrTimeList, String... fieldNames){
            return this.optrLogMapper.mapByInOptrTime(optrTimeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInOptrTime(Collection<Date> optrTimeList){
            return this.optrLogMapper.countByInOptrTime(optrTimeList);
        }

        public Integer updateNotNullFieldsByInOptrTime(OptrLogDO updateDO, Collection<Date> optrTimeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateNotNullFieldsByInOptrTime(updateDO,optrTimeList);
        }

        public Integer updateAllFieldsByInOptrTime(OptrLogDO updateDO, Collection<Date> optrTimeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateAllFieldsByInOptrTime(updateDO,optrTimeList);
        }

        public Integer deleteByInOptrTime( Collection<Date> optrTimeList){
            return this.optrLogMapper.deleteByInOptrTime(optrTimeList);
        }


        public List<OptrLogDO> listByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.optrLogMapper.listByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OptrLogDO> mapByUserIdCreate(Long userIdCreate, String... fieldNames){
            return this.optrLogMapper.mapByUserIdCreate(userIdCreate,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdCreate(Long userIdCreate){
            return this.optrLogMapper.countByUserIdCreate(userIdCreate);
        }

        public Integer updateNotNullFieldsByUserIdCreate(OptrLogDO updateDO, Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateNotNullFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer updateAllFieldsByUserIdCreate(OptrLogDO updateDO, Long userIdCreate){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateAllFieldsByUserIdCreate(updateDO,userIdCreate);
        }

        public Integer deleteByUserIdCreate( Long userIdCreate){
            return this.optrLogMapper.deleteByUserIdCreate(userIdCreate);
        }



        public List<OptrLogDO> listByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.optrLogMapper.listByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OptrLogDO> mapByInUserIdCreate(Collection<Long> userIdCreateList, String... fieldNames){
            return this.optrLogMapper.mapByInUserIdCreate(userIdCreateList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdCreate(Collection<Long> userIdCreateList){
            return this.optrLogMapper.countByInUserIdCreate(userIdCreateList);
        }

        public Integer updateNotNullFieldsByInUserIdCreate(OptrLogDO updateDO, Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateNotNullFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer updateAllFieldsByInUserIdCreate(OptrLogDO updateDO, Collection<Long> userIdCreateList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateAllFieldsByInUserIdCreate(updateDO,userIdCreateList);
        }

        public Integer deleteByInUserIdCreate( Collection<Long> userIdCreateList){
            return this.optrLogMapper.deleteByInUserIdCreate(userIdCreateList);
        }


        public List<OptrLogDO> listByUserIdModified(Long userIdModified, String... fieldNames){
            return this.optrLogMapper.listByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OptrLogDO> mapByUserIdModified(Long userIdModified, String... fieldNames){
            return this.optrLogMapper.mapByUserIdModified(userIdModified,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserIdModified(Long userIdModified){
            return this.optrLogMapper.countByUserIdModified(userIdModified);
        }

        public Integer updateNotNullFieldsByUserIdModified(OptrLogDO updateDO, Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateNotNullFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer updateAllFieldsByUserIdModified(OptrLogDO updateDO, Long userIdModified){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateAllFieldsByUserIdModified(updateDO,userIdModified);
        }

        public Integer deleteByUserIdModified( Long userIdModified){
            return this.optrLogMapper.deleteByUserIdModified(userIdModified);
        }



        public List<OptrLogDO> listByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.optrLogMapper.listByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,OptrLogDO> mapByInUserIdModified(Collection<Long> userIdModifiedList, String... fieldNames){
            return this.optrLogMapper.mapByInUserIdModified(userIdModifiedList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserIdModified(Collection<Long> userIdModifiedList){
            return this.optrLogMapper.countByInUserIdModified(userIdModifiedList);
        }

        public Integer updateNotNullFieldsByInUserIdModified(OptrLogDO updateDO, Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateNotNullFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer updateAllFieldsByInUserIdModified(OptrLogDO updateDO, Collection<Long> userIdModifiedList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.optrLogMapper.updateAllFieldsByInUserIdModified(updateDO,userIdModifiedList);
        }

        public Integer deleteByInUserIdModified( Collection<Long> userIdModifiedList){
            return this.optrLogMapper.deleteByInUserIdModified(userIdModifiedList);
        }


}

