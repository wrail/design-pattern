package com.wrial.factory.absFactory.pizza;
/*
 * @Author  Wrial
 * @Date Created in 9:10 2019/9/16
 * @Description Pizza 抽象类
 */


public  class BJPepperPizza extends Pizza {


    @Override
    public void prepare() {
        setName("北京胡椒pizza");
        System.out.println("北京呼叫披萨准备完成");
    }
}
