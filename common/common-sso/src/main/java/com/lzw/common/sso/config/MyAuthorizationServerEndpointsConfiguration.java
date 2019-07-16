package com.lzw.common.sso.config;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.autoconfigure.security.oauth2.resource.ResourceServerProperties;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.DefaultAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/7/5 22:38
 */
@Component
@Slf4j
public class MyAuthorizationServerEndpointsConfiguration implements BeanPostProcessor {

    @Autowired
    private ResourceServerProperties resource;


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof RemoteTokenServices){
            RemoteTokenServices tokenServices=(RemoteTokenServices)bean;
            log.warn("HyzsRemoteTokenServices init...");
            HyzsRemoteTokenServices services = new HyzsRemoteTokenServices();
            services.setCheckTokenEndpointUrl(this.resource.getTokenInfoUri());
            services.setClientId(this.resource.getClientId());
            services.setClientSecret(this.resource.getClientSecret());
            services.setAccessTokenConverter(new DefaultAccessTokenConverter(){
                @Override
                public OAuth2AccessToken extractAccessToken(String value, Map<String, ?> map) {
                    return super.extractAccessToken(value, map);
                }

                @Override
                public OAuth2Authentication extractAuthentication(Map<String, ?> map) {
                    OAuth2Authentication oAuth2Authentication= super.extractAuthentication(map);
                    //oAuth2Authentication.setDetails("liyinshan");
                    OAuth2AuthenticationExt ext=new OAuth2AuthenticationExt(oAuth2Authentication.getOAuth2Request(),oAuth2Authentication.getUserAuthentication());
                    String userInfoJson = "{}";
                    if(map.get("userInfo") != null){
                        userInfoJson = (String)map.get("userInfo");
                    }
                    log.warn("userInfo={}",userInfoJson);
//                    JSONObject jsonObject = JSON.parseObject(userInfoJson);
//                    UserInfo userInfo = JSON.parseObject(JSONObject.toJSONString(jsonObject),UserInfo.class);
                    UserInfo userInfo = JSON.parseObject(userInfoJson,UserInfo.class);
                    System.out.println(userInfoJson);
                    ext.setUserInfo(userInfo);
                    return  ext;
                }
            });
            return services;
        }
        return bean;
    }
}
