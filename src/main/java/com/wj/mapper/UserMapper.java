package com.wj.mapper;

import com.wj.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public  interface UserMapper {
        //新用户注册
        int register();
}
