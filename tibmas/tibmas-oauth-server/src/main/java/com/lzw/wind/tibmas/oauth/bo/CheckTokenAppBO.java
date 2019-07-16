package com.lzw.wind.tibmas.oauth.bo;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CheckTokenAppBO {
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
}
