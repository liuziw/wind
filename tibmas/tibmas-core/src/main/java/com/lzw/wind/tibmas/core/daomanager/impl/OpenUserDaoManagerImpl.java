package com.lzw.wind.tibmas.core.daomanager.impl;

import com.lzw.wind.tibmas.core.dao.OpenUserDao;
import com.lzw.wind.tibmas.core.daomanager.OpenUserDaoManager;
import com.lzw.wind.tibmas.core.daomanager.immutable.impl.ImmutableOpenUserDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OpenUserDaoManagerImpl extends  ImmutableOpenUserDaoManagerImpl implements OpenUserDaoManager{


    @Autowired
    private OpenUserDao openUserDao;

}
