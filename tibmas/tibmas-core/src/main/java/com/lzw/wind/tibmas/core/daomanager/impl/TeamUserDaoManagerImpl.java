package com.lzw.wind.tibmas.core.daomanager.impl;

import com.lzw.wind.tibmas.core.dao.TeamUserDao;
import com.lzw.wind.tibmas.core.daomanager.TeamUserDaoManager;
import com.lzw.wind.tibmas.core.daomanager.immutable.impl.ImmutableTeamUserDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeamUserDaoManagerImpl extends  ImmutableTeamUserDaoManagerImpl implements TeamUserDaoManager{


    @Autowired
    private TeamUserDao teamUserDao;

}
