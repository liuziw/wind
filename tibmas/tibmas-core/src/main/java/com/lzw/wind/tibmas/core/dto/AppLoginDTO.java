package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/8/23 14:28
 */
@Data
@ApiModel("app登录实体")
public class AppLoginDTO {
    @ApiModelProperty("账号/用户名")
    private String userAccount;

    @ApiModelProperty("用户密码")
    private String userPassword;

    @ApiModelProperty("app应用id")
    private Long appId;

    @ApiModelProperty("设备类型（0未知，1安卓，2ios）")
    private Integer deviceType;


    /**
     *手机序列号
     */
    @ApiModelProperty(value = "手机序列号")
    private String serialNumber;


    /**
     *手机IMEI号
     */
    @ApiModelProperty(value = "手机IMEI号")
    private String imei;


    /**
     *所在服务区
     */
    @ApiModelProperty(value = "所在服务区")
    private String serveArea;
}
