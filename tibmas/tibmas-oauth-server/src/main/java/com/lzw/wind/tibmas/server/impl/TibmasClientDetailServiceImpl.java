package com.lzw.wind.tibmas.server.impl;

import com.google.common.collect.Lists;
import com.lzw.wind.tibmas.core.daomanager.AppDaoManager;
import com.lzw.wind.tibmas.core.dbo.AppDO;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.NoSuchClientException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;

/**
 * @author liys
 * @date 2018/6/89:17
 */
@Service
public class TibmasClientDetailServiceImpl implements ClientDetailsService {


    private AppDaoManager appDaoManager;

    public TibmasClientDetailServiceImpl(AppDaoManager appDaoManager) {
        this.appDaoManager = appDaoManager;
    }

    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        AppDO appDO = appDaoManager.singleResultByAppCode(clientId);
        if(appDO==null){
            throw new NoSuchClientException("没有找到clientId:"+clientId);
        }
        BaseClientDetails clientDetails=new BaseClientDetails();
        clientDetails.setClientId(clientId);
        clientDetails.setClientSecret(appDO.getAccessKey());
//        clientDetails.setClientSecret(clientId);
        clientDetails.setAuthorizedGrantTypes(Lists.newArrayList("authorization_code","implicit","password","client_credentials"));
//        clientDetails.isAutoApprove("all");
        clientDetails.setAutoApproveScopes(Lists.newArrayList("all"));
        clientDetails.setScope(Lists.newArrayList("all"));
        return clientDetails;
    }
}
