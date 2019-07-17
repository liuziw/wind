package com.lzw.wind.tibmas.webapi.web.controller;

import com.lzw.common.core.bo.PageBO;
import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.core.vo.ResponseVO;
import com.lzw.common.core.web.controller.BaseController;
import com.lzw.wind.tibmas.core.bo.TeamDetailsBO;
import com.lzw.wind.tibmas.core.dto.*;
import com.lzw.wind.tibmas.core.service.TeamService;
import com.lzw.wind.tibmas.core.vo.HandleVO;
import com.lzw.wind.tibmas.core.vo.LeaderVO;
import com.lzw.wind.tibmas.core.vo.TeamVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;


@RestController
@RequestMapping("/api/v1.0/team")
@Api(value = "TeamController", description = "团队管理API")
public class TeamController extends BaseController {

    @Autowired
    private TeamService teamService;

    @ApiOperation("新建团队")
    @RequestMapping(value = "addTeam", method = RequestMethod.POST)
    public ResponseVO<Integer> addTeam(@RequestBody TeamDTO teamDTO) {
        return CommonUtils.okResponseVO(teamService.addTeam(teamDTO));
    }

    @ApiOperation("删除团队")
    @RequestMapping(value = "deleteTeam", method = RequestMethod.POST)
    public ResponseVO<Integer> deleteTeam(@RequestBody CommonIdDTO commonIdDTO) {
        return CommonUtils.okResponseVO(teamService.deleteTeamById(commonIdDTO));
    }

    @ApiOperation("根据ID修改团队")
    @RequestMapping(value = "updateTeam" +
            "", method = RequestMethod.POST)
    public ResponseVO<Integer> updateTeam(@RequestBody UpdateTeamDTO updateTeamDTO) {
        return CommonUtils.okResponseVO(teamService.updateTeamById(updateTeamDTO));
    }

    @ApiOperation("根据ID查询某个团队详情")
    @RequestMapping(value = "getTeamById", method = RequestMethod.POST)
    public ResponseVO<TeamDetailsBO> getTeamById(@RequestBody CommonIdDTO commonIdDTO) {
        return CommonUtils.okResponseVO(teamService.getTeamById(commonIdDTO));
    }

    @ApiOperation("所有团队列表")
    @RequestMapping(value = "listTeams", method = RequestMethod.POST)
    public ResponseVO<PageBO<TeamVO>> listTeams(@RequestBody ListTeamByNameDTO listTeamByNameDTO) {
        return CommonUtils.okResponseVO(teamService.listTeams(listTeamByNameDTO));
    }

    @ApiOperation("查询团队领导")
    @RequestMapping(value = "getTeamLeader", method = RequestMethod.POST)
    public ResponseVO<List<LeaderVO>> getTeamLeader(@RequestBody TeamLeaderDTO teamLeaderDTO) {
        return CommonUtils.okResponseVO(teamService.chooseLeader(teamLeaderDTO));
    }

    @ApiOperation("查询团队片长")
    @RequestMapping(value = "getTeamHandle", method = RequestMethod.POST)
    public ResponseVO<List<HandleVO>> getTeamHandle(@RequestBody TeamLeaderDTO teamLeaderDTO) {
        return CommonUtils.okResponseVO(teamService.chooseHandle(teamLeaderDTO));
    }

    @ApiOperation("根据部门id和团队类型编码查询团队列表")
    @RequestMapping(value = "listTeamsByCondition", method = RequestMethod.POST)
    public ResponseVO<List<TeamVO>> listTeamsByCondition(@RequestBody QueryTeamConditionDTO queryTeamConditionDTO) {
        return CommonUtils.okResponseVO(teamService.listTeamsByCondition(queryTeamConditionDTO));
    }

    @ApiOperation("根据部门id和团队类型编码查询团队列表(分页查询)")
    @RequestMapping(value = "listTeamsByConditionPage", method = RequestMethod.POST)
    public ResponseVO<PageBO<TeamVO>> listTeamsByConditionPage(@RequestBody QueryTeamConditionPageDTO queryTeamConditionPageDTO) {
        return CommonUtils.okResponseVO(teamService.listTeamsByConditionPage(queryTeamConditionPageDTO));
    }

    @ApiOperation("根据部门id和团队类型编码查询团队列表")
    @RequestMapping(value = "listTeamsByDeptIdAndTeamTypeCodePathVar/{teamTypeCode}", method = RequestMethod.POST)
    public ResponseVO<List<TeamVO>> listTeamsByDeptIdAndTeamTypeCodePathVar(@PathVariable("teamTypeCode") String teamTypeCode, @RequestHeader(value = "X-UserId") Long userId) {
        QueryTeamConditionDTO queryTeamConditionDTO = new QueryTeamConditionDTO();
//        Tibmas2RedisUserInfoBO userInfo = tibmas2RedisManager.getUserInfo(userId);
//        if (null == userInfo) {
//            throw CommonException.exception(CommonErrorCode.USER_NOT_FOUND, "该用户不存在");
//        }
//        queryTeamConditionDTO.setDeptId(userInfo.getDeptId());
        queryTeamConditionDTO.setDeptId(51L);
        return CommonUtils.okResponseVO(teamService.listTeamsByCondition(queryTeamConditionDTO));
    }

    @ApiIgnore
    @ApiOperation("根据团队名称查询团队列表")
    @RequestMapping(value = "getTeamByTeamName", method = RequestMethod.POST)
    public ResponseVO<List<TeamVO>> getTeamByTeamName(@RequestBody TeamNameDTO teamNameDTO) {
        return CommonUtils.okResponseVO(teamService.getTeamByTeamName(teamNameDTO));
    }
}
