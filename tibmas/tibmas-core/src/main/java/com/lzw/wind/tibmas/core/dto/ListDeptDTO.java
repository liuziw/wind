package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0.0
 * @author: kjtang
 * @date: 2019/5/31
 * @description:
 */
@Data
public class ListDeptDTO {

    @ApiModelProperty("部门名称")
    private String deptName;
}
