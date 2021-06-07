package com.yzm.gatewayroute.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/he/llo/**")
                        .filters(f -> f.
                                stripPrefix(2)
                                .addResponseHeader("hello", "world"))
                        .uri("lb://gateway-ha")
                )
                .build();
    }

}
