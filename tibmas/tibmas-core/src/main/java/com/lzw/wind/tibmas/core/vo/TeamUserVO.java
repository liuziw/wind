package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class TeamUserVO implements Serializable {

    /**
     * 用户Id
     */
    @ApiModelProperty("用户Id")
    private Long userId;

/*    *//**
     * 用户账号
     *//*
    @ApiModelProperty(value = "账号")
    private String userAccount;*/

    /**
     *用户名
     */
    @ApiModelProperty(value = "用户名")
    private String userName;


/*    *//**
     *手机号码
     *//*
    @ApiModelProperty(value = "手机号码")
    private String mobileNo;


    *//**
     *邮箱地址
     *//*
    @ApiModelProperty(value = "邮箱地址")
    private String email;*/


    /**
     *职位
     */
    @ApiModelProperty(value = "职位")
    private String job;


   /* *//**
     *出生年月
     *//*
    @ApiModelProperty(value = "出生年月")
    private java.util.Date birthday;
*/

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

    /**
     * 部门名称
     */
    @ApiModelProperty(value = "部门名称")
    private String deptName;

}
