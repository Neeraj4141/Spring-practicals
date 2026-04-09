package com.rays.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireByAnnotation {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		// UserServiceByName userService = (UserServiceByName)
		// context.getBean("userServiceByName");
		// UserServiceByConstructor userService = (UserServiceByConstructor)
		// context.getBean("userServiceByConstructor");
		// UserServiceBySetter userService = (UserServiceBySetter)
		// context.getBean("userServiceBySetter");
		UserServiceByType userService = (UserServiceByType) context.getBean("userServiceByType");
		userService.testadd();

	}

}
