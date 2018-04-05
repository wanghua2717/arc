package com.wang.dubbo.provider;

import com.wang.dubbo.api.User;
import com.wang.dubbo.api.UserService;
import org.apache.log4j.Logger;

public class UserServiceImpl implements UserService {
    public static final Logger logger=Logger.getLogger(UserServiceImpl.class);
    public User findById(long id) {
        logger.info("execute UserServiceImpl");
        User user =new User();
        user.setId(id);
        user.setName("useridnameis"+id);
        user.setSalary(100.20);
        try {
            Thread.sleep(120);
        }catch (Exception e){
        }
        logger.info("execute UserServiceImpl timeout 120ms");
        return user;
    }
}
