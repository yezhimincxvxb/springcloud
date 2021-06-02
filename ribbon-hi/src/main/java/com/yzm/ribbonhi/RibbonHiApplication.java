package com.yzm.ribbonhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RibbonHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonHiApplication.class, args);
    }

}
