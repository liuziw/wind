package com.lzw.wind.tibmas.core.daomanager.impl;

import com.hyzs.tibmas.core.dao.UserRegisterDao;
import com.hyzs.tibmas.core.daomanager.UserRegisterDaoManager;
import com.hyzs.tibmas.core.daomanager.immutable.impl.ImmutableUserRegisterDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRegisterDaoManagerImpl extends  ImmutableUserRegisterDaoManagerImpl implements UserRegisterDaoManager{


    @Autowired
    private UserRegisterDao userRegisterDao;

}
