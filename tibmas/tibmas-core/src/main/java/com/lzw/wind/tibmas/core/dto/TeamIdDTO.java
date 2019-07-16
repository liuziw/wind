package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by Furant
 * 2019/6/24 16:47
 */
@Data
public class TeamIdDTO {
    /**
     * 团队Id
     */
    @ApiModelProperty("团队Id")
    private Long teamId;
}
