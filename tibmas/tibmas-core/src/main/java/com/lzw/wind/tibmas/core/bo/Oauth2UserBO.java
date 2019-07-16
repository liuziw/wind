package com.lzw.wind.tibmas.core.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * @author liys
 * @date 2018/3/1815:51
 */
@Data
@ApiModel(value = "用户信息",description = "利用Spring Security 将该信息保存在redis中，这里将其单独定义是为了之后业务修改了DO对象里不会影响到序列化的操作")
public class Oauth2UserBO implements Serializable {

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
     *用户头像，对应资源表中的id
     */
    @ApiModelProperty(value = "用户头像，对应资源表中的id")
    private Long userPhoto;


    /**
     *枚举定义:MALE(1,男),FEMALE(0,女);
     */
    @ApiModelProperty(value = "枚举定义:MALE(1,男),FEMALE(0,女);")
    private Integer gender;


    /**
     *所属部门ID
     */
    @ApiModelProperty(value = "所属部门ID")
    private Long deptId;


    @ApiModelProperty("部门名称")
    private String deptName;



    @ApiModelProperty("角色信息")
    private Set<String> roles;



    @ApiModelProperty("权限信息")
    private Set<String> perms;

    @ApiModelProperty("App信息")
    private Set<String> apps;

}
