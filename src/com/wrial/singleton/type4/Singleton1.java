package com.wrial.singleton.type4;
/*
 * @Author  Wrial
 * @Date Created in 18:40 2019/9/15
 * @Description 懒汉式错误示例
 *
 * 这种方法并不能解决线程安全问题，因为在if的时候
 * 多线程环境下可能会有很多线程挤进去了（这是一个错误的例子）,也就成了多例
 *
 */

public class Singleton1 {
    private Singleton1() {

    }

    private static Singleton1 singleton;

    public static Singleton1 getInstance() {
        if (singleton == null) {
            synchronized (Singleton1.class) {
                singleton = new Singleton1();
            }
        }
        return singleton;

    }


}
