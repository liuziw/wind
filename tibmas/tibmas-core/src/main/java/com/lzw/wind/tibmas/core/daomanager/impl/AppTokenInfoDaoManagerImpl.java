package com.lzw.wind.tibmas.core.daomanager.impl;

import com.hyzs.tibmas.core.dao.AppTokenInfoDao;
import com.hyzs.tibmas.core.daomanager.AppTokenInfoDaoManager;
import com.hyzs.tibmas.core.daomanager.immutable.impl.ImmutableAppTokenInfoDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppTokenInfoDaoManagerImpl extends  ImmutableAppTokenInfoDaoManagerImpl implements AppTokenInfoDaoManager{


    @Autowired
    private AppTokenInfoDao appTokenInfoDao;

}
