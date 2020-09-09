package com.exercise.eg.feign.demo;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(JimImportBeanDefinitionRegistrar.class)
public @interface EnableJimRegistrara {
}
