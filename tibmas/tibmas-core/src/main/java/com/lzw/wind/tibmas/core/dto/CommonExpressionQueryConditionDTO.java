package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by yeyu on 2018/5/16.
 */
@ApiModel("常用语查询条件 传输对象")
@Data
public class CommonExpressionQueryConditionDTO {

    @ApiModelProperty(value = "类别")
    private String type;

    @ApiModelProperty(value = "内容类型")
    private Integer contentStyle;

    @ApiModelProperty(value = "所属环节")
    private Integer node;

    @ApiModelProperty(value = "创建者姓名")
    private String userNameCreate;

}
