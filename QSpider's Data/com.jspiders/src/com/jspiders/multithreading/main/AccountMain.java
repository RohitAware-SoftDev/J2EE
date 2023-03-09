package com.jspiders.multithreading.main;

import com.jspiders.multithreading.Thread.Husband;
import com.jspiders.multithreading.Thread.Wife;
import com.jspiders.multithreading.resppurce.Account;

public class AccountMain {
	public static void main(String[] args) {
		Account account = new Account(10000);
		Husband h = new Husband(account);
		Wife w = new Wife(account);
		h.start();
		w.start();
	}
}
