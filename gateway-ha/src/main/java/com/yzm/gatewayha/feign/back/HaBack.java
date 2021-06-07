package com.yzm.gatewayha.feign.back;

import com.yzm.gatewayha.feign.HaFeign;
import org.springframework.stereotype.Service;

@Service
public class HaBack implements HaFeign {
    @Override
    public String callHi(String name) {
        return "gateway-hi 服务挂了";
    }
}
