package com.lzw.wind.tibmas.core.daomanager.immutable.impl;

import com.lzw.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.lzw.wind.tibmas.core.daomanager.immutable.ImmutableTeamDaoManager;
import com.lzw.wind.tibmas.core.dbo.TeamDO;
import com.lzw.wind.tibmas.core.mapper.TeamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.*;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableTeamDaoManagerImpl extends CommonDaoManagerImpl<TeamDO,Long> implements ImmutableTeamDaoManager {

        @Autowired
        private TeamMapper teamMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(teamMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(TeamDO.ID,TeamDO.DB_ID);
            fieldMap.put(TeamDO.DB_ID,TeamDO.DB_ID);

            fieldMap.put(TeamDO.TEAM_NAME,TeamDO.DB_TEAM_NAME);
            fieldMap.put(TeamDO.DB_TEAM_NAME,TeamDO.DB_TEAM_NAME);

            fieldMap.put(TeamDO.TEAM_DESC,TeamDO.DB_TEAM_DESC);
            fieldMap.put(TeamDO.DB_TEAM_DESC,TeamDO.DB_TEAM_DESC);

            fieldMap.put(TeamDO.TEAM_TYPE_CODE,TeamDO.DB_TEAM_TYPE_CODE);
            fieldMap.put(TeamDO.DB_TEAM_TYPE_CODE,TeamDO.DB_TEAM_TYPE_CODE);

            fieldMap.put(TeamDO.TEAM_LEADER_ID,TeamDO.DB_TEAM_LEADER_ID);
            fieldMap.put(TeamDO.DB_TEAM_LEADER_ID,TeamDO.DB_TEAM_LEADER_ID);

            fieldMap.put(TeamDO.TEAM_DEPT_ID,TeamDO.DB_TEAM_DEPT_ID);
            fieldMap.put(TeamDO.DB_TEAM_DEPT_ID,TeamDO.DB_TEAM_DEPT_ID);

            fieldMap.put(TeamDO.IS_DELETED,TeamDO.DB_IS_DELETED);
            fieldMap.put(TeamDO.DB_IS_DELETED,TeamDO.DB_IS_DELETED);

            fieldMap.put(TeamDO.GMT_CREATE,TeamDO.DB_GMT_CREATE);
            fieldMap.put(TeamDO.DB_GMT_CREATE,TeamDO.DB_GMT_CREATE);

            fieldMap.put(TeamDO.GMT_MODIFIED,TeamDO.DB_GMT_MODIFIED);
            fieldMap.put(TeamDO.DB_GMT_MODIFIED,TeamDO.DB_GMT_MODIFIED);

            fieldMap.put(TeamDO.TEAM_HANDLE_ID,TeamDO.DB_TEAM_HANDLE_ID);
            fieldMap.put(TeamDO.DB_TEAM_HANDLE_ID,TeamDO.DB_TEAM_HANDLE_ID);



            super.setFieldNameMap(fieldMap);
        }


        /**
         * 根据主键获取记录
         *
         */
        public TeamDO getById(Long id){
            return this.teamMapper.getById(id);
        }



        public List<TeamDO> listById(Long id, String... fieldNames){
            return this.teamMapper.listById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamDO> mapById(Long id, String... fieldNames){
            return this.teamMapper.mapById(id,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countById(Long id){
            return this.teamMapper.countById(id);
        }

        public Integer updateNotNullFieldsById(TeamDO updateDO, Long id){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateNotNullFieldsById(updateDO,id);
        }

        public Integer updateAllFieldsById(TeamDO updateDO,  Long id){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateAllFieldsById(updateDO,id);
        }

        public Integer deleteById( Long id){
            return this.teamMapper.deleteById(id);
        }



        public List<TeamDO> listByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                return new ArrayList<>(0);
            }
            return this.teamMapper.listByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamDO> mapByInId(Collection<Long> idList, String... fieldNames){
            if(CollectionUtils.isEmpty(idList)){
                 return new HashMap<>();
            }
            return this.teamMapper.mapByInId(idList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInId(Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                   return 0;
             }
            return this.teamMapper.countByInId(idList);
        }

        public Integer updateNotNullFieldsByInId(TeamDO updateDO, Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateNotNullFieldsByInId(updateDO,idList);
        }

        public Integer updateAllFieldsByInId(TeamDO updateDO,  Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateAllFieldsByInId(updateDO,idList);
        }

        public Integer deleteByInId( Collection<Long> idList){
            if(CollectionUtils.isEmpty(idList)){
                           return 0;
             }
            return this.teamMapper.deleteByInId(idList);
        }


        public List<TeamDO> listByTeamName(String teamName, String... fieldNames){
            return this.teamMapper.listByTeamName(teamName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamDO> mapByTeamName(String teamName, String... fieldNames){
            return this.teamMapper.mapByTeamName(teamName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByTeamName(String teamName){
            return this.teamMapper.countByTeamName(teamName);
        }

        public Integer updateNotNullFieldsByTeamName(TeamDO updateDO, String teamName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateNotNullFieldsByTeamName(updateDO,teamName);
        }

        public Integer updateAllFieldsByTeamName(TeamDO updateDO,  String teamName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateAllFieldsByTeamName(updateDO,teamName);
        }

        public Integer deleteByTeamName( String teamName){
            return this.teamMapper.deleteByTeamName(teamName);
        }



        public List<TeamDO> listByInTeamName(Collection<String> teamNameList, String... fieldNames){
            if(CollectionUtils.isEmpty(teamNameList)){
                return new ArrayList<>(0);
            }
            return this.teamMapper.listByInTeamName(teamNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamDO> mapByInTeamName(Collection<String> teamNameList, String... fieldNames){
            if(CollectionUtils.isEmpty(teamNameList)){
                 return new HashMap<>();
            }
            return this.teamMapper.mapByInTeamName(teamNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInTeamName(Collection<String> teamNameList){
            if(CollectionUtils.isEmpty(teamNameList)){
                   return 0;
             }
            return this.teamMapper.countByInTeamName(teamNameList);
        }

        public Integer updateNotNullFieldsByInTeamName(TeamDO updateDO, Collection<String> teamNameList){
            if(CollectionUtils.isEmpty(teamNameList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateNotNullFieldsByInTeamName(updateDO,teamNameList);
        }

        public Integer updateAllFieldsByInTeamName(TeamDO updateDO,  Collection<String> teamNameList){
            if(CollectionUtils.isEmpty(teamNameList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateAllFieldsByInTeamName(updateDO,teamNameList);
        }

        public Integer deleteByInTeamName( Collection<String> teamNameList){
            if(CollectionUtils.isEmpty(teamNameList)){
                           return 0;
             }
            return this.teamMapper.deleteByInTeamName(teamNameList);
        }


        public List<TeamDO> listByTeamDesc(String teamDesc, String... fieldNames){
            return this.teamMapper.listByTeamDesc(teamDesc,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamDO> mapByTeamDesc(String teamDesc, String... fieldNames){
            return this.teamMapper.mapByTeamDesc(teamDesc,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByTeamDesc(String teamDesc){
            return this.teamMapper.countByTeamDesc(teamDesc);
        }

        public Integer updateNotNullFieldsByTeamDesc(TeamDO updateDO, String teamDesc){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateNotNullFieldsByTeamDesc(updateDO,teamDesc);
        }

        public Integer updateAllFieldsByTeamDesc(TeamDO updateDO,  String teamDesc){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateAllFieldsByTeamDesc(updateDO,teamDesc);
        }

        public Integer deleteByTeamDesc( String teamDesc){
            return this.teamMapper.deleteByTeamDesc(teamDesc);
        }



        public List<TeamDO> listByInTeamDesc(Collection<String> teamDescList, String... fieldNames){
            if(CollectionUtils.isEmpty(teamDescList)){
                return new ArrayList<>(0);
            }
            return this.teamMapper.listByInTeamDesc(teamDescList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamDO> mapByInTeamDesc(Collection<String> teamDescList, String... fieldNames){
            if(CollectionUtils.isEmpty(teamDescList)){
                 return new HashMap<>();
            }
            return this.teamMapper.mapByInTeamDesc(teamDescList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInTeamDesc(Collection<String> teamDescList){
            if(CollectionUtils.isEmpty(teamDescList)){
                   return 0;
             }
            return this.teamMapper.countByInTeamDesc(teamDescList);
        }

        public Integer updateNotNullFieldsByInTeamDesc(TeamDO updateDO, Collection<String> teamDescList){
            if(CollectionUtils.isEmpty(teamDescList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateNotNullFieldsByInTeamDesc(updateDO,teamDescList);
        }

        public Integer updateAllFieldsByInTeamDesc(TeamDO updateDO,  Collection<String> teamDescList){
            if(CollectionUtils.isEmpty(teamDescList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateAllFieldsByInTeamDesc(updateDO,teamDescList);
        }

        public Integer deleteByInTeamDesc( Collection<String> teamDescList){
            if(CollectionUtils.isEmpty(teamDescList)){
                           return 0;
             }
            return this.teamMapper.deleteByInTeamDesc(teamDescList);
        }


        public List<TeamDO> listByTeamTypeCode(String teamTypeCode, String... fieldNames){
            return this.teamMapper.listByTeamTypeCode(teamTypeCode,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamDO> mapByTeamTypeCode(String teamTypeCode, String... fieldNames){
            return this.teamMapper.mapByTeamTypeCode(teamTypeCode,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByTeamTypeCode(String teamTypeCode){
            return this.teamMapper.countByTeamTypeCode(teamTypeCode);
        }

        public Integer updateNotNullFieldsByTeamTypeCode(TeamDO updateDO, String teamTypeCode){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateNotNullFieldsByTeamTypeCode(updateDO,teamTypeCode);
        }

        public Integer updateAllFieldsByTeamTypeCode(TeamDO updateDO,  String teamTypeCode){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateAllFieldsByTeamTypeCode(updateDO,teamTypeCode);
        }

        public Integer deleteByTeamTypeCode( String teamTypeCode){
            return this.teamMapper.deleteByTeamTypeCode(teamTypeCode);
        }



        public List<TeamDO> listByInTeamTypeCode(Collection<String> teamTypeCodeList, String... fieldNames){
            if(CollectionUtils.isEmpty(teamTypeCodeList)){
                return new ArrayList<>(0);
            }
            return this.teamMapper.listByInTeamTypeCode(teamTypeCodeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamDO> mapByInTeamTypeCode(Collection<String> teamTypeCodeList, String... fieldNames){
            if(CollectionUtils.isEmpty(teamTypeCodeList)){
                 return new HashMap<>();
            }
            return this.teamMapper.mapByInTeamTypeCode(teamTypeCodeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInTeamTypeCode(Collection<String> teamTypeCodeList){
            if(CollectionUtils.isEmpty(teamTypeCodeList)){
                   return 0;
             }
            return this.teamMapper.countByInTeamTypeCode(teamTypeCodeList);
        }

        public Integer updateNotNullFieldsByInTeamTypeCode(TeamDO updateDO, Collection<String> teamTypeCodeList){
            if(CollectionUtils.isEmpty(teamTypeCodeList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateNotNullFieldsByInTeamTypeCode(updateDO,teamTypeCodeList);
        }

        public Integer updateAllFieldsByInTeamTypeCode(TeamDO updateDO,  Collection<String> teamTypeCodeList){
            if(CollectionUtils.isEmpty(teamTypeCodeList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateAllFieldsByInTeamTypeCode(updateDO,teamTypeCodeList);
        }

        public Integer deleteByInTeamTypeCode( Collection<String> teamTypeCodeList){
            if(CollectionUtils.isEmpty(teamTypeCodeList)){
                           return 0;
             }
            return this.teamMapper.deleteByInTeamTypeCode(teamTypeCodeList);
        }


        public List<TeamDO> listByTeamLeaderId(Long teamLeaderId, String... fieldNames){
            return this.teamMapper.listByTeamLeaderId(teamLeaderId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamDO> mapByTeamLeaderId(Long teamLeaderId, String... fieldNames){
            return this.teamMapper.mapByTeamLeaderId(teamLeaderId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByTeamLeaderId(Long teamLeaderId){
            return this.teamMapper.countByTeamLeaderId(teamLeaderId);
        }

        public Integer updateNotNullFieldsByTeamLeaderId(TeamDO updateDO, Long teamLeaderId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateNotNullFieldsByTeamLeaderId(updateDO,teamLeaderId);
        }

        public Integer updateAllFieldsByTeamLeaderId(TeamDO updateDO,  Long teamLeaderId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateAllFieldsByTeamLeaderId(updateDO,teamLeaderId);
        }

        public Integer deleteByTeamLeaderId( Long teamLeaderId){
            return this.teamMapper.deleteByTeamLeaderId(teamLeaderId);
        }



        public List<TeamDO> listByInTeamLeaderId(Collection<Long> teamLeaderIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(teamLeaderIdList)){
                return new ArrayList<>(0);
            }
            return this.teamMapper.listByInTeamLeaderId(teamLeaderIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamDO> mapByInTeamLeaderId(Collection<Long> teamLeaderIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(teamLeaderIdList)){
                 return new HashMap<>();
            }
            return this.teamMapper.mapByInTeamLeaderId(teamLeaderIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInTeamLeaderId(Collection<Long> teamLeaderIdList){
            if(CollectionUtils.isEmpty(teamLeaderIdList)){
                   return 0;
             }
            return this.teamMapper.countByInTeamLeaderId(teamLeaderIdList);
        }

        public Integer updateNotNullFieldsByInTeamLeaderId(TeamDO updateDO, Collection<Long> teamLeaderIdList){
            if(CollectionUtils.isEmpty(teamLeaderIdList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateNotNullFieldsByInTeamLeaderId(updateDO,teamLeaderIdList);
        }

        public Integer updateAllFieldsByInTeamLeaderId(TeamDO updateDO,  Collection<Long> teamLeaderIdList){
            if(CollectionUtils.isEmpty(teamLeaderIdList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateAllFieldsByInTeamLeaderId(updateDO,teamLeaderIdList);
        }

        public Integer deleteByInTeamLeaderId( Collection<Long> teamLeaderIdList){
            if(CollectionUtils.isEmpty(teamLeaderIdList)){
                           return 0;
             }
            return this.teamMapper.deleteByInTeamLeaderId(teamLeaderIdList);
        }


        public List<TeamDO> listByTeamDeptId(Long teamDeptId, String... fieldNames){
            return this.teamMapper.listByTeamDeptId(teamDeptId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamDO> mapByTeamDeptId(Long teamDeptId, String... fieldNames){
            return this.teamMapper.mapByTeamDeptId(teamDeptId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByTeamDeptId(Long teamDeptId){
            return this.teamMapper.countByTeamDeptId(teamDeptId);
        }

        public Integer updateNotNullFieldsByTeamDeptId(TeamDO updateDO, Long teamDeptId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateNotNullFieldsByTeamDeptId(updateDO,teamDeptId);
        }

        public Integer updateAllFieldsByTeamDeptId(TeamDO updateDO,  Long teamDeptId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateAllFieldsByTeamDeptId(updateDO,teamDeptId);
        }

        public Integer deleteByTeamDeptId( Long teamDeptId){
            return this.teamMapper.deleteByTeamDeptId(teamDeptId);
        }



        public List<TeamDO> listByInTeamDeptId(Collection<Long> teamDeptIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(teamDeptIdList)){
                return new ArrayList<>(0);
            }
            return this.teamMapper.listByInTeamDeptId(teamDeptIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamDO> mapByInTeamDeptId(Collection<Long> teamDeptIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(teamDeptIdList)){
                 return new HashMap<>();
            }
            return this.teamMapper.mapByInTeamDeptId(teamDeptIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInTeamDeptId(Collection<Long> teamDeptIdList){
            if(CollectionUtils.isEmpty(teamDeptIdList)){
                   return 0;
             }
            return this.teamMapper.countByInTeamDeptId(teamDeptIdList);
        }

        public Integer updateNotNullFieldsByInTeamDeptId(TeamDO updateDO, Collection<Long> teamDeptIdList){
            if(CollectionUtils.isEmpty(teamDeptIdList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateNotNullFieldsByInTeamDeptId(updateDO,teamDeptIdList);
        }

        public Integer updateAllFieldsByInTeamDeptId(TeamDO updateDO,  Collection<Long> teamDeptIdList){
            if(CollectionUtils.isEmpty(teamDeptIdList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateAllFieldsByInTeamDeptId(updateDO,teamDeptIdList);
        }

        public Integer deleteByInTeamDeptId( Collection<Long> teamDeptIdList){
            if(CollectionUtils.isEmpty(teamDeptIdList)){
                           return 0;
             }
            return this.teamMapper.deleteByInTeamDeptId(teamDeptIdList);
        }


        public List<TeamDO> listByTeamHandleId(Long teamHandleId, String... fieldNames){
            return this.teamMapper.listByTeamHandleId(teamHandleId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamDO> mapByTeamHandleId(Long teamHandleId, String... fieldNames){
            return this.teamMapper.mapByTeamHandleId(teamHandleId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByTeamHandleId(Long teamHandleId){
            return this.teamMapper.countByTeamHandleId(teamHandleId);
        }

        public Integer updateNotNullFieldsByTeamHandleId(TeamDO updateDO, Long teamHandleId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateNotNullFieldsByTeamHandleId(updateDO,teamHandleId);
        }

        public Integer updateAllFieldsByTeamHandleId(TeamDO updateDO,  Long teamHandleId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateAllFieldsByTeamHandleId(updateDO,teamHandleId);
        }

        public Integer deleteByTeamHandleId( Long teamHandleId){
            return this.teamMapper.deleteByTeamHandleId(teamHandleId);
        }



        public List<TeamDO> listByInTeamHandleId(Collection<Long> teamHandleIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(teamHandleIdList)){
                return new ArrayList<>(0);
            }
            return this.teamMapper.listByInTeamHandleId(teamHandleIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamDO> mapByInTeamHandleId(Collection<Long> teamHandleIdList, String... fieldNames){
            if(CollectionUtils.isEmpty(teamHandleIdList)){
                 return new HashMap<>();
            }
            return this.teamMapper.mapByInTeamHandleId(teamHandleIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInTeamHandleId(Collection<Long> teamHandleIdList){
            if(CollectionUtils.isEmpty(teamHandleIdList)){
                   return 0;
             }
            return this.teamMapper.countByInTeamHandleId(teamHandleIdList);
        }

        public Integer updateNotNullFieldsByInTeamHandleId(TeamDO updateDO, Collection<Long> teamHandleIdList){
            if(CollectionUtils.isEmpty(teamHandleIdList)){
                  return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateNotNullFieldsByInTeamHandleId(updateDO,teamHandleIdList);
        }

        public Integer updateAllFieldsByInTeamHandleId(TeamDO updateDO,  Collection<Long> teamHandleIdList){
            if(CollectionUtils.isEmpty(teamHandleIdList)){
                           return 0;
             }
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamMapper.updateAllFieldsByInTeamHandleId(updateDO,teamHandleIdList);
        }

        public Integer deleteByInTeamHandleId( Collection<Long> teamHandleIdList){
            if(CollectionUtils.isEmpty(teamHandleIdList)){
                           return 0;
             }
            return this.teamMapper.deleteByInTeamHandleId(teamHandleIdList);
        }


}

