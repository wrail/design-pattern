package com.wrial.factory.absFactory.order;
/*
 * @Author  Wrial
 * @Date Created in 19:53 2019/9/17
 * @Description 抽象工厂=工厂模式+抽象方法模式
 */

import com.wrial.factory.absFactory.pizza.Pizza;

public interface AbsFactory {

    public Pizza createPizza(String orderType);
}
