package com.lzw.wind.tibmas.webapi.web.controller;

import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.core.vo.ResponseVO;
import com.lzw.common.core.web.controller.BaseController;
import com.lzw.wind.tibmas.core.dto.*;
import com.lzw.wind.tibmas.core.service.TeamUserService;
import com.lzw.wind.tibmas.core.vo.TeamUserVO;
import com.lzw.wind.tibmas.core.vo.UserBasicInfoVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "api/v1.0/teamUser")
@Api(value = "teamUserComtroller", description = "对团队中成员操作的管理")
public class TeamUserController extends BaseController {

    @Autowired
    private TeamUserService teamUserService;

   /* @ApiOperation("团队成员展示")
    @RequestMapping(value = "listTeamUsers", method = RequestMethod.POST)
    public ResponseVO<PageBO<UserBasicInfoVO>> listTeamUsers(@RequestBody ListTeamUsersDTO listTeamUsersDTO) {
        return CommonUtils.okResponseVO(teamUserService.listTeamUserByTeamId(listTeamUsersDTO));
    }*/

    @ApiOperation("对团队中成员操作的管理")
    @RequestMapping(value = "operateTeamUser", method = RequestMethod.POST)
    public ResponseVO<Integer> operateTeamUser(@RequestBody TeamUserIdsDTO teamUserIdsDTO) {
        return CommonUtils.okResponseVO(teamUserService.operateTeamUser(teamUserIdsDTO));
    }

    @ApiOperation("根据团队中成员Id查看其他成员")
    @RequestMapping(value = "listUserByUserId",method = RequestMethod.POST)
    public ResponseVO<List<TeamUserVO>> listUserByUserId(@RequestBody ListOtherUserDTO listOtherUserDTO) {
        return CommonUtils.okResponseVO(teamUserService.listUsersByUserId(listOtherUserDTO));
    }

    @ApiOperation("通过团队Id查看团队中成员，不分页")
    @RequestMapping(value = "listUserByTeamId",method = RequestMethod.POST)
    public ResponseVO<List<UserBasicInfoVO>> listUserByTeamId(@RequestBody TeamIdDTO teamIdDTO) {
        return CommonUtils.okResponseVO(teamUserService.listUserByTeamId(teamIdDTO));
    }


    /**
     * 预制接口
     * 选择协办人的时候进行根据用户名，账号以及电话号码模糊搜索
     * 后期需要该接口直接解注释就ok
     * @param coordinatorDTO
     * @return
     */
   /* @ApiOperation("搜索协办人")
    @RequestMapping(value = "getCoordinator",method = RequestMethod.POST)
    public ResponseVO<List<TeamUserVO>> getCoordinator(@RequestBody CoordinatorDTO coordinatorDTO) {
        return CommonUtils.okResponseVO(teamUserService.getCoordinator(coordinatorDTO));
    }*/
}
