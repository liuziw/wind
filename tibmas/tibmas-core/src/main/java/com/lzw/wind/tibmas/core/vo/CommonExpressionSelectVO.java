package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by yeyu on 2018/5/16.
 */
@ApiModel("常用语页面 下拉列表初始化")
@Data
public class CommonExpressionSelectVO {

    @ApiModelProperty(value = "类别 下拉框")
    private List<SelectTreeVO> typeList;

    @ApiModelProperty(value = "内容类型 下拉框")
    private List<SelectTreeVO> contentStyleList;

    @ApiModelProperty(value = "所属环节 下拉框")
    private List<SelectTreeVO> nodeList;

}
