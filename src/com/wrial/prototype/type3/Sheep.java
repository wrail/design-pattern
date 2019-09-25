package com.wrial.prototype.type3;
/*
 * @Author  Wrial
 * @Date Created in 21:05 2019/9/17
 * @Description
 */

import java.io.Serializable;

public class Sheep implements Cloneable, Serializable {

    public Sheep(String name, int age, String color, HostMan hostMan) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.hostMan = hostMan;
    }

    private String name;
    private int age;
    private String color;
    private HostMan hostMan;

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

    public Sheep creteDeepClone(){
        Sheep sheep = null;
        try {
            sheep = (Sheep)clone();
            HostMan hostMan = sheep.getHostMan();
            HostMan clone = (HostMan)hostMan.clone();
            sheep.setHostMan(clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;

    }

    public HostMan getHostMan() {
        return hostMan;
    }

    public void setHostMan(HostMan hostMan) {
        this.hostMan = hostMan;
    }
}
