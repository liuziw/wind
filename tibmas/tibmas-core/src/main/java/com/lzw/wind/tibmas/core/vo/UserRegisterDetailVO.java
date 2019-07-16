package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Map;

/**
 * @version 1.0.0
 * @author: kjtang
 * @date: 2019/6/3
 * @description:
 */
@Data()
@ApiModel("用户注册详细信息")
public class UserRegisterDetailVO {
    /**
     *ID
     */
    @ApiModelProperty(value = "ID")
    private Long id;


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
     *所属部门
     */
    @ApiModelProperty(value = "所属部门")
    private String deptName;


    @ApiModelProperty(value = "拓展信息")
    private Map<String,Object> context;

}
