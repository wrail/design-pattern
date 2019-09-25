package com.wrial.builder.improve2;
/*
 * @Author  Wrial
 * @Date Created in 20:59 2019/9/19
 * @Description
 */

//指挥者，去指定制作流程，返回产品
public class HouseDirector {

    HouseBuilder houseBuilder;

    //构造方法中传入
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //通过setter设置
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        return houseBuilder.buildHouse();
    }


}
