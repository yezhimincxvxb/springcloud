package com.yzm.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HiController {

    @Value("${version}")
    private String version;

    @GetMapping("hi")
    public String hi() {
        return version;
    }
}
