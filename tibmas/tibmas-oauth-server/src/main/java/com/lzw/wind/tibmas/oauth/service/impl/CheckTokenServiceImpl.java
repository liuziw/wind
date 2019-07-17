package com.lzw.wind.tibmas.oauth.service.impl;

import com.lzw.common.core.util.CommonUtils;
import com.lzw.wind.tibmas.core.bo.ListPermInfoByUserIdAndAppIdBO;
import com.lzw.wind.tibmas.core.bo.ListTeamInfoByUserIdBO;
import com.lzw.wind.tibmas.core.daomanager.AppDaoManager;
import com.lzw.wind.tibmas.core.daomanager.AreaDaoManager;
import com.lzw.wind.tibmas.core.daomanager.DeptDaoManager;
import com.lzw.wind.tibmas.core.daomanager.UserDaoManager;
import com.lzw.wind.tibmas.core.dbo.AppDO;
import com.lzw.wind.tibmas.core.dbo.AreaDO;
import com.lzw.wind.tibmas.core.dbo.DeptDO;
import com.lzw.wind.tibmas.core.dbo.UserDO;
import com.lzw.wind.tibmas.core.manager.TibmasManager;
import com.lzw.wind.tibmas.core.service.TeamUserService;
import com.lzw.wind.tibmas.oauth.bo.*;
import com.lzw.wind.tibmas.oauth.service.CheckTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckTokenServiceImpl implements CheckTokenService {

    @Autowired
    private UserDaoManager userDaoManager;

    @Autowired
    private DeptDaoManager deptDaoManager;

    @Autowired
    private TibmasManager tibmasManager;

    @Autowired
    private AreaDaoManager areaDaoManager;

    @Autowired
    private TeamUserService teamUserService;


    @Autowired
    private AppDaoManager appDaoManager;

    @Override
    public CheckTokenUserInfoBO getUserInfo(Long userId, Long appId) {
        CheckTokenUserInfoBO checkTokenUserInfoBO=new CheckTokenUserInfoBO();

        //用户
        UserDO userDO = this.userDaoManager.getById(userId);
        checkTokenUserInfoBO.setUserDO(CommonUtils.newInstance(userDO,CheckTokenUserBO.class));

        //部门
        DeptDO deptDO=this.deptDaoManager.getById(userDO.getDeptId());
        checkTokenUserInfoBO.setDeptInfo(CommonUtils.newInstance(deptDO, CheckTokenDeptBO.class));

        //角色及权限
        ListPermInfoByUserIdAndAppIdBO listPermInfoByUserIdAndAppIdBO = this.tibmasManager.listPermInfoByUserIdAndAppIdBO(userId, appId);
        checkTokenUserInfoBO.setRoleInfoList(CommonUtils.collection2List(listPermInfoByUserIdAndAppIdBO.getRoleDOList(), roleDO -> CommonUtils.newInstance(roleDO,CheckTokenRoleBO.class)));

        checkTokenUserInfoBO.setPermTreeVOS(listPermInfoByUserIdAndAppIdBO.getPermTreeVOS());
        checkTokenUserInfoBO.setPermInfoList(CommonUtils.collection2List(listPermInfoByUserIdAndAppIdBO.getOptrPermList(), permDO -> CommonUtils.newInstance(permDO, CheckTokenPermBO.class)));

        //团队
        List<ListTeamInfoByUserIdBO> listTeamInfoByUserIdBOS = teamUserService.listTeamInfoByUserId(userId);
        checkTokenUserInfoBO.setTeamInfoList(CommonUtils.collection2List(listTeamInfoByUserIdBOS, listTeamInfoByUserIdBO -> CommonUtils.newInstance(listTeamInfoByUserIdBO, CheckTokenTermBO.class)));

        //地区
        checkTokenUserInfoBO.setAreaInfo(this.getCheckTokenAreaBO(deptDO.getAreaId()));


        //app
        AppDO appDO = this.appDaoManager.getById(appId);
        checkTokenUserInfoBO.setAppInfo(CommonUtils.newInstance(appDO,CheckTokenAppBO.class));


        return checkTokenUserInfoBO;
    }



    private CheckTokenAreaBO getCheckTokenAreaBO(Long areaId){
        AreaDO areaDO = this.areaDaoManager.getById(areaId);
        CheckTokenAreaBO checkTokenAreaBO= CommonUtils.newInstance(areaDO,CheckTokenAreaBO.class);
        checkTokenAreaBO.setPath(areaDO.getLevelPath());

        //TODO fullName
        return checkTokenAreaBO;
    }
}
