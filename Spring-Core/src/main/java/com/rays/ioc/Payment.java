package com.rays.ioc;

public class Payment {

	double balance = 0;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double makepayment(double amt) {
		balance = balance - amt;
		return balance;
	}

}
