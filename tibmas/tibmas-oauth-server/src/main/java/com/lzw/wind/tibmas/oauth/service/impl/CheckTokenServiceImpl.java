package com.lzw.wind.tibmas.oauth.service.impl;

import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.tibmas.core.bo.ListPermInfoByUserIdAndAppIdBO;
import com.hyzs.tibmas.core.bo.ListTeamInfoByUserIdBO;
import com.hyzs.tibmas.core.daomanager.AppDaoManager;
import com.hyzs.tibmas.core.daomanager.AreaDaoManager;
import com.hyzs.tibmas.core.daomanager.DeptDaoManager;
import com.hyzs.tibmas.core.daomanager.UserDaoManager;
import com.hyzs.tibmas.core.dbo.AppDO;
import com.hyzs.tibmas.core.dbo.AreaDO;
import com.hyzs.tibmas.core.dbo.DeptDO;
import com.hyzs.tibmas.core.dbo.UserDO;
import com.hyzs.tibmas.core.manager.TibmasManager;
import com.hyzs.tibmas.core.service.TeamUserService;
import com.hyzs.tibmas.oauth.bo.*;
import com.hyzs.tibmas.oauth.service.CheckTokenService;
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



        //TODO 这里有代码有很多重复的，下一步需要看看怎么抽取
        this.tibmasManager.push2Redis(userId);

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
