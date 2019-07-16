package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Author: Wangdy
 * @Date: 2018/12/18 17:36:50
 * @Description:
 */
@Data
@ApiModel(value = "给权限分配部门 传输对象")
public class GrantDeptsToPermDTO {

    @ApiModelProperty("权限ID")
    private Long permId;

    @ApiModelProperty("部门ID集合")
    private List<Long> deptIds;

    @ApiModelProperty("应用程序ID")
    private Long appId;

    @ApiModelProperty("开始时间")
    private Date startTime;

    @ApiModelProperty("结束时间")
    private Date endTime;

}
