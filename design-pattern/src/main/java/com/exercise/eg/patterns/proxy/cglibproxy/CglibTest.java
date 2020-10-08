package com.exercise.eg.patterns.proxy.cglibproxy;

public class CglibTest {
    public static void main(String[] args) {
        Girl instance = (Girl)new CGLibProxy().getInstance(Girl.class);
        instance.findLove();
    }
}
