package com.yzm.ribbonha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RibbonHaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonHaApplication.class, args);
    }

}
