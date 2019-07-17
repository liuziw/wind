package com.lzw.wind.tibmas.core.vo;

import com.lzw.wind.tibmas.core.bo.Oauth2UserBO;
import lombok.Data;

/**
 * @author liys
 * @date 2018/3/1420:49
 */
@Data
public class LoginVO {
    private Oauth2UserBO userInfo;

    private String redirectUri;

    private String message;
}
