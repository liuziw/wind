package com.lzw.wind.tibmas.oauth.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CheckTokenUserBO {


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
     *性别,枚举定义:MALE(1,男);FEMALE(0,女);
     */
    @ApiModelProperty(value = "性别,枚举定义:MALE(1,男);FEMALE(0,女);")
    private Integer gender;




    /**
     *联系地址
     */
    @ApiModelProperty(value = "联系地址")
    private String address;
}
