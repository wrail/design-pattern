package com.wrial.builder.improve;
/*
 * @Author  Wrial
 * @Date Created in 20:56 2019/9/19
 * @Description
 */

public class CommonHouse extends HouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
        house.setBasic("5m");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子建墙");
        house.setWall("10m");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
        house.setRoofed("水泥");
    }
}
