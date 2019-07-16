package com.lzw.wind.tibmas.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liys
 * @date 2018/6/149:33
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class TibmasWebApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TibmasWebApiApplication.class,args);
    }

}
