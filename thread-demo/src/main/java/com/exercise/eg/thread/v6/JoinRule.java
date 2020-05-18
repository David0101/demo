package com.exercise.eg.thread.v6;

public class JoinRule {
    static int x = 0;

    public static void main(String[] args) throws InterruptedException {
        /*Thread thread1 = new Thread(()->{
            x = 100;
        });
        thread1.start();
        thread1.join();

        System.out.println(x);*/

        Thread t1 = new Thread(()->{
            System.out.println("t1");
        });
        Thread t2 = new Thread(()->{
            System.out.println("t2");
        });
        Thread t3 = new Thread(()->{
            System.out.println("t3");
        });
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
