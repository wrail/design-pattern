package com.wrial.prototype;
/*
 * @Author  Wrial
 * @Date Created in 21:05 2019/9/17
 * @Description
 */

public class Sheep implements Cloneable{

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    private String name;
    private int age;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public Sheep creteClone(){
        Sheep sheep = null;
        try {
            sheep = (Sheep)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;

    }

}