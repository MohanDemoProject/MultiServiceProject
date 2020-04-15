package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Test.DockerController;

@SpringBootTest
class DockerProjectApplicationTests {
	
	@Autowired
	DockerController dockercontroller;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void checkconditiontrue() {
		
		String val;
		val=dockercontroller.MockTest();
		
		assertEquals("Hello Docker Service 1", val);
		
	}
/*	
 * failure case not in scope 
 * 
 * @Test
	public void failureTest() {
		
		assertEquals("success", "failure");
		
	}
	*/

}
