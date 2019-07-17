package com.lzw.common.sso;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author liys
 * @date 2018/6/2615:15
 */
public class SsoWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

    @Value("${wind.sso.logoutUrl}")
    private String ssoLoutUrl;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.logout().logoutUrl("/logout").logoutSuccessHandler(new LogoutSuccessHandler(){
            @Override
            public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
                StringBuffer requestURL = request.getRequestURL();
                response.sendRedirect(ssoLoutUrl+"?url="+requestURL);
            }
        });
    }

}
