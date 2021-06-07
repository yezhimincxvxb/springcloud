package com.yzm.gatewayhi.feign;

import com.yzm.gatewayhi.feign.back.HiBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "gateway-ha", fallback = HiBack.class)
public interface HiFeign {

    @GetMapping("hello")
    String callHa(@RequestParam String name);
}
