package com.lzw.wind.tibmas.config;

import com.hyzs.gz.common.core.util.CommonUtils;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/12/26 11:13
 */
public class VcodeFilter implements Filter {

    //验证码不存在
    private static final Integer VCODE_NOT_FOUND_ERROR_CODE=40001;

    //验证码错误
    private static final Integer VCODE_ERR_ERROR_CODE=40002;

    private final static String OAUTH2_CAPTCHA_KEY="OAUTH2_CAPTCHA_KEY";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        filterConfig.getFilterName();
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String requestURI = httpServletRequest.getRequestURI();
        String method=httpServletRequest.getMethod();
        if(!(StringUtils.equals("/loginProcessing",requestURI)&&StringUtils.equalsIgnoreCase(method,"post")))
        {
            chain.doFilter(request,response);
            return;
        }
        //设置admin用户和包含test的用户不需进行验证码验证
        String username = httpServletRequest.getParameter("username");
        if(username != null && (username.toUpperCase().contains("TEST") || StringUtils.equals(username,"admin") || username.toUpperCase().contains("TOKEN:"))){
            chain.doFilter(request,response);
            return;
        }

        String vcode=httpServletRequest.getParameter("vcode");
        HttpSession session = httpServletRequest.getSession();
        //获取验证码
        String sessionCaptcha = (String) session.getAttribute(OAUTH2_CAPTCHA_KEY);

        //session中的验证码不存在
        if (StringUtils.isBlank(sessionCaptcha)) {
            CommonUtils.responseMsg(response,VCODE_NOT_FOUND_ERROR_CODE,"验证码异常");
            return;

        }
        //清除session中验证码
        session.removeAttribute(OAUTH2_CAPTCHA_KEY);

        //验证码错误
        if(!StringUtils.equalsAnyIgnoreCase(sessionCaptcha,vcode)){
            CommonUtils.responseMsg(response,VCODE_ERR_ERROR_CODE,"验证码错误");
            return;
        }
        chain.doFilter(request,response);
    }
    @Override
    public void destroy() {

    }

}
