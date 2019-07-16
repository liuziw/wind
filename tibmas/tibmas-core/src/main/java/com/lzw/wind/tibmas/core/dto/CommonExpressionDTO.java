package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by yeyu on 2018/5/16.
 */
@ApiModel("常用语 传输对象")
@Data
public class CommonExpressionDTO {

    @ApiModelProperty(value = "代理主键")
    private Long id;

    @ApiModelProperty(value = "类别")
    private String type;

    @ApiModelProperty(value = "内容类型,枚举定义:QUESTION(1,问题描述);ADVICE(2,办理意见)")
    private Integer contentStyle;

    @ApiModelProperty(value = "内容")
    private String content;

    @ApiModelProperty(value = "所属环节,枚举定义:CTV(1,委托核实);V(2,核实);ACCEPTANCE(3,受理);REGISTER(5,立案);DISPATCH(6,派遣);FIRTREAT(7,一级处置);SECTREAT(8,二级处置);FIRTRIAL(15,初审);EI(16,委托核查);INSPECT(17,核查);AUDIT(21,审核);CLOSE(22,结案)")
    private Integer node;

    @ApiModelProperty(value = "排序号")
    private Long seq;

}
