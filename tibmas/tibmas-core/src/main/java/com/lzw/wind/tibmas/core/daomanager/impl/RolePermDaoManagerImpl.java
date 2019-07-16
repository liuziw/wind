package com.lzw.wind.tibmas.core.daomanager.impl;

import com.hyzs.tibmas.core.dao.RolePermDao;
import com.hyzs.tibmas.core.daomanager.RolePermDaoManager;
import com.hyzs.tibmas.core.daomanager.immutable.impl.ImmutableRolePermDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RolePermDaoManagerImpl extends  ImmutableRolePermDaoManagerImpl implements RolePermDaoManager{


    @Autowired
    private RolePermDao rolePermDao;

}
