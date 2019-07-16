package com.lzw.wind.tibmas.webapi.web.controller;

import com.hyzs.gz.common.core.exception.CommonErrorCode;
import com.hyzs.gz.common.core.exception.CommonException;
import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.gz.common.core.vo.ResponseVO;
import com.hyzs.gz.common.core.web.controller.BaseController;
import com.hyzs.gz.common.dao.dto.IdDTO;
import com.hyzs.tibmas.core.bo.DeptDetailsBO;
import com.hyzs.tibmas.core.dto.*;
import com.hyzs.tibmas.core.service.DeptService;
import com.hyzs.tibmas.core.vo.*;
import com.hyzs.tibmas2reids.core.manager.Tibmas2RedisManager;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by kjtang on 2018/3/15 0015.
 */
@RestController
@RequestMapping("/api/v1.0/dept")
@Api(value = "DeptController", description = "部门管理API")
public class DeptController extends BaseController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private Tibmas2RedisManager tibmas2RedisManager;

    @ApiOperation("新增部门信息")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseVO<AddDeptVO> insert(@RequestBody AddDeptDTO dto) {
        return CommonUtils.okResponseVO(deptService.insert(dto));
    }

    @ApiOperation("修改部门信息")
    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    public ResponseVO<Integer> updateById(@RequestBody UpdateDeptDTO dto) {
        return CommonUtils.okResponseVO(deptService.updateById(dto));
    }

    @ApiOperation("删除部门信息")
    @RequestMapping(value = "/deleteById", method = RequestMethod.POST)
    public ResponseVO<Integer> deleteById(@RequestBody IdDTO<Long> idDTO) {
        return CommonUtils.okResponseVO(deptService.deleteById(idDTO.getId()));
    }

    @ApiOperation("批量删除部门信息")
    @RequestMapping(value = "/deleteByIds", method = RequestMethod.POST)
    public ResponseVO<Integer> deleteByIds(@RequestBody IdsDTO<Long> idsDTO) {
        return CommonUtils.okResponseVO(deptService.deleteByIds(idsDTO.getIds()));
    }

    @ApiOperation("为部门分配角色")
    @RequestMapping(value = "/grantRolesToDept", method = RequestMethod.POST)
    public ResponseVO<Integer> grantRolesToDept(@RequestBody GrantRolesToDeptDTO grantRolesToDeptDTO) {
        return CommonUtils.okResponseVO(deptService.grantRolesToDept(grantRolesToDeptDTO));
    }

    @ApiOperation("根据部门查询角色树信息，返回所有的角色信息")
    @RequestMapping(value = "listRoleForUpdate", method = RequestMethod.POST)
    public ResponseVO<AppRoleTreeVO> listRoleForUpdate(@RequestBody IdDTO<Long> dto) {
        if (dto == null || dto.getId() == null) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "id不能为空");
        }
        return CommonUtils.okResponseVO(this.deptService.listRoleForUpdate(dto));
    }

    @ApiOperation("得到部门详细信息")
    @RequestMapping(value = "/getDeptDetailsById", method = RequestMethod.POST)
    public ResponseVO<DeptDetailsBO> getDeptDetailsById(@RequestBody IdDTO<Long> dto) {
        return CommonUtils.okResponseVO(deptService.getDeptDetailsById(dto.getId()));

    }

    @ApiOperation("返回部门类型")
    @RequestMapping(value = "/listDeptType", method = RequestMethod.POST)
    public ResponseVO<List<SelectTreeVO>> listDeptType() {
        return CommonUtils.okResponseVO(deptService.listDeptType());
    }

    @ApiOperation("根据名称获取机构列表")
    @RequestMapping(value = "/listDeptByName", method = RequestMethod.POST)
    public ResponseVO<List<DeptTreeVO>> listDeptByName(@RequestBody ListDeptDTO dto) {
        return CommonUtils.okResponseVO(deptService.listDeptByName(dto));

    }

    @ApiOperation("根据pid查询机构列表")
    @RequestMapping(value = "/listDeptById", method = RequestMethod.POST)
    public ResponseVO<List<DeptTreeVO>> listDeptById(@RequestBody IdDTO<Long> dto) {
        return CommonUtils.okResponseVO(deptService.listDeptById(dto));

    }

    @ApiOperation("部门用户树异步请求的接口，通过id返回该部门下的用户及子部门，只返回一级")
    @RequestMapping(value = "/listDeptUserById", method = RequestMethod.POST)
    public ResponseVO<List<DeptUserTreeVO>> listDeptUserById(@RequestBody IdDTO<Long> dto) {
        return CommonUtils.okResponseVO(deptService.listDeptUserById(dto));
    }

    @ApiOperation("根据用户ids得到用户所在部门树")
    @RequestMapping(value = "/listDeptUserByUserIds", method = RequestMethod.POST)
    public ResponseVO<List<DeptUserTreeVO>> listDeptUserByUserIds(@RequestBody IdsDTO<Long> dto) {
        return CommonUtils.okResponseVO(deptService.listDeptUserByUserIds(dto));
    }

    @ApiOperation("根据部门id得到该部门及其子部门下的所有用户")
    @RequestMapping(value = "/listUserByDeptId", method = RequestMethod.POST)
    public ResponseVO<List<UsersByDeptIdVO>> listUserByDeptId(@RequestBody IdDTO<Long> dto) {
        return CommonUtils.okResponseVO(deptService.listUserByDeptId(dto));
    }


    @ApiOperation("根据部门ID查分组人员信息")
    @RequestMapping(value = "/listUserByDeptAndTeamType", method = RequestMethod.POST)
    public ResponseVO<List<ListUserByDeptAndTeamTypeVO>> listUserByDeptAndTeamType(@RequestBody ListUserByDeptAndTeamTypeDTO listUserByDeptAndTeamTypeDTO) {
        return CommonUtils.okResponseVO(deptService.listUserByDeptAndTeamType(listUserByDeptAndTeamTypeDTO));
    }


    @ApiOperation("根据pid查询机构列表")
    @RequestMapping(value = "/listDeptByPid", method = RequestMethod.POST)
    public ResponseVO<List<DeptTreeVO>> listDeptByPid(@RequestBody IdDTO<Long> dto) {
        return CommonUtils.okResponseVO(deptService.listDeptById(dto));

    }

    @ApiOperation("根据部门ID查分组人员信息")
    @RequestMapping(value = "/listUserByDeptAndTeamTypePathVar/{teamTypeCode}", method = RequestMethod.POST)
    public ResponseVO<List<ListUserByDeptAndTeamTypeUserInfoVO>> listUserByDeptAndTeamType(@PathVariable("teamTypeCode") String teamTypeCode, @RequestHeader(value = "X-UserId") Long userId) {

        //TODO
        Set<Long> idSet = new HashSet<>();

        ListUserByDeptAndTeamTypeDTO listUserByDeptAndTeamTypeDTO = new ListUserByDeptAndTeamTypeDTO();
        listUserByDeptAndTeamTypeDTO.setDeptId(51L);
//        Tibmas2RedisUserInfoBO userInfo = tibmas2RedisManager.getUserInfo(userId);
//        if (null == userInfo) {
//            throw CommonException.exception(CommonErrorCode.USER_NOT_FOUND,"该用户不存在");
//        }
//        listUserByDeptAndTeamTypeDTO.setDeptId(userInfo.getDeptId());
        listUserByDeptAndTeamTypeDTO.setTeamTypeCode(teamTypeCode);
        List<ListUserByDeptAndTeamTypeVO> listUserByDeptAndTeamTypeVOS = deptService.listUserByDeptAndTeamType(listUserByDeptAndTeamTypeDTO);
        List<ListUserByDeptAndTeamTypeUserInfoVO> list = new ArrayList<>();
        for (ListUserByDeptAndTeamTypeVO listUserByDeptAndTeamTypeVO : listUserByDeptAndTeamTypeVOS) {
            for (ListUserByDeptAndTeamTypeUserInfoVO listUserByDeptAndTeamTypeUserInfoVO : listUserByDeptAndTeamTypeVO.getUserList()) {
                listUserByDeptAndTeamTypeUserInfoVO.setUserName(listUserByDeptAndTeamTypeUserInfoVO.getUserName() + "-" + listUserByDeptAndTeamTypeVO.getTeamName());
                if (idSet.contains(listUserByDeptAndTeamTypeUserInfoVO.getUserId())) {

                } else {
                    list.add(listUserByDeptAndTeamTypeUserInfoVO);
                    idSet.add(listUserByDeptAndTeamTypeUserInfoVO.getUserId());
                }
            }
        }
        return CommonUtils.okResponseVO(list);
    }
}
