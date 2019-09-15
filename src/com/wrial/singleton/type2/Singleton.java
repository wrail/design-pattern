package com.wrial.singleton.type2;
/*
 * @Author  Wrial
 * @Date Created in 13:38 2019/9/15
 * @Description 饿汉式（静态代码块写法）
 *
 * 优缺点和type1相同（静态变量写法）
 *
 * 结论：可用，有可能内存浪费
 *
 */

public class Singleton {

    //1.构造为私有，不能被new
    private Singleton() {
    }

    //2.本类内部创建对象实例
    private static Singleton singleton;

    static {
        //3.在静态代码块中创建
        singleton = new Singleton();
    }
    //4.提供一个得到单例的方法
    public static Singleton getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        Singleton instance = getInstance();
        Singleton instance1 = getInstance();
        System.out.println(instance == instance1);//true

    }

}
