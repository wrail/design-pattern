package com.wrial.singleton.type4;
/*
 * @Author  Wrial
 * @Date Created in 18:40 2019/9/15
 * @Description 懒汉式第二种，解决线程安全问题,使用Synchronized来保证只有一个线程进去
 *
 * 优缺点
 * 优点：解决了线程安全问题
 * 缺点：效率太低，因为加了方法锁，但是getInstacne又很经常用
 *
 * 结论：可用，但是效率低，不建议使用
 */

public class Singleton {
    private Singleton() {

    }

    private static Singleton singleton;

    public static synchronized Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;

    }


}
