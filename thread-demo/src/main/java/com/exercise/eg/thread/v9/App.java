package com.exercise.eg.thread.v9;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class App {
    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        ConditionWait conditionWait  = new ConditionWait(lock,condition);
        ConditionNotify conditionNotify = new ConditionNotify(lock,condition);

        new Thread(conditionWait).start();
        new Thread(conditionNotify).start();
    }
}
