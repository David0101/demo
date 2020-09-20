package com.exercise.eg.patterns.factory.factorymethod;

import com.exercise.eg.patterns.factory.ICourse;
import com.exercise.eg.patterns.factory.JavaCourse;

public class JavaCourseFacotry implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
