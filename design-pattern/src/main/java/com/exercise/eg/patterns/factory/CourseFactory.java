package com.exercise.eg.patterns.factory;

public class CourseFactory {
    public ICourse create(String name){
        if("java".equals(name)){
            return new JavaCourse();
        }
        else if("python".equals(name)){
            return new PythonCourse();
        }
        else{
            return null;
        }
    }
    public ICourse create1(Class<? extends ICourse> clazz){
        if(clazz == null){
            return null;
        }
        try {
            return  (ICourse)clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
