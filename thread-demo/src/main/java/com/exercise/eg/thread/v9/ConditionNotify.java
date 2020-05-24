package com.exercise.eg.thread.v9;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ConditionNotify implements Runnable {

    private Lock lock;
    private Condition condition;

    public ConditionNotify(Lock lock, Condition condition) {
        this.lock = lock;
        this.condition = condition;
    }

    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println("ConditionNotify begin");
            condition.signal();
            //condition.notify();
            System.out.println("ConditionNotify end");
        }
        finally {
            lock.unlock();
        }


    }
}
