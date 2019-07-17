package com.lzw.wind.tibmas.core.service;

import com.lzw.common.dao.dto.IdDTO;
import com.lzw.wind.tibmas.core.bo.PermDetailsBO;
import com.lzw.wind.tibmas.core.dbo.PermDO;
import com.lzw.wind.tibmas.core.dto.*;
import com.lzw.wind.tibmas.core.vo.PermTreeVO;
import com.lzw.wind.tibmas.core.vo.TreeVO;
import com.lzw.wind.tibmas.core.vo.TreeWithSelectedVO;

import java.util.List;

/**
 * Created by kjtang on 2018/3/15 0015.
 */
public interface PermService {

    /**
     * 新增权限信息
     *
     * @param dto
     * @return
     */
    Integer insert(AddPermDTO dto);


    /**
     * 修改权限信息
     *
     * @param dto
     * @return
     */
    Integer updateById(UpdatePermDTO dto);


    /**
     * 通过Id删除权限信息
     *
     * @param id
     * @return
     */
    Integer deleteById(Long id);

    /**
     * 批量删除权限信息
     *
     * @param ids
     * @return
     */
    Integer deleteByIds(List<Long> ids);


    /**
     * 通过权限Id查询权限详细新
     *
     * @param id
     * @return
     */
    PermDO getById(Long id);


    /**
     * 通过应用Id获取该应用拥有的权限
     *
     * @param appId
     * @return
     */
    List<PermTreeVO> getPermTreeByAppId(Long appId);

    /**
     * 查询所有部门并生成树（该方法的TreeVO按照前台控件的属性定义）
     *
     * @return
     */
    List<TreeVO> listAllPermTree();

    /**
     * 通过制定条件查询权限信息
     *
     * @param listQueryPermDTO
     * @return
     */
    List<TreeVO> listPermTree(ListQueryPermDTO listQueryPermDTO);


    /**
     * 通过指定条件查询所有权限码
     *
     * @param listPermCodeDTO
     * @return
     */
    List<String> listPermCodeByApp(ListPermCodeDTO listPermCodeDTO);

    /**
     * 查询应用程序所对应的权限数,包含角色已有的权限
     */
    TreeWithSelectedVO listPermTreeWithSelectForRoleUpdate(RoleAndAppIDDTO dto);

    /**
     * 得到权限详细信息
     *
     * @param id
     * @return
     */
    PermDetailsBO getPermDetailsById(Long id);

    /**
     * 通过条件查询权限并生成一颗树table
     *
     * @param permTreeDTO
     * @return
     */
    List<PermTreeVO> listPermTreeTable(PermTreeDTO permTreeDTO);

    /**
     * 禁用/启用菜单
     *
     * @param dto
     * @return
     */
    Integer disablePerm(IdDTO<Long> dto);


    /**
     * 给权限分配角色
     *
     * @param grantRolesToPermDTO
     * @return
     */
    Integer grantRolesToPerm(GrantRolesToPermDTO grantRolesToPermDTO);

}
