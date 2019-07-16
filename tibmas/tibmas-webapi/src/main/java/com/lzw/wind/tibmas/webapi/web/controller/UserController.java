package com.lzw.wind.tibmas.webapi.web.controller;

import com.hyzs.gz.common.core.bo.PageBO;
import com.hyzs.gz.common.core.exception.CommonErrorCode;
import com.hyzs.gz.common.core.exception.CommonException;
import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.gz.common.core.vo.ResponseVO;
import com.hyzs.gz.common.core.web.controller.BaseController;
import com.hyzs.gz.common.dao.dto.IdDTO;
import com.hyzs.tibmas.core.bo.TibmasUserBO;
import com.hyzs.tibmas.core.bo.UserAppBO;
import com.hyzs.tibmas.core.bo.UserDeptBO;
import com.hyzs.tibmas.core.dbo.PermDO;
import com.hyzs.tibmas.core.dto.*;
import com.hyzs.tibmas.core.service.UserService;
import com.hyzs.tibmas.core.util.EncryptUtils;
import com.hyzs.tibmas.core.vo.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kjtang on 2018/3/15 0015.
 */
@RestController
@RequestMapping(value = {"/api/v1.0/user"})
@Api(value = "UserController", description = "用户管理API")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;


    @ApiOperation("通过用户id和应用Id查询用户拥有的菜单")
    @RequestMapping(value = "/listOwnerMenus", method = RequestMethod.POST)
    public ResponseVO<List<PermTreeVO>> listOwnerMenus(@RequestBody ListOwnerMenusDTO listOwnerMenusDTO) {
        return CommonUtils.okResponseVO(userService.listOwnerMenus(listOwnerMenusDTO));
    }

    @ApiOperation("通过用户Id和应用Id查询用户拥有的权限 ")
    @RequestMapping(value = "/listOwnerPerms", method = RequestMethod.POST)
    public ResponseVO<List<PermDO>> listOwnerPerms(@RequestBody ListOwnerMenusDTO listOwnerMenusDTO) {
        return CommonUtils.okResponseVO(userService.listOwnerPerms(listOwnerMenusDTO));
    }

    @ApiOperation("通过用户Id查询用户的详细信息 ")
    @RequestMapping(value = "/getUserDetailsById", method = RequestMethod.POST)
    public ResponseVO<UserDetailsVO> getUserDetailsById(@RequestBody IdDTO<Long> dto) {
        UserDetailsVO userDetailsVO = userService.getUserByUserId(dto.getId());
        return CommonUtils.okResponseVO(userDetailsVO);
    }

    @ApiOperation("通过用户Id查询用户的详细信息 ")
    @RequestMapping(value = "/getUserByOpenId", method = RequestMethod.POST)
    public ResponseVO<UserDetailsVO> getUserByOpenId(@RequestBody OpenIdDTO dto) {
        UserDetailsVO userDetailsVO = userService.getUserByOpenId(dto);
        return CommonUtils.okResponseVO(userDetailsVO);
    }

    @ApiOperation("通过Id查询用户注册的详细信息 ")
    @RequestMapping(value = "/getUserRegisterDetailsById", method = RequestMethod.POST)
    public ResponseVO<UserRegisterDetailVO> getUserRegisterDetailsById(@RequestBody IdDTO<Long> dto) {
        UserRegisterDetailVO userRegisterDetailVO = userService.getUserRegisterDetailsById(dto);
        return CommonUtils.okResponseVO(userRegisterDetailVO);
    }

    @ApiOperation("根据用户账号和密码得到用户信息")
    @RequestMapping(value = "/getUserByAccountAndPassword", method = RequestMethod.POST)
    public ResponseVO<UserDetailsVO> getUserByAccountAndPassword(@RequestBody QueryUserDTO dto) {
        UserDetailsVO userDetailsVO = userService.getUserByAccountAndPassword(dto);
        return CommonUtils.okResponseVO(userDetailsVO);
    }

    @ApiOperation("小程序登录")
    @RequestMapping(value = "/miniProgremLogin", method = RequestMethod.POST)
    public ResponseVO<Integer> miniProgremLogin(@RequestBody MiniProgremLoginDTO dto) {
        return CommonUtils.okResponseVO(userService.miniProgremLogin(dto));
    }

    @ApiOperation("小程序退出登录")
    @RequestMapping(value = "/miniProgremLogout", method = RequestMethod.POST)
    public ResponseVO<Integer> miniProgremLogout(@RequestBody MiniProgremLogoutDTO dto) {
        return CommonUtils.okResponseVO(userService.miniProgremLogout(dto));
    }

    @ApiOperation("删除用户信息 ")
    @RequestMapping(value = "/deleteById", method = RequestMethod.POST)
    public ResponseVO<Integer> deleteById(@RequestBody IdDTO<Long> idDTO) {
        return CommonUtils.okResponseVO(userService.deleteById(idDTO.getId()));
    }

    @ApiOperation("更新用户信息 ")
    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    public ResponseVO<Integer> updateById(@RequestBody UpdateUserDTO dto) {
        return CommonUtils.okResponseVO(userService.updateById(dto));
    }


    @ApiOperation("用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseVO<Integer> register(@RequestBody AddUserDTO dto) {
        if (dto.getUserPassword() == null) {
            dto.setUserPassword(EncryptUtils.encryptByMD5(EncryptUtils.encryptByMD5("12345678").toLowerCase()));
        }
        return CommonUtils.okResponseVO(userService.register(dto));
    }


    @ApiOperation("新增用户信息 ")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseVO<Integer> insert(@RequestBody AddUserDTO dto) {
        if (dto.getUserPassword() == null) {
            dto.setUserPassword(EncryptUtils.encryptByMD5(EncryptUtils.encryptByMD5("12345678")));
        }
        return CommonUtils.okResponseVO(userService.insert(dto));
    }

    @ApiOperation("查询用户列表 ")
    @RequestMapping(value = "/listQuery", method = RequestMethod.POST)
    public ResponseVO<PageBO<TibmasUserBO>> listQuery(@RequestBody ListQueryUserDTO listQueryUserDTO) {
        return CommonUtils.okResponseVO(userService.listQuery(listQueryUserDTO));
    }

    @ApiOperation("根据关键字查询用户 ")
    @RequestMapping(value = "/listUserByKeyWords", method = RequestMethod.POST)
    public ResponseVO<List<UserDeptBO>> listUserByKeyWords(@RequestBody UserByKeyWordsDTO dto) {
        return CommonUtils.okResponseVO(userService.listUserByKeyWords(dto));
    }

    @ApiOperation("查询注册用户用户列表 ")
    @RequestMapping(value = "/listQueryUserRegister", method = RequestMethod.POST)
    public ResponseVO<PageBO<UserRegisterVO>> listQueryUserRegister(@RequestBody ListQueryUserDTO listQueryUserDTO) {
        return CommonUtils.okResponseVO(userService.listQueryUserRegister(listQueryUserDTO));
    }

    @ApiOperation("用户分配角色")
    @RequestMapping(value = "/grantRolesToUser", method = RequestMethod.POST)
    public ResponseVO<Integer> grantRolesToUser(@RequestBody GrantRolesToUserDTO grantRolesToUserDTO) {
        return CommonUtils.okResponseVO(userService.grantRolesToUser(grantRolesToUserDTO));
    }

    @ApiOperation("重置用户密码")
    @RequestMapping(value = "/resetPassword", method = RequestMethod.POST)
    public ResponseVO<Integer> resetPassword(@RequestBody ResetPasswordDTO resetPasswordDTO) {
        return CommonUtils.okResponseVO(userService.resetPassword(resetPasswordDTO));
    }

    @ApiOperation("根据用户查询角色信息，返回所有的角色信息,包含用户对应的角色id")
    @RequestMapping(value = "listRoleTreeWithSelectForRoleUpdate", method = RequestMethod.POST)
    public ResponseVO<AppRoleTreeVO> listRoleTreeWithSelectForRoleUpdate(@RequestBody IdDTO<Long> dto) {
        if (dto == null || dto.getId() == null) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "id不能为空");
        }
        return CommonUtils.okResponseVO(this.userService.listRoleTreeWithSelectForRoleUpdate(dto));
    }

    @ApiOperation("禁用/启用用户")
    @RequestMapping(value = "/disabledUser", method = RequestMethod.POST)
    public ResponseVO<Boolean> disabledUser(@RequestBody IdDTO<Long> dto) {
        return CommonUtils.okResponseVO(userService.disabledUser(dto));
    }

    @ApiOperation("根据userId和应用appId返回菜单树和权限")
    @RequestMapping(value = "/getMenuByUserIdAndAppId", method = RequestMethod.POST)
    public ResponseVO<UserAppBO> getMenuByUserIdAndAppId(@RequestBody UserAndAppIDDTO dto){
        return CommonUtils.okResponseVO(userService.getMenuByUserIdAndAppId(dto));
    }

    @ApiOperation("解锁用户（包括登录失败多次后的锁定和账号过期）")
    @RequestMapping(value = "/unlock", method = RequestMethod.POST)
    public ResponseVO<Integer> unlock(@RequestBody IdDTO<Long> dto) {
        return CommonUtils.okResponseVO(userService.unlock(dto.getId()));
    }

    /**
     * 查询用户信息，用户选择框组件专用
     * @param pageListUserInfoForComponentDTO
     * @return
     */
    @ApiOperation("查询用户信息，用户选择框组件专用")
    @RequestMapping(value = "/pageListUserInfoForComponent", method = RequestMethod.POST)
    public ResponseVO<PageBO<PageListUserInfoForComponentVO>> pageListUserInfoForComponent(@RequestBody  PageListUserInfoForComponentDTO pageListUserInfoForComponentDTO){
        if(pageListUserInfoForComponentDTO==null){
            throw CommonException.paramException("pageListUserInfoForComponentDTO不能为空");
        }

        return CommonUtils.okResponseVO(this.userService.pageListUserInfoForComponent(pageListUserInfoForComponentDTO));
    }

    @ApiOperation("根据部门ID和角色编码查询人员集合")
    @RequestMapping(value = "/listAreaUserByDeptIdAndRoleCode", method = RequestMethod.POST)
    public ResponseVO<List<AreaUserVO>> listAreaUserByDeptIdAndRoleCode(@RequestBody ListAreaUserByDeptIdAndRoleCodeDTO listAreaUserByDeptIdAndRoleCodeDTO) {
        return CommonUtils.okResponseVO(userService.listAreaUserByDeptIdAndRoleCode(listAreaUserByDeptIdAndRoleCodeDTO));
    }

}
