package com.exercise.eg.patterns.factory.factorymethod;

import com.exercise.eg.patterns.factory.ICourse;

public interface ICourseFactory {
    ICourse create();

    //JDK1.8增加了Default关键字，使得我们的接口类里边可以有具体的方法
    public default  void defaultMethod(){
        System.out.println("这是接口里实现的方法！！！！！");
    };
}
