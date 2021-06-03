package com.yzm.dashboardha.feign.back;

import com.yzm.dashboardha.feign.HaFeign;
import org.springframework.stereotype.Service;

@Service
public class HaBack implements HaFeign {
    @Override
    public String callHi(String name) {
        return "dashboard-hi 服务挂了";
    }
}
