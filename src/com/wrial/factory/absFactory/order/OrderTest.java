package com.wrial.factory.absFactory.order;
/*
 * @Author  Wrial
 * @Date Created in 20:37 2019/9/17
 * @Description
 */

public class OrderTest {


    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }
}
