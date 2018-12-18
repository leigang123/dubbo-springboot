package com.xiaoze.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xiaoze.api.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserConsumerController {

    @Reference(version = "${demo.service.version}")
    UserService userService;

    @GetMapping("/getIndex")
    public String getIndex(){
        return userService.getIndex();
    }
}
