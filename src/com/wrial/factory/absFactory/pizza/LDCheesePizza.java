package com.wrial.factory.absFactory.pizza;
/*
 * @Author  Wrial
 * @Date Created in 9:10 2019/9/16
 * @Description Pizza 抽象类
 */


public class LDCheesePizza extends Pizza {


    @Override
    public void prepare() {
        setName("伦敦奶酪pizza");
        System.out.println("伦敦奶酪披萨准备完成");
    }
}
