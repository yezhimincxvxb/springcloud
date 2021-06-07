package com.yzm.gatewayha.controller;

import com.yzm.gatewayha.feign.HaFeign;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

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

    //==============================================
    @PostMapping("post")
    public String post() {
        System.out.println("post");
        return "post";
    }

    @GetMapping("time")
    public String time() {
        System.out.println("time");
        return "time";
    }

    @GetMapping("/header")
    public String header(HttpServletRequest request) {
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            System.out.println(name + " = " + request.getHeader(name));
        }
        return "header";
    }

    @GetMapping("/cookie")
    public String cookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + " = " + cookie.getValue());
        }
        return "cookie";
    }

    @GetMapping("/host")
    public String host(HttpServletRequest request) {
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            System.out.println(name + " = " + request.getHeader(name));
        }
        return "host";
    }

    @GetMapping("/query")
    public String query(Integer number) {
        System.out.println(number);
        return "query";
    }

}
