package com.exercise.eg.thread.v7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

    static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        lock.lock();

        lock.unlock();
    }
}
