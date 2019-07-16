package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * Created by liuzw on 2018/4/9.
 */
@Data
@ApiModel("部门列表树视图对象")
public class DeptTreeVO {
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


    @ApiModelProperty(value = "父部门名称")
    private String parentName;

    @ApiModelProperty(value = "排序号")
    private Long seq;

    @ApiModelProperty("与id值一样，不过为String类型的")
    private String key;

    private List<DeptTreeVO> children;

    @ApiModelProperty(value = "部门拓展信息")
    private Map<String,Object> context;

}
