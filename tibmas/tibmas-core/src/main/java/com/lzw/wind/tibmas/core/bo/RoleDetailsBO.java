package com.lzw.wind.tibmas.core.bo;

import com.lzw.wind.tibmas.core.vo.PermTreeVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by liuzw on 2018/4/2.
 */
@Data
@ApiModel("角色详情实体")
public class RoleDetailsBO {
    private RoleBO roleBO;

    @ApiModelProperty(value = "拥有该角色的人员")
    private List<UserBO> userBOList;

    @ApiModelProperty(value = "拥有该角色的部门")
    private List<DeptBO> deptBOList;

    @ApiModelProperty(value = "改角色的权限")
    private List<PermTreeVO> permTreeVOList;


}
