package com.lzw.wind.tibmas.core.dto;

import com.hyzs.gz.common.dao.dto.PageQueryItemDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by kjtang on 2018/3/22 0022.
 */
@Data
@ApiModel
public class ListQueryRoleDTO extends PageQueryItemDTO {

    @ApiModelProperty(value = "角色名称")
    private String roleName;

    @ApiModelProperty(value = "应用ID")
    private Long appId;
}
