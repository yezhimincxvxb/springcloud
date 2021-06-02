package com.yzm.ribbonha.controller;

import com.yzm.ribbonha.service.HaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HaController {

    @Autowired
    private HaService haService;

    @Value("${server.port}")
    private String port;

    @GetMapping("hello")
    public String hello(@RequestParam String name) {
        return "ha，" + name + " ! " + "访问端口号：" + port;
    }

    @GetMapping("ha")
    public String ha(@RequestParam String name) {
        return haService.callHi(name);
    }

}
