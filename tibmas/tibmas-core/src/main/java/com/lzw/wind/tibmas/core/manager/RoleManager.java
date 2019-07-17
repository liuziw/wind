package com.lzw.wind.tibmas.core.manager;

import com.lzw.wind.tibmas.core.bo.RoleBO;
import com.lzw.wind.tibmas.core.dbo.RoleDO;
import com.lzw.wind.tibmas.core.dbo.RolePermDO;
import com.lzw.wind.tibmas.core.vo.AppRoleVO;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;

/**
 * @author liys
 * @date 2018/3/139:45
 */
public interface RoleManager {

    public List<RolePermDO> listRolePermDOByRoleId(Long... roleId);

    public List<RolePermDO> listRolePermDOByRoleId(Collection<Long> roleIds);

    public <T> List<RolePermDO> listRolePermDOByRoleId(Collection<T> roleIds, Function<T, Long> mapper);

    public List<RoleBO> listRoleDO2ListRoleBO(List<RoleDO> roleDOList);

    /**
     * 得到应用角色树
     * @return
     */
    public List<AppRoleVO> listAppRoleVO();

}
