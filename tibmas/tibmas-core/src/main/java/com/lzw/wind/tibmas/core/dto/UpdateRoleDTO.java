package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0.0
 * @author: kjtang
 * @date: 2019/5/29
 * @description:
 */
@Data
public class UpdateRoleDTO {
    /**
     *代理主键
     */
    @ApiModelProperty(value = "代理主键")
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
     *角色类型,枚举定义:ADMIN(1,超级管理员);BUSINESS(2,业务员);GENERAL(3,普通管理员)
     */
    @ApiModelProperty(value = "角色类型,枚举定义:ADMIN(1,超级管理员);BUSINESS(2,业务员);GENERAL(3,普通管理员)")
    private Integer roleType;


    /**
     *应用ID
     */
    @ApiModelProperty(value = "应用ID")
    private Long appId;


    /**
     *是否能继承:0-否,1-是
     */
    @ApiModelProperty(value = "是否能继承:0-否,1-是")
    private Integer isExtend;
}
