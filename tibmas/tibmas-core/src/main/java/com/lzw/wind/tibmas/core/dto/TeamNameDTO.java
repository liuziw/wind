package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by Furant
 * 2019/6/27 12:29
 */

@Data
public class TeamNameDTO {

    @ApiModelProperty(value = "团队名称",example = "海山街道执法队-巡查1组")
    private String teamName;
}
