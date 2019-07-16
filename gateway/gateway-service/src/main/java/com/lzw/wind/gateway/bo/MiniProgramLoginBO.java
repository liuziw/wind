package com.lzw.wind.gateway.bo;

import lombok.Data;

@Data
public class MiniProgramLoginBO {

    private String token;

    private String openId;

    private String sessionKey;

    private String unionId;
}
