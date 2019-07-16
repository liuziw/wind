package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by Furant
 * 2019/6/20 18:15
 */

@Data
public class TeamLeaderDTO implements Serializable {

    @ApiModelProperty(value = "查询条件")
    private String condition;

}
