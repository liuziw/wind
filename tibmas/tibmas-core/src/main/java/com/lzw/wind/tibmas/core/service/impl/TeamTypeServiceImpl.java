package com.lzw.wind.tibmas.core.service.impl;

import com.lzw.common.core.util.CommonUtils;
import com.lzw.wind.tibmas.core.daomanager.TeamTypeDaoManager;
import com.lzw.wind.tibmas.core.dbo.TeamTypeDO;
import com.lzw.wind.tibmas.core.service.TeamTypeService;
import com.lzw.wind.tibmas.core.vo.TeamTypeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Furant
 * 2019/6/27 18:29
 */

@Service
public class TeamTypeServiceImpl implements TeamTypeService {

    @Autowired
    private TeamTypeDaoManager teamTypeDaoManager;
    @Override
    public List<TeamTypeVO> listTeamType() {

        List<TeamTypeDO> listTeamTypeDO = teamTypeDaoManager.listAll();

        return CommonUtils.collection2List(listTeamTypeDO, teamTypeDO -> CommonUtils.newInstance(teamTypeDO,TeamTypeVO.class));

    }
}
