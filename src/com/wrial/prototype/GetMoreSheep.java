package com.wrial.prototype;
/*
 * @Author  Wrial
 * @Date Created in 21:26 2019/9/17
 * @Description
 */

public class GetMoreSheep {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("多利", 1, "red");
        Sheep sheep1 = sheep.creteClone();
        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep == sheep1);
    }
}
