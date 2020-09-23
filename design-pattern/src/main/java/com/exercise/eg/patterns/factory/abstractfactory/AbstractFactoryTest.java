package com.exercise.eg.patterns.factory.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        factory.createCurse().record();
        factory.createNote().note();

    }
}
