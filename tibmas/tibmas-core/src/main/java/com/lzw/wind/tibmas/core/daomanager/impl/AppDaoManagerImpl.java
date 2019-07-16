package com.lzw.wind.tibmas.core.daomanager.impl;

import com.hyzs.tibmas.core.dao.AppDao;
import com.hyzs.tibmas.core.daomanager.AppDaoManager;
import com.hyzs.tibmas.core.daomanager.immutable.impl.ImmutableAppDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppDaoManagerImpl extends  ImmutableAppDaoManagerImpl implements AppDaoManager{


    @Autowired
    private AppDao appDao;

}
