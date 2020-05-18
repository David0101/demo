package com.exercise.eg.thread.v5;

public class VolateTest {

    public static boolean stop = false;

    private int count ;
    public int incr(){
        count ++;
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        VolateTest volateTest = new VolateTest();
        Thread t1 = new Thread(()->{

            while (!stop){
                int num =  volateTest.incr();

                //System.out.println(num);
            }
        });
        t1.start();
        Thread.sleep(1000);
        stop = true;
        System.out.println("count:"+volateTest.count);
    }
}
