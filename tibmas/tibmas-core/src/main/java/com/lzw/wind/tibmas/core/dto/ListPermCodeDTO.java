package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by kjtang on 2018/3/22 0022.
 */
@Data
@ApiModel("查询权限码")
public class ListPermCodeDTO {

    @ApiModelProperty("应用Id")
    private Long appId;

    @ApiModelProperty("应用编码")
    private String appCode;

}