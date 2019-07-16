package com.lzw.common.core.web.aop;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * 输出{@linkplain org.springframework.web.bind.annotation.RequestMapping}注解方法的执行日志.
 * <PRE>
 *     每个请求输出一个行日志，字段之间以char(01)分隔,字段信息如下：
 *     1.本次调用成功与否：SUCC-成功，FAIL-失败
 *     2.耗时，单位：毫秒
 *     3.请求uri
 *     4.请求方法:GET/POST等
 *     5.方法入参
 *     6.方法返回对象，如果异常为异常信息
 *
 *     注：char(01)为1的assci码，不可见字符，方法后续的日志入库
 * </PRE>
 *
 * User: liys
 * Date: 2017-09-21
 */
@Component
@Aspect
public class ControllerLoggerAspect {

    private static final Logger logger= LoggerFactory.getLogger(ControllerLoggerAspect.class);


    private static final Character CHAR_01=01;

    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void controllerMethodPointcut(){}


    @Around("controllerMethodPointcut()")
    public Object  doLog(ProceedingJoinPoint joinPoint) throws Throwable
    {
        if(!logger.isInfoEnabled())
        {
            return joinPoint.proceed();
        }
        RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
        ServletRequestAttributes servletRequestAttributes=(ServletRequestAttributes)requestAttributes;
        HttpServletRequest request=servletRequestAttributes.getRequest();
        String uri=request.getRequestURI();
        String method=request.getMethod();
        String methodParams= ArrayUtils.toString(joinPoint.getArgs());
        long start=System.currentTimeMillis();
        try
        {
            Object rspObj=joinPoint.proceed();
            if(rspObj!=null && rspObj.toString().length()>512)
            {
                logger.info("SUCC{}{}{}{}{}{}{}{}{}{}",CHAR_01,System.currentTimeMillis()-start,CHAR_01,uri,CHAR_01,method,CHAR_01,methodParams,CHAR_01,StringUtils.substring(rspObj.toString(),0,500));
            }
            else
            {
                logger.info("SUCC{}{}{}{}{}{}{}{}{}{}",CHAR_01,System.currentTimeMillis()-start,CHAR_01,uri,CHAR_01,method,CHAR_01,methodParams,CHAR_01,rspObj);
            }
            return rspObj;
        }
        catch (Throwable e)
        {
            logger.info("FAIL{}{}{}{}{}{}{}{}{}{}",CHAR_01,System.currentTimeMillis()-start,CHAR_01,uri,CHAR_01,method,CHAR_01,methodParams,CHAR_01,e.getMessage());
            throw e;
        }
    }

}
