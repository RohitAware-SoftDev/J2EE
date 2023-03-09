package com.jspiders.multithreading.resppurce;

public class Account {
	double account_balance;

	public Account(double account_balance) {
		this.account_balance = account_balance;
	}
	public double check_balance() {
		return this.account_balance;
	}
	public synchronized void deposite(double amount) {
		System.out.println("Depositing"+amount+"in account");
		this.account_balance+=amount;
		System.out.println("Current balance is "+check_balance());
		System.out.println("-------------------------------");
	
	}
	public synchronized void withraw(double amount) {
		System.out.println("Widrawing"+amount+"from account");
		this.account_balance-=amount;
		System.out.println("Current balance is "+check_balance());
		System.out.println("-------------------------------");
	
	}
}

