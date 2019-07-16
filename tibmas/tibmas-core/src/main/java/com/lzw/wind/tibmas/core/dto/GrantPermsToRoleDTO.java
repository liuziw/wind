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
@ApiModel("")
public class GrantPermsToRoleDTO {

    @ApiModelProperty("角色ID")
    private Long roleId;

    @ApiModelProperty("权限集合ID")
    private List<Long> permIds;

    @ApiModelProperty("应用程序ID")
    private Long appId;

    @ApiModelProperty("授权开始时间")
    private Date startTime;

    @ApiModelProperty("权限回收时间")
    private Date endTime;

}
