package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by kjtang on 2018/3/21 0021.
 */
@Data
@ApiModel("权限查询传输对象")
public class ListQueryPermDTO {

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
     * 权限关联的应用Id
     */
    @ApiModelProperty("应用Id")
    private Long appId;

}
