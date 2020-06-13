package com.exercise.eg.kafka.config;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class GpKafkaProducer1 extends Thread{
    KafkaProducer<Integer,String> producer;
    String topic;

    public GpKafkaProducer1(String topic) {
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"120.79.172.150:9092");
        properties.put(ProducerConfig.CLIENT_ID_CONFIG,"gp-producer");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        producer = new KafkaProducer<Integer, String>(properties);
        this.topic = topic;
    }

    @Override
    public void run() {
        int num =0;
        String msg="gp kafka practice msg:"+num;
        while (num<20){
            try {
                RecordMetadata recordMetadata = producer.send(new ProducerRecord<Integer, String>(topic,msg)).get();
                System.out.println(recordMetadata.offset()+"->"
                +recordMetadata.partition()+"->"+recordMetadata.topic());
                TimeUnit.SECONDS.sleep(1);
                num ++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        new GpKafkaProducer1("test").start();
    }
}
