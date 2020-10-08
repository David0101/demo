package com.exercise.eg.patterns.proxy.staticproxy;

import com.exercise.eg.patterns.proxy.Person;

public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("儿子要找一个对象");
    }
}
