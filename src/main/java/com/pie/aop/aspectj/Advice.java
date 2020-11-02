package com.pie.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


/**
 * @author LIN
 * @since JDK 1.8
 * 定义切面
 * (定义代理类)
 */
@Component
@Aspect
public class Advice {
    
    /**
     * 1.切入点
     *    1.1 value 表示切入点表达式(execution) 或者 注解 @annotation()
     *    1.2 execution 格式
     *      方法的可见性  *  返回类型 * 表示返回任意类型 String void 方法的包名+类名 ()  
     * 通配符
     * * 匹配任意数量的字符
     * ..可以匹配任意参数
     * 操作符
     * &&
     * ||
     * !
     */
    @Pointcut(value = "execution( public * com.pie.aop.service.UserService.register(..))")
    public void point(){
        
    }
    /**
     * 定义通知
     * 前置通知(Before)
     * 返回通知(After-returning)
     * 异常通知(after-throwing)
     * 环绕通知(Around)
     * 最终通知(After)
     */
    @Before(value = "point()")
     public void before(){
         System.out.println("前置通知");
     }
     @AfterReturning(value = "point()")
     public void afterReturning(){
         System.out.println("返回通知");
     }
     @AfterThrowing(value = "point()",throwing = "e")
     public void afterThrowing(Exception e){
         System.out.println(e.getMessage());
     }
     @Around("point()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
         System.out.println("环绕前");
         Object proceed = pjp.proceed();
         System.out.println("环绕后");
         return proceed;
     }
     @After("point()")
    public void after(){
         System.out.println("最终通知");
     }
}
