package com.github.saber.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.saber.user.entity.User;
import com.github.saber.user.service.UserService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * <p>
 * 用户信息表，保存用户信息。 前端控制器
 * </p>
 *
 * @author jianb.jiang
 * @since 2018-08-07
 */
@Controller
@RestController
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping("/list")
    public Flux<User> list() {
        return Flux.fromStream(userService.listAll().stream());
    }
    

    @RequestMapping("/add")
    public Mono<User> add() {
        User u = new User();
        u.setPid(0l);
        return Mono.create(monoSink -> {
            userService.insert(u);
            monoSink.success(u);
        });
    }
}

