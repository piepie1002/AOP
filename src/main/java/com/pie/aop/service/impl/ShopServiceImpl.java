package com.pie.aop.service.impl;

import com.pie.aop.service.ShopService;

/**
 * @author LIN
 * @since JDK 1.8
 */
public class ShopServiceImpl implements ShopService {
    @Override
    public String add() {
        System.out.println("商品添加功能");
        return null;
    }
}
