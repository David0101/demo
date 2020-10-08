package com.exercise.eg.patterns.proxy.staticproxy;


import com.exercise.eg.patterns.proxy.Person;

public class Father implements Person {
    private Son son;
    public Father (Son son){
        this.son = son ;
    }
    @Override
    public void findLove() {
        System.out.println("开始物色");
        son.findLove();
        System.out.println("找到");
    }
}
