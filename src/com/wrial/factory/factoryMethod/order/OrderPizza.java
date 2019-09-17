package com.wrial.factory.factoryMethod.order;

import com.wrial.factory.factoryMethod.pizza.Pizza;
import com.wrial.factory.simpleFactory.pizzaStore.pizza.CheesePizza;
import com.wrial.factory.simpleFactory.pizzaStore.pizza.GeekPizza;
import com.wrial.factory.simpleFactory.pizzaStore.pizza.PepperPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {


    //抽象出来一个创建pizza的抽象方法，由子类进行实现
    abstract Pizza createPizza(String orderType);

    OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    private String getType() {
        String s = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("输入要订购披萨的种类");
            s = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;

    }

}
