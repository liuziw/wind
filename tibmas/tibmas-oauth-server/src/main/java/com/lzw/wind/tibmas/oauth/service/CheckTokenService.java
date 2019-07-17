package com.lzw.wind.tibmas.oauth.service;


import com.lzw.wind.tibmas.oauth.bo.CheckTokenUserInfoBO;

public interface CheckTokenService {

    public CheckTokenUserInfoBO getUserInfo(Long userId, Long appId);


}
