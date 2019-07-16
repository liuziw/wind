package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * @author liuzw
 * @date 2018/5/5
 */
@Data
@ApiModel("树形数据，包含被选中的节点")
public class TreeWithSelectedForUserPermVO {

    /**
     * 树的数据
     */
    @ApiModelProperty("树的数据")
    private List<TreeVO> treeNodes;

    /**
     * 用户权限选中节点
     */
    @ApiModelProperty("用户权限选中节点")
    private List<Long> selectIds;

    /**
     * 部门权限选中节点
     */
    @ApiModelProperty("部门权限选中节点")
    private Set<Long> deptPermSelectIds;

    /**
     * 角色权限选中节点
     */
    @ApiModelProperty("角色权限选中节点")
    private Set<Long> rolePermSelectIds;

    /**
     * 部门角色权限选中节点
     */
    @ApiModelProperty("部门角色权限选中节点")
    private Set<Long> deptRolePermSelectIds;
}
