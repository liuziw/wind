package com.lzw.wind.tibmas.core.service;

import com.lzw.common.core.bo.PageBO;
import com.lzw.wind.tibmas.core.bo.RoleBO;
import com.lzw.wind.tibmas.core.bo.RoleDetailsBO;
import com.lzw.wind.tibmas.core.bo.TibmasRoleBO;
import com.lzw.wind.tibmas.core.dto.*;
import com.lzw.wind.tibmas.core.vo.PageListRoleInfoForComponentVO;

import java.util.List;

/**
 * Created by kjtang on 2018/3/16 0016.
 */
public interface RoleService {

    /**
     * 新增角色信息
     *
     * @param dto
     * @return
     */
    public Integer insert(AddRoleDTO dto);


    /**
     * 修改角色信息
     *
     * @param dto
     * @return
     */
    public Integer updateById(UpdateRoleDTO dto);

    /**
     * 删除角色信息
     *
     * @param id
     * @return
     */
    public Integer deleteById(Long id);

    /**
     * 批量删除角色信息
     *
     * @param ids
     * @return
     */
    public Integer deleteByIds(List<Long> ids);

    /**
     * 通过Id查询角色的详情信息
     *
     * @param id
     * @return
     */
    public TibmasRoleBO getById(Long id);

    /**
     * 查询角色列表（分页）
     *
     * @param listQueryRoleDTO
     * @return
     */
    public PageBO<RoleBO> listQuery(ListQueryRoleDTO listQueryRoleDTO);


    /**
     * 为角色分配权限
     *
     * @param grantPermsToRoleDTO
     * @return
     */
    public Integer grantPermsToRole(GrantPermsToRoleDTO grantPermsToRoleDTO);

    /**
     * 得到角色详细信息
     *
     * @param id
     * @return
     */
    public RoleDetailsBO getRoleDetailsById(Long id);


    /**
     * 查询角色信息，角色选择框组件专用
     *
     * @param pageListRoleInfoForComponentDTO
     * @return
     */
    public PageBO<PageListRoleInfoForComponentVO> pageListRoleInfoForComponent(PageListRoleInfoForComponentDTO pageListRoleInfoForComponentDTO);

}
