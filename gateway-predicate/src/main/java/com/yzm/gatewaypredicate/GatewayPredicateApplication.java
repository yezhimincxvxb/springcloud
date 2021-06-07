package com.yzm.gatewaypredicate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GatewayPredicateApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayPredicateApplication.class, args);
    }

}
