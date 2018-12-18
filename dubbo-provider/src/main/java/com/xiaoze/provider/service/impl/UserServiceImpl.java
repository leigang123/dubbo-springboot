package com.xiaoze.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xiaoze.api.service.UserService;

@Service(version = "${demo.service.version}")
public class UserServiceImpl implements UserService {
    @Override
    public String getIndex() {
        return "hahhahah";
    }
}
