package com.lzw.wind.tibmas.core.service.impl;

import com.hyzs.gz.common.core.bo.PageBO;
import com.hyzs.gz.common.core.exception.CommonErrorCode;
import com.hyzs.gz.common.core.exception.CommonException;
import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.gz.common.dao.dto.QueryItemDTO;
import com.hyzs.gz.common.dao.util.DaoUtils;
import com.hyzs.tibmas.core.bo.TeamDetailsBO;
import com.hyzs.tibmas.core.daomanager.*;
import com.hyzs.tibmas.core.dbo.*;
import com.hyzs.tibmas.core.dto.*;
import com.hyzs.tibmas.core.enums.RoleTypeEnum;
import com.hyzs.tibmas.core.service.TeamService;
import com.hyzs.tibmas.core.vo.HandleVO;
import com.hyzs.tibmas.core.vo.LeaderVO;
import com.hyzs.tibmas.core.vo.TeamVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamDaoManager teamDaoManager;

    @Autowired
    private UserDaoManager userDaoManager;

    @Autowired
    private DeptDaoManager deptDaoManager;

    @Autowired
    private TeamUserDaoManager teamUserDaoManager;

    @Autowired
    private TeamTypeDaoManager teamTypeDaoManager;

    @Autowired
    private AreaDaoManager areaDaoManager;

    @Override
    public Integer addTeam(TeamDTO teamDTO) {
        /**
         * 进行团队名称校验，如果名称已经存在，则无法新建
         */
        TeamDO teamDODB = teamDaoManager.singleResultByTeamName(teamDTO.getTeamName());
        if (teamDODB != null) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "该团队已经存在");
        }
//      验证leaderId的合法性
        UserDO leader = userDaoManager.getById(teamDTO.getTeamLeaderId());
        if (leader == null) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "无效的leaderId");
        }
        //验证handleId的合法性
        if (teamDTO.getTeamHandleId()!=null){
            UserDO handle = userDaoManager.getById(teamDTO.getTeamHandleId());
            if (handle == null) {
                throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "无效的handleId");
            }
        }

//      验证deptId的合法性
        if (teamDTO.getTeamDeptId() != null) {
            DeptDO dept = deptDaoManager.getById(teamDTO.getTeamDeptId());
            if (dept == null) {
                throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "无效的deptId");
            }
        }
//       验证团队类型的合法性
        TeamTypeDO teamTypeCode = teamTypeDaoManager.singleResultByTeamTypeCode(teamDTO.getTeamTypeCode());
        if (teamTypeCode == null) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "必须添加团队类型");
        }
        /**
         * 执行新建
         */
        TeamDO teamDO = CommonUtils.newInstance(teamDTO, TeamDO.class);
        teamDaoManager.insertNotNullProperties(teamDO);

        TeamUserDO teamUserDO = new TeamUserDO();
        teamUserDO.setTeamId(teamDO.getId());
        teamUserDO.setUserId(teamDO.getTeamLeaderId());
        teamUserDO.setUserType(1);
        return this.teamUserDaoManager.insertNotNullProperties(teamUserDO);

    }

    @Override
    public Integer deleteTeamById(CommonIdDTO commonIdDTO) {

        /**
         * team不为空，不能执行删除
         */
        if (!teamUserDaoManager.listByTeamId(commonIdDTO.getId()).isEmpty()) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "删除失败");
        }

        TeamDO teamDO = teamDaoManager.getById(commonIdDTO.getId());
        if (teamDO == null) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "该团队不存在，无法执行该操作");
        }
        return teamDaoManager.deleteById(commonIdDTO.getId());
    }

    @Override
        public Integer updateTeamById(UpdateTeamDTO updateTeamDTO) {

        TeamDO teamDODB = this.teamDaoManager.singleResultByTeamName(updateTeamDTO.getTeamName());
        if (teamDODB != null && !teamDODB.getId().equals(teamDODB.getId()))
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "该团队名称已经存在");

        TeamDO teamDO = CommonUtils.newInstance(updateTeamDTO, TeamDO.class);
        this.teamDaoManager.updateNotNullProperties(teamDO);


        TeamUserDO teamUserDO = new TeamUserDO();
        teamUserDO.setTeamId(updateTeamDTO.getId());
        teamUserDO.setUserId(updateTeamDTO.getTeamLeaderId());
        teamUserDO.setUserType(RoleTypeEnum.ADMIN.getCode());

        List<QueryItemDTO> queryItemDTOList = Arrays.asList(DaoUtils.buildEqualTo(TeamUserDO.DB_TEAM_ID, updateTeamDTO.getId()),
                DaoUtils.buildEqualTo(TeamUserDO.DB_USER_ID, teamDODB.getTeamLeaderId()));
        return this.teamUserDaoManager.updateNotNullFieldsByQueryItems(teamUserDO,queryItemDTOList);



    }

    /**
     * 通过团队Id来查询某个团队
     *
     * @param commonIdDTO
     * @return
     */
    @Override
    public TeamDetailsBO getTeamById(CommonIdDTO commonIdDTO) {
        TeamDO teamDo = teamDaoManager.getById(commonIdDTO.getId());
        if (teamDo == null) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "未找到相关团队信息");
        }

        TeamDetailsBO teamDetailsBO = CommonUtils.newInstance(teamDo, TeamDetailsBO.class);
        if (teamDo.getTeamLeaderId() != null) {
            UserDO userById = userDaoManager.getById(teamDo.getTeamLeaderId());
            if (userById.getUserName() != null) {
                teamDetailsBO.setTeamLeaderName(userById.getUserName());
            }
        }

        //设置片长姓名
        UserDO handleUserDO = userDaoManager.getById(teamDo.getTeamHandleId());
        if (handleUserDO != null) {
            teamDetailsBO.setTeamHandleName(handleUserDO.getUserName());
        }

        if (teamDo.getTeamDeptId() != null) {
            DeptDO deptById = deptDaoManager.getById(teamDo.getTeamDeptId());
            if (deptById != null) {
                if (deptById.getDeptName() != null) {
                    teamDetailsBO.setTeamDeptName(deptById.getDeptName());
                }
            }
        }

        teamDetailsBO.setTeamTypeCode(teamDo.getTeamTypeCode());

        return teamDetailsBO;
    }

    /**
     * 根据团队名称查询团队信息（模糊查询）
     * 不给条件默认是列出所有的团队
     *
     * @param listTeamByNameDTO
     * @return
     */
    @Override
    public PageBO<TeamVO> listTeams(ListTeamByNameDTO listTeamByNameDTO) {

        PageBO<TeamDO> teamDOPageBO = DaoUtils.listDOByPage(() -> {
            List<TeamDO> teamDOList = new ArrayList<>();
            if (CommonUtils.isNotBlank(listTeamByNameDTO.getTeamName())) {
                teamDOList = teamDaoManager.listByQueryItems(DaoUtils.buildLike(TeamDO.DB_TEAM_NAME, "%" + listTeamByNameDTO.getTeamName() + "%"));
            } else {
                teamDOList = teamDaoManager.listAll();
            }
            return teamDOList;
        }, listTeamByNameDTO);
        return CommonUtils.convertPageBO(teamDOPageBO, teamDO -> {
            TeamVO teamVO = CommonUtils.newInstance(teamDO, TeamVO.class);
            UserDO userDO = userDaoManager.getById(teamDO.getTeamLeaderId());
            if (userDO != null) {
                String userName = userDO.getUserName();
                if (CommonUtils.isNotBlank(userName)) {
                    teamVO.setTeamLeaderName(userName);
                }
            }
            DeptDO deptDO = deptDaoManager.getById(teamDO.getTeamDeptId());
            if (deptDO != null) {
                String deptName = deptDO.getDeptName();
                if (CommonUtils.isNotBlank(deptName)) {
                    teamVO.setTeamDeptName(deptName);
                }
            }
            return teamVO;
        });

    }


    /**
     * 选择团队领导
     *
     * @param teamLeaderDTO
     * @return
     */
    @Override
    public List<LeaderVO> chooseLeader(TeamLeaderDTO teamLeaderDTO) {
        Set<Long> leaderIds = teamDaoManager.listAll().stream().map(TeamDO::getTeamLeaderId).collect(Collectors.toSet());
        List<UserDO> listLeaders = this.userDaoManager.listByIds(leaderIds);
        List<UserDO> leaderDOs = new ArrayList<>();

        if (CommonUtils.isNotBlank(teamLeaderDTO.getCondition())) {
            List<UserDO> leaderByAccount = listLeaders.stream().filter(userDO -> userDO.getUserAccount().contains(teamLeaderDTO.getCondition())).collect(Collectors.toList());
            List<UserDO> leaderByName = listLeaders.stream().filter(userDO -> userDO.getUserName().contains(teamLeaderDTO.getCondition())).collect(Collectors.toList());
            List<UserDO> leaderByMobileNo = listLeaders.stream().filter(userDO -> userDO.getMobileNo().contains(teamLeaderDTO.getCondition())).collect(Collectors.toList());
            leaderDOs = Stream.of(leaderByAccount, leaderByName, leaderByMobileNo).flatMap(Collection::stream).distinct().collect(Collectors.toList());
        } else {
            leaderDOs = this.userDaoManager.listByIds(leaderIds);
        }
        return CommonUtils.collection2List(leaderDOs, leaderDO -> {
            LeaderVO leaderVO = CommonUtils.newInstance(leaderDO, LeaderVO.class);

            DeptDO deptDO = deptDaoManager.getById(leaderDO.getDeptId());
            if (deptDO != null) {
                CommonUtils.copyProperties(deptDO, leaderVO);
                leaderVO.setAreaId(deptDO.getAreaId());
                AreaDO areaDO = areaDaoManager.getById(deptDO.getAreaId());
                if (areaDO!=null) {
                    leaderVO.setName(areaDO.getName());
                }
            }

            TeamDO teamDO = teamDaoManager.singleResultByTeamLeaderId(leaderDO.getId());
            if (teamDO != null) {
                leaderVO.setTeamLeaderId(teamDO.getTeamLeaderId());
                leaderVO.setTeamName(teamDO.getTeamName());
                leaderVO.setTeamDesc(teamDO.getTeamDesc());
                leaderVO.setTeamTypeCode(teamDO.getTeamTypeCode());
                List<TeamUserDO> listTeamUsers = teamUserDaoManager.listByTeamId(teamDO.getId());
                List<Long> teamUserIds = listTeamUsers.stream().map(TeamUserDO::getUserId).collect(Collectors.toList());
                leaderVO.setTeamUserIds(teamUserIds);
                return leaderVO;
            }

            return leaderVO;

        });
    }

    /**
     *  查询团队片长信息
     * @param teamLeaderDTO
     * @return
     */
    @Override
    public List<HandleVO> chooseHandle(TeamLeaderDTO teamLeaderDTO) {
        Set<Long> handleIds = teamDaoManager.listAll().stream().map(TeamDO::getTeamHandleId).collect(Collectors.toSet());
        List<UserDO> listHandle = this.userDaoManager.listByIds(handleIds);
        List<UserDO> handleDOs = new ArrayList<>();

        if (CommonUtils.isNotBlank(teamLeaderDTO.getCondition())) {
            List<UserDO> handleByAccount = listHandle.stream().filter(userDO -> userDO.getUserAccount().contains(teamLeaderDTO.getCondition())).collect(Collectors.toList());
            List<UserDO> handleByName = listHandle.stream().filter(userDO -> userDO.getUserName().contains(teamLeaderDTO.getCondition())).collect(Collectors.toList());
            List<UserDO> handleByMobileNo = listHandle.stream().filter(userDO -> userDO.getMobileNo().contains(teamLeaderDTO.getCondition())).collect(Collectors.toList());
            handleDOs = Stream.of(handleByAccount, handleByName, handleByMobileNo).flatMap(Collection::stream).distinct().collect(Collectors.toList());
        } else {
            handleDOs = this.userDaoManager.listByIds(handleIds);
        }
        return CommonUtils.collection2List(handleDOs, handleDO->{
            HandleVO handleVO = CommonUtils.newInstance(handleDO, HandleVO.class);
            handleVO.setTeamLeaderId(handleDO.getId());
            return handleVO;
        });

    }


    /**
     * 根据条件搜索团队
     *
     * @param queryTeamConditionDTO
     * @return
     */
    @Override
    public List<TeamVO> listTeamsByCondition(QueryTeamConditionDTO queryTeamConditionDTO) {

        List<QueryItemDTO> condition = new ArrayList<>();

        if (queryTeamConditionDTO.getDeptId() != null) {
            condition.add(DaoUtils.buildEqualTo(TeamDO.DB_TEAM_DEPT_ID, queryTeamConditionDTO.getDeptId()));
        }

        if (CommonUtils.isNotBlank(queryTeamConditionDTO.getTeamName())) {
            condition.add(DaoUtils.buildLike(TeamDO.DB_TEAM_NAME, "%" + queryTeamConditionDTO.getTeamName() + "%"));
        }

        if (CommonUtils.isNotBlank(queryTeamConditionDTO.getTeamTypeCode())) {
            condition.add(DaoUtils.buildLike(TeamDO.DB_TEAM_TYPE_CODE, "%" + queryTeamConditionDTO.getTeamTypeCode() + "%"));
        }

        if (queryTeamConditionDTO.getStartTime() != null) {
            condition.add(DaoUtils.buildGreaterThenOrEqualTo(TeamDO.DB_GMT_CREATE, new Date(queryTeamConditionDTO.getStartTime())));
        }

        if (queryTeamConditionDTO.getEndTime() != null) {
            condition.add(DaoUtils.buildLessThenOrEqualTo(TeamDO.DB_GMT_CREATE, new Date(queryTeamConditionDTO.getEndTime())));
        }

        List<TeamDO> teamDOS = teamDaoManager.listByQueryItems(condition);


        return CommonUtils.collection2List(teamDOS, teamDO -> {
            TeamVO teamVO = CommonUtils.newInstance(teamDO, TeamVO.class);
            UserDO userDaoManagerById = userDaoManager.getById(teamDO.getTeamLeaderId());
            if (userDaoManagerById!=null){
                teamVO.setTeamLeaderName(userDaoManagerById.getUserName());
            }
            teamVO.setTeamDeptName(deptDaoManager.getById(teamDO.getTeamDeptId()).getDeptName());
            return teamVO;
        });

    }

    /**
     * 根据部门编号和团队类型查询团队列表(分页查询)
     *
     * @param queryTeamConditionPageDTO
     * @return
     */
    @Override
    public PageBO<TeamVO> listTeamsByConditionPage(QueryTeamConditionPageDTO queryTeamConditionPageDTO) {
        List<QueryItemDTO> condition = new ArrayList<>();
        PageBO<TeamDO> teamDOPageBO = DaoUtils.listDOByPage(() -> {
            if (queryTeamConditionPageDTO.getDeptId() != null) {
                condition.add(DaoUtils.buildEqualTo(TeamDO.DB_TEAM_DEPT_ID, queryTeamConditionPageDTO.getDeptId()));
            }

            if (CommonUtils.isNotBlank(queryTeamConditionPageDTO.getTeamName())) {
                condition.add(DaoUtils.buildLike(TeamDO.DB_TEAM_NAME, "%" + queryTeamConditionPageDTO.getTeamName() + "%"));
            }

            if (CommonUtils.isNotBlank(queryTeamConditionPageDTO.getTeamTypeCode())) {
                condition.add(DaoUtils.buildLike(TeamDO.DB_TEAM_TYPE_CODE, "%" + queryTeamConditionPageDTO.getTeamTypeCode() + "%"));
            }

            if (queryTeamConditionPageDTO.getStartTime() != null) {
                condition.add(DaoUtils.buildGreaterThenOrEqualTo(TeamDO.DB_GMT_CREATE, new Date(queryTeamConditionPageDTO.getStartTime())));
            }

            if (queryTeamConditionPageDTO.getEndTime() != null) {
                condition.add(DaoUtils.buildLessThenOrEqualTo(TeamDO.DB_GMT_CREATE, new Date(queryTeamConditionPageDTO.getEndTime())));
            }

            return teamDaoManager.listByQueryItems(condition);
        }, queryTeamConditionPageDTO);

        return CommonUtils.convertPageBO(teamDOPageBO, teamDO -> {
            TeamVO teamVO = CommonUtils.newInstance(teamDO, TeamVO.class);
            UserDO userDaoManagerById = userDaoManager.getById(teamDO.getTeamLeaderId());
            if (userDaoManagerById!=null){
                teamVO.setTeamLeaderName(userDaoManagerById.getUserName());
            }
            teamVO.setTeamDeptName(deptDaoManager.getById(teamDO.getTeamDeptId()).getDeptName());
            return teamVO;
        });
    }

    @Override
    public List<TeamVO> getTeamByTeamName(TeamNameDTO teamNameDTO) {

        List<TeamDO> listTeamDO = new ArrayList<>();
        if (CommonUtils.isNotBlank(teamNameDTO.getTeamName())) {

            listTeamDO = this.teamDaoManager.listByQueryItems(DaoUtils.buildLike(TeamDO.DB_TEAM_NAME, "%" + teamNameDTO.getTeamName() + "%"));
//            listTeamDO = teamDaoManager.listByTeamName(teamNameDTO.getTeamName()).stream().filter(teamDO -> teamDO.getTeamName().contains(teamNameDTO.getTeamName())).collect(Collectors.toList());

        } else {
            listTeamDO = this.teamDaoManager.listAll();
        }
        return CommonUtils.collection2List(listTeamDO, teamDO -> {
            TeamVO teamVO = CommonUtils.newInstance(teamDO, TeamVO.class);
            teamVO.setTeamLeaderName(userDaoManager.getById(teamDO.getId()).getUserName());
            teamVO.setTeamDeptName(deptDaoManager.getById(teamDO.getTeamDeptId()).getDeptName());
            return teamVO;
        });

    }

}


