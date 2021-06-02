package com.yzm.feignhi.feign;

import com.yzm.feignhi.feign.back.HiBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "feign-ha", fallback = HiBack.class)
public interface HiFeign {

    @GetMapping("hello")
    String callHa(@RequestParam String name);
}
