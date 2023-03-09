package com.jpsiders.designpattern.account;

public class Account {
	public double accountBalance;
	private static Account account=new Account(10000); 

	private Account(int account) {
		System.out.println("Contructed Exicuted");
		this.accountBalance=account;
	}

	public static Account getAcc() {
		return account;
	}

}
