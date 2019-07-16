package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by yeyu on 2018/4/17.
 */
@ApiModel("下拉框树数据模板")
@Data
public class SelectTreeVO {

    @ApiModelProperty(value = "key")
    private Long key;

    @ApiModelProperty(value = "value")
    private String value;

    @ApiModelProperty(value = "label")
    private String label;

    public SelectTreeVO() {
    }

    public SelectTreeVO(Long key, String value, String label) {
        this.key = key;
        this.value = value;
        this.label = label;
    }
}
