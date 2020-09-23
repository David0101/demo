package com.exercise.eg.patterns.factory.abstractfactory;

import com.exercise.eg.patterns.factory.ICourse;
import com.exercise.eg.patterns.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory{
    @Override
    public ICourse createCurse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
