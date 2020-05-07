package com.exercise.eg.thread;

public class PrintProcessor implements IRequestProcessor {

    private IRequestProcessor nextPorcessor;

    public PrintProcessor(IRequestProcessor nextPorcessor) {
        this.nextPorcessor = nextPorcessor;
    }

    @Override
    public void process(Request request) {
        System.out.println("打印開始，交給下一個："+request.getName());
        nextPorcessor.process(request);
    }
}
