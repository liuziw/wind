package com.lzw.wind.tibmas.core.daomanager.impl;

import com.hyzs.tibmas.core.dao.OptrLogDao;
import com.hyzs.tibmas.core.daomanager.OptrLogDaoManager;
import com.hyzs.tibmas.core.daomanager.immutable.impl.ImmutableOptrLogDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OptrLogDaoManagerImpl extends  ImmutableOptrLogDaoManagerImpl implements OptrLogDaoManager{


    @Autowired
    private OptrLogDao optrLogDao;

}
