package com.wrial.builder.improve;
/*
 * @Author  Wrial
 * @Date Created in 21:05 2019/9/19
 * @Description
 */

public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();
        System.out.println(house.toString());

        HighHouse highHouse = new HighHouse();
        houseDirector.setHouseBuilder(highHouse);
        House house1 = houseDirector.constructHouse();
        System.out.println(house1);

    }
}
