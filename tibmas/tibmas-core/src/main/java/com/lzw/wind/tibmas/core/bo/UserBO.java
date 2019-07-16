package com.lzw.wind.tibmas.core.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/4/10 18:06
 */@Data
public class UserBO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     *ID
     */
    @ApiModelProperty(value = "ID")
    private Long id;


    /**
     *用户账户
     */
    @ApiModelProperty(value = "用户账户")
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
     *职位
     */
    @ApiModelProperty(value = "职位")
    private String job;


    /**
     *出生年月
     */
    @ApiModelProperty(value = "出生年月")
    private java.util.Date birthday;


    /**
     *用户头像,对应资源表中的id
     */
    @ApiModelProperty(value = "用户头像,对应资源表中的id")
    private Long userPhoto;


    /**
     *身份证号
     */
    @ApiModelProperty(value = "身份证号")
    private String idCardNo;


    /**
     *性别,枚举定义:MALE(1,男);FEMALE(0,女);
     */
    @ApiModelProperty(value = "性别,枚举定义:MALE(1,男);FEMALE(0,女);")
    private Integer gender;


    /**
     *是否锁定,枚举定义:LOCKED(1,已锁定);UNLOCKED(0,未锁定);
     */
    @ApiModelProperty(value = "是否锁定,枚举定义:LOCKED(1,已锁定);UNLOCKED(0,未锁定);")
    private Integer locked;


    /**
     *是否禁用,枚举定义:ENABLED(1,已禁用);UNENABLED(0,正常);
     */
    @ApiModelProperty(value = "是否禁用,枚举定义:ENABLED(1,已禁用);UNENABLED(0,正常);")
    private Integer enabled;

    /**
     *账号是否过期,枚举定义:EXPIRED_YES(1,过期);EXPIRED_NO(0,未过期);
     */
    @ApiModelProperty(value = "账号是否过期,枚举定义:EXPIRED_YES(1,过期);EXPIRED_NO(0,未过期);")
    private Integer expired;

    @ApiModelProperty(value = "部门名称")
    private String deptName;

    @ApiModelProperty(value = "审核状态注（注册信息中用），枚举定义:WAIT(1,待审核);PASS(2,审核通过);NO_PASS(3,审核不通过);")
    private Integer examineStatus;

    @ApiModelProperty("角色名称")
    private String roleName;


}
