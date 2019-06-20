package com.cdzg.demo_01;

import java.awt.PageAttributes.MediaType;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.cdzg.demo_01.controller.SpringBootDemoController;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class HelloWorldContrllerTests {

	private MockMvc mvc ;
	@Before
	public void setUp() {
		mvc = MockMvcBuilders.standaloneSetup(new SpringBootDemoController()).build();
	}
	
	@Test
	public void getHello() throws Exception {
		
		mvc.perform(MockMvcRequestBuilders.get("/demo/hello")).andExpect(MockMvcResultMatchers
				.status().isOk()
				).andDo(MockMvcResultHandlers.print()).andReturn();						
	}
	
}
