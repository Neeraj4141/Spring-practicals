package com.rays.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServiceBySetter")
public class UserServiceBySetter {

	private UserDAOInt userDao;

	@Autowired
	public void setUserDao(UserDAOInt userDao) {
		this.userDao = userDao;
	}

	public void testadd() {
		userDao.add();
	}

}
