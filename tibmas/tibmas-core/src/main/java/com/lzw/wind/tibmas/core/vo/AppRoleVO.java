package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @version 1.0.0
 * @author: kjtang
 * @date: 2019/6/17
 * @description:
 */
@Data
public class AppRoleVO {
    @ApiModelProperty("appId")
    private Long id;

    @ApiModelProperty("应用名称")
    private String appName;

    @ApiModelProperty("角色列表")
    private List<RoleVO> roleVOList;
}
