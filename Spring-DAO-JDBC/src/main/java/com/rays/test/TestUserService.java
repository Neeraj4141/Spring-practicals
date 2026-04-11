package com.rays.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rays.dto.UserDTO;
import com.rays.service.UserService;

@Component("testUserService")
public class TestUserService {

	@Autowired
	public UserService service = null;

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		TestUserService test = (TestUserService) context.getBean("testUserService");

		// test.testadd();
		// test.testdelete();
		test.testupdate();

	}

	public void testadd() {
		UserDTO dto = new UserDTO();
		dto.setFirstName("Rohit");
		dto.setLastname("Mewada");
		dto.setLoginId("rohit@gmail.com");
		dto.setPassword("Rohit@123");
		long i = service.add(dto);
		System.out.println("data inserted successfully row affected = " + i);

	}

	public void testdelete() {
		service.delete(2);
		System.out.println("data deleted successfully");
	}

	public void testupdate() {
		UserDTO dto = new UserDTO();
		dto.setFirstName("Mohit");
		dto.setLastname("Chawda");
		dto.setLoginId("mohit@gmail.com");
		dto.setPassword("Mohit@123");
		dto.setId(2);
		service.update(dto);
		System.out.println("data updated successfully");
	}

}
