package com.lzw.wind.tibmas.core.daomanager.impl;

import com.lzw.wind.tibmas.core.dao.DeptDao;
import com.lzw.wind.tibmas.core.daomanager.DeptDaoManager;
import com.lzw.wind.tibmas.core.daomanager.immutable.impl.ImmutableDeptDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeptDaoManagerImpl extends  ImmutableDeptDaoManagerImpl implements DeptDaoManager{


    @Autowired
    private DeptDao deptDao;

}
