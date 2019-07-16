package com.lzw.wind.tibmas.core.vo;

import com.hyzs.tibmas.core.bo.*;
import com.hyzs.tibmas.core.dbo.PermDO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author liys
 * @date 2018/3/139:08
 */
@Data
@ApiModel("用户详请业务实体")
public class UserDetailsVO implements java.io.Serializable {

    private  static final long serialVersionUID = 1L;

    private UserBO userBO;

    private DeptBO deptBO;

    private TeamBO teamBO;

    private List<RoleBO> roleBOList;

    private List<PermDO> permDOList;

    private Map<String,Object> context;

    @ApiModelProperty(value = "该人员的权限")
    private List<PermTreeVO> permTreeVOList;



}
