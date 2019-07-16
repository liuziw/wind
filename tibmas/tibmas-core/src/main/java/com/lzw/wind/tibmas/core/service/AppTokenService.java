package com.lzw.wind.tibmas.core.service;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/8/15 11:10
 */
public interface AppTokenService {

    /**
     * 根据appToken得到用户id
     * @param token
     * @return
     */
    Long getUserIdByToken(String token);
}
