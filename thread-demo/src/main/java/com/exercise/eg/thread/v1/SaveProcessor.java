package com.exercise.eg.thread.v1;

public class SaveProcessor implements IRequestProcessor {
    private IRequestProcessor nextProcessor;

    public SaveProcessor(IRequestProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }
    public SaveProcessor(){

    }
    @Override
    public void process(Request request) {
        System.out.println("save 处理后結束"+request.getName());
        //nextProcessor.process(request);
    }
}
