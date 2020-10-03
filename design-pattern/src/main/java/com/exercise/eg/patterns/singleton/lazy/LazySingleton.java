package com.exercise.eg.patterns.singleton.lazy;

public class LazySingleton {

    private volatile static  LazySingleton lazySingleton =  null;
    private LazySingleton(){

    }

    public static LazySingleton getLazySingleton() {

        if(lazySingleton == null){
            synchronized (LazySingleton.class){
                if(lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
