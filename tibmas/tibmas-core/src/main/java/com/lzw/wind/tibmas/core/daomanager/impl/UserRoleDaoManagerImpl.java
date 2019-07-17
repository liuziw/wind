package com.lzw.wind.tibmas.core.daomanager.impl;

import com.lzw.wind.tibmas.core.dao.UserRoleDao;
import com.lzw.wind.tibmas.core.daomanager.UserRoleDaoManager;
import com.lzw.wind.tibmas.core.daomanager.immutable.impl.ImmutableUserRoleDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRoleDaoManagerImpl extends  ImmutableUserRoleDaoManagerImpl implements UserRoleDaoManager{


    @Autowired
    private UserRoleDao userRoleDao;

}
