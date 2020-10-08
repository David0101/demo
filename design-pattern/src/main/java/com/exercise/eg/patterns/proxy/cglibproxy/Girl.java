package com.exercise.eg.patterns.proxy.cglibproxy;

import com.exercise.eg.patterns.proxy.Person;

public class Girl implements Person{
    @Override
    public void findLove() {
        System.out.println("女兒要找一个对象");
    }
}
