package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @version 1.0.0
 * @author: liuzw
 * @date: 2019/6/6
 * @description:
 */
@Data
public class DeptUserTreeVO implements Serializable {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("pid")
    private Long pid;

    @ApiModelProperty(value = "排序，前端不用管这个字段，后台排序")
    private Long seq;

    @ApiModelProperty("类型：0部门，1人员")
    private Integer type;

    @ApiModelProperty("部门编码")
    private String deptCode;

    @ApiModelProperty("用户所属部门id")
    private Long deptId;

    @ApiModelProperty("用户所属部门名称")
    private String deptName;

    private List<DeptUserTreeVO> children;
}
