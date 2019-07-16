package com.lzw.wind.tibmas.core.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
public class ListTeamInfoByUserIdBO {
    /**
     *团队ID
     */
    @ApiModelProperty(value = "团队ID")
    private Long id;


    /**
     *团队名称
     */
    @ApiModelProperty(value = "团队名称")
    private String teamName;


    /**
     *团队类型
     */
    @ApiModelProperty(value = "团队类型")
    private String teamTypeCode;

    /**
     *团队负责人ID
     */
    @ApiModelProperty(value = "团队负责人ID")
    private Long teamLeaderId;


    /**
     *团队所属组织
     */
    @ApiModelProperty(value = "团队所属组织")
    private Long teamDeptId;
}
