package com.exercise.eg.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: demo
 * @author: jim
 * @create: 2020-05-13 17:42
 */

@SpringBootApplication
public class MQApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(MQApplication.class);
        application.run(args);
        System.out.println("启动完毕");
    }
}
