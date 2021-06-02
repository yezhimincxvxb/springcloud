package com.yzm.ribbonhi.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HiService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String callHa(String name) {
        return restTemplate.getForObject("http://ribbon-ha/hello?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "hi," + name + " , ribbon-ha 服务挂了!";
    }
}
