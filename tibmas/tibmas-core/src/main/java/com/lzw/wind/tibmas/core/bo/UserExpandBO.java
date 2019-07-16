package com.lzw.wind.tibmas.core.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/5/15 11:33
 */
@Data
public class UserExpandBO {
    /**
     *属性名
     */
    @ApiModelProperty(value = "属性名")
    private String propertyName;


    /**
     *属性值
     */
    @ApiModelProperty(value = "属性值")
    private String propertyValue;
}
