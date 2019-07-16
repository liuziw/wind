package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
public class TeamDTO {

    /**
     * 团队名称
     */
    @ApiModelProperty(value = "团队名称", example = "开发二组")
    private String teamName;

    /**
     * 团队简介
     */
    @ApiModelProperty(value = "团队简介", example = "该团队的成立是为了。。。。")
    private String teamDesc;

    /**
     * 团队负责人ID
     */
    @ApiModelProperty(value = "团队负责人ID", example = "26")
    private Long TeamLeaderId;

    /**
     * 片长ID
     */
    @ApiModelProperty(value = "片长ID", example = "12")
    private Long teamHandleId;

    /**
     * 团队所属组织
     */
    @ApiModelProperty(value = "团队所属组织", example = "1")
    private Long teamDeptId;

    /**
     * 团队类型编码
     */
    @ApiModelProperty(value = "团队类型编码", example = "ZF_XCJ")
    private String teamTypeCode;
}
