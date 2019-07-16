package com.lzw.wind.tibmas.core.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/4/11 9:44
 */
@Data
public class PermBO {
    /**
     *id
     */
    @ApiModelProperty(value = "id")
    private Long id;


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
     *权限图标，对应资源表的id
     */
    @ApiModelProperty(value = "权限图标，对应资源表的id")
    private Long permIcon;

    @ApiModelProperty(value = "权限图标地址")
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
     *权限对应的应用程序
     */
    @ApiModelProperty(value = "权限对应的应用程序")
    private Long appId;


    @ApiModelProperty(value = "权限所属应用名称")
    private String appName;

    @ApiModelProperty(value = "权限类型名称")
    private String permTypeName;

    @ApiModelProperty(value = "是否禁用")
    private String enableStatus;
}
