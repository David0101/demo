package com.exercise.eg.kafka.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.BitSet;

@Component
public class GpKafkaProducer {

    @Autowired
    private KafkaTemplate<Integer, String>  kafkaTemplate;

    public void send(){
        kafkaTemplate.send("test",1,"msgData");

//        BitSet liveTcpMsgData = "";
//        kafkaTemplate.send("test22",1,"live-kafka-remote",liveTcpMsgData.toByteArray());
    }
}
