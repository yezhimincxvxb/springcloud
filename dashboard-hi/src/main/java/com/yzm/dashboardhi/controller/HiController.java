package com.yzm.dashboardhi.controller;

import com.yzm.dashboardhi.feign.HiFeign;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HiController {

    @Resource
    private HiFeign hiFeign;

    @Value("${server.port}")
    private String port;

    @GetMapping("hello")
    public String hello(@RequestParam String name) {
        return "hi，" + name + " ! " + "访问端口号：" + port;
    }

    @GetMapping("hi")
    public String hi(@RequestParam String name) {
        return hiFeign.callHa(name);
    }

}
