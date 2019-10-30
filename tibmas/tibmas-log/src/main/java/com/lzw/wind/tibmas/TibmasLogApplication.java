package com.lzw.wind.tibmas;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableDistributedTransaction
public class TibmasLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(TibmasLogApplication.class,args);
    }
}
