package com.wrial.builder.traditional.house;
/*
 * @Author  Wrial
 * @Date Created in 20:01 2019/9/19
 * @Description 高楼
 */

public class HighHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼建墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
