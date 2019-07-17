package com.lzw.common.sso.config;

import com.lzw.common.sso.web.interceptor.UserInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author chugz
 * @email chugz@hua-cloud.com.cn
 * @date 2018/4/8 12:28
 */

@Configuration
public class SsoWebMvcConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private UserInterceptor userInterceptor;

    //拦截的url
    @Value("${wind.auth.urls:/webapi/**,/api/**}")
    private String [] urls;

    //排除的url
    @Value("${wind.auth.excludeUrls:/login,/logout}")
    private String [] excludeUrls;

    @Value("${spring.profiles.active:/dev}")
    String active;

    //添加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        if (!active.equals("dev")) {
            InterceptorRegistration interceptorRegistration = registry.addInterceptor(this.userInterceptor);
            //拦截的url
            if(urls != null && urls.length>0){
                interceptorRegistration.addPathPatterns(urls);
            }
            //排除的url
            if(excludeUrls != null && excludeUrls.length>0){
                interceptorRegistration.excludePathPatterns(excludeUrls);
            }
            interceptorRegistration.excludePathPatterns("/login");
            interceptorRegistration.excludePathPatterns("/logout");
            interceptorRegistration.excludePathPatterns("/webapi/loginUserInfo");
            super.addInterceptors(registry);
        }

    }

}