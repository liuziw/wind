package com.lzw.wind.gateway.enums;


import org.springframework.http.HttpStatus;

/**
 * 鉴权信息
 */
public enum AuthInfoEnum {

    OK(HttpStatus.OK,"OK"),
    USER_NOT_LOGIN(HttpStatus.UNAUTHORIZED,"用户未登录"),
    CHECK_CHANNEL_ERROR(HttpStatus.FORBIDDEN,"来源验证失败"),
    CHECK_TOKEN_ERROR(HttpStatus.FORBIDDEN,"来源验证失败"),
    CHECK_FILE_SERVICE_TOKEN_ERROR(HttpStatus.FORBIDDEN,"文件服务验证失败");

        /**
         * {@linkplain HttpStatus#OK}表示鉴权通过
         */
        private HttpStatus status;

        private String info;

        private AuthInfoEnum(HttpStatus status, String info) {
            this.status = status;
            this.info = "GATEWAY_AUTH_ERROR:"+info;
        }


        public HttpStatus getStatus() {
            return status;
        }


        public String getInfo() {
            return info;
        }
}