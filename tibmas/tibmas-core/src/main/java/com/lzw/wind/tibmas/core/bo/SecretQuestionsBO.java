package com.lzw.wind.tibmas.core.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/5/21 14:21
 */
@Data
public class SecretQuestionsBO {

    @ApiModelProperty("密保问题id")
    private Long questionId;

    @ApiModelProperty("问题答案(加密)")
    private String questionAnswer;

    @ApiModelProperty("问题排序")
    private Integer seq;

}
