package com.lzw.wind.tibmas.core.dto;

import com.hyzs.gz.common.dao.dto.PageQueryDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by Furant
 * 2019/6/17 14:13
 */

@Data
public class ListTeamUsersDTO extends PageQueryDTO {

    /**
     * 团队id
     */
    @ApiModelProperty(value = "团队的id",example = "1")
    private Long teamId;


}
