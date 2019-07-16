package com.lzw.wind.tibmas.core.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/4/10 18:10
 */
@Data
public class DeptBO {
    /**
     *id
     */
    @ApiModelProperty(value = "id")
    private Long id;


    /**
     *部门编码:全大写,英文数字加-组成
     */
    @ApiModelProperty(value = "部门编码:全大写,英文数字加-组成")
    private String deptCode;


    /**
     *部门名称
     */
    @ApiModelProperty(value = "部门名称")
    private String deptName;


    /**
     *部门描述
     */
    @ApiModelProperty(value = "部门描述")
    private String deptDescribe;


    /**
     *机构类型,枚举定义:TOP(1,一级机构);
     */
    @ApiModelProperty(value = "机构类型,枚举定义:TOP(1,一级机构);")
    private Integer deptType;


    /**
     *所属区域
     */
    @ApiModelProperty(value = "所属区域")
    private Long areaId;


    /**
     *父部门Id
     */
    @ApiModelProperty(value = "父部门Id")
    private Long pid;


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

    @ApiModelProperty(value = "所属区域名称")
    private String areaName;

    @ApiModelProperty(value = "部门类型名称")
    private String deptTypeName;
}
