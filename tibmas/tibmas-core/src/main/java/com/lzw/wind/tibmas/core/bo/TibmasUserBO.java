package com.lzw.wind.tibmas.core.bo;

import com.hyzs.tibmas.core.dbo.DeptDO;
import com.hyzs.tibmas.core.dbo.UserDO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Map;

/**
 * Created by kjtang on 2018/3/16 0016.
 */
@Data
@ApiModel("用户业务实体")
public class TibmasUserBO extends UserDO {

    @ApiModelProperty("用户所属部门")
    private DeptDO deptDO;

    @ApiModelProperty("用户所拥有角色(多个角色用“,”隔开)")
    private String roleName;

    @ApiModelProperty(value = "用户拓展信息")
    private Map<String,Object> context;

}
