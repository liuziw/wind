package com.lzw.wind.tibmas.core.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("ListUserByDeptAndTeamTypeDTO")
public class ListUserByDeptAndTeamTypeDTO {


    @ApiModelProperty(value = "部门ID",example = "51")
    private Long deptId;


    @ApiModelProperty(value="团队类型",example = "ZF_XCJ")
    private String teamTypeCode;
}
