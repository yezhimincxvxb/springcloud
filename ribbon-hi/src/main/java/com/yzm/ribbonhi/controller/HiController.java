package com.yzm.ribbonhi.controller;

import com.yzm.ribbonhi.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HiController {

    @Autowired
    private HiService hiService;

    @Value("${server.port}")
    private String port;

    @GetMapping("hello")
    public String hello(@RequestParam String name) {
        return "hi，" + name + " ! " + "访问端口号：" + port;
    }

    @GetMapping("hi")
    public String hi(@RequestParam String name) {
        return hiService.callHa(name);
    }

}
