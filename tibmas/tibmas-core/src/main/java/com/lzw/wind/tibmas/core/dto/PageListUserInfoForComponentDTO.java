package com.lzw.wind.tibmas.core.dto;


import com.hyzs.gz.common.dao.dto.PageQueryDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class PageListUserInfoForComponentDTO extends PageQueryDTO {

    @ApiModelProperty("账号")
    private String userAccount;


    @ApiModelProperty("姓名")
    private String userName;
}
