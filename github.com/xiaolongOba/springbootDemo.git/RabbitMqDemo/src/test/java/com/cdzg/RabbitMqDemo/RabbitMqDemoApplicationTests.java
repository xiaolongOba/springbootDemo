package com.cdzg.RabbitMqDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cdzg.RabbitMqDemo.sender.HelloSender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqDemoApplicationTests {
	@Autowired
	private HelloSender helloSender;

	@Test
	public void sayHello() {
		helloSender.send();
	}

	@Test
	public void sayIndex() {
		helloSender.send();

	}

}
