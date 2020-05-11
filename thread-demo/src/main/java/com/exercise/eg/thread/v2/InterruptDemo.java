package com.exercise.eg.thread.v2;

public class InterruptDemo {

    private static  int a = 0;
    public static void main(String[] args) {
      // Thread t1 = new Thread();

        Thread t1 = new Thread(()->{
            while(!Thread.currentThread().isInterrupted()){
                try {
                    System.out.println("每s打印直到中断："+a);
                    System.out.println(Thread.currentThread().isInterrupted());
                    a++;
                    Thread.sleep(1000);
                } catch (InterruptedException e) {//中斷一个处于阻塞状态的线程，join/wait/queuq.take..
                                                    // 会抛出异常，isInteruped状态会重新变为false
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        });
        t1.start();


        while (true){
            try {
                Thread.sleep(3000);
                if(a==6){
                    t1.interrupt();
                }
                System.out.println( "主綫程每3s，查看t1状态："+t1.isInterrupted());
                t1.run();
                //System.out.println("main thread:a"+a);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
