package com.exercise.eg.patterns.factory.factorymethod;

import com.exercise.eg.patterns.factory.ICourse;
import com.exercise.eg.patterns.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
