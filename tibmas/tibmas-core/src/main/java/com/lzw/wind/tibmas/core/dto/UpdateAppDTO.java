package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0.0
 * @author: kjtang
 * @date: 2019/5/29
 * @description:
 */
@Data
public class UpdateAppDTO {
    /**
     *id
     */
    @ApiModelProperty(value = "id")
    private Long id;


    /**
     *应用程序编码
     */
    @ApiModelProperty(value = "应用程序编码")
    private String appCode;


    /**
     *应用程序名称
     */
    @ApiModelProperty(value = "应用程序名称")
    private String appName;


    /**
     *应用程序图标对应资源表中的Id
     */
    @ApiModelProperty(value = "应用程序图标对应资源表中的Id")
    private Long appIcon;


    /**
     *应用程序描述
     */
    @ApiModelProperty(value = "应用程序描述")
    private String appDesc;


    /**
     *应用的URL
     */
    @ApiModelProperty(value = "应用的URL")
    private String appUrl;


    /**
     *访问的key（明文）
     */
    @ApiModelProperty(value = "访问的key（明文）")
    private String accessKeyPlain;

}
