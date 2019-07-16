package com.lzw.wind.tibmas.core.daomanager.impl;

import com.hyzs.tibmas.core.dao.UserExpandDao;
import com.hyzs.tibmas.core.daomanager.UserExpandDaoManager;
import com.hyzs.tibmas.core.daomanager.immutable.impl.ImmutableUserExpandDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserExpandDaoManagerImpl extends  ImmutableUserExpandDaoManagerImpl implements UserExpandDaoManager{


    @Autowired
    private UserExpandDao userExpandDao;

}
