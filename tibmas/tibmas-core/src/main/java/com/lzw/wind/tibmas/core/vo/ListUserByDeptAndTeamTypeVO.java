package com.lzw.wind.tibmas.core.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel("ListUserByDeptAndTeamTypeVO")
public class ListUserByDeptAndTeamTypeVO {

    @ApiModelProperty("团队ID")
    private Long teamId;

    @ApiModelProperty("团队名称")
    private String teamName;


    @ApiModelProperty("团队类型")
    private String teamTypeCode;

    @ApiModelProperty("团队成员")
    private List<ListUserByDeptAndTeamTypeUserInfoVO> userList;


}
