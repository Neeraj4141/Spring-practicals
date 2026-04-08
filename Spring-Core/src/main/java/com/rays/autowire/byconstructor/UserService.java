package com.rays.autowire.byconstructor;

public class UserService {

	private UserDAOInt userDao;

	public UserService(UserDAOInt userDao) {
		this.userDao = userDao;

	}

	public void testadd() {
		userDao.add();
	}

}
