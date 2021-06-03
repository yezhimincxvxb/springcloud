package com.yzm.dashboardhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@EnableHystrixDashboard
@EnableHystrix
@SpringBootApplication
public class DashboardHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DashboardHiApplication.class, args);
    }

}
