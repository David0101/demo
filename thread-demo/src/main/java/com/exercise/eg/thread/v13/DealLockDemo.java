package com.exercise.eg.thread.v13;
class MyLockObject{
    public static Object object1 = new Object();
    public static Object object2 = new Object();
}
public class DealLockDemo {

    public static void main(String[] args) {
        new Thread(()->{
            while (true){
                synchronized (MyLockObject.object1){
                    System.out.println(Thread.currentThread().getName()+"获取到锁1");

                    synchronized (MyLockObject.object2){
                        System.out.println(Thread.currentThread().getName()+"获取锁2");
                    }
                }
            }
        }).start();
        new Thread(()->{
            while (true){
                synchronized (MyLockObject.object2){
                    System.out.println(Thread.currentThread().getName()+"获取到锁2");

                    synchronized (MyLockObject.object1){
                        System.out.println(Thread.currentThread().getName()+"获取锁1");
                    }
                }
            }
        }).start();
    }

}
