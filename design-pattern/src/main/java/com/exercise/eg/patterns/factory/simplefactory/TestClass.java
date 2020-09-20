package com.exercise.eg.patterns.factory.simplefactory;

import com.exercise.eg.patterns.factory.ICourse;
import com.exercise.eg.patterns.factory.PythonCourse;

public class TestClass {
    public static void main(String[] args) {
        //ICourse course = new JavaCourse();//如果有其它課程会new 很多不同的课程
        //如：new PythonCourse(),new GoCourse() ...等
        //course.record();

//        CourseFactory courseFactory = new CourseFactory();
//        ICourse iCourse = courseFactory.create("python");
//        iCourse.record();

        //优化1
        CourseFactory courseFactory = new CourseFactory();
        ICourse iCourse = courseFactory.create1(PythonCourse.class);
        iCourse.record();
    }
}
