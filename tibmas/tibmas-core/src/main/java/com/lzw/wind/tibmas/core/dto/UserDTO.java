package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
public class UserDTO extends OperateDTO{

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


    /**
     *是否删除,枚举定义:DELETED_NO(0,未删除);DELETED_YES(1,已删除);
     */
    @ApiModelProperty(value = "是否删除,枚举定义:DELETED_NO(0,未删除);DELETED_YES(1,已删除);")
    private Integer isDeleted;


    /**
     *创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private java.util.Date gmtCreate;


    /**
     *更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private java.util.Date gmtModified;
}
