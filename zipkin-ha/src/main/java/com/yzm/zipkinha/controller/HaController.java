package com.yzm.zipkinha.controller;

import com.yzm.zipkinha.feign.HaFeign;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HaController {

    @Resource
    private HaFeign haFeign;

    @Value("${server.port}")
    private String port;

    @GetMapping("hello")
    public String hello(@RequestParam String name) {
        return "ha，" + name + " ! " + "访问端口号：" + port;
    }

    @GetMapping("ha")
    public String ha(@RequestParam String name) {
        return haFeign.callHi(name);
    }

}
