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
public class AddPermDTO {
    /**
     *父权限ID,如果是根节点为0
     */
    @ApiModelProperty(value = "父权限ID,如果是根节点为0")
    private Long pid;


    /**
     *权限名称
     */
    @ApiModelProperty(value = "权限名称")
    private String permName;


    /**
     *权限类型,枚举定义:DIRECTORY(1,目录);MENU(2,菜单);OPERATOR(3,操作);
     */
    @ApiModelProperty(value = "权限类型,枚举定义:DIRECTORY(1,目录);MENU(2,菜单);OPERATOR(3,操作);")
    private Integer permType;


    /**
     *排序
     */
    @ApiModelProperty(value = "排序")
    private Long seq;


    /**
     *权限图标
     */
    @ApiModelProperty(value = "权限图标")
    private String permIconUrl;


    /**
     *权限编码
     */
    @ApiModelProperty(value = "权限编码")
    private String permCode;


    /**
     *权限路径
     */
    @ApiModelProperty(value = "权限路径")
    private String permUrl;


    /**
     *权限描述
     */
    @ApiModelProperty(value = "权限描述")
    private String permDesc;


    /**
     *是否禁用（0启用，1禁用）
     */
    @ApiModelProperty(value = "是否禁用（0启用，1禁用）")
    private Integer enableStatus;


    /**
     *权限对应的应用程序
     */
    @ApiModelProperty(value = "权限对应的应用程序")
    private Long appId;
}
