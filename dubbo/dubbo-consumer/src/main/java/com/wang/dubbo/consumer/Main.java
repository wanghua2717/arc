package com.wang.dubbo.consumer;

import com.wang.dubbo.api.User;
import com.wang.dubbo.api.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Prevent to get IPV6 address,this way only work in debug mode
        //But you can pass use -Djava.net.preferIPv4Stack=true,then it work well whether in debug mode or not
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-consumer.xml"});
        context.start();
        UserService demoService = (UserService) context.getBean("userService"); // get remote service proxy

        while (true) {
            try {
                Thread.sleep(1000);
                User user =demoService.findById(100);
                System.out.println(user.getName());

            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }


        }

    }
}
