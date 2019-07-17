package com.lzw.wind.tibmas.webapi.web.controller;

import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.core.vo.ResponseVO;
import com.lzw.common.core.web.controller.BaseController;
import com.lzw.wind.tibmas.core.dto.CommonIdDTO;
import com.lzw.wind.tibmas.core.dto.CommonOperationDTO;
import com.lzw.wind.tibmas.core.dto.DeleteUsersFromTeamDTO;
import com.lzw.wind.tibmas.core.dto.TeamAndUserDTO;
import com.lzw.wind.tibmas.core.service.TeamAndUserService;
import com.lzw.wind.tibmas.core.vo.TeamUserVO;
import com.lzw.wind.tibmas.core.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@RestController
@RequestMapping("api/v1.0/teamAndUser")
@Api(value = "TeamAndUserController",description = "团队用户关联管理")
@ApiIgnore
public class TeamAndUserController extends BaseController {

    @Autowired
    TeamAndUserService teamAndUserService;

    @ApiOperation("团队中新增成员")
    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public ResponseVO<Integer> insert(@RequestBody TeamAndUserDTO teamAndUserDTO) {
        return CommonUtils.okResponseVO(teamAndUserService.addUserToTeam(teamAndUserDTO));
    }

    @ApiOperation("删除团队中的成员")
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    public ResponseVO<Integer> delete(@RequestBody CommonOperationDTO commonOperationDTO) {
        return CommonUtils.okResponseVO(teamAndUserService.deleteUserFromTeamByUserId(commonOperationDTO));
    }

    @ApiOperation("根据id查看团队中的成员")
    @RequestMapping(value = "getUserByUserId",method = RequestMethod.POST)
    public ResponseVO<UserVO> getUser(@RequestBody CommonIdDTO id) {
        return CommonUtils.okResponseVO(teamAndUserService.getUserByUserId(id));
    }

    @ApiOperation("根据团队id获取团队中的所有成员")
    @RequestMapping(value = "getUsersByTeamId",method = RequestMethod.POST)
    public ResponseVO<List<TeamUserVO>> getUers(@RequestBody CommonIdDTO id) {
        return CommonUtils.okResponseVO(teamAndUserService.getUsersByTeamId(id));
    }

    @ApiOperation("根据团队id批量删除")
    @RequestMapping(value = "deleteUsersByTeamId",method = RequestMethod.POST)
    public ResponseVO<Integer> deleteUers(@RequestBody DeleteUsersFromTeamDTO deleteUsersFromTeamDTO) {
        return CommonUtils.okResponseVO(teamAndUserService.deleteUserByUserIds(deleteUsersFromTeamDTO));
    }

    @ApiOperation("批量新增")
    @RequestMapping(value = "insertUsers",method = RequestMethod.POST)
    public ResponseVO<Integer> insertUsers(@RequestBody List<TeamAndUserDTO> teamAndUserDTOS) {
        return CommonUtils.okResponseVO(teamAndUserService.addUsers(teamAndUserDTOS));
    }
}
