package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/5/15 16:10
 */
@Data
public class ExamineDTO {

    /**
     *业务ID
     */
    @ApiModelProperty(value = "业务ID")
    private String busId;

    @ApiModelProperty("审批状态")
    private String busStatus;


    /**
     *用户账号
     */
    @ApiModelProperty(value = "用户账号")
    private String userAccount;


    /**
     *用户密码
     */
    @ApiModelProperty(value = "用户密码")
    private String userPassword;


    /**
     *用户名
     */
    @ApiModelProperty(value = "用户名")
    private String userName;


    /**
     *手机号码
     */
    @ApiModelProperty(value = "手机号码")
    private String mobileNo;


    /**
     *邮箱地址
     */
    @ApiModelProperty(value = "邮箱地址")
    private String email;


    /**
     *生日
     */
    @ApiModelProperty(value = "生日")
    private java.util.Date birthday;


    /**
     *用户头像，对应资源表中的id
     */
    @ApiModelProperty(value = "用户头像，对应资源表中的id")
    private Long userPhoto;


    /**
     *身份证号
     */
    @ApiModelProperty(value = "身份证号")
    private String idCardNo;


    /**
     *性别：1男，0女
     */
    @ApiModelProperty(value = "性别：1男，0女")
    private Integer gender;


    /**
     *所属部门id
     */
    @ApiModelProperty(value = "所属部门id")
    private Long deptId;

}
