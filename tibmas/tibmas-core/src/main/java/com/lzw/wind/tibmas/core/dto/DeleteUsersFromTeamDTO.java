package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DeleteUsersFromTeamDTO implements Serializable {

    @ApiModelProperty("当前操作人id")
    private Long operatorUserId;

    @ApiModelProperty("要删除人员的ids")
    private List<Long> ids;

    @ApiModelProperty("当前团队id")
    private Long teamId;
}
