package com.exercise.eg.thread.v4;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadA implements Callable {
    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public Object call() throws Exception {
        synchronized (lock){
            System.out.println("開始等待A");
            lock.wait();
            System.out.println("結束等待A");
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        Object o = new Object();
        ThreadA threadA = new ThreadA(o);
        FutureTask fureTask = new FutureTask(threadA);
        Thread thread = new Thread(fureTask);
        thread.start();
    }

}
