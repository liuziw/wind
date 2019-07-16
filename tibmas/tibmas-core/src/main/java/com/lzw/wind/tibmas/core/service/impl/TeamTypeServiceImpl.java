package com.lzw.wind.tibmas.core.service.impl;

import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.tibmas.core.daomanager.TeamTypeDaoManager;
import com.hyzs.tibmas.core.dbo.TeamTypeDO;
import com.hyzs.tibmas.core.service.TeamTypeService;
import com.hyzs.tibmas.core.vo.TeamTypeVO;
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
