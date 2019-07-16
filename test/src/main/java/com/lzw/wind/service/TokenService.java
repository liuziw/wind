package com.lzw.wind.service;

import com.lzw.wind.common.ServerResponse;

import javax.servlet.http.HttpServletRequest;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/7/11 15:31
 */
public interface TokenService {

    ServerResponse createToken();

    void checkToken(HttpServletRequest request);
}
