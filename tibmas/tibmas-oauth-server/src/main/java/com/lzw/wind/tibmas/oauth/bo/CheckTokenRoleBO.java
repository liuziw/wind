package com.lzw.wind.tibmas.oauth.bo;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CheckTokenRoleBO {

    /**
     *代理主键
     */
    @ApiModelProperty(value = "代理主键")
    private Long id;


    /**
     *角色编码
     */
    @ApiModelProperty(value = "角色编码")
    private String roleCode;


    /**
     *角色名称
     */
    @ApiModelProperty(value = "角色名称")
    private String roleName;

}
