package com.exercise.eg.mq.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: demo
 * @author: jim
 * @create: 2020-05-14 15:18
 */
@SpringBootApplication
public class ConSumerApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ConSumerApplication.class);
        application.run(args);
        System.out.println("ConSumerApplication启动完毕");
    }
}
