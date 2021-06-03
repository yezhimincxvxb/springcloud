package com.yzm.zipkinha.feign;

import com.yzm.zipkinha.feign.back.HaBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "zipkin-hi", fallback = HaBack.class)
public interface HaFeign {

    @GetMapping("hello")
    String callHi(@RequestParam String name);
}
