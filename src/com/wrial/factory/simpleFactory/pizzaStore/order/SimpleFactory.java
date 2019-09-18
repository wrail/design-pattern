package com.wrial.factory.simpleFactory.pizzaStore.order;
/*
 * @Author  Wrial
 * @Date Created in 15:23 2019/9/16
 * @Description
 */

import com.wrial.factory.simpleFactory.pizzaStore.pizza.CheesePizza;
import com.wrial.factory.simpleFactory.pizzaStore.pizza.GeekPizza;
import com.wrial.factory.simpleFactory.pizzaStore.pizza.PepperPizza;
import com.wrial.factory.simpleFactory.pizzaStore.pizza.Pizza;

public class SimpleFactory {

    String orderType;

    SimpleFactory() {

    }
    //创建pizza
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("芝士披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        } else if (orderType.equals("geek")) {
            pizza = new GeekPizza();
            pizza.setName("希腊披萨");
        }
        return pizza;
    }

    //静态简单工厂
    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("芝士披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        } else if (orderType.equals("greek")) {
            pizza = new GeekPizza();
            pizza.setName("希腊披萨");
        }
        return pizza;
    }
}
