package com.wrial.builder.improve2;
/*
 * @Author  Wrial
 * @Date Created in 21:05 2019/9/19
 * @Description
 */

public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.buildBasic("1m").buildWalls("4m").roofed("水泥");
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();
        System.out.println(house.toString());

        HighHouse highHouse = new HighHouse();
        highHouse.buildBasic("5m").buildWalls("50m").roofed("玻璃");
        houseDirector.setHouseBuilder(highHouse);
        House house1 = houseDirector.constructHouse();
        System.out.println(house1);

    }
}
