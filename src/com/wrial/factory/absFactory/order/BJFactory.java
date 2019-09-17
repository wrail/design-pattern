package com.wrial.factory.absFactory.order;
/*
 * @Author  Wrial
 * @Date Created in 19:56 2019/9/17
 * @Description BJ Factory
 */

import com.wrial.factory.absFactory.pizza.BJCheesePizza;
import com.wrial.factory.absFactory.pizza.BJPepperPizza;
import com.wrial.factory.absFactory.pizza.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
            pizza.setName("BJ Cheese Pizza");
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
            pizza.setName("BJ Pepper Pizza");
        }else {
            System.out.println("无此pizza");
        }
        return pizza;
    }
}
