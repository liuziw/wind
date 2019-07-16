package com.lzw.wind.tibmas.core.dto;

import com.hyzs.tibmas.core.bo.ValidateSecretQuestionBO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/5/21 16:26
 */
@Data
public class ValidateSecretQuestionDTO {

    @ApiModelProperty("验证问题列表")
    private List<ValidateSecretQuestionBO> validateSecretQuestionBOList;

    @ApiModelProperty("用户账号")
    private String userAccount;
}
