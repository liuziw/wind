package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by kjtang on 2018/3/23 0023.
 */
@Data
@ApiModel
public class ResetPasswordDTO {

    @ApiModelProperty("用户id")
    private Long id;

    @ApiModelProperty("密码")
    private String userPassword;
}
