package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class OperateDTO {
    /**
     *operateType
     */
    @ApiModelProperty(value = "数据操作类型, insert, delete, update")
    private String operateType;
}
