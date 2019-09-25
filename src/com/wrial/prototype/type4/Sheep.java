package com.wrial.prototype.type4;
/*
 * @Author  Wrial
 * @Date Created in 21:05 2019/9/17
 * @Description
 */


import java.io.*;

public class Sheep implements Serializable {

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

    public Sheep creteDeepClone() {

        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;
        Sheep sheep = null;

        try {
            //序列化
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            //反序列化
            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            sheep = (Sheep) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
                objectInputStream.close();
                byteArrayOutputStream.close();
                byteArrayInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

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
