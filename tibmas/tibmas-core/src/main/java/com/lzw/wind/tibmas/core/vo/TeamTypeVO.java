package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * Created by Furant
 * 2019/6/27 18:24
 */

@Data
public class TeamTypeVO {

    @ApiModelProperty(value = "团队类型名称",example = "执法巡查组")
    private String teamTypeName;


    @ApiModelProperty(value = "团队类型编码",example = "ZF_XCJ")
    private String teamTypeCode;
}
