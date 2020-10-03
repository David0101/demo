package com.exercise.eg.patterns.singleton.register;

public class ContainerSingletonTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Object object = ContainerSingleton.
                getInstance("com.exercise.eg.patterns.singleton.register.Pojo");
        System.out.println("end");
    }
}
