package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TeamAndUserDTO {

    /**
     * ID
     */
   /* @ApiModelProperty("id")
    private Long id;*/

    /**
     * 团队ID
     */
    @ApiModelProperty(value = "团队ID",example = "1")
    private Long TeamId;

    /**
     * 成员ID
     */
    @ApiModelProperty(value = "团队成员的ID",example = "1")
    private Long userId;

    /**
     * 团队成员身份类型
     * 枚举定义：0：管理员1：负责人，2：普通成员
     */
    @ApiModelProperty(value = "团队成员身份类型",example = "2")
    private Integer userType;

}
