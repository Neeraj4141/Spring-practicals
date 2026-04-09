package com.rays.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServiceByType")
public class UserServiceByType {

	@Autowired
	private UserDAOInt userDao;

	public void testadd() {
		userDao.add();
	}

}
