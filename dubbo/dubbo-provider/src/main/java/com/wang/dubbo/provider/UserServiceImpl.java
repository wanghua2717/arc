package com.wang.dubbo.provider;

import com.wang.dubbo.api.User;
import com.wang.dubbo.api.UserService;

public class UserServiceImpl implements UserService {
    public User findById(long id) {
        User user =new User();
        user.setId(id);
        user.setName("useridnameis"+id);
        user.setSalary(100.20);
        return user;
    }
}
