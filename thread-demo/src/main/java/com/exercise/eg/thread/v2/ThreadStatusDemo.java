package com.exercise.eg.thread.v2;

import java.util.concurrent.TimeUnit;

public class ThreadStatusDemo {

    public static void main(String[] args) {
        new Thread(()->{//time_waiting
            while (true){
                try {
                    System.out.println("time_waiting");
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"time_waiting_thread").start();

        new Thread(()->{
            while (true){
                synchronized (ThreadStatusDemo.class){
                    try {
                        System.out.println("waiting");
                        ThreadStatusDemo.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"waiting_thread").start();

        new Thread(new BlockDemo(),"BlockDemo1_thread").start();
        new Thread(new BlockDemo(),"BlockDemo2_thread").start();
    }

    static class BlockDemo extends Thread{

        @Override
        public void run() {
            while(true){
                synchronized (BlockDemo.class){
                    try {
                        System.out.println("當前獲取到鎖進程 begin:"+Thread.currentThread().getName());
                        TimeUnit.SECONDS.sleep(10);
                        System.out.println("當前獲取到鎖進程: end："+Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
