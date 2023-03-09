package com.jpsiders.designpattern.withdraw;

import com.jpsiders.designpattern.account.Account;

public class Withdraw {
	double WithdrawAmmout;
	private Account account;
	
	public Withdraw(double ammount) {
		this.WithdrawAmmout=ammount;
		withDraw();
	}
	
	public void withDraw() {
		if (WithdrawAmmout>account.accountBalance) {
			System.out.println("Insufficiant Account Balance .\nPlease Try Again After Some Time : \n"+ account.accountBalance);
		} else {
			account.accountBalance -=this.WithdrawAmmout;
			System.out.println("Withrawal Successfull : "+WithdrawAmmout);
		}
	}
}
