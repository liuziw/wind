package com.lzw.common.sso.config;

import com.hyzs.common.sso.bo.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 与oauth-server中返回的userInfo对应，属性应与那边一致
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/7/6 16:44
 */
@Data
public class UserInfo implements Serializable {

    private UserBO userDO;

    private DeptBO deptDO;

    private List<RoleBO> roleDOList;

    private List<PermBO> permDOList;

    private List<AppBO> appDOList;

    @ApiModelProperty("菜单树")
    private List<PermTreeBO> permTreeVOS;

}
