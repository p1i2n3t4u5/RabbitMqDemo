package com.rabbitmq.rabbitmqdemo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMqDemoApplication  implements CommandLineRunner {
	
	@Autowired
	RabbitTemplate  rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqDemoApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		//this message will be delivered to default exchange and then defaut queue
//		//rabbitTemplate.convertAndSend("Hello from our first message");
//		//rabbitTemplate.convertAndSend("TestExchange", "testRouting", "Helloo from code");
//		
//		SimpleMessage simpleMessage=new SimpleMessage();
//		simpleMessage.setName("Simple Message");
//		simpleMessage.setDescription("Simple Description");
//		rabbitTemplate.convertAndSend("TestExchange", "testRouting", simpleMessage);
//	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//this message will be delivered to default exchange and then defaut queue
		//rabbitTemplate.convertAndSend("Hello from our first message");
		//rabbitTemplate.convertAndSend("TestExchange", "testRouting", "Helloo from code");
		
		SimpleMessage simpleMessage=new SimpleMessage();
		simpleMessage.setName("Simple Message");
		simpleMessage.setDescription("Simple Description");
		rabbitTemplate.convertAndSend("MyTopicExchange", "topic", simpleMessage);
	}

}
