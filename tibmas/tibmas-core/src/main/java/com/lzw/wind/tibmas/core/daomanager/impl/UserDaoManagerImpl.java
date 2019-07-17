package com.lzw.wind.tibmas.core.daomanager.impl;

import com.lzw.wind.tibmas.core.dao.UserDao;
import com.lzw.wind.tibmas.core.daomanager.UserDaoManager;
import com.lzw.wind.tibmas.core.daomanager.immutable.impl.ImmutableUserDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDaoManagerImpl extends  ImmutableUserDaoManagerImpl implements UserDaoManager{


    @Autowired
    private UserDao userDao;

}
