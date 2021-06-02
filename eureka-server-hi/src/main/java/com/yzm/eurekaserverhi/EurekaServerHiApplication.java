package com.yzm.eurekaserverhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaServerHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerHiApplication.class, args);
    }

}
