package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by Furant
 * 2019/6/20 16:48
 */
@Data
public class UpdateTeamDTO implements Serializable {

    /**
     * 团队Id
     */
    @ApiModelProperty("团队id")
    private Long id;

    /**
     * 团队名称
     */
    @ApiModelProperty("团队名称")
    private String teamName;

    /**
     * 团队简介
     */
    @ApiModelProperty("团队简介")
    private String teamDesc;

    /**
     * 团队负责人ID
     */
    @ApiModelProperty("团队负责人ID")
    private Long TeamLeaderId;

    /**
     * 片长ID
     */
    @ApiModelProperty(value = "片长ID", example = "12")
    private Long teamHandleId;

    /**
     * 团队所属组织
     */
    @ApiModelProperty("团队所属组织")
    private Long teamDeptId;
}
