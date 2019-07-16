package com.lzw.wind.tibmas.core.dto;


import com.hyzs.gz.common.dao.dto.PageQueryDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class PageListRoleInfoForComponentDTO extends PageQueryDTO {

    @ApiModelProperty("角色编码")
    private String roleCode;


    @ApiModelProperty("角色名称")
    private String roleName;
}
