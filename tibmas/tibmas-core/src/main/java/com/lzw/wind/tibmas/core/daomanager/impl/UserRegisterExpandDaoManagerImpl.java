package com.lzw.wind.tibmas.core.daomanager.impl;

import com.hyzs.tibmas.core.dao.UserRegisterExpandDao;
import com.hyzs.tibmas.core.daomanager.UserRegisterExpandDaoManager;
import com.hyzs.tibmas.core.daomanager.immutable.impl.ImmutableUserRegisterExpandDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRegisterExpandDaoManagerImpl extends  ImmutableUserRegisterExpandDaoManagerImpl implements UserRegisterExpandDaoManager{


    @Autowired
    private UserRegisterExpandDao userRegisterExpandDao;

}
