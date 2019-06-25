package com.cdzg.RabbitMqDemo.reciver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class OneByMoreReciver {

	@RabbitHandler
	public void indexReciver(String index) {
		System.err.println(index);
		
	}
}
