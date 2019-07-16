package com.lzw.wind.tibmas.log.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("插入操作日志")
@Data
public class InsertOptrLogDTO {
    /**
     *用户ID
     */
    @ApiModelProperty(value = "用户ID")
    private Long userId;


    /**
     *部门ID
     */
    @ApiModelProperty(value = "部门ID")
    private Long deptId;


    /**
     *应用ID
     */
    @ApiModelProperty(value = "应用ID")
    private Long appId;


    /**
     *应用主模块
     */
    @ApiModelProperty(value = "应用主模块")
    private String mainModel;


    /**
     *应用子模块
     */
    @ApiModelProperty(value = "应用子模块")
    private String subModel;


    /**
     *操作对象
     */
    @ApiModelProperty(value = "操作对象")
    private String optrTarget;


    /**
     *操作描述
     */
    @ApiModelProperty(value = "操作描述")
    private String optrDesc;


    /**
     *操作时间
     */
    @ApiModelProperty(value = "操作时间")
    private java.util.Date optrTime;
}
