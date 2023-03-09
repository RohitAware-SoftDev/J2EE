package com.jspiders.multithreading.Thread;

import com.jspiders.multithreading.resppurce.Account;

public class Wife extends Thread{
	Account account;

	public Wife(Account account) {
		this.account = account;
	}
	@Override
	public void run() {
		account.deposite(500);
		account.withraw(5000);
	}
	
}
