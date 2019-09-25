package com.wrial.builder.improve2;
/*
 * @Author  Wrial
 * @Date Created in 20:50 2019/9/19
 * @Description
 */

public abstract class HouseBuilder {

    protected House house = new House();

    //构造流程
    public abstract HouseBuilder buildBasic(String basic);
    public abstract HouseBuilder buildWalls(String wall);
    public abstract HouseBuilder roofed(String roofed);

    //将建造好的房子返回去
    protected House buildHouse(){
        return house;
    }


}
