package com.exercise.eg.patterns.factory.abstractfactory;

import com.exercise.eg.patterns.factory.ICourse;

//要求所有的子工厂都实现这个工厂
public interface ICourseFactory {
    ICourse createCurse();
    INote createNote();
    IVideo createVideo();
}
