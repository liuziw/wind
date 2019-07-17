package com.lzw.wind.tibmas.webapi.web.controller;

import com.lzw.common.core.bo.PageBO;
import com.lzw.common.core.exception.CommonErrorCode;
import com.lzw.common.core.exception.CommonException;
import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.core.vo.ResponseVO;
import com.lzw.common.core.web.controller.BaseController;
import com.lzw.common.dao.dto.IdDTO;
import com.lzw.wind.tibmas.core.bo.RoleBO;
import com.lzw.wind.tibmas.core.bo.RoleDetailsBO;
import com.lzw.wind.tibmas.core.bo.TibmasRoleBO;
import com.lzw.wind.tibmas.core.dto.*;
import com.lzw.wind.tibmas.core.enums.RoleTypeEnum;
import com.lzw.wind.tibmas.core.service.PermService;
import com.lzw.wind.tibmas.core.service.RoleService;
import com.lzw.wind.tibmas.core.vo.PageListRoleInfoForComponentVO;
import com.lzw.wind.tibmas.core.vo.RoleTypeVO;
import com.lzw.wind.tibmas.core.vo.TreeWithSelectedVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kjtang on 2018/3/16 0016.
 */
@RestController
@RequestMapping(value = {"/api/v1.0/role"})
@Api(value = "RoleController", description = "角色管理API")
public class RoleController extends BaseController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private PermService permService;

    @ApiOperation("新增角色信息 ")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseVO<Integer> insert(@RequestBody AddRoleDTO dto) {
        return CommonUtils.okResponseVO(roleService.insert(dto));
    }

    @ApiOperation("批量删除角色信息 ")
    @RequestMapping(value = "/deleteByIds", method = RequestMethod.POST)
    public ResponseVO<Integer> deleteByIds(@RequestBody IdsDTO<Long> idsDTO) {
        return CommonUtils.okResponseVO(roleService.deleteByIds(idsDTO.getIds()));
    }

    @ApiOperation("删除角色信息 ")
    @RequestMapping(value = "/deleteById", method = RequestMethod.POST)
    public ResponseVO<Integer> deleteById(@RequestBody IdDTO<Long> idDTO) {
        return CommonUtils.okResponseVO(roleService.deleteById(idDTO.getId()));
    }

    @ApiOperation("修改角色信息 ")
    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    public ResponseVO<Integer> updateById(@RequestBody UpdateRoleDTO dto) {
        return CommonUtils.okResponseVO(roleService.updateById(dto));
    }

    @ApiOperation("根据id查询角色信息 ")
    @RequestMapping(value = "/getById", method = RequestMethod.POST)
    public ResponseVO<TibmasRoleBO> getById(@RequestBody IdDTO<Long> idDTO) {
        return CommonUtils.okResponseVO(roleService.getById(idDTO.getId()));
    }

    @ApiOperation("查询角色列表")
    @RequestMapping(value = "/listQuery", method = RequestMethod.POST)
    public ResponseVO<PageBO<RoleBO>> listQuery(@RequestBody ListQueryRoleDTO listQueryRoleDTO) {
        PageBO<RoleBO> roleBOPageBO = roleService.listQuery(listQueryRoleDTO);
        return CommonUtils.okResponseVO(roleBOPageBO);
    }

    @ApiOperation("为角色分配权限 ")
    @RequestMapping(value = "/grantPermsToRole", method = RequestMethod.POST)
    public ResponseVO<Integer> grantPermsToRole(@RequestBody GrantPermsToRoleDTO grantPermsToRoleDTO) {
        return CommonUtils.okResponseVO(roleService.grantPermsToRole(grantPermsToRoleDTO));
    }

    @ApiOperation("查询应用程序所对应的权限,包含角色已有的权限")
    @RequestMapping(value = "listPermTreeWithSelectForRoleUpdate", method = RequestMethod.POST)
    public ResponseVO<TreeWithSelectedVO> listPermTreeWithSelectForRoleUpdate(@RequestBody RoleAndAppIDDTO dto) {
        if (dto == null ||
                dto.getRoleId() == null ||
                dto.getAppId() == null) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "roleid/appId不能为空");
        }
        return CommonUtils.okResponseVO(this.permService.listPermTreeWithSelectForRoleUpdate(dto));
    }

    @ApiOperation("返回角色类型")
    @RequestMapping(value = "listRoleType", method = RequestMethod.POST)
    public ResponseVO<List<RoleTypeVO>> listRoleType() {
        List<RoleTypeVO> roleTypeVOS = new ArrayList<>();
        for (RoleTypeEnum roleTypeEnum : RoleTypeEnum.values()) {
            RoleTypeVO roleTypeVO = CommonUtils.newInstance(roleTypeEnum, RoleTypeVO.class);
            roleTypeVOS.add(roleTypeVO);
        }
        return CommonUtils.okResponseVO(roleTypeVOS);
    }

    @ApiOperation("得到角色详细信息")
    @RequestMapping(value = "/getRoleDetailsById", method = RequestMethod.POST)
    public ResponseVO<RoleDetailsBO> getRoleDetailsById(@RequestBody IdDTO<Long> dto) {
        if (dto == null) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "roleid不能为空");
        }
        return CommonUtils.okResponseVO(roleService.getRoleDetailsById(dto.getId()));
    }

    @ApiOperation("查询角色信息，角色选择框组件专用")
    @RequestMapping(value = "/pageListRoleInfoForComponent", method = RequestMethod.POST)
    public ResponseVO<PageBO<PageListRoleInfoForComponentVO>> pageListRoleInfoForComponent(@RequestBody PageListRoleInfoForComponentDTO pageListRoleInfoForComponentDTO) {
        if (pageListRoleInfoForComponentDTO == null) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "pageListRoleInfoForComponentDTO不能为空");
        }
        return CommonUtils.okResponseVO(roleService.pageListRoleInfoForComponent(pageListRoleInfoForComponentDTO));
    }

}
