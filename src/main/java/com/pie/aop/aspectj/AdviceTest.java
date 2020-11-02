package com.pie.aop.aspectj;

import com.pie.aop.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LIN
 * @since JDK 1.8
 */
public class AdviceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
        UserService userService = applicationContext.getBean("userServiceImpl", UserService.class);
        String register = userService.register();
        System.out.println(register);
    }
}
