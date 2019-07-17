package com.lzw.wind.tibmas.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lzw.common.core.exception.CommonException;
import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.core.vo.ResponseVO;
import com.lzw.wind.tibmas.core.daomanager.LoginFailDaoManager;
import com.lzw.wind.tibmas.core.daomanager.UserDaoManager;
import com.lzw.wind.tibmas.core.dbo.LoginFailDO;
import com.lzw.wind.tibmas.core.dbo.UserDO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.RememberMeServices;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenBasedRememberMeServices;
import org.springframework.security.web.savedrequest.SavedRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import java.io.IOException;

import static org.springframework.security.config.Elements.REMEMBER_ME;

//import org.springframework.boot.actuate.autoconfigure.ManagementServerProperties;

/**
 * @author liys
 * @date 2018/6/89:11
 */
@Configuration
public class SecurityConfig  extends WebSecurityConfigurerAdapter {


    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private UserDaoManager userDaoManager;

    @Autowired
    private LoginFailDaoManager loginFailDaoManager;

    private static final ObjectMapper objectMapper=new ObjectMapper();

    //用户不存在
    private static final Integer USER_NOT_FOUND_ERROR_CODE=40003;

    //用户密码错误
    private static final Integer PASSWORD_ERROR_CODE=40004;

    //用户被锁定
    private static final Integer ACCOUNT_LOCKED=40005;

    //账号过期
    private static final Integer ACCOUNT_EXPIRED=40006;

    //参数非法
    private static final Integer PARAM_ERROR_CODE=1001;

    //没有找到数据
    private static final Integer DATA_NOT_FOUND_ERROR_CODE=1002;

    //验证码不存在
    private static final Integer VCODE_NOT_FOUND_ERROR_CODE=40001;

    //验证码错误
    private static final Integer VCODE_ERR_ERROR_CODE=40002;

    private final static String OAUTH2_CAPTCHA_KEY="OAUTH2_CAPTCHA_KEY";

    @Autowired
    private DataSource dataSource;


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        //登录失败次数及密码期限过滤器
        http.addFilterBefore(loginFailTimesFilter(),UsernamePasswordAuthenticationFilter.class);
        //验证码过滤器
        http.addFilterBefore(new VcodeFilter(),UsernamePasswordAuthenticationFilter.class);
        http.formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/loginProcessing")
                .successHandler(new AuthenticationSuccessHandler() {
                    //登录成功之发送json
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
                        String userAccount = httpServletRequest.getParameter("username");
                        UserDO userDO = userDaoManager.singleResultByUserAccount(userAccount);
                        //解锁
                        userDO.setLocked(0);
                        userDaoManager.updateAllProperties(userDO);
                        //清除失败记录
                        loginFailDaoManager.deleteByUserAccount(userAccount);
                        httpServletResponse.setContentType("application/json;charset=UTF-8");
                        //后面返回的
                        HttpSession session = httpServletRequest.getSession();
                        String redirectUri = null;
                        SavedRequest savedRequest = ((SavedRequest) session.getAttribute("SPRING_SECURITY_SAVED_REQUEST"));

                        if (savedRequest != null) {
                            redirectUri = savedRequest.getRedirectUrl();
                        }

                        httpServletResponse.getWriter().print(objectMapper.writeValueAsString(CommonUtils.okResponseVO(redirectUri)));
                    }
                })
                .permitAll()
                .failureHandler(new AuthenticationFailureHandler() {
                    /*@Override
                    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
                        String error = "OTHER";
                        if(e instanceof UsernameNotFoundException){
                            error = "USER_NOT_FOUND";
                        }else if (e instanceof BadCredentialsException){
                            error = "PASSWORD_ERROR";
                        }
                        else if (e instanceof InternalAuthenticationServiceException){
                            error = "PASSWORD_ERROR";
                        } else if (e instanceof LockedException) {
                            error = "ACCOUNT_LOCKED";
                        } else if (e instanceof AccountExpiredException) {
                            error = "ACCOUNT_EXPIRED";
                        }
                        response.sendRedirect("/login?errType="+error+"&username="+request.getParameter("username"));
                    }*/
                    //验证失败
                    @Override
                    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {

                        ResponseVO<String> rv = new ResponseVO<>();
                        if (e instanceof UsernameNotFoundException) {
                            rv.setCode(USER_NOT_FOUND_ERROR_CODE);
                            rv.setMsg("用户不存在");
                        } else if (e instanceof BadCredentialsException) {
                            //插入密码错误登录失败记录
                            inserFailLogin(httpServletRequest);
                            rv.setCode(PASSWORD_ERROR_CODE);
                            rv.setMsg("密码错误");
                        } else if (e instanceof InternalAuthenticationServiceException) {
                            //插入密码错误登录失败记录
                            inserFailLogin(httpServletRequest);
                            rv.setCode(PASSWORD_ERROR_CODE);
                            rv.setMsg("密码错误");
                        } else if (e instanceof LockedException) {
                            rv.setCode(ACCOUNT_LOCKED);
                            rv.setMsg("用户被锁定");
                        } else if (e instanceof AccountExpiredException) {
                            rv.setCode(ACCOUNT_EXPIRED);
                            rv.setMsg("账号过期");
                        } else {
                            rv.setCode(CommonException.DEFAULT_CODE);
                            rv.setMsg(e.getMessage());
                        }
                        httpServletResponse.setContentType("application/json;charset=UTF-8");
                        httpServletResponse.getWriter().print(objectMapper.writeValueAsString(rv));
                    }
                })
                .and()
                .logout()
                .logoutSuccessHandler(new LogoutSuccessHandler() {
                    @Override
                    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
                        String url = request.getParameter("url");
                        if (StringUtils.isBlank(url)) {
                            response.sendRedirect("/login");
                            return;
                        }
                        url = url.substring(0, url.lastIndexOf("/"));
                        response.sendRedirect(url);
                    }
                })
                .and()
                .authorizeRequests()
                .antMatchers("/webapi/oauth2Server/loginUserInfo", "/webapi/getClient", "/webapi/getQRcode", "/**")
                .permitAll()
                .and()
                .rememberMe()
                .tokenValiditySeconds(1209600)
                //指定记住登录信息所使用的数据源
                .rememberMeServices(rememberMeServices())
                .key("INTERNAL_SECRET_KEY")
                .and()
                .authorizeRequests()
                .anyRequest()
                .permitAll()
                .and()
                .csrf().disable();
        http.csrf().disable();
    }

    @Bean
    public RememberMeServices rememberMeServices() {
        JdbcTokenRepositoryImpl rememberMeTokenRepository = new JdbcTokenRepositoryImpl();
        rememberMeTokenRepository.setDataSource(dataSource);

        // 这里也注入了 UserDetailsSerice 实例
        PersistentTokenBasedRememberMeServices rememberMeServices =
                new PersistentTokenBasedRememberMeServices("INTERNAL_SECRET_KEY", userDetailsService, rememberMeTokenRepository);

        rememberMeServices.setParameter(REMEMBER_ME);
        return rememberMeServices;
    }

    @Bean
    public LoginFailTimesFilter loginFailTimesFilter(){
        LoginFailTimesFilter loginFailTimesFilter = new LoginFailTimesFilter();
        return loginFailTimesFilter;
    }

    private void inserFailLogin(HttpServletRequest httpServletRequest){
        String userAccount = httpServletRequest.getParameter("username");
        LoginFailDO loginFailDO = new LoginFailDO();
        loginFailDO.setUserAccount(userAccount);
        loginFailDaoManager.insertNotNullProperties(loginFailDO);
    }

}
