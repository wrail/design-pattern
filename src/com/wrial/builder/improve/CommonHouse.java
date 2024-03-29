package com.wrial.builder.improve;
/*
 * @Author  Wrial
 * @Date Created in 20:56 2019/9/19
 * @Description
 */

public class CommonHouse extends HouseBuilder{

    @Override
    public HouseBuilder buildBasic() {
        System.out.println("普通房子打地基");
        house.setBasic("2m");
        return this;
    }

    @Override
    public HouseBuilder buildWalls() {
        System.out.println("普通房子建墙");
        house.setWall("4m");
        return this;
    }

    @Override
    public HouseBuilder roofed() {
        System.out.println("普通房子封顶");
        house.setRoofed("水泥");
        return this;
    }
}
