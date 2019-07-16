package com.lzw.wind.tibmas.core.daomanager.impl;

import com.hyzs.tibmas.core.dao.DeptExpandDao;
import com.hyzs.tibmas.core.daomanager.DeptExpandDaoManager;
import com.hyzs.tibmas.core.daomanager.immutable.impl.ImmutableDeptExpandDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeptExpandDaoManagerImpl extends  ImmutableDeptExpandDaoManagerImpl implements DeptExpandDaoManager{


    @Autowired
    private DeptExpandDao deptExpandDao;

}
