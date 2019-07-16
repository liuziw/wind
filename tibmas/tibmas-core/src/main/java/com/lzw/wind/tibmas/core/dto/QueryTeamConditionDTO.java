package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by Furant
 * 2019/6/21 11:07
 */
@Data
public class QueryTeamConditionDTO implements Serializable{

    @ApiModelProperty(value = "团队部门id",example = "51")
    private Long deptId;

    @ApiModelProperty(value = "团队类型编码",example = "ZF_XCJ")
    private String teamTypeCode;

    @ApiModelProperty(value = "团队名称",example = "海山街道执法队-巡查1组")
    private String teamName;

    @ApiModelProperty(value = "开始时间",example = "")
    private Long startTime;

    @ApiModelProperty(value = "结束时间",example = "")
    private Long endTime;
}
