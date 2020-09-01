package com.exercise.eg.reference;

import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: 软引用作为缓存demo
 * @author: jim
 * @create: 2020-07-22 15:06
 */
public class SoftReferenceDemo {
    //private static ConcurrentHashMap<String,SoftReference<User>> cacheUser = new ConcurrentHashMap<String,SoftReference<User>>();
    public static void main(String[] args) throws InterruptedException {
        User a = new User();
        a.name = "wei";
        SoftReference<User> softReference = new SoftReference<User>(a);
        a = null;
        System.out.println(softReference.get().name);
        int i = 0;

        while (softReference.get() != null) {
            if (i == 10) {
                System.gc();
                System.out.println("GC");
            }
            Thread.sleep(1000);
            System.out.println(i);
            i++;
        }
        System.out.println("Finish");
    }
}
