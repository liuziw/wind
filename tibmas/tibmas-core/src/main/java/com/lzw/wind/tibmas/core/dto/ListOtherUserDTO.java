package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by Furant
 * 2019/6/14 16:50
 */

@Data
public class ListOtherUserDTO implements Serializable {

    /**
     * 用户Id
     */
    @ApiModelProperty(value = "用户Id",example = "1")
    private Long userId;

    /**
     * teamId
     */
    @ApiModelProperty(value = "团队ID",example = "1")
    private Long teamId;

    /**
     * 分页
     */
//    private PageQueryDTO pageQueryDTO;

}
