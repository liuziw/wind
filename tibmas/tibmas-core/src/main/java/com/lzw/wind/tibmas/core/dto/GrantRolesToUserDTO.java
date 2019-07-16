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
public class GrantRolesToUserDTO {

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("用户拥有的角色")
    private List<Long> roleIds;

    @ApiModelProperty("角色授予时间")
    private Date startTime;

    @ApiModelProperty("角色回收时间")
    private Date endTime;
}
