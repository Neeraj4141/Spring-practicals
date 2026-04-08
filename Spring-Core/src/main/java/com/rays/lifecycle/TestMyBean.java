package com.rays.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestMyBean {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		MyBean mybean = (MyBean) context.getBean("mybean");
		((ClassPathXmlApplicationContext) context).close();
	}

}
