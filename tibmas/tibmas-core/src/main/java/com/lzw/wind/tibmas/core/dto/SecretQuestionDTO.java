package com.lzw.wind.tibmas.core.dto;

import com.lzw.wind.tibmas.core.bo.SecretQuestionsBO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/5/21 12:28
 */
@Data
public class SecretQuestionDTO {

    @ApiModelProperty("用户账号")
    private String userAccount;

    @ApiModelProperty("密保问题列表")
    private List<SecretQuestionsBO> secretQuestionsBOList;

}
