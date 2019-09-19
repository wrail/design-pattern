package com.wrial.builder.traditional.house;
/*
 * @Author  Wrial
 * @Date Created in 20:01 2019/9/19
 * @Description 普通房子
 */

public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子建墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
