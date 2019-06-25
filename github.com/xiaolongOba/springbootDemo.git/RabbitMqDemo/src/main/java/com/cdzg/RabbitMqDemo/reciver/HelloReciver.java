package com.cdzg.RabbitMqDemo.reciver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class HelloReciver {
	@RabbitHandler()
	public void helloReciver(String hello) {
		System.out.println("reciver :" + hello);
		
	}	
}
