package com.lzw.wind.tibmas.core.daomanager.impl;

import com.lzw.wind.tibmas.core.dao.UserRegisterExpandDao;
import com.lzw.wind.tibmas.core.daomanager.UserRegisterExpandDaoManager;
import com.lzw.wind.tibmas.core.daomanager.immutable.impl.ImmutableUserRegisterExpandDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRegisterExpandDaoManagerImpl extends  ImmutableUserRegisterExpandDaoManagerImpl implements UserRegisterExpandDaoManager{


    @Autowired
    private UserRegisterExpandDao userRegisterExpandDao;

}
