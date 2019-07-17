package com.lzw.wind.tibmas.log.config;

import com.lzw.common.sso.SsoWebSecurityConfigurerAdapter;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableOAuth2Sso
public class SecurityConfig extends SsoWebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
        //http.authorizeRequests().antMatchers("/webapi/optrlog/*").permitAll().and();
        http.authorizeRequests().anyRequest().permitAll();
    }
}
