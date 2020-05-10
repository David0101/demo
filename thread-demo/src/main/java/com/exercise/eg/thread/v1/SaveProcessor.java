package com.exercise.eg.thread.v1;

import java.util.concurrent.LinkedBlockingQueue;

public class SaveProcessor extends Thread implements IRequestProcessor {
    private IRequestProcessor nextProcessor;

    LinkedBlockingQueue<Request> linkedBlockingQueue = new LinkedBlockingQueue<>();
    private volatile  boolean isFinish = false;
    public SaveProcessor(IRequestProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }
    public SaveProcessor(){

    }

    @Override
    public void run() {
        while (!isFinish){
            try {
                Request request = linkedBlockingQueue.take();
                System.out.println("save 处理后結束"+request.getName());
                if(nextProcessor != null){
                    nextProcessor.process(request);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void process(Request request) {
        //System.out.println("save 处理后結束"+request.getName());
        //nextProcessor.process(request);
        linkedBlockingQueue.add(request);
    }
}
