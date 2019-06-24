package com.cdzg.demo_01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue ;

@Configuration
public class RabbitMqConfig {

	@Bean
	public Queue Queue() {
		return new Queue("hello world");
	}
}
