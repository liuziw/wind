package com.lzw.wind.tibmas.core.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("ListUserByDeptAndTeamTypeUserInfoVO")
public class ListUserByDeptAndTeamTypeUserInfoVO {


    @ApiModelProperty("用户ID")
    private Long userId;

    @ApiModelProperty("账号")
    private String userAccount;

    @ApiModelProperty("姓名")
    private String userName;
}
