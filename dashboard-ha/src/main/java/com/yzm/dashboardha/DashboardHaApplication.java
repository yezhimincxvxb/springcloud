package com.yzm.dashboardha;

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
public class DashboardHaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DashboardHaApplication.class, args);
    }

}
