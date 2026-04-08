package com.rays.lifecycle;

public class MyBean {

	public void init() {
		System.out.println("init methos : BeanCreated");
	}

	public void destroy() {
		System.out.println("destroy method : bean Destroy");
	}

}
