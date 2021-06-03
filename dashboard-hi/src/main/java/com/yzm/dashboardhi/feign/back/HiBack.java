package com.yzm.dashboardhi.feign.back;

import com.yzm.dashboardhi.feign.HiFeign;
import org.springframework.stereotype.Service;

@Service
public class HiBack implements HiFeign {
    @Override
    public String callHa(String name) {
        return "dashboard-ha 服务挂了";
    }
}
