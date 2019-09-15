package com.wrial.singleton.type3;
/*
 * @Author  Wrial
 * @Date Created in 13:54 2019/9/15
 * @Description 懒汉模式
 *
 * 优缺点
 * 优点：起到了laze-load
 * 缺点：在多线程环境下是不安全的，因为在同一时刻可能会有多个线程进入getInstance的if中，并且
 * 判断为空，这样就不是单例了，当然单线程就可以
 *
 * 结论：起到laze-load，不能使用（线程安全问题）
 *
 */

public class Singleton {
    private Singleton() {
    }

    private static Singleton singleton;

    public Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }


}
