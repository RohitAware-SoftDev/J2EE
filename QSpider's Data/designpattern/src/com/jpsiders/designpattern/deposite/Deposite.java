package com.jpsiders.designpattern.deposite;

import com.jpsiders.designpattern.account.Account;

public class Deposite {
	double depositeAmmount;
	private Account account;
	
	public Deposite(int depositeAmmount) {
		this.depositeAmmount = depositeAmmount;
	}
	
	public void depoAmmount() {
		account.accountBalance += this.depositeAmmount;
		System.out.println("Total Balance In Account IS : "+account.accountBalance);
	}
}
