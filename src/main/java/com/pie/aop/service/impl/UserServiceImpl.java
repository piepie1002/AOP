package com.pie.aop.service.impl;

import com.pie.aop.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author LIN
 * @since JDK 1.8
 */
@Service
public class UserServiceImpl implements UserService {   
    @Override
    public String login() {
        System.out.println("2.核心登录功能");
        return "核心";
    }

    @Override
    public String register() {
        return null;
    }

    @Override
    public String toList() {
        return null;
    }
}
