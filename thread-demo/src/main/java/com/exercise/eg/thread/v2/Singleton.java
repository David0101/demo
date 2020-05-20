package com.exercise.eg.thread.v2;

/**
 * @program: 双重检查
 * @author: jim
 * @create: 2020-05-18 18:01
 */
public class Singleton {

    private volatile static Singleton  singleton= null;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
