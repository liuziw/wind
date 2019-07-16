package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by liuzw on 2018/4/9.
 */
@Data
public class PermTreeDTO {

    @ApiModelProperty("应用id")
    private Long appId;

    @ApiModelProperty("权限编码")
    private String permCode;

    @ApiModelProperty("权限名称")
    private String permName;

    @ApiModelProperty("目录类型")
    private Integer permType;
}
