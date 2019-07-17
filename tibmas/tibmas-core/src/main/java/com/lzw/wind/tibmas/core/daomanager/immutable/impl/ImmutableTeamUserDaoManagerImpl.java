package com.lzw.wind.tibmas.core.daomanager.immutable.impl;

import com.lzw.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.lzw.wind.tibmas.core.daomanager.immutable.ImmutableTeamUserDaoManager;
import com.lzw.wind.tibmas.core.dbo.TeamUserDO;
import com.lzw.wind.tibmas.core.mapper.TeamUserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableTeamUserDaoManagerImpl extends CommonDaoManagerImpl<TeamUserDO,Long> implements ImmutableTeamUserDaoManager {

        @Autowired
        private TeamUserMapper teamUserMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(teamUserMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(TeamUserDO.ID,TeamUserDO.DB_ID);
            fieldMap.put(TeamUserDO.DB_ID,TeamUserDO.DB_ID);

            fieldMap.put(TeamUserDO.TEAM_ID,TeamUserDO.DB_TEAM_ID);
            fieldMap.put(TeamUserDO.DB_TEAM_ID,TeamUserDO.DB_TEAM_ID);

            fieldMap.put(TeamUserDO.USER_ID,TeamUserDO.DB_USER_ID);
            fieldMap.put(TeamUserDO.DB_USER_ID,TeamUserDO.DB_USER_ID);

            fieldMap.put(TeamUserDO.USER_TYPE,TeamUserDO.DB_USER_TYPE);
            fieldMap.put(TeamUserDO.DB_USER_TYPE,TeamUserDO.DB_USER_TYPE);

            fieldMap.put(TeamUserDO.IS_DELETED,TeamUserDO.DB_IS_DELETED);
            fieldMap.put(TeamUserDO.DB_IS_DELETED,TeamUserDO.DB_IS_DELETED);

            fieldMap.put(TeamUserDO.GMT_CREATE,TeamUserDO.DB_GMT_CREATE);
            fieldMap.put(TeamUserDO.DB_GMT_CREATE,TeamUserDO.DB_GMT_CREATE);

            fieldMap.put(TeamUserDO.GMT_MODIFIED,TeamUserDO.DB_GMT_MODIFIED);
            fieldMap.put(TeamUserDO.DB_GMT_MODIFIED,TeamUserDO.DB_GMT_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }



        public List<TeamUserDO> listByTeamId(Long teamId, String... fieldNames){
            return this.teamUserMapper.listByTeamId(teamId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamUserDO> mapByTeamId(Long teamId, String... fieldNames){
            return this.teamUserMapper.mapByTeamId(teamId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByTeamId(Long teamId){
            return this.teamUserMapper.countByTeamId(teamId);
        }

        public Integer updateNotNullFieldsByTeamId(TeamUserDO updateDO, Long teamId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamUserMapper.updateNotNullFieldsByTeamId(updateDO,teamId);
        }

        public Integer updateAllFieldsByTeamId(TeamUserDO updateDO,  Long teamId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamUserMapper.updateAllFieldsByTeamId(updateDO,teamId);
        }

        public Integer deleteByTeamId( Long teamId){
            return this.teamUserMapper.deleteByTeamId(teamId);
        }



        public List<TeamUserDO> listByInTeamId(Collection<Long> teamIdList, String... fieldNames){
            return this.teamUserMapper.listByInTeamId(teamIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamUserDO> mapByInTeamId(Collection<Long> teamIdList, String... fieldNames){
            return this.teamUserMapper.mapByInTeamId(teamIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInTeamId(Collection<Long> teamIdList){
            return this.teamUserMapper.countByInTeamId(teamIdList);
        }

        public Integer updateNotNullFieldsByInTeamId(TeamUserDO updateDO, Collection<Long> teamIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamUserMapper.updateNotNullFieldsByInTeamId(updateDO,teamIdList);
        }

        public Integer updateAllFieldsByInTeamId(TeamUserDO updateDO,  Collection<Long> teamIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamUserMapper.updateAllFieldsByInTeamId(updateDO,teamIdList);
        }

        public Integer deleteByInTeamId( Collection<Long> teamIdList){
            return this.teamUserMapper.deleteByInTeamId(teamIdList);
        }


        public List<TeamUserDO> listByUserId(Long userId, String... fieldNames){
            return this.teamUserMapper.listByUserId(userId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamUserDO> mapByUserId(Long userId, String... fieldNames){
            return this.teamUserMapper.mapByUserId(userId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserId(Long userId){
            return this.teamUserMapper.countByUserId(userId);
        }

        public Integer updateNotNullFieldsByUserId(TeamUserDO updateDO, Long userId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamUserMapper.updateNotNullFieldsByUserId(updateDO,userId);
        }

        public Integer updateAllFieldsByUserId(TeamUserDO updateDO,  Long userId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamUserMapper.updateAllFieldsByUserId(updateDO,userId);
        }

        public Integer deleteByUserId( Long userId){
            return this.teamUserMapper.deleteByUserId(userId);
        }



        public List<TeamUserDO> listByInUserId(Collection<Long> userIdList, String... fieldNames){
            return this.teamUserMapper.listByInUserId(userIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamUserDO> mapByInUserId(Collection<Long> userIdList, String... fieldNames){
            return this.teamUserMapper.mapByInUserId(userIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserId(Collection<Long> userIdList){
            return this.teamUserMapper.countByInUserId(userIdList);
        }

        public Integer updateNotNullFieldsByInUserId(TeamUserDO updateDO, Collection<Long> userIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamUserMapper.updateNotNullFieldsByInUserId(updateDO,userIdList);
        }

        public Integer updateAllFieldsByInUserId(TeamUserDO updateDO,  Collection<Long> userIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamUserMapper.updateAllFieldsByInUserId(updateDO,userIdList);
        }

        public Integer deleteByInUserId( Collection<Long> userIdList){
            return this.teamUserMapper.deleteByInUserId(userIdList);
        }


        public List<TeamUserDO> listByUserType(Integer userType, String... fieldNames){
            return this.teamUserMapper.listByUserType(userType,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamUserDO> mapByUserType(Integer userType, String... fieldNames){
            return this.teamUserMapper.mapByUserType(userType,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUserType(Integer userType){
            return this.teamUserMapper.countByUserType(userType);
        }

        public Integer updateNotNullFieldsByUserType(TeamUserDO updateDO, Integer userType){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamUserMapper.updateNotNullFieldsByUserType(updateDO,userType);
        }

        public Integer updateAllFieldsByUserType(TeamUserDO updateDO,  Integer userType){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamUserMapper.updateAllFieldsByUserType(updateDO,userType);
        }

        public Integer deleteByUserType( Integer userType){
            return this.teamUserMapper.deleteByUserType(userType);
        }



        public List<TeamUserDO> listByInUserType(Collection<Integer> userTypeList, String... fieldNames){
            return this.teamUserMapper.listByInUserType(userTypeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,TeamUserDO> mapByInUserType(Collection<Integer> userTypeList, String... fieldNames){
            return this.teamUserMapper.mapByInUserType(userTypeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUserType(Collection<Integer> userTypeList){
            return this.teamUserMapper.countByInUserType(userTypeList);
        }

        public Integer updateNotNullFieldsByInUserType(TeamUserDO updateDO, Collection<Integer> userTypeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamUserMapper.updateNotNullFieldsByInUserType(updateDO,userTypeList);
        }

        public Integer updateAllFieldsByInUserType(TeamUserDO updateDO,  Collection<Integer> userTypeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.teamUserMapper.updateAllFieldsByInUserType(updateDO,userTypeList);
        }

        public Integer deleteByInUserType( Collection<Integer> userTypeList){
            return this.teamUserMapper.deleteByInUserType(userTypeList);
        }


}

