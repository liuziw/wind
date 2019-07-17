package com.lzw.wind.tibmas.core.bo;

import com.lzw.wind.tibmas.core.dbo.*;
import com.lzw.wind.tibmas.core.vo.PermTreeVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author liys
 * @date 2018/3/139:08
 */
@Data
@ApiModel("用户详请业务实体")
public class UserDetailsBO implements java.io.Serializable {

    private  static final long serialVersionUID = 1L;

    private UserDO userDO;

    private DeptDO deptDO;

    private List<RoleDO> roleDOList;

    private List<PermDO> permDOList;

    private List<AppDO> appDOList;

    @ApiModelProperty("菜单树")
    private List<PermTreeVO> permTreeVOS;

}
