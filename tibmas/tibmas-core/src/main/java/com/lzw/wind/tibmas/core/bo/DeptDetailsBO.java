package com.lzw.wind.tibmas.core.bo;

import com.lzw.wind.tibmas.core.dbo.AreaDO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * Created by liuzw on 2018/4/2.
 */
@Data
@ApiModel("部门详情实体")
public class DeptDetailsBO {
    private DeptBO deptBO;

    @ApiModelProperty(value = "区域")
    private AreaDO area;

    @ApiModelProperty(value = "上级部门")
    private DeptBO ParentDept;

    @ApiModelProperty(value = "部门下人员")
    private List<UserBO> userBOList;

    @ApiModelProperty(value = "部门所拥有的角色")
    private List<RoleBO> roleBOList;

    @ApiModelProperty(value = "部门拓展信息")
    private Map<String,Object> context;

}
