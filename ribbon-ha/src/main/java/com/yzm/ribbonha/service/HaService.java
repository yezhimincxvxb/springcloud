package com.yzm.ribbonha.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HaService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "haError")
    public String callHi(String name) {
        return restTemplate.getForObject("http://ribbon-hi/hello?name=" + name, String.class);
    }

    public String haError(String name) {
        return "ha," + name + " , ribbon-hi 服务挂了!";
    }
}
