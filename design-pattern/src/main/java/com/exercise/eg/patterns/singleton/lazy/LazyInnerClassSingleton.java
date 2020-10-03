package com.exercise.eg.patterns.singleton.lazy;

import org.springframework.context.annotation.Lazy;

//这种形式兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
//完美地屏蔽了这两个缺点
public class LazyInnerClassSingleton {
    //默认使用LazyInnerClassGeneral的时候，会先初始化内部类
    //如果没使用的话，内部类是不加载的
    private LazyInnerClassSingleton() {
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许构建多个单例");
        }
    }
    //每一个关键字都不是多余的
    //static 是为了使单例的空间共享
    //保证这个方法不会被重写，重载
    public static final LazyInnerClassSingleton getLazyInnerClassSingleton(){
        return LazyHolder.LAZY;
    }
    //默认不加载
    private static  class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
