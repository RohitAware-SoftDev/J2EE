package com.jspiders.multithreading.Thread;

import com.jspiders.multithreading.resppurce.Account;

public class Husband extends Thread{
	Account account;

	public Husband(Account account) {
		super();
		this.account = account;
	}
	@Override
	public void run() {
		account.deposite(1000);
		account.withraw(500);
	}
}
