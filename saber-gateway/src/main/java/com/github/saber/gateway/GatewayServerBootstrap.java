package com.github.saber.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

/**
 * <b>Description:</b>
 * <br><b>ClassName:</b> GatewayServerBootstrap
 * <br><b>Date:</b> 2018年7月12日 下午5:28:40
 * <br>@author <b>jianb.jiang</b>
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients({"com.github.saber.auth.client.feign","com.github.saber.gateway.feign"})
@RestController
public class GatewayServerBootstrap {
    
    @RequestMapping("/health")
    public Mono<String> home() {
        return Mono.just("Hello World,I'm GatewayServer");
    }
    
    /**
     * <b>Description.:熔断fallback测试方法</b><br>
     * <b>Author:jianb.jiang</b>
     * <br><b>Date:</b> 2018年7月27日 下午3:17:12
     * <br><b>BackLog:</b> 禅道需求编号
     * @return
     */
    @RequestMapping("/myfallback")
    public Mono<String> fallback() {
        return Mono.just("您拨打的用户忙，请稍后再拨！");
    }
    
    public static void main(String[] args) {
        SpringApplication.run(GatewayServerBootstrap.class, args);
    }
    
    @Bean
    KeyResolver hostKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostString());
    }
}
