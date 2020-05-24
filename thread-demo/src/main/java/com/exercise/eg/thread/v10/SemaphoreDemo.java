package com.exercise.eg.thread.v10;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

    static class Car extends Thread{
        private int num;
        private Semaphore semaphore;

        public Car(int num, Semaphore semaphore) {
            this.num = num;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("第："+num+"车进来");
                Thread.sleep(1000);
                System.out.println("第："+num+"车开走");
                System.out.println("-----------------");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        Semaphore semaphore =new Semaphore(2);
        for(int i=0;i<10;i++){
            Car car = new Car(i,semaphore);
            car.start();
        }
    }
}
