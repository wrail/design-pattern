package com.wrial.builder.improve;
/*
 * @Author  Wrial
 * @Date Created in 20:56 2019/9/19
 * @Description
 */

public class HighHouse extends HouseBuilder{


    @Override
    public HouseBuilder buildBasic() {
        System.out.println("高楼打地基");
        house.setBasic("10m");
        return this;
    }

    @Override
    public HouseBuilder buildWalls() {
        System.out.println("高楼建墙");
        house.setWall("100m");
        return this;
    }

    @Override
    public HouseBuilder roofed() {
        System.out.println("高楼封顶");
        house.setRoofed("玻璃");
        return this;
    }
}
