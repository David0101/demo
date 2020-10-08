package com.exercise.eg.patterns.prototype;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class ProtoTypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
//        ConcretePrototype concretePrototype = new ConcretePrototype();
//        concretePrototype.setAge(1);
//        concretePrototype.setName("jim");
//        List hobbies = new ArrayList();
//        hobbies.add("climbing");
//        hobbies.add("basketball");
//        concretePrototype.setHobbies(hobbies);
//
//        ConcretePrototype target = new ConcretePrototype();
//        System.out.println(concretePrototype);
//        System.out.println(target);
//        BeanUtils.copyProperties(concretePrototype,target);
//        System.out.println(concretePrototype.getHobbies());
//        System.out.println(target.getHobbies());
//        System.out.println(concretePrototype.getHobbies() == target.getHobbies());
//        System.out.println(concretePrototype == target);
//        System.out.println("end");


        ConcretePrototypeDeep concretePrototypeDeep = new ConcretePrototypeDeep();
        concretePrototypeDeep.setAge(1);
        concretePrototypeDeep.setName("jim");
        List hobbies = new ArrayList();
        hobbies.add("climbing");
        hobbies.add("basketball");
        concretePrototypeDeep.setHobbies(hobbies);

        ConcretePrototypeDeep target =(ConcretePrototypeDeep) concretePrototypeDeep.clone();
        System.out.println(concretePrototypeDeep == target);
        System.out.println(concretePrototypeDeep.getHobbies());
        System.out.println(target.getHobbies());
        System.out.println(concretePrototypeDeep.getHobbies() == target.getHobbies());

    }
}
