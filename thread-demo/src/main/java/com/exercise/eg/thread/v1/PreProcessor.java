package com.exercise.eg.thread.v1;

import com.sun.org.apache.regexp.internal.RE;

import java.util.concurrent.LinkedBlockingQueue;

public class PreProcessor extends Thread implements IRequestProcessor {

    LinkedBlockingQueue<Request> linkedBlockingQueue = new LinkedBlockingQueue<>();
    private IRequestProcessor nextProcessor;

    private volatile boolean isFinish = false;

    public PreProcessor(IRequestProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    @Override
    public void run() {
        while(!isFinish){
            try {
                Request request = linkedBlockingQueue.take();
                System.out.println("预处理开始,交给下一個："+request.getName());
                nextProcessor.process(request);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void process(Request request) {
//        System.out.println("预处理开始,交给下一個："+request.getName());
//        nextProcessor.process(request);
        linkedBlockingQueue.add(request);
    }
}
