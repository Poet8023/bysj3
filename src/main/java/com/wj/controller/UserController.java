package com.wj.controller;

import com.wj.service.UserService;
import com.wj.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("controller")
@Controller
public class UserController {
    //controller层依赖于service层
    @Autowired
    private UserService userService;
    @RequestMapping("register")
    public String register(){
        int cout=userService.register();
         System.out.println(cout);
        return "success";
    }
}
