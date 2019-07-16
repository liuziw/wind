package com.lzw.common.sso.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.autoconfigure.security.oauth2.resource.ResourceServerProperties;
import org.springframework.lang.Nullable;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;

/**
 * @author liys
 * @date 2018/11/716:03
 */
//@Component

    //无效的代码 liyinshan 20181213
@Slf4j
@Deprecated
public class HyzsRemoteTokenServicesPostProcessor implements BeanPostProcessor{


    @Autowired
    private  ResourceServerProperties resource;


    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof RemoteTokenServices){
            log.warn("HyzsRemoteTokenServices init...");
            HyzsRemoteTokenServices services = new HyzsRemoteTokenServices();
            services.setCheckTokenEndpointUrl(this.resource.getTokenInfoUri());
            services.setClientId(this.resource.getClientId());
            services.setClientSecret(this.resource.getClientSecret());
            return services;
        }
        return bean;
    }
}
