package com.lzw.wind.tibmas.core.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/4/10 17:50
 */
@Data
public class RoleBO {

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
     *角色类型,枚举定义:ADMIN(1,超级管理员);BUSINESS(2,业务员);GENERAL(3,普通管理员)
     */
    @ApiModelProperty(value = "角色类型,枚举定义:ADMIN(1,超级管理员);BUSINESS(2,业务员);GENERAL(3,普通管理员)")
    private Integer roleType;

    /**
     *角色名称
     */
    @ApiModelProperty(value = "角色类型名称")
    private String roleTypeName;


    /**
     *应用ID
     */
    @ApiModelProperty(value = "应用ID")
    private Long appId;

    @ApiModelProperty("app名称")
    private String appName;


    /**
     *是否能继承:0-否,1-是
     */
    @ApiModelProperty(value = "是否能继承:0-否,1-是")
    private Integer isExtend;
}
