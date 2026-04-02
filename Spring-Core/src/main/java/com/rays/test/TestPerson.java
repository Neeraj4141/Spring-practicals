package com.rays.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestPerson {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("person.xml"));
		PersonBean person = (PersonBean) factory.getBean("person");

		System.out.println(person.getName());
		System.out.println(person.getLastName());

		PersonBean person1 = (PersonBean) factory.getBean("person1");
		System.out.println(person1.getName());
		System.out.println(person1.getLastName());

	}

}
