package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by kjtang on 2018/3/23 0023.
 */
@Data
@ApiModel
public class GrantPermsToUserDTO {


    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("权限集合ID")
    private List<Long> perIds;

    @ApiModelProperty("应用程序ID")
    private Long appId;

    @ApiModelProperty("权限授予开始时间")
    private Date startTime;

    @ApiModelProperty("权限回收时间")
    private Date endTime;

}
