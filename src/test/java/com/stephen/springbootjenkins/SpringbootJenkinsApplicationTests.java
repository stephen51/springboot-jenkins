package com.stephen.springbootjenkins;

import com.stephen.springbootjenkins.controller.SampleController;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class SpringbootJenkinsApplicationTests {

	@InjectMocks
	SampleController sampleController;

	@Test
	void contextLoads() {

		Assert.assertEquals("App is Up and Running",sampleController.defaultMethod());
	}
	@Test
	void contextLoadTest1() {

		Assert.assertEquals("Test is Up and Running",sampleController.test());
	}

	@Test
	void contextLoadTest2() {

		Assert.assertNotNull(sampleController.test());
	}

}
