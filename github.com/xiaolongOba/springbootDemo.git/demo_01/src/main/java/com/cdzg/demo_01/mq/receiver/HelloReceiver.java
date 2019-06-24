package com.cdzg.demo_01.mq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues ="queues=msgtest01")
public class HelloReceiver {

	public void process(String hello) {
		System.out.println("receiver :"+hello);
	}
}
