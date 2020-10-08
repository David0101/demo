package com.exercise.eg.patterns.prototype;

import java.io.*;
import java.util.Date;

public class ConcretePrototypeDeep extends ConcretePrototype implements Cloneable ,Serializable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }
    private Object deepClone(){
        try{

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            ConcretePrototype copy = (ConcretePrototype)ois.readObject();
            copy.setAge(this.getAge());
            copy.setHobbies(this.getHobbies());
            copy.setName(this.getName());
            return copy;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
