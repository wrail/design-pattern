package com.wrial.factory.absFactory.order;
/*
 * @Author  Wrial
 * @Date Created in 20:31 2019/9/17
 * @Description
 */

import com.wrial.factory.absFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    AbsFactory absFactory;
    OrderPizza(AbsFactory absFactory) {
        String orderType = null;
        this.absFactory = absFactory;
        do {
            orderType = getType();
            Pizza pizza = absFactory.createPizza(orderType);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("购买失败");
                break;
            }
        } while (true);
    }

    public String getType(){
        String s = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("输入要订购披萨的种类");
            s = bufferedReader.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return s;
    }

}
