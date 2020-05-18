package com.exercise.eg.thread.v6;

public class StartRule {
    static int x ;

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println(x);
        });

        x =10;
        t1.start();

    }
}
