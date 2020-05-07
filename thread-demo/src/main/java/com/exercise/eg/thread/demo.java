package com.exercise.eg.thread;

public class demo {
    static IRequestProcessor requestProcessor ;
    public static void main(String[] args) {
        Request request = new Request("jim");


        SaveProcessor saveProcessor = new SaveProcessor( );
        IRequestProcessor printProcessor = new PrintProcessor(saveProcessor);

        PreProcessor preProcessor = new PreProcessor(printProcessor);
        preProcessor.process(request);


    }
}
