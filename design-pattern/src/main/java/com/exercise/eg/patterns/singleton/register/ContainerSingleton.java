package com.exercise.eg.patterns.singleton.register;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
//Spring中的做法，就是用这种注册式单例
public class ContainerSingleton {
    private static Map<String,Object> iocMap = new ConcurrentHashMap<String,Object>();

    public static Object getInstance(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        synchronized (iocMap){
            if(!iocMap.containsKey(className)){
                Class<?> aClass = Class.forName(className);
                Object o = aClass.newInstance();
                iocMap.put(className, o);
                return o;
            }
            return iocMap.get(className);
        }

    }
}
