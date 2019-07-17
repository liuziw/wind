package com.lzw.wind.tibmas.core.daomanager.impl;

import com.lzw.wind.tibmas.core.dao.RoleDao;
import com.lzw.wind.tibmas.core.daomanager.RoleDaoManager;
import com.lzw.wind.tibmas.core.daomanager.immutable.impl.ImmutableRoleDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoleDaoManagerImpl extends  ImmutableRoleDaoManagerImpl implements RoleDaoManager{


    @Autowired
    private RoleDao roleDao;

}
