package com.exercise.eg.thread.v4;

import java.util.concurrent.FutureTask;

public class WaitNotifyDemo {

    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA callable = new ThreadA(lock);
        ThreadB threadB = new ThreadB(lock);
        FutureTask task = new FutureTask(callable);
        Thread threadA = new Thread(task);

        threadB.start();
        threadA.start();


    }
}
