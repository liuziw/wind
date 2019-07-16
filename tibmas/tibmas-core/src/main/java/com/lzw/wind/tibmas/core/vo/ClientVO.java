package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/8/24 17:38
 */
@Data
@ApiModel("应用实体")
public class ClientVO {
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
     *访问的KEY
     */
    @ApiModelProperty(value = "访问的KEY")
    private String accessKey;
}
