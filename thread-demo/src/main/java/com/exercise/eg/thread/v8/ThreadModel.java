package com.exercise.eg.thread.v8;

import java.util.concurrent.*;

public class ThreadModel {

    public static void main(String[] args) {
        ExecutorService pool  = new ThreadPoolExecutor(2,3,60,
                TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(5),
                Executors.defaultThreadFactory());
        try {
            for(int i=0;i<9;i++){
                pool.execute(new Task(i));
                //Thread.sleep(100);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            pool.shutdown();
        }
    }
}
