package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0.0
 * @author: kjtang
 * @date: 2019/6/5
 * @description:
 */
@Data
public class AddDeptVO {

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("新增天数")
    private Integer updateCount;
}
