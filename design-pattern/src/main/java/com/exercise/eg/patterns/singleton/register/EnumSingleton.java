package com.exercise.eg.patterns.singleton.register;

import java.io.Serializable;

public enum  EnumSingleton implements Serializable{
    INSTANCE;
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
    private  Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    private String sayHello(){
        return "hello Word";
    }
}
