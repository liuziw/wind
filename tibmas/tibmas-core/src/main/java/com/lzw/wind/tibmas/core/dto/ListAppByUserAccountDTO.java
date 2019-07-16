package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/7/4 19:40
 */
@Data
@ApiModel
public class ListAppByUserAccountDTO {
    @ApiModelProperty("用户账号")
    private String userAccount;
}
