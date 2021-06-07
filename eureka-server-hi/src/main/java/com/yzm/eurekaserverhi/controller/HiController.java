package com.yzm.eurekaserverhi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Enumeration;

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