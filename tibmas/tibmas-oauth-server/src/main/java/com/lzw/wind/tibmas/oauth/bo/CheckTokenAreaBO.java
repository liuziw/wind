package com.lzw.wind.tibmas.oauth.bo;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CheckTokenAreaBO {

    /**
     *id
     */
    @ApiModelProperty(value = "id")
    private Long id;


    /**
     *区域代码
     */
    @ApiModelProperty(value = "区域代码")
    private Long code;


    /**
     *区域名称
     */
    @ApiModelProperty(value = "区域名称")
    private String name;



    /**
     *区域名称
     */
    @ApiModelProperty(value = "id路径")
    private String path;


    /**
     *区域名称
     */
    @ApiModelProperty(value = "全路径名")
    private String fullName;

}
