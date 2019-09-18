package com.wrial.factory.simpleFactory.pizzaStore.order;
/*
 * @Author  Wrial
 * @Date Created in 15:20 2019/9/16
 * @Description
 */

public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza();

        new OrderPizza2().useFactory(new SimpleFactory());
    }
}
