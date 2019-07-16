package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by yeyu on 2018/4/17.
 */
@ApiModel("下拉框数据模板")
@Data
public class SelectVO {

    @ApiModelProperty(value = "key")
    private Long key;

    @ApiModelProperty(value = "value")
    private String value;

    public SelectVO() {
    }

    public SelectVO(Long key, String value) {
        this.key = key;
        this.value = value;
    }
}
