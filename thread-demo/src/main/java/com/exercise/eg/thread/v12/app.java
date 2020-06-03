package com.exercise.eg.thread.v12;

import javafx.concurrent.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class app implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    static ExecutorService executorService = Executors.newFixedThreadPool(32);
    public static void main(String[] args) {


        for(int i=0;i<32;i++){
             executorService.execute(new app());
             //executorService.submit(new app());
        }
        executorService.shutdown();
    }
}
