package com.lzw.common.redis.util;

import java.lang.reflect.ParameterizedType;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/9/6 15:14
 */
public class ClassUtil<D> {

    public Class<D> getTClass()
    {
        Class<D> tClass = (Class<D>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return tClass;
    }

}
