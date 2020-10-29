package com.dubbo.dubbo_service.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo_common.dubbo_common.service.UserService;
import org.springframework.stereotype.Component;

@Service(interfaceClass = UserService.class,weight = 100)
@Component
public class UserServiceImpl implements UserService {
    @Override
    public String hello() {
        return "你在使用dubbo1.";
    }
}
