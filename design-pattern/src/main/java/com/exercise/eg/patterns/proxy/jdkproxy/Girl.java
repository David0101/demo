package com.exercise.eg.patterns.proxy.jdkproxy;

import com.exercise.eg.patterns.proxy.Person;
import com.exercise.eg.patterns.proxy.staticproxy.Son;

public class Girl implements Person{
    @Override
    public void findLove() {
        System.out.println("女兒要找一个对象");
    }
}
