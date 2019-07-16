package com.lzw.wind.tibmas.core.daomanager.impl;

import com.hyzs.tibmas.core.dao.DeptRoleDao;
import com.hyzs.tibmas.core.daomanager.DeptRoleDaoManager;
import com.hyzs.tibmas.core.daomanager.immutable.impl.ImmutableDeptRoleDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeptRoleDaoManagerImpl extends  ImmutableDeptRoleDaoManagerImpl implements DeptRoleDaoManager{


    @Autowired
    private DeptRoleDao deptRoleDao;

}
