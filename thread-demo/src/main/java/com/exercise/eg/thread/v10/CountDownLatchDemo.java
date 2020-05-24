package com.exercise.eg.thread.v10;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo  extends Thread{

    private static CountDownLatch countDownLatch = new CountDownLatch(1);
    @Override
    public void run() {
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("to do "+Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<100;i++){
            new Thread(new CountDownLatchDemo()).start();
        }
        Thread.sleep(1000);
        countDownLatch.countDown();
    }

    /*public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        new Thread(()->{
            try {
                Thread.sleep(500);
                System.out.println("Thread1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countDownLatch.countDown();
        }).start();
        new Thread(()->{
            try {
                Thread.sleep(1000);
                System.out.println("Thread2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countDownLatch.countDown();
        }).start();
        new Thread(()->{
            try {
                Thread.sleep(1500);
                System.out.println("Thread3");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countDownLatch.countDown();
        }).start();
        countDownLatch.await();
        System.out.println("finished");
    }*/
}
