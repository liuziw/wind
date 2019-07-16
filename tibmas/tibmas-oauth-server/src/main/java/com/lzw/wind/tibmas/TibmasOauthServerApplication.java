package com.lzw.wind.tibmas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @author liys
 * @date 2018/6/89:06
 */
@SpringBootApplication
@EnableEurekaClient
@EnableAuthorizationServer
@EnableFeignClients
public class TibmasOauthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TibmasOauthServerApplication.class,args);
    }
}
