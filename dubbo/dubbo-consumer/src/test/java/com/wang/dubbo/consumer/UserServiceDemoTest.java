package com.wang.dubbo.consumer;

import com.wang.dubbo.api.User;
import com.wang.dubbo.api.UserService;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;



public class UserServiceDemoTest extends BaseJunit4Test{
    @Resource
    private UserService userService;


    @Test
    public void testFindUser() {
        User user =userService.findById(100);
        Assert.assertEquals(user.getName(),"useridnameis100");
    }
}