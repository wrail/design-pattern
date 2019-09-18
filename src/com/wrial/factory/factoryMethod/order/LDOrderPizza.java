package com.wrial.factory.factoryMethod.order;
/*
 * @Author  Wrial
 * @Date Created in 8:07 2019/9/17
 * @Description
 */

import com.wrial.factory.factoryMethod.pizza.*;

public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
            pizza.setName("LD Cheese Pizza");
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
            pizza.setName("LD Pepper Pizza");
        }
        return pizza;
    }
}
