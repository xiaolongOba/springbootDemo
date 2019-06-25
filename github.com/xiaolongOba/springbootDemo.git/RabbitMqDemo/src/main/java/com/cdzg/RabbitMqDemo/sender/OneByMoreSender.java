package com.cdzg.RabbitMqDemo.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OneByMoreSender {
//注入模板
@Autowired
private AmqpTemplate amqpTemplate ;

public void indexSend(String index) {
	this.amqpTemplate.convertAndSend("index",index);
}
	
	
	
	
	
}
