package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/7/3 17:03
 */
@Data
@ApiModel("app实体")
public class AppDTO {
    @ApiModelProperty("应用id")
    private Long id;

    @ApiModelProperty("应用名称")
    private String appName;

    @ApiModelProperty("应用图标id")
    private Long appIcon;

    @ApiModelProperty("应用描述")
    private String appDesc;

    @ApiModelProperty("应用地址")
    private String appUrl;
}
