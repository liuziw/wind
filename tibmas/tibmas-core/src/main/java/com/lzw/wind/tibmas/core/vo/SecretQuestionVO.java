package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/6/29 11:06
 */
@Data
public class SecretQuestionVO {

    @ApiModelProperty("密保问题id")
    private Long id;

    @ApiModelProperty("密保问题描述")
    private String questionDesc;

    @ApiModelProperty("排序号")
    private Long seq;
}
