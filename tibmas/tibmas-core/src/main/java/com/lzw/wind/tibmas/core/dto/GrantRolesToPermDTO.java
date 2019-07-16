package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Author: Wangdy
 * @Date: 2018/12/18 17:35:11
 * @Description:
 */
@Data
@ApiModel(value = "给权限分配角色 传输对象")
public class GrantRolesToPermDTO {

    @ApiModelProperty("权限ID")
    private Long permId;

    @ApiModelProperty("角色ID集合")
    private List<Long> roleIds;

    @ApiModelProperty("应用程序ID")
    private Long appId;

    @ApiModelProperty("开始时间")
    private Date startTime;

    @ApiModelProperty("结束时间")
    private Date endTime;

}
