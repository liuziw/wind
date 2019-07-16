package com.lzw.wind.tibmas.webapi.web.controller;


import com.google.common.collect.Lists;
import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.gz.common.core.vo.ResponseVO;
import com.hyzs.gz.common.core.web.controller.BaseController;
import com.hyzs.tibmas.core.bo.UserBO;
import com.hyzs.tibmas.core.dto.*;
import com.hyzs.tibmas.core.service.UserService;
import com.hyzs.tibmas.core.vo.UserVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * 流程引擎运行时需要调用的服务
 * @author liys
 * @date 2018/6/149:42
 */
@RestController
public class EliteRuntimeController extends BaseController {



    @Data
    @ApiModel("用户")
    public static class EliteUserBO {

        @ApiModelProperty("用户标识")
        private String userId;

        @ApiModelProperty("用户名称")
        private String userName;

        @ApiModelProperty("用户手机")
        private String phone;

        @ApiModelProperty("邮箱")
        private String email;

    }






    @Autowired
    private UserService userService;

    @RequestMapping(value = "listClosestUserIdByRole/v1.0",method = RequestMethod.POST)
    public ResponseVO<List<Long>> listClosestUserIdByRole(@RequestBody ListClosestUserIdByRoleDTO dto){
        return CommonUtils.okResponseVO(Lists.newArrayList(1L,2L,3L,4L));
    }

    @ApiOperation("根据发起人账号和角色编码找到最近的人员")
    @RequestMapping(value = "listClosestUserByRoles/v1.0",method = RequestMethod.POST)
    public ResponseVO<List<UserVO>> listClosestUserByRoles(@RequestBody ClosestUserByRolesDTO dto){
        return CommonUtils.okResponseVO(userService.listClosestUserByRoles(dto));
    }

    @ApiOperation("根据发起人账号和上级角色编码，部门编码找到最近的人员")
    @RequestMapping(value="/listTaskProcessingUsers/v1.0",method = RequestMethod.POST)
    public ResponseVO<List<String>> listTaskProcessingUsers(@RequestBody ListTaskProcessingUsersDTO listTaskProcessingUsersDTO){

        return CommonUtils.okResponseVO(userService.listTaskProcessingUsers(listTaskProcessingUsersDTO));
    }

    @ApiOperation("查询可执行人员")
    @RequestMapping(value="/listCanDoTaskUsers/v1.0",method = RequestMethod.POST)
    public ResponseVO<List<EliteUserBO>> listCanDoTaskUsers(@RequestBody ListCanDoTaskUsersDTO listCanDoTaskUsersDTO){

        return this.okResponseVO(userService.listCanDoTaskUsers(listCanDoTaskUsersDTO));
    }

    @ApiOperation("查询可执行人员")
    @RequestMapping(value="/listUserInfoByIds/v1.0",method = RequestMethod.POST)
    public ResponseVO<List<EliteUserBO>> listUserInfoByIds(@RequestBody ListUserInfoByIdsDTO listUserInfoByIdsDTO){

        return this.okResponseVO(userService.listUserInfoByIds(listUserInfoByIdsDTO));
    }

    @ApiOperation("查询可执行人员")
    @RequestMapping(value="/listCopyForUsers/v1.0",method = RequestMethod.POST)
    public ResponseVO<List<EliteUserBO>> listCopyForUsers(@RequestBody ListCopyForUsersDTO listCopyForUsersDTO){

        return this.okResponseVO(userService.listCopyForUsers(listCopyForUsersDTO));
    }

    @ApiOperation("查询可执行人员")
    @RequestMapping(value="/listUsersByDeptAndRoleDTO/v1.0",method = RequestMethod.POST)
    public ResponseVO<List<EliteUserBO>> listUsersByDeptAndRoleDTO(@RequestBody ListUsersByDeptAndRoleDTO listUsersByDeptAndRoleDTO){
        return this.okResponseVO(userService.listUsersByDeptAndRoleDTO(listUsersByDeptAndRoleDTO));
    }


    protected ResponseVO<List<EliteUserBO>> okResponseVO(List<UserBO> userBOS){
        return CommonUtils.okResponseVO(CommonUtils.collection2List(userBOS, userBO -> {
            EliteUserBO eliteUserBO=new EliteUserBO();
            eliteUserBO.setEmail(userBO.getEmail());
            eliteUserBO.setPhone(userBO.getMobileNo());
            eliteUserBO.setUserId(userBO.getUserAccount());
            eliteUserBO.setUserName(userBO.getUserName());
            return eliteUserBO;
        }));
    }
}
