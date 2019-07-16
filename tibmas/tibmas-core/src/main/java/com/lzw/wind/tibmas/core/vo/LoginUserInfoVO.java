package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by yeyu on 2018/5/17.
 */
@ApiModel("登录用户信息 视图对象")
@Data
public class LoginUserInfoVO {

    @ApiModelProperty(value = "登录用户ID")
    private Long userId;

    @ApiModelProperty(value = "登录用户角色ID")
    private Long roleId;

}
