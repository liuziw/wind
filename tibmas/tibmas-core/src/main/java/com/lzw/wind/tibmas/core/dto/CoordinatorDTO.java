package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by Furant
 * 2019/6/26 11:24
 */

@Data
public class CoordinatorDTO {


    /**
     * Coordinator
     */
    @ApiModelProperty("Coordinator")
    private String queryCondition;


    /**
     * 团队Id
     */
    @ApiModelProperty("团队Id")
    private Long teamId;


    /**
     * 人员Id
     */
    @ApiModelProperty("人员Id")
    private Long userId;
}
