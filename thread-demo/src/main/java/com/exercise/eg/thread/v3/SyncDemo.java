package com.exercise.eg.thread.v3;

public class SyncDemo {
    public synchronized  void demo(){//对象锁

    }
    public void demo2(){
        synchronized (this){//this这个对象的生命周期
                //保护存在线程安全的变量
        }
    }
    public synchronized static void demo3(){

    }
    public void demo4(){
        synchronized (SyncDemo.class){//生命周期最大 初始化时加载到jvm

        }
    }
}
