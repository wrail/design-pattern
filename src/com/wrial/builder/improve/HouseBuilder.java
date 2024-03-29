package com.wrial.builder.improve;
/*
 * @Author  Wrial
 * @Date Created in 20:50 2019/9/19
 * @Description
 */

public abstract class HouseBuilder {

    protected House house = new House();

    //构造流程
    public abstract HouseBuilder buildBasic();
    public abstract HouseBuilder buildWalls();
    public abstract HouseBuilder roofed();

    //将建造好的房子返回去
    public House buildHouse(){
        return house;
    }


}
