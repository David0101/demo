package com.exercise.eg.mq.consumer.listener;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @program: demo
 * @author: jim
 * @create: 2020-05-14 15:23
 */
@Component
@RabbitListener(bindings = @QueueBinding(value = @Queue(value = "TestDirectQueue"),
        exchange = @Exchange(value = "TestDirectExchange", type = ExchangeTypes.DIRECT)))
public class DirectReceiver {
    @RabbitHandler
    public void process(Map testMessage){
        System.out.println("DirectReceiver消费者收到消息  : " + testMessage.toString());
    }

}

//@Component
//@RabbitListener(queues = "TestDirectQueue")//监听的队列名称 TestDirectQueue
//public class DirectReceiver {
//
//    @RabbitHandler
//    public void process(Map testMessage) {
//        System.out.println("DirectReceiver消费者收到消息  : " + testMessage.toString());
//    }
//}
