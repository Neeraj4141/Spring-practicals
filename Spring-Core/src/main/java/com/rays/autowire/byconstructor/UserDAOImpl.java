package com.rays.autowire.byconstructor;

public class UserDAOImpl implements UserDAOInt {


	@Override
	public void add() {
		System.out.println("in add method by type of constructor");

	}

}
