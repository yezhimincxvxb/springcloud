package com.yzm.feignha.feign;

import com.yzm.feignha.feign.back.HaBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "feign-hi", fallback = HaBack.class)
public interface HaFeign {

    @GetMapping("hello")
    String callHi(@RequestParam String name);
}
