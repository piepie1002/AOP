package com.pie.aop.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author LIN
 * @since JDK 1.8
 */
public class CglibProxy implements MethodInterceptor {
    //代码生成器
    private Enhancer enhancer = new Enhancer();
    
    public Object getProxy(Class<?> cls){
        enhancer.setSuperclass(cls);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     *  
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("1.打开事务");
        //执行核心
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("3.提交事务");
        return o1;
    }
}
