package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/8/23 15:01
 */
@Data
@ApiModel("app登录返回实体")
public class AppUserVO extends UserDetailsVO {
    @ApiModelProperty("app登录返回的token")
    private String token;
}
