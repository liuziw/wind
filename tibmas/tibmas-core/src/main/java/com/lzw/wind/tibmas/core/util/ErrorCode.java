package com.lzw.wind.tibmas.core.util;

/**
 * @author chenws
 * @email chenws@hua-cloud.com.cn
 * @date 2018/4/4
 * 错误/异常统一返回编码code
 */
public abstract class ErrorCode {

    /**
     * 用户不存在
     */
    public static final int USER_NOT_FOUND = 10001;

    /**
     * 密码不正确
     */
    public static final int PASSWORD_NOT_RIGHT = 10002;
    /**
     * 找不到token信息
     */
    public static final int TOKEN_NOT_FOUND = 10003;



}
