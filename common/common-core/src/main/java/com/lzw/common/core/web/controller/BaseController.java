package com.lzw.common.core.web.controller;


import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.core.vo.ResponseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 *所有Controller的父类.
 * <PRE>
 *     包含的功能主要如下：
 *      1.统一的异常处理
 * </PRE>
 * User: liys
 * Date: 2017-09-16
 */
public abstract class BaseController {


    private static final Logger logger= LoggerFactory.getLogger(BaseController.class);

    @ExceptionHandler
    public ResponseVO<?> exceptionHandler(HttpServletRequest request, Exception e)
    {
        logger.error("服务调用异常",e);
        ResponseVO<?> responseVO= CommonUtils.errorResponseVO(e);
        return responseVO;
    }

}
