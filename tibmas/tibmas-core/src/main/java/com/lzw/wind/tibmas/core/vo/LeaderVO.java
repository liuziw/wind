package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Furant
 * 2019/6/20 18:18
 */

@Data
public class LeaderVO implements Serializable {

    /**
     * 所在部门Id
     */
    @ApiModelProperty("所在部门Id")
    private Long deptId;

    /**
     * 所在部门名称
     */
    @ApiModelProperty("所在部门名称")
    private String deptName;

    /**
     * 部门所属区域名称
     */
    @ApiModelProperty("部门所属区域名称")
    private String name;

    /**
     * 所属区域Id
     */
   @ApiModelProperty("所属区域Id")
    private Long areaId;

    /**
     * 领导人姓名
     */
    @ApiModelProperty("领导人姓名")
    private String userName;

    /**
     * 领导人账号
     */
    @ApiModelProperty("领导人账号")
    private String userAccount;

    /**
     * 领导人手机号码
     */
    @ApiModelProperty("领导人手机号")
    private String mobileNo;

    /**
     * 邮箱
     */
    @ApiModelProperty("邮箱")
    private String email;

    /**
     * 领导id
     */
    @ApiModelProperty("领导Id")
    private Long teamLeaderId;

    /**
     * 领导团队的名称
     */
    @ApiModelProperty("领导团队的名称")
    private String teamName;

    /**
     * 团队成员Id
     */
    @ApiModelProperty("团队成员Id")
    private List<Long> teamUserIds;

    /**
     * 团队说明
     */
    @ApiModelProperty(value = "团队说明")
    private String teamDesc;


    /**
     * 团队类型
     */
    @ApiModelProperty(value = "团队类型")
    private String teamTypeCode;

}
