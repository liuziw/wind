package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by kjtang on 2018/3/22 0022.
 */
@Data
@ApiModel("为部门分配角色")
public class GrantRolesToDeptDTO {


    @ApiModelProperty("部门Id")
    private Long deptId;

    @ApiModelProperty("角色Id集合")
    private List<Long> roleIds;

    @ApiModelProperty("角色授予开始时间")
    private Date startTime;

    @ApiModelProperty("角色授予结束时间")
    private Date endTime;

}
