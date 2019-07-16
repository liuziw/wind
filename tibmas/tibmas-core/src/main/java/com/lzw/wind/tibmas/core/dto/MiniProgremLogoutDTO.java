package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/7/3 9:26
 */
@Data
public class MiniProgremLogoutDTO {

    @ApiModelProperty("openId")
    private String openId;

    @ApiModelProperty("微信appId")
    private String wxAppId;

}
