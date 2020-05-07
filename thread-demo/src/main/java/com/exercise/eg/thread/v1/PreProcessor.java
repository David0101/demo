package com.exercise.eg.thread.v1;

public class PreProcessor implements IRequestProcessor {


    private IRequestProcessor nextProcessor;

    public PreProcessor(IRequestProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    @Override
    public void process(Request request) {
        System.out.println("预处理开始,交给下一個："+request.getName());
        nextProcessor.process(request);
    }
}
