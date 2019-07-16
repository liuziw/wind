package com.lzw.wind.gateway.filter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "hyzs.auth", ignoreUnknownFields = true)
@Data
public class AuthProperties {
    public static enum AuthTypeEnum{
        NONE,//不做任何限制
        LOGIN,//统一鉴权session
        APP_SIGNATURE,//App端签名
        MINI_PROGRAM_SIGNATURE //小程序签名
    }


    @Data
    public static class MiniProgram{

        private String appId;

        private String appSecret;

    }


    /**
     * 鉴权类型
     */
    private AuthTypeEnum type;


    /**
     * 是否验证来源
     */
    private boolean checkChannel=true;


    /**
     * 是否验证token
     */
    private boolean checkToken=true;


    /**
     * 排除的antPath
     */
    private List<String> excludePaths;


    private MiniProgram miniProgram;


    private Map<String,String> serviceUrlMapping;
}
