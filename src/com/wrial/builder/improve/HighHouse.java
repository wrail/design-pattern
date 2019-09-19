package com.wrial.builder.improve;
/*
 * @Author  Wrial
 * @Date Created in 20:56 2019/9/19
 * @Description
 */

public class HighHouse extends HouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
        house.setBasic("20m");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼建墙");
        house.setWall("50m");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
        house.setRoofed("玻璃房顶");
    }
}
