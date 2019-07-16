package com.lzw.wind.tibmas.core.daomanager.impl;

import com.hyzs.tibmas.core.dao.PermDao;
import com.hyzs.tibmas.core.daomanager.PermDaoManager;
import com.hyzs.tibmas.core.daomanager.immutable.impl.ImmutablePermDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PermDaoManagerImpl extends  ImmutablePermDaoManagerImpl implements PermDaoManager{


    @Autowired
    private PermDao permDao;

}
