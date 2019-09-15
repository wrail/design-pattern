package com.wrial.singleton.type7;
/*
 * @Author  Wrial
 * @Date Created in 19:11 2019/9/15
 * @Description 通过枚举来实现安全的单例
 *
 * 枚举可以防止反射，因为在反射的源码中会判断是不是枚举，如果是抛出异常
 * 可以避免序列化问题，如果是类，反序列化后和序列化前的类不是同一个对象(任何一个readObject方法，不管是显式的还是默认的，它都会返回一个新建的实例，这个新建的实例不同于该类初始化时创建的实例)，Enum则不会
 * 实现了Serializable然后可以加transient避免序列化
 * 但是不是加了transient就一定会避免（若实现的是Externalizable接口，则没有任何东西可以自动序列化，需要在writeExternal方法中进行手工指定所要序列化的变量，这与是否被transient修饰无关）
 *
 *
 */

public class Singleton {
    private Singleton(){

    }

    public static void main(String[] args) {
        Singleton instance = SingletonEnum.INSTANCE.getInstance();
        Singleton instance1 = SingletonEnum.INSTANCE.getInstance();
        System.out.println(instance == instance1);
    }


    private enum SingletonEnum{
        INSTANCE;
        SingletonEnum(){
            singleton = new Singleton();
        }
        private Singleton singleton;
        private Singleton getInstance(){
            return singleton;
        }


    }
}
