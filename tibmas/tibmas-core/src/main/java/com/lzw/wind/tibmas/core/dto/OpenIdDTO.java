package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0.0
 * @author: kjtang
 * @date: 2019/6/19
 * @description:
 */
@Data
public class OpenIdDTO {

    @ApiModelProperty("openId")
    private String openId;

    @ApiModelProperty("微信appId")
    private String wxAppId;

    @ApiModelProperty("团队类型编码")
    private String teamTypeCode;

}
