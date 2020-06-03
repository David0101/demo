package com.exercise.eg.thread.v9;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ConditionWait implements Runnable{

    private Lock lock;
    private Condition condition;

    public ConditionWait(Lock lock, Condition condition) {
        this.lock = lock;
        this.condition = condition;
    }

    @Override
    public void run() {
        try{
            lock.lock();
            try {
                System.out.println("ConditionWait begin");
                condition.await();//阻塞（释放锁，加入condition阻塞队列，唤醒()的话再进入aqs队列去竞争锁?
                System.out.println("ConditionWait end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } finally {
         lock.unlock();
        }

    }
}
