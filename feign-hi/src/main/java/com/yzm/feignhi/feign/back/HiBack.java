package com.yzm.feignhi.feign.back;

import com.yzm.feignhi.feign.HiFeign;
import org.springframework.stereotype.Service;

@Service
public class HiBack implements HiFeign {
    @Override
    public String callHa(String name) {
        return "feign-ha 服务挂了";
    }
}
