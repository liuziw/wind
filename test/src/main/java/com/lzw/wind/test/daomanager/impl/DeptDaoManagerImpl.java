package com.lzw.wind.test.daomanager.impl;

import com.lzw.wind.test.daomanager.DeptDaoManager;
import com.lzw.wind.test.dbo.DeptDO;
import com.lzw.wind.test.daomanager.immutable.impl.ImmutableDeptDaoManagerImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.lzw.wind.test.mapper.DeptMapper;
import com.lzw.wind.test.dao.DeptDao;

import java.util.HashMap;
import java.util.Map;

@Component
public class DeptDaoManagerImpl extends  ImmutableDeptDaoManagerImpl implements DeptDaoManager{


    @Autowired
    private DeptDao deptDao;

}
