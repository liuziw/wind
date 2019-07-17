package com.lzw.wind.tibmas.core.manager.impl;

import com.lzw.wind.tibmas.core.dbo.DeptDO;
import com.lzw.wind.tibmas.core.dbo.RoleDO;
import com.lzw.wind.tibmas.core.dbo.UserDO;
import com.lzw.wind.tibmas.core.manager.Info2KafkaManager;
import org.springframework.stereotype.Component;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/7/24 10:10
 */
@Component
public class Info2KafkaManagerDefaultImpl implements Info2KafkaManager {

    @Override
    public void addUser(UserDO userDO) {
        //
    }

    @Override
    public void updateUser(UserDO userDO) {

    }

    @Override
    public void deleteUser(UserDO userDO) {

    }

    @Override
    public void addRole(RoleDO roleDO) {

    }

    @Override
    public void updateRole(RoleDO roleDO) {

    }

    @Override
    public void deleteRole(RoleDO roleDO) {

    }

    @Override
    public void addDept(DeptDO deptDO) {

    }

    @Override
    public void updateDept(DeptDO deptDO) {

    }

    @Override
    public void deleteDept(DeptDO deptDO) {

    }
}
