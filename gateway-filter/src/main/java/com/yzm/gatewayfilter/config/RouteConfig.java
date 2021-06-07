package com.yzm.gatewayfilter.config;

import com.yzm.gatewayfilter.filter.ElapsedFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("to_gateway", r -> r
                        .path("/he/llo/**")
                        .filters(f -> f
                                .stripPrefix(2)
                                .filter(new ElapsedFilter())
                                .addRequestHeader("addRequest","request")
                                .addResponseHeader("addResponse", "response"))
                        .uri("lb://gateway-ha")
                )
                .build();
    }

}
