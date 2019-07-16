package com.lzw.wind.tibmas.core.daomanager.impl;

import com.hyzs.tibmas.core.dao.TeamDao;
import com.hyzs.tibmas.core.daomanager.TeamDaoManager;
import com.hyzs.tibmas.core.daomanager.immutable.impl.ImmutableTeamDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeamDaoManagerImpl extends  ImmutableTeamDaoManagerImpl implements TeamDaoManager{


    @Autowired
    private TeamDao teamDao;

}
