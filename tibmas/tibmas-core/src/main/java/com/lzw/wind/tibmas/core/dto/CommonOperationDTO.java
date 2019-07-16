package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
public class CommonOperationDTO {

    @ApiModelProperty(value = "当前操作人id",example = "1")
    private Long operatorUserId;

    @ApiModelProperty(value = "要删除人的id",example = "1")
    private Long userId;

    @ApiModelProperty(value = "当前团队id",example = "1")
    private Long teamId;


}
