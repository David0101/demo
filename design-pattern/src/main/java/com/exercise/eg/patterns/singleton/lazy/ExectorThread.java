package com.exercise.eg.patterns.singleton.lazy;

public class ExectorThread implements Runnable{
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getLazySingleton();
        System.out.println(Thread.currentThread().getName()+":"+lazySingleton);
    }
}
