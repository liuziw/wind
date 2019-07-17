package com.lzw.wind.tibmas.core.daomanager.impl;

import com.lzw.wind.tibmas.core.dao.TeamTypeDao;
import com.lzw.wind.tibmas.core.daomanager.TeamTypeDaoManager;
import com.lzw.wind.tibmas.core.daomanager.immutable.impl.ImmutableTeamTypeDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeamTypeDaoManagerImpl extends  ImmutableTeamTypeDaoManagerImpl implements TeamTypeDaoManager{


    @Autowired
    private TeamTypeDao teamTypeDao;

}
