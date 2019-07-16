package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/7/8 11:25
 */
@Data
public class UsersByDeptIdVO {

    @ApiModelProperty("用户id")
    private Long id;

    @ApiModelProperty("用户账号")
    private String userAccount;

    @ApiModelProperty("用户名")
    private String userName;

}
