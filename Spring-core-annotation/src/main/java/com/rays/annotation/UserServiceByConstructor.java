package com.rays.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServiceByConstructor")
public class UserServiceByConstructor {

	private UserDAOInt userDao;

	@Autowired
	public UserServiceByConstructor(UserDAOInt userDao) {

		this.userDao = userDao;

	}

	public void testadd() {
		userDao.add();

	}

}
