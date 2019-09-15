package com.wrial.singleton.type5;
/*
 * @Author  Wrial
 * @Date Created in 18:49 2019/9/15
 * @Description Double Check 推荐使用
 *
 * 通过volatile保证了不进行指令重排序，保证了内存的可见性，让单例的值第一时间刷新到内存
 * volatile执行结束后，第二次判断保证了单例的完整执行
 *
 * 结论：既实现了lazy-load，也最大程度保证了效率，推荐使用
 *
 */

public class Singleton {
    Singleton() {
    }

    private static volatile Singleton singleton;

    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }


}
