package com.lzw.wind.tibmas.core.daomanager.impl;

import com.lzw.wind.tibmas.core.dao.AppTokenInfoDao;
import com.lzw.wind.tibmas.core.daomanager.AppTokenInfoDaoManager;
import com.lzw.wind.tibmas.core.daomanager.immutable.impl.ImmutableAppTokenInfoDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppTokenInfoDaoManagerImpl extends  ImmutableAppTokenInfoDaoManagerImpl implements AppTokenInfoDaoManager{


    @Autowired
    private AppTokenInfoDao appTokenInfoDao;

}
