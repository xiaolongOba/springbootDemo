package com.cdzg.demo_01.mq.sender;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloSender {
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	public void send() {
		String context = "hello" + new Date();
		System.out.println("Sender:"+context);
		this.amqpTemplate.convertAndSend("msgtest01",context);
		
	}

}
