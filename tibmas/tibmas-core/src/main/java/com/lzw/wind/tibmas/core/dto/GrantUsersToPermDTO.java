package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Author: Wangdy
 * @Date: 2018/12/18 17:32:27
 * @Description:
 */
@Data
@ApiModel(value = "给权限分配用户 传输对象")
public class GrantUsersToPermDTO {

    @ApiModelProperty("权限ID")
    private Long permId;

    @ApiModelProperty("用户ID集合")
    private List<Long> userIds;

    @ApiModelProperty("应用程序ID")
    private Long appId;

    @ApiModelProperty("开始时间")
    private Date startTime;

    @ApiModelProperty("结束时间")
    private Date endTime;

}
