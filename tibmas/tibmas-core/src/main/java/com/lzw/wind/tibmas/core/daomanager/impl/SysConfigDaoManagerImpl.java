package com.lzw.wind.tibmas.core.daomanager.impl;

import com.hyzs.tibmas.core.dao.SysConfigDao;
import com.hyzs.tibmas.core.daomanager.SysConfigDaoManager;
import com.hyzs.tibmas.core.daomanager.immutable.impl.ImmutableSysConfigDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SysConfigDaoManagerImpl extends  ImmutableSysConfigDaoManagerImpl implements SysConfigDaoManager{


    @Autowired
    private SysConfigDao sysConfigDao;

}
