package com.lzw.wind.tibmas.core.daomanager.impl;

import com.lzw.wind.tibmas.core.dao.SysConfigDao;
import com.lzw.wind.tibmas.core.daomanager.SysConfigDaoManager;
import com.lzw.wind.tibmas.core.daomanager.immutable.impl.ImmutableSysConfigDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SysConfigDaoManagerImpl extends  ImmutableSysConfigDaoManagerImpl implements SysConfigDaoManager{


    @Autowired
    private SysConfigDao sysConfigDao;

}
