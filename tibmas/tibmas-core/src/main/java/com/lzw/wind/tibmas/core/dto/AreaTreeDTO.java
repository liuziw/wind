package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by liuzw on 2018/4/9.
 */
@Data
public class AreaTreeDTO {
    @ApiModelProperty(value = "区域编码")
    private String code;

    @ApiModelProperty(value = "区域名称")
    private String name;
}
