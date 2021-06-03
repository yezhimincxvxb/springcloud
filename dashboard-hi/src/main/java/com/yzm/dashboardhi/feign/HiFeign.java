package com.yzm.dashboardhi.feign;

import com.yzm.dashboardhi.feign.back.HiBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "dashboard-ha", fallback = HiBack.class)
public interface HiFeign {

    @GetMapping("hello")
    String callHa(@RequestParam String name);
}
