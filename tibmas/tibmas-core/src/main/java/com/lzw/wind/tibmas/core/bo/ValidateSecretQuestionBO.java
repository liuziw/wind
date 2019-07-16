package com.lzw.wind.tibmas.core.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/5/21 16:30
 */
@Data
public class ValidateSecretQuestionBO {
    @ApiModelProperty("用户密保问题id")
    private Long id;

    @ApiModelProperty("问题答案(加密)")
    private String questionAnswer;
}
