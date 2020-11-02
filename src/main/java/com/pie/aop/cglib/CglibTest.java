package com.pie.aop.cglib;

import com.pie.aop.service.UserService;
import com.pie.aop.service.impl.UserServiceImpl;

/**
 * @author LIN
 * @since JDK 1.8
 */
public class CglibTest {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        UserService proxy = (UserService) cglibProxy.getProxy(UserServiceImpl.class);
        String login = proxy.login();
        System.out.println(login);
    }
}
