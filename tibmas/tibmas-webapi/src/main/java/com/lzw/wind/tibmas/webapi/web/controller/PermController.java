package com.lzw.wind.tibmas.webapi.web.controller;

import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.core.vo.ResponseVO;
import com.lzw.common.core.web.controller.BaseController;
import com.lzw.common.dao.dto.IdDTO;
import com.lzw.wind.tibmas.core.bo.PermDetailsBO;
import com.lzw.wind.tibmas.core.dbo.PermDO;
import com.lzw.wind.tibmas.core.dto.*;
import com.lzw.wind.tibmas.core.service.PermService;
import com.lzw.wind.tibmas.core.vo.PermTreeVO;
import com.lzw.wind.tibmas.core.vo.TreeVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kjtang on 2018/3/16 0016.
 */
@RestController
@RequestMapping("/api/v1.0/perm")
@Api(value = "PermController", description = "权限管理API")
public class PermController extends BaseController {

    @Autowired
    private PermService permService;

    @ApiOperation("新增权限信息")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseVO<Integer> insert(@RequestBody AddPermDTO dto) {
        return CommonUtils.okResponseVO(permService.insert(dto));
    }

    @ApiOperation("修改权限信息")
    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    public ResponseVO<Integer> updateById(@RequestBody UpdatePermDTO dto) {
        return CommonUtils.okResponseVO(permService.updateById(dto));
    }

    @ApiOperation("删除权限信息")
    @RequestMapping(value = "/deleteById", method = RequestMethod.POST)
    public ResponseVO<Integer> deleteById(@RequestBody IdDTO<Long> idDTO) {
        return CommonUtils.okResponseVO(permService.deleteById(idDTO.getId()));
    }

    @ApiOperation("批量删除权限信息")
    @RequestMapping(value = "/deleteByIds", method = RequestMethod.POST)
    public ResponseVO<Integer> deleteByIds(@RequestBody IdsDTO<Long> idsDTO) {
        return CommonUtils.okResponseVO(permService.deleteByIds(idsDTO.getIds()));
    }

    @ApiOperation("通过Id查询权限详情信息")
    @RequestMapping(value = "/getById", method = RequestMethod.POST)
    public ResponseVO<PermDO> getById(@RequestBody IdDTO<Long> idDTO) {
        return CommonUtils.okResponseVO(permService.getById(idDTO.getId()));
    }

    @ApiOperation("查询所有权限并生成一颗树")
    @RequestMapping(value = "/listAllPermTree", method = RequestMethod.POST)
    public ResponseVO<List<TreeVO>> listAllPermTree() {
        return CommonUtils.okResponseVO(permService.listAllPermTree());
    }

    @ApiOperation("通过条件查询权限并生成一颗树")
    @RequestMapping(value = "/listPermTree", method = RequestMethod.POST)
    public ResponseVO<List<TreeVO>> listPermTree(@RequestBody ListQueryPermDTO listQueryPermDTO) {
        return CommonUtils.okResponseVO(permService.listPermTree(listQueryPermDTO));
    }

    @ApiOperation("通过条件查询权限码")
    @RequestMapping(value = "/listPerCodeByApp", method = RequestMethod.POST)
    public ResponseVO<List<String>> listPerCodeByApp(@RequestBody ListPermCodeDTO listPermCodeDTO) {
        return CommonUtils.okResponseVO(permService.listPermCodeByApp(listPermCodeDTO));
    }

    @ApiOperation("得到权限详细信息")
    @RequestMapping(value = "/getPermDetailsById", method = RequestMethod.POST)
    public ResponseVO<PermDetailsBO> getPermDetailsById(@RequestBody IdDTO<Long> dto) {
        return CommonUtils.okResponseVO(permService.getPermDetailsById(dto.getId()));
    }

    @ApiOperation("通过条件查询权限并生成一颗树table")
    @RequestMapping(value = "/listPermTreeTable", method = RequestMethod.POST)
    public ResponseVO<List<PermTreeVO>> listPermTreeTable(@RequestBody PermTreeDTO permTreeDTO) {
        return CommonUtils.okResponseVO(permService.listPermTreeTable(permTreeDTO));
    }

    @ApiOperation("禁用/启用菜单")
    @RequestMapping(value = "/disablePerm", method = RequestMethod.POST)
    public ResponseVO<Integer> disablePerm(@RequestBody IdDTO<Long> dto) {
        return CommonUtils.okResponseVO(permService.disablePerm(dto));
    }

    @ApiOperation(value = "给权限赋角色")
    @RequestMapping(value = "/grantRolesToPerm", method = RequestMethod.POST)
    public ResponseVO<Integer> grantRolesToPerm(@RequestBody GrantRolesToPermDTO grantRolesToPermDTO) {
        return CommonUtils.okResponseVO(permService.grantRolesToPerm(grantRolesToPermDTO));
    }

}
