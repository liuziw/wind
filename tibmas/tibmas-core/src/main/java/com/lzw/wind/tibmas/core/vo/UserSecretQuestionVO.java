package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/5/21 15:27
 */
@Data
public class UserSecretQuestionVO {

    @ApiModelProperty("用户密保问题id")
    private Long id;

    @ApiModelProperty("密保问题id")
    private Long questionId;

    @ApiModelProperty("密保问题id")
    private String questionDesc;

    @ApiModelProperty("问题排序")
    private Integer seq;

}
