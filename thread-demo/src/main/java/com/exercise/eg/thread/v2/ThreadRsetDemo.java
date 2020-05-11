package com.exercise.eg.thread.v2;

import java.util.concurrent.TimeUnit;

public class ThreadRsetDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            while(true){
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("before:"+Thread.currentThread().isInterrupted());
                    Thread.interrupted();
                    System.out.println("after:"+Thread.currentThread().isInterrupted());
                }
            }
        });
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        thread.interrupt();
    }
}
