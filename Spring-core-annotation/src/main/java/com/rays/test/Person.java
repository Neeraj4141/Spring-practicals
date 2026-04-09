package com.rays.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // agar haam yaha bean ka naam nahi denge to same class ke naam se by default
			// bean create kaar dega
public class Person {

	private String name;
	private String address;

	public String getName() {
		return name;
	}

	// @Value("Neeraj") without value annotation use setter in test
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	// @Value("Shujalpur")
	public void setAddress(String address) {
		this.address = address;
	}

}
