package com.cdzg.demo_01.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class CdzgProperties {

	@Value("${com.cdzg.title}")
	private String title;
	@Value("${com.cdzg.description}")
	private String description;
}
