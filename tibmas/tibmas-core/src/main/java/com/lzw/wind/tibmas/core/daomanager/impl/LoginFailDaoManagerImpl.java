package com.lzw.wind.tibmas.core.daomanager.impl;

import com.lzw.wind.tibmas.core.dao.LoginFailDao;
import com.lzw.wind.tibmas.core.daomanager.LoginFailDaoManager;
import com.lzw.wind.tibmas.core.daomanager.immutable.impl.ImmutableLoginFailDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginFailDaoManagerImpl extends  ImmutableLoginFailDaoManagerImpl implements LoginFailDaoManager{


    @Autowired
    private LoginFailDao loginFailDao;

}
