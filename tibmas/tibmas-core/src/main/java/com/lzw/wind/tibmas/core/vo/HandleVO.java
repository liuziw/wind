package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author xusm
 * @Date 2019/7/12 16:05
 */
@Data
@ApiModel(value = "片长相关信息")
public class HandleVO {



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
     * 片长姓名
     */
    @ApiModelProperty("片长姓名")
    private String userName;

    /**
     * 片长账号
     */
    @ApiModelProperty("片长账号")
    private String userAccount;

    /**
     * 片长手机号码
     */
    @ApiModelProperty("片长手机号")
    private String mobileNo;

    /**
     * 邮箱
     */
    @ApiModelProperty("邮箱")
    private String email;

    /**
     * 片长id
     */
    @ApiModelProperty("片长Id")
    private Long teamLeaderId;

//    /**
//     * 领导团队的名称
//     */
//    @ApiModelProperty("领导团队的名称")
//    private String teamName;
//
//    /**
//     * 团队成员Id
//     */
//    @ApiModelProperty("团队成员Id")
//    private List<Long> teamUserIds;
//
//    /**
//     * 团队说明
//     */
//    @ApiModelProperty(value = "团队说明")
//    private String teamDesc;
//
//
//    /**
//     * 团队类型
//     */
//    @ApiModelProperty(value = "团队类型")
//    private String teamTypeCode;

}
