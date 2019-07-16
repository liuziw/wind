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
public class AppRoleTreeVO {

    /**
     * 选择中的节点
     */
    @ApiModelProperty("选择中的节点")
    private List<Long> selectIds;

    @ApiModelProperty("应用角色列表")
    private List<AppRoleVO> appRoleVOList;
}
