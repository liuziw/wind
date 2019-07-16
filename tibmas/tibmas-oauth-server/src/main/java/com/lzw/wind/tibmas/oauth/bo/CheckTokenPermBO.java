package com.lzw.wind.tibmas.oauth.bo;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CheckTokenPermBO {

    /**
     *id
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     *权限编码
     */
    @ApiModelProperty(value = "权限编码")
    private String permCode;


    /**
     *父权限ID,如果是根节点为0
     */
    @ApiModelProperty(value = "父权限ID,如果是根节点为0")
    private Long pid;


    /**
     *权限名称
     */
    @ApiModelProperty(value = "权限名称")
    private String permName;
}
