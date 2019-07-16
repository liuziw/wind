package com.lzw.wind.tibmas.core.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by Administrator on 2018/4/2.
 */
@Data
@ApiModel("权限详情实体")
public class PermDetailsBO {
    private PermBO permBO;

    @ApiModelProperty(value = "拥有该权限的角色")
    private List<RoleBO> roleBOList;

}
