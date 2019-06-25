package com.cdzg.RabbitMqDemo.sender;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {
	@Autowired //spring自带的消息模板
	private AmqpTemplate amqpTemplate ;
	//创建生产者
	public void send() {
		String context = "hello	 -" +new Date();
		System.out.println("sender  :"+context);
		this.amqpTemplate.convertAndSend("hello",context);
	}
}
