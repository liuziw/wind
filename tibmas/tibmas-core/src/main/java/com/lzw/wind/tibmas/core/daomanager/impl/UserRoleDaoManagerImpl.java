package com.lzw.wind.tibmas.core.daomanager.impl;

import com.hyzs.tibmas.core.dao.UserRoleDao;
import com.hyzs.tibmas.core.daomanager.UserRoleDaoManager;
import com.hyzs.tibmas.core.daomanager.immutable.impl.ImmutableUserRoleDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRoleDaoManagerImpl extends  ImmutableUserRoleDaoManagerImpl implements UserRoleDaoManager{


    @Autowired
    private UserRoleDao userRoleDao;

}
