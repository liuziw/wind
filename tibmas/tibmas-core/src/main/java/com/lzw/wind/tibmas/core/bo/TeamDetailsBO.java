package com.lzw.wind.tibmas.core.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("业务实体对象")
public class TeamDetailsBO {

    /**
     * 团队ID
     */
    @ApiModelProperty(value = "团队ID")
    private Long id;


    /**
     * 团队名称
     */
    @ApiModelProperty(value = "团队名称")
    private String teamName;


    /**
     * 团队说明
     */
    @ApiModelProperty(value = "团队说明")
    private String teamDesc;


    /**
     * 团队负责人ID
     */
    @ApiModelProperty(value = "团队负责人ID")
    private Long teamLeaderId;

    /**
     * 团队负责人名称
     */
    @ApiModelProperty(value = "团队负责人名称")
    private String teamLeaderName;

    /**
     * 团队所属组织id
     */
    @ApiModelProperty(value = "团队所属组织id")
    private Long teamDeptId;

    /**
     * 团队所属组织名称
     */
    @ApiModelProperty(value = "团队所属组织名称")
    private String teamDeptName;

    /**
     * 片长ID
     */
    @ApiModelProperty(value = "片长ID")
    private Long teamHandleId;

    /**
     * 片长name
     */
    @ApiModelProperty(value = "片长name")
    private String teamHandleName;

    /**
     * 团队类型编码
     */
    @ApiModelProperty("团队类型编码")
    private String teamTypeCode;
}
