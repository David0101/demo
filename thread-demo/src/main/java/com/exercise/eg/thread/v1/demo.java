package com.exercise.eg.thread.v1;

public class demo {
    static IRequestProcessor requestProcessor ;
    public static void main(String[] args) {
        Request request = new Request("jim");


        SaveProcessor saveProcessor = new SaveProcessor( );
        saveProcessor.start();
        PrintProcessor printProcessor = new PrintProcessor(saveProcessor);
        printProcessor.start();
        PreProcessor preProcessor = new PreProcessor(printProcessor);
        preProcessor.process(request);
        preProcessor.start();


    }
}
