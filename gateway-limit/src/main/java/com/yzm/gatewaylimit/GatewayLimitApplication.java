package com.yzm.gatewaylimit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GatewayLimitApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayLimitApplication.class, args);
    }

}
