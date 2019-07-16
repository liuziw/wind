package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class CommonIdDTO implements Serializable {

    @ApiModelProperty(value = "公用idDTO",example = "1")
    private Long id;

   @ApiModelProperty(value = "团队类型编码",example = "ZF_XCJ")
    private String teamTypeCode;
}
