package com.exercise.eg.patterns.singleton.threadlocal;

public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> singletonThreadLocal =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    public static ThreadLocalSingleton getSingletonThreadLocal() {
        return singletonThreadLocal.get();
    }

    private ThreadLocalSingleton() {
    }
}
