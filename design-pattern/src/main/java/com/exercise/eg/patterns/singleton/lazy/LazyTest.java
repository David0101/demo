package com.exercise.eg.patterns.singleton.lazy;

import java.util.concurrent.*;

public class LazyTest {
    public static void main(String[] args) {
//        Thread thread1 = new Thread(new ExectorThread());
//        Thread thread2 = new Thread(new ExectorThread());
//        thread1.start();
//        thread2.start();

        LazyInnerClassSingleton lazyInnerClassSingleton = LazyInnerClassSingleton.getLazyInnerClassSingleton();
        System.out.println("end");
    }
}
