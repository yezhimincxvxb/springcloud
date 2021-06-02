package com.yzm.feignha.feign.back;

import com.yzm.feignha.feign.HaFeign;
import org.springframework.stereotype.Service;

@Service
public class HaBack implements HaFeign {
    @Override
    public String callHi(String name) {
        return "feign-hi 服务挂了";
    }
}
