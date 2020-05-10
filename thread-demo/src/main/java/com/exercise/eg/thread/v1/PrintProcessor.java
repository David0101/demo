package com.exercise.eg.thread.v1;

import java.util.concurrent.LinkedBlockingQueue;

public class PrintProcessor extends Thread implements IRequestProcessor {

    LinkedBlockingQueue<Request> linkedBlockingQueue = new LinkedBlockingQueue<>();
    private IRequestProcessor nextPorcessor;

    private volatile boolean isFinish = false;
    public PrintProcessor(IRequestProcessor nextPorcessor) {
        this.nextPorcessor = nextPorcessor;
    }

    @Override
    public void run() {
        while(!isFinish){
            try {
                Request request = linkedBlockingQueue.take();
                System.out.println("打印開始，交給下一個："+request.getName());
                nextPorcessor.process(request);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void process(Request request) {
//        System.out.println("打印開始，交給下一個："+request.getName());
//        nextPorcessor.process(request);
        linkedBlockingQueue.add(request);
    }
}
