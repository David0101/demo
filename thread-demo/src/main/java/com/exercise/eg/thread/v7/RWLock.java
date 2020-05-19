package com.exercise.eg.thread.v7;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RWLock {

    static ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    static Lock readLock = reentrantReadWriteLock.readLock();
    static Lock writeLock = reentrantReadWriteLock.writeLock();

    private Map map = new HashMap();
    public Object getMap(String key){
        try{
            readLock.lock();
            return map.get(key);
        }
        finally {
            readLock.unlock();
        }
    }
    public Object putMap(String key,String value){
        try {
            writeLock.lock();
            return map.put(key,value);
        }
        finally {
            writeLock.unlock();
        }
    }
    public static void main(String[] args) {

    }
}
