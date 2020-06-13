package com.exercise.eg.kafka;

import com.exercise.eg.kafka.config.GpKafkaProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * @program: demo
 * @author: jim
 * @create: 2020-06-13 15:57
 */
@SpringBootApplication
public class KafkaApplication {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context= SpringApplication.run(KafkaApplication.class, args);
        GpKafkaProducer kp=context.getBean(GpKafkaProducer.class);
        for (int i = 0; i < 10; i++) {
            kp.send();
            TimeUnit.SECONDS.sleep(2);
        }
    }
}
