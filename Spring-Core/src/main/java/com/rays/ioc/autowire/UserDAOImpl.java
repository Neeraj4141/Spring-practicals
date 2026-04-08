package com.rays.ioc.autowire;

public class UserDAOImpl implements UserDAOInt {

	@Override
	public void add() {
		System.out.println("Add method !!!!");
	}

}
