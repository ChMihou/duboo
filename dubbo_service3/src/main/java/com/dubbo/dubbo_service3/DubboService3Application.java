package com.dubbo.dubbo_service3;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboService3Application {

    public static void main(String[] args) {
        SpringApplication.run(DubboService3Application.class, args);
    }

}
