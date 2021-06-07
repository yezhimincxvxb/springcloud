package com.yzm.gatewaylimit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class IndexController {

    @RequestMapping("/fallback")
    public Mono<String> fallback() {
        System.out.println("fallback");
        return Mono.just("fallback");
    }

}
