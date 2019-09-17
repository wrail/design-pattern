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

public class OrderPizza {

    OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            if (orderType.equals("cheese")){
                pizza = new CheesePizza();
                pizza.setName("芝士披萨");
            }else if (orderType.equals("pepper")){
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
            }else if (orderType.equals("geek")){
                pizza = new GeekPizza();
                pizza.setName("希腊披萨");
            }else {
                System.out.println("无此种类pizza");
                break;
            }
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
