package com.lzw.wind.tibmas.core.daomanager.impl;

import com.hyzs.tibmas.core.dao.RoleDao;
import com.hyzs.tibmas.core.daomanager.RoleDaoManager;
import com.hyzs.tibmas.core.daomanager.immutable.impl.ImmutableRoleDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoleDaoManagerImpl extends  ImmutableRoleDaoManagerImpl implements RoleDaoManager{


    @Autowired
    private RoleDao roleDao;

}
