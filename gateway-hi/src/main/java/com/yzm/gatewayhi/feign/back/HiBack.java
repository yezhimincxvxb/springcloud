package com.yzm.gatewayhi.feign.back;

import com.yzm.gatewayhi.feign.HiFeign;
import org.springframework.stereotype.Service;

@Service
public class HiBack implements HiFeign {
    @Override
    public String callHa(String name) {
        return "gateway-ha 服务挂了";
    }
}
