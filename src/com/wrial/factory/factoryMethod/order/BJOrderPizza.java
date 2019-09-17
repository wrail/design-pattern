package com.wrial.factory.factoryMethod.order;
/*
 * @Author  Wrial
 * @Date Created in 8:07 2019/9/17
 * @Description
 */

import com.wrial.factory.factoryMethod.pizza.BJCheesePizza;
import com.wrial.factory.factoryMethod.pizza.BJPepperPizza;
import com.wrial.factory.factoryMethod.pizza.Pizza;
import com.wrial.factory.simpleFactory.pizzaStore.pizza.PepperPizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
            pizza.setName("BJ Cheese Pizza");
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
            pizza.setName("BJ Pepper Pizza");
        }
        return pizza;
    }
}
