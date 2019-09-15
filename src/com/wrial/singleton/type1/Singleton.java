package com.wrial.singleton.type1;
/*
 * @Author  Wrial
 * @Date Created in 13:38 2019/9/15
 * @Description 饿汉式（静态常量写法）
 *
 * 优缺点
 * 优点：简单，因为是static所以在类装载（第一次主动使用）的时候就完成了初始化，避免了线程同步问题
 * 缺点：没有起到懒加载的效果（lazy-load，就是用的时候再加载），可能会有空间浪费
 *
 * 结论：可用，有可能内存浪费
 *
 */

public class Singleton {

    //1.构造为私有，不能被new
    private Singleton() {
    }

    //2.本类内部创建对象实例
    private static final Singleton singleton = new Singleton();

    //3.提供一个得到单例的方法
    public static Singleton getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        Singleton instance = getInstance();
        Singleton instance1 = getInstance();
        System.out.println(instance == instance1);//true

    }

}
