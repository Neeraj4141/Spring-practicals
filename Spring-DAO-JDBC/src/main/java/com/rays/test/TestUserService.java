package com.rays.test;

import java.util.Iterator;
import java.util.List;

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

		// Stest.testadd();
		// test.testdelete();
		// test.testupdate();
		// test.testFindByPk();
		// test.testFindByLogin();
		// test.testAuthenticate();
		test.testSearch();
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

	public void testFindByPk() {
		UserDTO dto = new UserDTO();
		dto = service.findByPk(1);
		if (dto != null) {
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastname());
			System.out.println(dto.getLoginId());
			System.out.println(dto.getPassword());
		} else {
			System.out.println("RecordNotFound");
		}
	}

	public void testFindByLogin() {
		UserDTO dto = new UserDTO();
		dto = service.findByLogin("rohit@gmail.com");
		if (dto != null) {
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastname());
			System.out.println(dto.getLoginId());
			System.out.println(dto.getPassword());
		} else {
			System.out.println("RecordNotFound");
		}

	}

	private void testAuthenticate() {
		UserDTO dto = new UserDTO();
		dto = service.authenticate("rohit@gmail.com", "rohit@123");
		if (dto != null) {
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastname());
			System.out.println(dto.getLoginId());
			System.out.println(dto.getPassword());
		} else {
			System.out.println("Login id and password are not same ");
		}

	}

	private void testSearch() {
		UserDTO dto = new UserDTO();
		dto.setFirstName("Rohit");
		List<UserDTO> list = service.search(dto, 1, 5);
		Iterator<UserDTO> it = list.iterator();
		while (it.hasNext()) {
			dto = it.next();
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastname());
			System.out.println(dto.getLoginId());
			System.out.println(dto.getPassword());

		}

	}

}
