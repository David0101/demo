package com.exercise.eg.patterns.singleton.hungury;

public class HungrySingleton {
    private final static    HungrySingleton hungrySingleton = new HungrySingleton();

    // 或者:
//    private final static    HungrySingleton hungrySingleton ;
//    static {
//        hungrySingleton = new HungrySingleton();
//    }
    private HungrySingleton(){

    }

    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }
}
