package com.rays.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rays.dto.UserDTO;
import com.rays.service.UserServiceInt;

@Component("testuserservice")
public class TestUserService {

	@Autowired
	private UserServiceInt service = null;

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		TestUserService test = (TestUserService) context.getBean("testuserservice");

		// test.testAdd();
		// test.testUpdate();
		// test.testDelete();
		// test.testFindByPk();
		// test.testFindByLogin();
		// test.testSearch();
		test.testAuthenticate();
	}

	public void testAdd() {
		UserDTO dto = new UserDTO();
		dto.setFirstName("Rohit");
		dto.setLastName("Mewada");
		dto.setLogin("rohit@gmail.com");
		dto.setPassword("Rohit@123");
		service.add(dto);

	}

	public void testUpdate() {
		UserDTO dto = new UserDTO();
		dto.setId(3);
		dto.setFirstName("Rahul");
		dto.setLastName("Mewada");
		dto.setLogin("rahul@gmail.com");
		dto.setPassword("Rahul@123");
		service.update(dto);

	}

	public void testDelete() {
		UserDTO dto = new UserDTO();
		service.delete(3);
	}

	public void testFindByPk() {
		UserDTO dto = service.findByPK(1);
		System.out.println(dto.getId());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());
		System.out.println(dto.getLogin());
		System.out.println(dto.getPassword());
	}

	public void testFindByLogin() {
		UserDTO dto = service.findByLogin("rohit@gmail.com");
		System.out.println(dto.getId());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());
		System.out.println(dto.getLogin());
		System.out.println(dto.getPassword());

	}

	public void testSearch() {

		UserDTO dto = new UserDTO();
		System.out.println("service->" + service);
		List<UserDTO> list = service.search(dto, 1, 5);
		System.out.println(list);

		Iterator<UserDTO> it = list.iterator();

		while (it.hasNext()) {
			dto = (UserDTO) it.next();
			System.out.print(dto.getId());
			System.out.print("\t" + dto.getFirstName());
			System.out.print("\t" + dto.getLastName());
			System.out.print("\t" + dto.getLogin());
			System.out.println("\t" + dto.getPassword());
		}
	}

	public void testAuthenticate() {
		UserDTO dto = service.authenticate("rohit@gmail.com", "Rohit@123");
		System.out.println(dto.getId());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());
		System.out.println(dto.getLogin());
		System.out.println(dto.getPassword());
	}

}
