package com.wrial.builder.improve2;
/*
 * @Author  Wrial
 * @Date Created in 20:56 2019/9/19
 * @Description
 */

public class HighHouse extends HouseBuilder {


    @Override
    public HouseBuilder buildBasic(String basic) {
        System.out.println("高楼打地基");
        house.setBasic(basic);
        return this;
    }

    @Override
    public HouseBuilder buildWalls(String wall) {
        System.out.println("高楼建墙");
        house.setWall(wall);
        return this;
    }

    @Override
    public HouseBuilder roofed(String wall) {
        System.out.println("高楼封顶");
        house.setRoofed(wall);
        return this;
    }
}
