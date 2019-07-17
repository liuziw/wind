package com.lzw.wind.tibmas.core.manager;

import com.lzw.wind.tibmas.core.dbo.DeptDO;
import com.lzw.wind.tibmas.core.dbo.RoleDO;
import com.lzw.wind.tibmas.core.dbo.UserDO;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/7/24 9:56
 */
public interface Info2KafkaManager {

    public void addUser(UserDO userDO);

    public void updateUser(UserDO userDO);

    public void deleteUser(UserDO userDO);

    public void addRole(RoleDO roleDO);

    public void updateRole(RoleDO roleDO);

    public void deleteRole(RoleDO roleDO);

    public void addDept(DeptDO deptDO);

    public void updateDept(DeptDO deptDO);

    public void deleteDept(DeptDO deptDO);

}
