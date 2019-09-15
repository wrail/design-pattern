package com.wrial.singleton.type6;
/*
 * @Author  Wrial
 * @Date Created in 19:00 2019/9/15
 * @Description 使用静态内部类完成单例
 *
 * 可以通过静态内部类保证单例的懒加载，静态内部类不会随着外部类的加载而加载，只有第一次主动使用内部类的时候才会装载
 * 可以通过JVM装载机制来保证线程是安全的
 *
 * 结论：线程安全，使用静态内部类实现lazy-load，效率高，推荐用
 */

public class Singleton {
    private Singleton() {
    }

    //静态类不会随Singleton的加载而加载，只是在第一次主动使用时加载且只会加载一次
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }


}
