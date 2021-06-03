package com.yzm.dashboardturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@EnableEurekaClient
@SpringBootApplication
public class DashboardTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(DashboardTurbineApplication.class, args);
    }

}
