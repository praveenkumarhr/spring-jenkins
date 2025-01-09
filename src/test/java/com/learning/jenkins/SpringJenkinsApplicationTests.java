package com.learning.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
	
	private static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		
		logger.info("Test Case executing");
		logger.info("Test Case executing 2,,,,,,,");
		logger.info("Test Case executing 3,,,,,,,");
		logger.info("Test Case executing 4,,,,,,,");
		assertEquals(true, true);
	}

}
