package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserOperationDTO {

    @ApiModelProperty(value = "团队ID",example = "1")
    private Long teamId;

    @ApiModelProperty("成员ID")
    private Long userId;
}
