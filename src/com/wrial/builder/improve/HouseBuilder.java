package com.wrial.builder.improve;
/*
 * @Author  Wrial
 * @Date Created in 20:50 2019/9/19
 * @Description
 */

public abstract class HouseBuilder {

    protected House house = new House();

    //构造流程
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    //将建造好的房子返回去
    public House buildHouse(){
        return house;
    }


}
