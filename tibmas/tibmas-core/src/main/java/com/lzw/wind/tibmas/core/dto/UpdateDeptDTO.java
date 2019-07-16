package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Map;

/**
 * @version 1.0.0
 * @author: kjtang
 * @date: 2019/5/29
 * @description:
 */
@Data
public class UpdateDeptDTO {
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
     *机构类型,枚举定义:IMPORTANT(1,重要部门);MUNICIPAL(2,市委部门);GOVERNMENT(3,政府部门);INSTITUTION(4,事业部门);SOCIAL(5,社会团体);COURT(6,法院、检查);OTHER(7,其他单位);
     */
    @ApiModelProperty(value = "机构类型,枚举定义:IMPORTANT(1,重要部门);MUNICIPAL(2,市委部门);GOVERNMENT(3,政府部门);INSTITUTION(4,事业部门);SOCIAL(5,社会团体);COURT(6,法院、检查);OTHER(7,其他单位);")
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
     *排序
     */
    @ApiModelProperty(value = "排序")
    private Long seq;

    @ApiModelProperty(value = "部门拓展信息")
    private Map<String,Object> context;

}
