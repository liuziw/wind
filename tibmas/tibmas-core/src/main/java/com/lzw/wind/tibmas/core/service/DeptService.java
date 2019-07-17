package com.lzw.wind.tibmas.core.service;

import com.lzw.common.dao.dto.IdDTO;
import com.lzw.wind.tibmas.core.bo.DeptDetailsBO;
import com.lzw.wind.tibmas.core.dto.*;
import com.lzw.wind.tibmas.core.vo.*;

import java.util.List;

/**
 * Created by kjtang on 2018/3/15 0015.
 */
 public interface DeptService {

    /**
     * 新增部门信息
     * @param dto
     * @return
     */
    AddDeptVO insert(AddDeptDTO dto);

    /**
     * 更新部门信息
     * @param dto
     * @return
     */
     Integer updateById(UpdateDeptDTO dto);

    /**
     * 删除部门
     * @param id
     * @return
     */
     Integer deleteById(Long id);

    /**
     * 批量删除部门信息
     * @param ids
     * @return
     */
     Integer deleteByIds(List<Long> ids);


    /**
     *为部门分配角色
     */
     Integer grantRolesToDept(GrantRolesToDeptDTO grantRolesToDeptDTO);


    /**
     * 根据部门查询角色树信息，返回所有的角色信息
     * @param dto
     * @return
     */
    AppRoleTreeVO listRoleForUpdate(IdDTO<Long> dto);

    /**
     * 得到部门详细信息
     * @param id
     * @return
     */
     DeptDetailsBO getDeptDetailsById(Long id);

    /**
     * 返回部门类型
     * @return
     */
    List<SelectTreeVO> listDeptType();

    /**
     * 根据部门名称查询机构列表
     * 
     * @param dto
     * @return 直属下级机构列表
     */
	List<DeptTreeVO> listDeptByName(ListDeptDTO dto);

    /**
     * 根据pid查询部门列表
     * @param dto
     * @return
     */
    List<DeptTreeVO> listDeptById(IdDTO<Long> dto);

    /**
     * 部门用户树异步请求的接口，通过id返回该部门下的用户及子部门，只返回一级
     * @param idDTO
     * @return
     */
    List<DeptUserTreeVO> listDeptUserById(IdDTO<Long> idDTO);

    /**
     * 根据用户ids得到用户所在部门树
     * @param idsDTO
     * @return
     */
    List<DeptUserTreeVO> listDeptUserByUserIds(IdsDTO<Long> idsDTO);

    /**
     * 根据部门id找到该部门及其子部门下所有人员
     * <pre>
     *     1.先找到该部门及其子部门
     *     2.再找这些部门下的人员
     * </pre>
     * @param dto
     * @return
     */
    List<UsersByDeptIdVO> listUserByDeptId(IdDTO<Long> dto);


    /**
     * 根据部门ID获取该部门下的成员信息，按团队分组
     * @param listUserByDeptAndTeamTypeDTO
     * @return
     */
    List<ListUserByDeptAndTeamTypeVO> listUserByDeptAndTeamType(ListUserByDeptAndTeamTypeDTO listUserByDeptAndTeamTypeDTO);

}