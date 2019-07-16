package com.lzw.common.core.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 *
 * SpringMVC Controller中RequestMapping方法统一的返回对象.
 *
 * User: liys
 * Date: 2017-09-16
 */
@ApiModel(description = "统一返回对象")
public class ResponseVO<T> implements Serializable{


    private static final long serialVersionUID = 6775422262797117144L;


    /**
     * 错误编码.0表示成功，其他表示失败.
     */
    @ApiModelProperty(value = "返回编码 0表示成功，其他表示失败")
    private Integer code;

    /**
     * 错误信息
     */
    @ApiModelProperty(value = "错误信息")
    private String msg;


    /**
     * 返回的业务数据
     */
    @ApiModelProperty(value = "返回的业务数据")
    private T data;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ResponseVO{");
        sb.append("code=").append(code);
        sb.append(", msg='").append(msg).append('\'');
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
