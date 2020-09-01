package com.exercise.eg.reference;

/**
 * @program: demo
 * @author: jim
 * @create: 2020-07-22 15:32
 */
class User{
    public String name;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize");
        super.finalize();
    }
}