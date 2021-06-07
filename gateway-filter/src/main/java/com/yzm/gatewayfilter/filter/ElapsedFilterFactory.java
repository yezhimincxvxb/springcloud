package com.yzm.gatewayfilter.filter;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.core.style.ToStringCreator;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

/**
 * 自定义过滤器工厂
 */
@Slf4j
@Component
public class ElapsedFilterFactory extends AbstractGatewayFilterFactory<ElapsedFilterFactory.NameConfig> {

    private static final String TIME_BEGIN = "timeBegin";
    private static final String KEY = "withParams";

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList(KEY);
    }

    public ElapsedFilterFactory() {
        super(NameConfig.class);
    }

    @Override
    public GatewayFilter apply(NameConfig config) {
        return (exchange, chain) -> {
            exchange.getAttributes().put(TIME_BEGIN, System.currentTimeMillis());
            return chain.filter(exchange).then(
                    Mono.fromRunnable(() -> {
                        Long startTime = exchange.getAttribute(TIME_BEGIN);
                        if (startTime != null) {
                            StringBuilder sb = new StringBuilder(exchange.getRequest().getURI().getRawPath())
                                    .append(": ")
                                    .append(System.currentTimeMillis() - startTime)
                                    .append("ms");
                            if (config.isWithParams()) {
                                sb.append(" params:").append(exchange.getRequest().getQueryParams());
                            }
                            log.info(sb.toString());
                        }
                    })
            );
        };
    }

    @Data
    static class NameConfig {

        private boolean withParams;

        boolean isWithParams() {
            return withParams;
        }
    }

    public static class NameValueConfig {
        private String name;
        private String value;

        public NameValueConfig() {
        }

        public String getName() {
            return this.name;
        }

        public ElapsedFilterFactory.NameValueConfig setName(String name) {
            this.name = name;
            return this;
        }

        public String getValue() {
            return this.value;
        }

        public ElapsedFilterFactory.NameValueConfig setValue(String value) {
            this.value = value;
            return this;
        }

        public String toString() {
            return (new ToStringCreator(this)).append("name", this.name).append("value", this.value).toString();
        }
    }

}
