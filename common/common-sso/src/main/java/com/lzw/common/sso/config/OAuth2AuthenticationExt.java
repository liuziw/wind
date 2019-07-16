package com.lzw.common.sso.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.OAuth2Request;

import java.io.Serializable;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/7/5 23:02
 */
public class OAuth2AuthenticationExt extends OAuth2Authentication implements Serializable {
    public OAuth2AuthenticationExt(OAuth2Request storedRequest, Authentication userAuthentication) {
        super(storedRequest,userAuthentication);
    }


    private UserInfo userInfo;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
