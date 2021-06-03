package com.example.zipkinhi.feign.back;

import com.example.zipkinhi.feign.HiFeign;
import org.springframework.stereotype.Service;

@Service
public class HiBack implements HiFeign {
    @Override
    public String callHa(String name) {
        return "zipkin-ha 服务挂了";
    }
}
