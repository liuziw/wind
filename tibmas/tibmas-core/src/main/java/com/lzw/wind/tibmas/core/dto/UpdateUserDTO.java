package com.lzw.wind.tibmas.core.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Map;

/**
 * @author zhongsj
 * @date 2019/3/29 16:47
 */
@Data
@ApiModel("用户信息增加")
public class UpdateUserDTO {

    @ApiModelProperty("id")
    private Long id;

    /**
     *ID
     */
    @ApiModelProperty(value = "操作人id")
    private Long userId;


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
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
     *所属部门ID
     */
    @ApiModelProperty(value = "所属部门ID")
    private Long deptId;


    /**
     * 直接汇报人ID
     */
    private Long leaderId;


    @ApiModelProperty(value = "用户拓展信息(此拓展信息中必须包含teamLeaderName，teamLeaderAccount团队负责人姓名和团队负责人账号)")
    private Map<String,Object> context;

}
