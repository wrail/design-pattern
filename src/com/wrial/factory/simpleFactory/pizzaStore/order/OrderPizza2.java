package com.wrial.factory.simpleFactory.pizzaStore.order;
/*
 * @Author  Wrial
 * @Date Created in 15:02 2019/9/16
 * @Description Pizza订购窗口，可能会有多个订购窗口，如果要修改pizza种类的话，需要在每个OrderPizza都要改
 * 因此要引入简单工厂
 */

import com.wrial.factory.simpleFactory.pizzaStore.pizza.CheesePizza;
import com.wrial.factory.simpleFactory.pizzaStore.pizza.GeekPizza;
import com.wrial.factory.simpleFactory.pizzaStore.pizza.PepperPizza;
import com.wrial.factory.simpleFactory.pizzaStore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza2 {

    OrderPizza2() {

    }

    private SimpleFactory simpleFactory;

    Pizza pizza;
    public void setFactory(SimpleFactory simpleFactory) {
        String orderType = null;
        this.simpleFactory = simpleFactory;

        do {
            orderType = getType();
            pizza = simpleFactory.createPizza(orderType);
            if (pizza==null){
                System.out.println("订购失败");
                return;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);



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
