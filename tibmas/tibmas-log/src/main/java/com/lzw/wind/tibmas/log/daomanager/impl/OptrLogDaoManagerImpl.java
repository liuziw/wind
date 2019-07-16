package com.lzw.wind.tibmas.log.daomanager.impl;

import com.hyzs.tibmas.log.dao.OptrLogDao;
import com.hyzs.tibmas.log.daomanager.OptrLogDaoManager;
import com.hyzs.tibmas.log.daomanager.immutable.impl.ImmutableOptrLogDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OptrLogDaoManagerImpl extends ImmutableOptrLogDaoManagerImpl implements OptrLogDaoManager {


    @Autowired
    private OptrLogDao optrLogDao;

}
