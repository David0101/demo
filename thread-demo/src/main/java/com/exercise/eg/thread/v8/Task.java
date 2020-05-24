package com.exercise.eg.thread.v8;

public class Task extends  Thread {
    private Integer i;

    public Task(Integer i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("Thread:"+i);
    }
}
