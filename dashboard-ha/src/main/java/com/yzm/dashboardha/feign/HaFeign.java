package com.yzm.dashboardha.feign;

import com.yzm.dashboardha.feign.back.HaBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "dashboard-hi", fallback = HaBack.class)
public interface HaFeign {

    @GetMapping("hello")
    String callHi(@RequestParam String name);
}
