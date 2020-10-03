package com.exercise.eg.patterns.singleton.lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LazyInnerClassSingletonTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> clazz = LazyInnerClassSingleton.class;
        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        Object o1 = declaredConstructor.newInstance();
        Object o2 = declaredConstructor.newInstance();


        System.out.println(o1 == o2);//false

    }
}
