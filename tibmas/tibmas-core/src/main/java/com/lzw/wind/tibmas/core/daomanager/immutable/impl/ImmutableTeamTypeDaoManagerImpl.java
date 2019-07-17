package com.lzw.wind.tibmas.core.daomanager.immutable.impl;

import com.lzw.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.lzw.wind.tibmas.core.daomanager.immutable.ImmutableTeamTypeDaoManager;
import com.lzw.wind.tibmas.core.dbo.TeamTypeDO;
import com.lzw.wind.tibmas.core.mapper.TeamTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableTeamTypeDaoManagerImpl extends CommonDaoManagerImpl<TeamTypeDO,Long> implements ImmutableTeamTypeDaoManager {

        @Autowired
        private TeamTypeMapper teamTypeMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(teamTypeMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(TeamTypeDO.ID,TeamTypeDO.DB_ID);
            fieldMap.put(TeamTypeDO.DB_ID,TeamTypeDO.DB_ID);

            fieldMap.put(TeamTypeDO.TEAM_TYPE_CODE,TeamTypeDO.DB_TEAM_TYPE_CODE);
            fieldMap.put(TeamTypeDO.DB_TEAM_TYPE_CODE,TeamTypeDO.DB_TEAM_TYPE_CODE);

            fieldMap.put(TeamTypeDO.TEAM_TYPE_NAME,TeamTypeDO.DB_TEAM_TYPE_NAME);
            fieldMap.put(TeamTypeDO.DB_TEAM_TYPE_NAME,TeamTypeDO.DB_TEAM_TYPE_NAME);

            fieldMap.put(TeamTypeDO.TEAM_TYPE_REPEAT,TeamTypeDO.DB_TEAM_TYPE_REPEAT);
            fieldMap.put(TeamTypeDO.DB_TEAM_TYPE_REPEAT,TeamTypeDO.DB_TEAM_TYPE_REPEAT);

            fieldMap.put(TeamTypeDO.IS_DELETED,TeamTypeDO.DB_IS_DELETED);
            fieldMap.put(TeamTypeDO.DB_IS_DELETED,TeamTypeDO.DB_IS_DELETED);

            fieldMap.put(TeamTypeDO.GMT_CREATE,TeamTypeDO.DB_GMT_CREATE);
            fieldMap.put(TeamTypeDO.DB_GMT_CREATE,TeamTypeDO.DB_GMT_CREATE);

            fieldMap.put(TeamTypeDO.GMT_MODIFIED,TeamTypeDO.DB_GMT_MODIFIED);
            fieldMap.put(TeamTypeDO.DB_GMT_MODIFIED,TeamTypeDO.DB_GMT_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }



        public List<TeamTypeDO> listByTeamTypeCode(String teamTypeCode, String... fieldNames){
            return this.teamTypeMapper.listByTeamTypeCode(teamTypeCode,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamTypeDO> mapByTeamTypeCode(String teamTypeCode, String... fieldNames){
            return this.teamTypeMapper.mapByTeamTypeCode(teamTypeCode,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByTeamTypeCode(String teamTypeCode){
            return this.teamTypeMapper.countByTeamTypeCode(teamTypeCode);
        }

        public Integer updateNotNullFieldsByTeamTypeCode(TeamTypeDO updateDO, String teamTypeCode){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamTypeMapper.updateNotNullFieldsByTeamTypeCode(updateDO,teamTypeCode);
        }

        public Integer updateAllFieldsByTeamTypeCode(TeamTypeDO updateDO,  String teamTypeCode){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamTypeMapper.updateAllFieldsByTeamTypeCode(updateDO,teamTypeCode);
        }

        public Integer deleteByTeamTypeCode( String teamTypeCode){
            return this.teamTypeMapper.deleteByTeamTypeCode(teamTypeCode);
        }



        public List<TeamTypeDO> listByInTeamTypeCode(Collection<String> teamTypeCodeList, String... fieldNames){
            return this.teamTypeMapper.listByInTeamTypeCode(teamTypeCodeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamTypeDO> mapByInTeamTypeCode(Collection<String> teamTypeCodeList, String... fieldNames){
            return this.teamTypeMapper.mapByInTeamTypeCode(teamTypeCodeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInTeamTypeCode(Collection<String> teamTypeCodeList){
            return this.teamTypeMapper.countByInTeamTypeCode(teamTypeCodeList);
        }

        public Integer updateNotNullFieldsByInTeamTypeCode(TeamTypeDO updateDO, Collection<String> teamTypeCodeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamTypeMapper.updateNotNullFieldsByInTeamTypeCode(updateDO,teamTypeCodeList);
        }

        public Integer updateAllFieldsByInTeamTypeCode(TeamTypeDO updateDO,  Collection<String> teamTypeCodeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamTypeMapper.updateAllFieldsByInTeamTypeCode(updateDO,teamTypeCodeList);
        }

        public Integer deleteByInTeamTypeCode( Collection<String> teamTypeCodeList){
            return this.teamTypeMapper.deleteByInTeamTypeCode(teamTypeCodeList);
        }


        public List<TeamTypeDO> listByTeamTypeName(String teamTypeName, String... fieldNames){
            return this.teamTypeMapper.listByTeamTypeName(teamTypeName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamTypeDO> mapByTeamTypeName(String teamTypeName, String... fieldNames){
            return this.teamTypeMapper.mapByTeamTypeName(teamTypeName,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByTeamTypeName(String teamTypeName){
            return this.teamTypeMapper.countByTeamTypeName(teamTypeName);
        }

        public Integer updateNotNullFieldsByTeamTypeName(TeamTypeDO updateDO, String teamTypeName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamTypeMapper.updateNotNullFieldsByTeamTypeName(updateDO,teamTypeName);
        }

        public Integer updateAllFieldsByTeamTypeName(TeamTypeDO updateDO,  String teamTypeName){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamTypeMapper.updateAllFieldsByTeamTypeName(updateDO,teamTypeName);
        }

        public Integer deleteByTeamTypeName( String teamTypeName){
            return this.teamTypeMapper.deleteByTeamTypeName(teamTypeName);
        }



        public List<TeamTypeDO> listByInTeamTypeName(Collection<String> teamTypeNameList, String... fieldNames){
            return this.teamTypeMapper.listByInTeamTypeName(teamTypeNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamTypeDO> mapByInTeamTypeName(Collection<String> teamTypeNameList, String... fieldNames){
            return this.teamTypeMapper.mapByInTeamTypeName(teamTypeNameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInTeamTypeName(Collection<String> teamTypeNameList){
            return this.teamTypeMapper.countByInTeamTypeName(teamTypeNameList);
        }

        public Integer updateNotNullFieldsByInTeamTypeName(TeamTypeDO updateDO, Collection<String> teamTypeNameList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamTypeMapper.updateNotNullFieldsByInTeamTypeName(updateDO,teamTypeNameList);
        }

        public Integer updateAllFieldsByInTeamTypeName(TeamTypeDO updateDO,  Collection<String> teamTypeNameList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamTypeMapper.updateAllFieldsByInTeamTypeName(updateDO,teamTypeNameList);
        }

        public Integer deleteByInTeamTypeName( Collection<String> teamTypeNameList){
            return this.teamTypeMapper.deleteByInTeamTypeName(teamTypeNameList);
        }


        public List<TeamTypeDO> listByTeamTypeRepeat(Integer teamTypeRepeat, String... fieldNames){
            return this.teamTypeMapper.listByTeamTypeRepeat(teamTypeRepeat,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamTypeDO> mapByTeamTypeRepeat(Integer teamTypeRepeat, String... fieldNames){
            return this.teamTypeMapper.mapByTeamTypeRepeat(teamTypeRepeat,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByTeamTypeRepeat(Integer teamTypeRepeat){
            return this.teamTypeMapper.countByTeamTypeRepeat(teamTypeRepeat);
        }

        public Integer updateNotNullFieldsByTeamTypeRepeat(TeamTypeDO updateDO, Integer teamTypeRepeat){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamTypeMapper.updateNotNullFieldsByTeamTypeRepeat(updateDO,teamTypeRepeat);
        }

        public Integer updateAllFieldsByTeamTypeRepeat(TeamTypeDO updateDO,  Integer teamTypeRepeat){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamTypeMapper.updateAllFieldsByTeamTypeRepeat(updateDO,teamTypeRepeat);
        }

        public Integer deleteByTeamTypeRepeat( Integer teamTypeRepeat){
            return this.teamTypeMapper.deleteByTeamTypeRepeat(teamTypeRepeat);
        }



        public List<TeamTypeDO> listByInTeamTypeRepeat(Collection<Integer> teamTypeRepeatList, String... fieldNames){
            return this.teamTypeMapper.listByInTeamTypeRepeat(teamTypeRepeatList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamTypeDO> mapByInTeamTypeRepeat(Collection<Integer> teamTypeRepeatList, String... fieldNames){
            return this.teamTypeMapper.mapByInTeamTypeRepeat(teamTypeRepeatList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInTeamTypeRepeat(Collection<Integer> teamTypeRepeatList){
            return this.teamTypeMapper.countByInTeamTypeRepeat(teamTypeRepeatList);
        }

        public Integer updateNotNullFieldsByInTeamTypeRepeat(TeamTypeDO updateDO, Collection<Integer> teamTypeRepeatList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamTypeMapper.updateNotNullFieldsByInTeamTypeRepeat(updateDO,teamTypeRepeatList);
        }

        public Integer updateAllFieldsByInTeamTypeRepeat(TeamTypeDO updateDO,  Collection<Integer> teamTypeRepeatList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamTypeMapper.updateAllFieldsByInTeamTypeRepeat(updateDO,teamTypeRepeatList);
        }

        public Integer deleteByInTeamTypeRepeat( Collection<Integer> teamTypeRepeatList){
            return this.teamTypeMapper.deleteByInTeamTypeRepeat(teamTypeRepeatList);
        }


}

