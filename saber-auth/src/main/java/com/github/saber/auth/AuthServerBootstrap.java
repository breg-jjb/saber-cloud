package com.github.saber.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

/**
 * <b>Description:</b>
 * <br><b>ClassName:</b> AuthServerBootstrap
 * <br><b>Date:</b> 2018年7月25日 上午11:00:09
 * <br>@author <b>jianb.jiang</b>
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class AuthServerBootstrap {
    
    @RequestMapping("/health")
    public Mono<String> home() {
        return Mono.just("Hello World,I'm AuthServer");
    }
    
    @RequestMapping("/test")
    public Mono<String> test() {
        return Mono.just("test");
    }
    
    public static void main(String[] args) {
        SpringApplication.run(AuthServerBootstrap.class, args);
    }
}
