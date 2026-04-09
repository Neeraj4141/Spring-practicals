package com.rays.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userServiceByName")
public class UserServiceByName {

	@Autowired
	@Qualifier("userDao")
	private UserDAOInt userDao;

	public void testadd() {
		userDao.add();
	}

}
