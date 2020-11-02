package com.pie.aop.dynamic;

import com.pie.aop.service.ShopService;
import com.pie.aop.service.UserService;
import com.pie.aop.service.impl.ShopServiceImpl;
import com.pie.aop.service.impl.UserServiceImpl;

/**
 * @author LIN
 * @since JDK 1.8
 */
public class ProxyTest {
    public static void main(String[] args) {
        DynamicProxy dynamicProxy = new DynamicProxy();
        UserService userService = (UserService) dynamicProxy.getTarget(new UserServiceImpl());
        userService.login();
        ShopService shopService = (ShopService) dynamicProxy.getTarget(new ShopServiceImpl());
        shopService.add();
    }
}
