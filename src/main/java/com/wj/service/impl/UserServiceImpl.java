package com.wj.service.impl;

import com.wj.mapper.UserMapper;
import com.wj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//@Service将UserServiceimpl纳入spring IOC容器中
@Service
public class UserServiceImpl implements UserService {
    //service依赖于dao层（Mapper层）
    //通过@Autowired自动装配方式，从IoC容器中去查找到UserMapper，并返回给该属性userMapper
    @Autowired
    private UserMapper userMapper;

    public int register() {
        return userMapper.register();
    }
}
