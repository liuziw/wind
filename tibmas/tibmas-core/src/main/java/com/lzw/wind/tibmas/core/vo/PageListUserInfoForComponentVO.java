package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class PageListUserInfoForComponentVO {

    @ApiModelProperty("id")
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


    @ApiModelProperty(value = "所属部门ID")
    private Long deptId;


    @ApiModelProperty(value = "所属部门名称")
    private String deptName;

    @ApiModelProperty(value = "所属部门编码")
    private String deptCode;


}
