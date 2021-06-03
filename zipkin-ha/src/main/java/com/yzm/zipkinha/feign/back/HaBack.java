package com.yzm.zipkinha.feign.back;

import com.yzm.zipkinha.feign.HaFeign;
import org.springframework.stereotype.Service;

@Service
public class HaBack implements HaFeign {
    @Override
    public String callHi(String name) {
        return "zipkin-hi 服务挂了";
    }
}
