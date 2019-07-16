package com.lzw.common.core.exception;

/**
 *公共异常，编码从1001-1999
 * @author liys
 * @date 2018/3/1314:27
 */
public class CommonErrorCode {


    /**
     * 参数非法
     */
    public static Integer PARAM_ERROR_CODE=1001;

    /**
     * 没有找到数据
     */
    public static Integer DATA_NOT_FOUND_ERROR_CODE=1002;

    /**
     * 用户不存在
     */
    public static final int USER_NOT_FOUND = 1003;

    /**
     * 密码不正确
     */
    public static final int PASSWORD_NOT_RIGHT = 1004;

    /**
     * 找不到token信息
     */
    public static final int TOKEN_NOT_FOUND = 1005;

    /**
     * web端session失效码
     */
    public static final int SESSION_TIME_OUT = 403403;
}
