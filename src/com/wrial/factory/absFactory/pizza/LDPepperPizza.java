package com.wrial.factory.absFactory.pizza;
/*
 * @Author  Wrial
 * @Date Created in 9:10 2019/9/16
 * @Description Pizza 抽象类
 */


public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("伦敦胡椒披萨准备完成");
    }
}
