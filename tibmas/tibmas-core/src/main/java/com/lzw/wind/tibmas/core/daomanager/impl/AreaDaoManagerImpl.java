package com.lzw.wind.tibmas.core.daomanager.impl;

import com.lzw.wind.tibmas.core.dao.AreaDao;
import com.lzw.wind.tibmas.core.daomanager.AreaDaoManager;
import com.lzw.wind.tibmas.core.daomanager.immutable.impl.ImmutableAreaDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AreaDaoManagerImpl extends  ImmutableAreaDaoManagerImpl implements AreaDaoManager{


    @Autowired
    private AreaDao areaDao;

}
