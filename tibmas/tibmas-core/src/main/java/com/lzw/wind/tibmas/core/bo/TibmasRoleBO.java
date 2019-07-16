package com.lzw.wind.tibmas.core.bo;

import com.hyzs.tibmas.core.dbo.RoleDO;
import com.hyzs.tibmas.core.dbo.RoleTypeDO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by kjtang on 2018/3/19 0019.
 */
@Data
@ApiModel("角色业务实体")
public class TibmasRoleBO extends RoleDO {

    @ApiModelProperty("角色类型")
    private RoleTypeDO roleTypeDO;
}
