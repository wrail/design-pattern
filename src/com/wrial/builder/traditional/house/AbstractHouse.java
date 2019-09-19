package com.wrial.builder.traditional.house;
/*
 * @Author  Wrial
 * @Date Created in 19:56 2019/9/19
 * @Description 抽象的房子
 */

public abstract class AbstractHouse {

    //打地基
    public abstract void buildBasic();

    //建墙
    public abstract void buildWalls();

    //封顶
    public abstract void roofed();

    //建造
    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
