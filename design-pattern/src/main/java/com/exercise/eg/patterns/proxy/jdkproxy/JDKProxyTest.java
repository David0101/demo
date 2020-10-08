package com.exercise.eg.patterns.proxy.jdkproxy;

import com.exercise.eg.patterns.proxy.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JDKProxyTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Object instance = new JDKProxy().getInstance(new Girl());
//        Method method = instance.getClass().getMethod("findLove", null);
//        method.invoke(instance);
        //或者：
        Person instance =(Person) new JDKProxy().getInstance(new Girl());
        instance.findLove();
    }
}
