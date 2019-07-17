package com.lzw.wind.tibmas.core.service;

import com.lzw.common.core.bo.PageBO;
import com.lzw.wind.tibmas.core.bo.TeamDetailsBO;
import com.lzw.wind.tibmas.core.dto.*;
import com.lzw.wind.tibmas.core.vo.HandleVO;
import com.lzw.wind.tibmas.core.vo.LeaderVO;
import com.lzw.wind.tibmas.core.vo.TeamVO;

import java.util.List;

public interface TeamService {

    /**
     * 新建团队
     */
    public Integer addTeam(TeamDTO teamDTO);

    /**
     * 根据id删除团队
     * @param commonIdDTO
     * @return
     */
    public Integer deleteTeamById(CommonIdDTO commonIdDTO);

    /**
     *
     * @param updateTeamDTO
     * @return
     */
    public Integer updateTeamById(UpdateTeamDTO updateTeamDTO);

    /**
     *
     * @param commonIdDTO
     * @return
     * 根据id查看团队详情
     */
    public TeamDetailsBO getTeamById(CommonIdDTO commonIdDTO);

    /**
     *
     * @param listTeamByNameDTO
     * @return
     */
    public PageBO<TeamVO> listTeams(ListTeamByNameDTO listTeamByNameDTO);


    /**
     *  查询团队领导信息
     * @param teamLeaderDTO
     * @return
     */
    public List<LeaderVO> chooseLeader(TeamLeaderDTO teamLeaderDTO);

    /**
     *  查询团队片长信息
     * @param teamLeaderDTO
     * @return
     */
    public List<HandleVO> chooseHandle(TeamLeaderDTO teamLeaderDTO);


    /**
     * 根据部门编号和团队类型查询团队列表
     * @param queryTeamConditionDTO
     * @return
     */
    public List<TeamVO> listTeamsByCondition(QueryTeamConditionDTO queryTeamConditionDTO);

    /**
     * 根据部门编号和团队类型查询团队列表(分页查询)
     * @param queryTeamConditionPageDTO
     * @return
     */
    public PageBO<TeamVO> listTeamsByConditionPage(QueryTeamConditionPageDTO queryTeamConditionPageDTO);


    public List<TeamVO> getTeamByTeamName(TeamNameDTO teamNameDTO);
}
