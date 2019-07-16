package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RoleDTO extends OperateDTO{
    /**
     *id
     */
    @ApiModelProperty(value = "id")
    private Long id;


    /**
     *角色编码
     */
    @ApiModelProperty(value = "角色编码")
    private String roleCode;


    /**
     *角色名称
     */
    @ApiModelProperty(value = "角色名称")
    private String roleName;


    /**
     *角色描述
     */
    @ApiModelProperty(value = "角色描述")
    private String roleDesc;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long roleTypeId;


    /**
     *角色类型,枚举定义:ADMIN(1,超级管理员);
     */
    @ApiModelProperty(value = "角色类型,枚举定义:ADMIN(1,超级管理员);")
    private Integer roleType;


    /**
     *是否删除,枚举定义:DELETED_NO(0,未删除);DELETED_YES(1,已删除);
     */
    @ApiModelProperty(value = "是否删除,枚举定义:DELETED_NO(0,未删除);DELETED_YES(1,已删除);")
    private Integer isDeleted;


    /**
     *创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private java.util.Date gmtCreate;


    /**
     *更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private java.util.Date gmtModified;
}
