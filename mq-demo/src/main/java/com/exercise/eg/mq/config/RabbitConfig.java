package com.exercise.eg.mq.config;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;

/**
 * @program: demo
 * @author: jim
 * @create: 2020-05-15 14:31
 */
@Configuration
public class RabbitConfig {

    @Value("${spring.rabbitmq.host}")
    private String host;
    @Value("${spring.rabbitmq.port}")
    private Integer port;
    @Value("${spring.rabbitmq.username}")
    private String username;
    @Value("${spring.rabbitmq.password}")
    private String password;

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setHost(host);
        connectionFactory.setPort(port);
        connectionFactory.setUsername(username);
        connectionFactory.setPassword(password);
        connectionFactory.setVirtualHost("/");
        connectionFactory.setConnectionTimeout(500000);
        //是否发送确认
        connectionFactory.setPublisherConfirms(true);
        //是否发送失败回调
        connectionFactory.setPublisherReturns(true);
        return connectionFactory;
    }
    @Bean
    public RabbitTemplate rabbitTemplate (){
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory());
        rabbitTemplate.setMandatory(true);
        rabbitTemplate.setConfirmCallback(new RabbitTemplate.ConfirmCallback() {
            @Override
            public void confirm(@Nullable CorrelationData correlationData, boolean ack, String cause) {
                if(ack){
                    System.out.println("消息发送成功:" );

                }
                else {
                    System.out.println("消息发送失败:" + cause);
                }
            }
        });
        rabbitTemplate.setReturnCallback(new RabbitTemplate.ReturnCallback() {
            @Override
            public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
                System.out.println(message.getMessageProperties().getCorrelationId() + " 发送失败");
                System.out.println("消息主体 message : " + message);
                System.out.println("描述：" + replyText);
                System.out.println("消息使用的交换器 exchange : " + exchange);
                System.out.println("消息使用的路由键 routing : " + routingKey);
                String correlationId = message.getMessageProperties().getCorrelationId();
                System.out.println("correlationId:"+correlationId);
            }
        });

        return rabbitTemplate;
    }

}
