package com.etc;

import com.etc.controller.Hello;
import com.etc.controller.Index;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringbootdemoApplicationTests {

	@Resource
	Hello hello=new Hello();
	Logger logger= LoggerFactory.getLogger(SpringbootdemoApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("test is running");
		String str=hello.hello();
		logger.info(str);
		logger.info("test is end");
	}

}
