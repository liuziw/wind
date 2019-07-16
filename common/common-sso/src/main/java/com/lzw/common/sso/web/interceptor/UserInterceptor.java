package com.lzw.common.sso.web.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hyzs.common.sso.config.OAuth2AuthenticationExt;
import com.hyzs.gz.common.core.exception.CommonErrorCode;
import com.hyzs.gz.common.core.vo.ResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author chugz
 * @email chugz@hua-cloud.com.cn
 * @date 2018/4/8 12:35
 */

@Component
@Slf4j
public class UserInterceptor implements HandlerInterceptor{

    private static final ObjectMapper objectMapper=new ObjectMapper();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception {
        SecurityContext securityContext = (SecurityContext)request.getSession().getAttribute("SPRING_SECURITY_CONTEXT");
        if(securityContext == null){
            this.writeResponse(response);
            return false;
        }
        Authentication authentication = securityContext.getAuthentication();
        if(authentication!=null && (authentication instanceof OAuth2AuthenticationExt) && authentication.isAuthenticated() == true){
            return true;
        }
        else{
            this.writeResponse(response);
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

    private void writeResponse(HttpServletResponse response)throws Exception{
        response.setContentType("application/json;charset=UTF-8");
        ResponseVO<String> responseVO=new ResponseVO<>();
        responseVO.setCode(CommonErrorCode.SESSION_TIME_OUT);
        responseVO.setMsg("用户未登陆或身份已过期");
        response.getWriter().print(objectMapper.writeValueAsString(responseVO));
    }
}
