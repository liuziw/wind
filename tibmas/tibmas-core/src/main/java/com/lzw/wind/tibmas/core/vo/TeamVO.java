package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by Furant
 * 2019/6/17 10:50
 */

@Data
public class TeamVO {


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
     *团队说明
     */
    @ApiModelProperty(value = "团队说明")
    private String teamDesc;


    /**
     *团队负责人ID
     */
    @ApiModelProperty(value = "团队负责人Name")
    private String teamLeaderName;


    /**
     *团队所属组织
     */
    @ApiModelProperty(value = "团队所属组织名称")
    private String teamDeptName;

    /**
     * 团队类型
     */
    @ApiModelProperty(value = "团队类型")
    private String teamTypeCode;

//    /**
//     * 片长ID
//     */
//    @ApiModelProperty(value = "片长ID")
//    private Long teamHandleId;
}
