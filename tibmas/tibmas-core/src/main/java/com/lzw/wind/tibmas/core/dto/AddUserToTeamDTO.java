package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AddUserToTeamDTO {

    /**
     *成员ID
     */
    @ApiModelProperty(value = "成员ID",example = "1")
    private Long userId;


    /**
     *成员类型--0:管理员，1:负责人,2:普通成员
     */
    @ApiModelProperty(value = "成员类型--0:管理员，1:负责人,2:普通成员",example = "2")
    private Integer userType;
}
