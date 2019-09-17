package com.wrial.factory.absFactory.pizza;
/*
 * @Author  Wrial
 * @Date Created in 9:10 2019/9/16
 * @Description Pizza 抽象类
 */


public class BJCheesePizza extends Pizza  {


    @Override
    public void prepare() {
        setName("北京奶酪pizza");
        System.out.println("北京奶酪披萨准备完成");
    }
}
