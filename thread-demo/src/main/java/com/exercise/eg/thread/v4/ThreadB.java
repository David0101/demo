package com.exercise.eg.thread.v4;

public class ThreadB extends Thread {
    private Object lock;

    public ThreadB(  Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            System.out.println("start lockB");
            lock.notify();

            System.out.println("end lockB");
        }
    }
}
