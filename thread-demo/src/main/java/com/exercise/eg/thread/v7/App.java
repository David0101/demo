package com.exercise.eg.thread.v7;

public class App {

    public synchronized void demo1(){
        System.out.println("demo1");
        demo2();
    }
    public void demo2(){
        synchronized (this){
            System.out.println("demo2");
        }

    }

    public static void main(String[] args) {
        App app = new App();
        app.demo1();
    }
}
