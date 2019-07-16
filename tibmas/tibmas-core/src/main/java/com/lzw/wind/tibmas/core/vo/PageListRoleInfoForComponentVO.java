package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class PageListRoleInfoForComponentVO {

    @ApiModelProperty("id")
    private Long id;


    /**
     *用户账户
     */
    @ApiModelProperty(value = "角色编码")
    private String roleCode;



    @ApiModelProperty("角色名称")
    private String roleName;

}
