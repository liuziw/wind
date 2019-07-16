package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/7/11 14:18
 */
@Data
public class UserVO {
    /**
     *ID
     */
    @ApiModelProperty(value = "ID")
    private Long UserId;


    /**
     *用户账户
     */
    @ApiModelProperty(value = "用户账户")
    private String userAccount;


    /*//**
     *用户密码
     *//*
    @ApiModelProperty(value = "用户密码")
    private String userPassword;*/


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
     *职位
     */
    @ApiModelProperty(value = "职位")
    private String job;


    /**
     *出生年月
     */
    @ApiModelProperty(value = "出生年月")
    private java.util.Date birthday;


   /* *//**
     *身份证号
     *//*
    @ApiModelProperty(value = "身份证号")
    private String idCardNo;*/


    /**
     *性别,枚举定义:MALE(1,男);FEMALE(0,女);
     */
    @ApiModelProperty(value = "性别,枚举定义:MALE(1,男);FEMALE(0,女);")
    private Integer gender;


    /**
     *所属部门ID
     */
    @ApiModelProperty(value = "所属部门ID")
    private Long deptId;


    @ApiModelProperty(value = "部门名称")
    private String deptName;
}
