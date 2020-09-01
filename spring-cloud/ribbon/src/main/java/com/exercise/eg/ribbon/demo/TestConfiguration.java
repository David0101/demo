package com.exercise.eg.ribbon.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {
    @Qualifier
    @Bean(value = "test1")
    TestClass testClass1(){
        return new TestClass("test1");
    }
    @Qualifier
    @Bean(value = "test2")
    TestClass testClass2(){
        return new TestClass("test2");
    }
}
