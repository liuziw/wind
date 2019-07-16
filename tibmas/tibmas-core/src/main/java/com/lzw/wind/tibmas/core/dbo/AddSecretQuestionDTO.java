package com.lzw.wind.tibmas.core.dbo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/6/29 10:51
 */
@Data
public class AddSecretQuestionDTO {

    @ApiModelProperty("问题描述")
    private String questionDesc;

    @ApiModelProperty("排序号")
    private Long seq;
}
