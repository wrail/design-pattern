package com.wrial.builder.traditional.house;
/*
 * @Author  Wrial
 * @Date Created in 20:05 2019/9/19
 * @Description 传统方式
 */



public class Client {

    public static void main(String[] args) {
        new HighHouse().build();
        System.out.println("______________________________");
        new CommonHouse().build();
    }

}
