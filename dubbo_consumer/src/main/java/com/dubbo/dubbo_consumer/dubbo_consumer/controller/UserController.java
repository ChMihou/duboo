package com.dubbo.dubbo_consumer.dubbo_consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.dubbo_consumer.dubbo_consumer.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Reference
    UserService userService;

    @GetMapping("hello")
    public String hello() {
        String TestForDubbo = "";
        for (int i = 0; i < 9; i++) {
            TestForDubbo += userService.hello();
        }
        return TestForDubbo;
    }
}
