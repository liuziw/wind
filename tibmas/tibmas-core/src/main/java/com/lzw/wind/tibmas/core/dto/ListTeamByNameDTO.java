package com.lzw.wind.tibmas.core.dto;

import com.hyzs.gz.common.dao.dto.PageQueryDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by Furant
 * 2019/6/19 16:10
 */
@Data
public class ListTeamByNameDTO extends PageQueryDTO {

    /**
     *团队名称
     */
    @ApiModelProperty(value = "团队名称")
    private String teamName;

}
