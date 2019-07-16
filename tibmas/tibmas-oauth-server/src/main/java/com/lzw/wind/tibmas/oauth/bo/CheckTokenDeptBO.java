package com.lzw.wind.tibmas.oauth.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CheckTokenDeptBO {
    /**
     *id
     */
    @ApiModelProperty(value = "id")
    private Long id;


    /**
     *部门编码:全大写,英文数字加-组成
     */
    @ApiModelProperty(value = "部门编码:全大写,英文数字加-组成")
    private String deptCode;


    /**
     *部门名称
     */
    @ApiModelProperty(value = "部门名称")
    private String deptName;

}
