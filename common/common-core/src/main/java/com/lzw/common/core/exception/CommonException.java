package com.lzw.common.core.exception;

/**
 *
 * 通用异常，一般情况下在各分层都有可以抛出该异常，该异常在被{@link lzw.gz.common.core.web.controller.BaseController}处理
 *
 * User: liys
 * Date: 2017-11-14
 */
public class CommonException extends RuntimeException {

    public static final long serialVersionUID = -7034897190745766939L;

    public static final Integer DEFAULT_CODE=new Integer(500);


    /**
     * 异常编码
     */
    private Integer code = DEFAULT_CODE;


    /**
     * 异常信息
     */
    private String msg;


    private CommonException(String msg) {
        super(msg);
        this.msg = msg;
    }

    private CommonException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    private CommonException(String msg, Integer code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    private CommonException(String msg, Integer code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

    /**
     * 返回参数异常
     *
     * @see CommonErrorCode#PARAM_ERROR_CODE
     * @param msg
     * @return
     */
    public static CommonException paramException(String msg){
        return new CommonException(msg,CommonErrorCode.PARAM_ERROR_CODE);
    }


    /**
     * 返回一个错误编码为500的异常
     *
     * @see #DEFAULT_CODE
     * @param msg
     * @return
     */
    public static CommonException exception(String msg)
    {
        return new CommonException(msg);
    }

    /**
     * 返回一个错误编码为500的异常
     *
     * @param msg
     * @param e
     * @return
     */
    public static CommonException exception(String msg, Throwable e)
    {
        return new CommonException(msg,e);
    }

    /**
     * 返回指定错误编码及错误信息的异常
     *
     * @param msg
     * @param code
     * @return
     */
    public static CommonException exception(String msg, Integer code)
    {
        return new CommonException(msg,code);
    }

    /**
     * 返回指定错误编码及错误信息的异常
     * @param code
     * @param msg
     * @return
     */
    public static CommonException exception(Integer code,String msg)
    {
        return new CommonException(msg,code);
    }


    /**
     * 返回指定错误编码及错误信息的异常
     * @param msg
     * @param code
     * @param e
     * @return
     */
    public static CommonException exception(String msg, Integer code, Throwable e)
    {
        return new CommonException(msg,code,e);
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
