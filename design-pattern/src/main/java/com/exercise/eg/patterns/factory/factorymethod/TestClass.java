package com.exercise.eg.patterns.factory.factorymethod;

import com.exercise.eg.patterns.factory.ICourse;

public class TestClass {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFacotry();
        ICourse course = factory.create();
        course.record();
    }
}
