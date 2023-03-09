package com.jpsiders.designpattern.checkbalance;

import com.jpsiders.designpattern.account.Account;

public class CheckBalance {
	double checkBalance;
	private Account account;
	
	public double checkBalance() {
		return account.accountBalance;
	}
}
