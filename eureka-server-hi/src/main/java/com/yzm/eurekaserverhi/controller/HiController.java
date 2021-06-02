package com.yzm.eurekaserverhi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 提供服务
 */
@RestController
public class HiController {

    @Value("${server.port}")
    private String port;

    @GetMapping("hi")
    public String hi(@RequestParam String name) {
        return "hi，" + name + " ! " + "当前端口号：" + port;
    }
}