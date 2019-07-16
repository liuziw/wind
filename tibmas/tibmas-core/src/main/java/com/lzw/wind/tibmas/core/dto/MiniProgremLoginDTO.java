package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0.0
 * @author: kjtang
 * @date: 2019/5/31
 * @description:
 */
@Data
public class MiniProgremLoginDTO {

    @ApiModelProperty("用户账号")
    private String userAccount;

    @ApiModelProperty("用户密码")
    private String password;

    @ApiModelProperty("openId")
    private String openId;

    @ApiModelProperty("微信appId")
    private String wxAppId;

    @ApiModelProperty("昵称")
    private String nickName;

    @ApiModelProperty("unionId")
    private String unionId;

    @ApiModelProperty("微信头像")
    private String wxHeadImg;

    @ApiModelProperty("微信性别")
    private Integer wxGender;

    @ApiModelProperty("微信电话号码")
    private String wxPhoneNum;
}
