package com.rays.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rays.dto.UserDTO;
import com.rays.service.UserServiceInt;

@Component("testuserservice")
public class TestUserDTO {

	@Autowired
	private UserServiceInt service = null;

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		TestUserDTO test = (TestUserDTO) context.getBean("testuserservice");

		test.testAdd();

	}

	public void testAdd() {
		UserDTO dto = new UserDTO();
		dto.setFirstName("Neeraj");
		dto.setLastName("Mewada");
		dto.setLogin("neeraj@gmail.com");
		dto.setPassword("Neeraj@123");
		service.add(dto);

	}

}
