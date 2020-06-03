package com.exercise.eg.thread.v12;

import java.util.concurrent.*;

public class FutureDemo implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("execute:call");
        return "Hello Call";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureDemo futureDemo = new FutureDemo();
        FutureTask futureTask = new FutureTask(futureDemo);
        new Thread(futureTask).start();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> future =  executorService.submit(futureDemo);
        System.out.println(future.get());
        futureTask.get();
    }
}
