package com.exercise.eg.thread.v10;

import java.util.concurrent.CyclicBarrier;

public class CycliBarrierDemo extends Thread{
    @Override
    public void run() {
        System.out.println("開始做数据分析");
    }

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3,new CycliBarrierDemo() );
        for(int i=0;i<3;i++){
            new Thread(new DataImportThread(cyclicBarrier)).start();
        }
        //System.out.println("Main Thread");
    }
}
