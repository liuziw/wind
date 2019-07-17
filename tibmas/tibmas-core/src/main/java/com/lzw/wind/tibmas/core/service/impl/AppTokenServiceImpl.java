package com.lzw.wind.tibmas.core.service.impl;

import com.lzw.wind.tibmas.core.daomanager.AppTokenInfoDaoManager;
import com.lzw.wind.tibmas.core.dbo.AppTokenInfoDO;
import com.lzw.wind.tibmas.core.service.AppTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/8/15 11:10
 */
@Service
public class AppTokenServiceImpl implements AppTokenService {

    @Autowired
    private AppTokenInfoDaoManager appTokenInfoDaoManager;

    public Long getUserIdByToken(String token){
        AppTokenInfoDO appTokenInfoDO = appTokenInfoDaoManager.singleResultByToken(token);
        if(appTokenInfoDO !=null){
            return appTokenInfoDO.getUserId();
        }
        return null;
    }
}
