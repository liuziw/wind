package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/5/21 15:24
 */
@Data
public class ListSecretQuestionDTO {

    @ApiModelProperty("用户账号")
    private String userAccount;

}
