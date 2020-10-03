package com.exercise.eg.patterns.singleton.register;

import com.exercise.eg.patterns.singleton.lazy.SeriableSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumSingletonTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = EnumSingleton.class;
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class,Integer.class);
        constructor.setAccessible(true);
        constructor.newInstance("Jim",666);
    }

//    public static void main(String[] args) {
//        EnumSingleton s1 = null;
//        EnumSingleton s2 = EnumSingleton.getInstance();
//
//        FileOutputStream fos = null;
//        try {
//            fos = new FileOutputStream("EnumSingleton.obj");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(s2);
//            oos.flush();
//            oos.close();
//
//
//            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            s1 = (EnumSingleton)ois.readObject();
//            ois.close();
//
//            System.out.println(s1);
//            System.out.println(s2);
//            System.out.println(s1 == s2);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

}
