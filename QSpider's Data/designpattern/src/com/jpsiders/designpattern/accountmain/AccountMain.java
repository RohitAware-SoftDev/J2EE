package com.jpsiders.designpattern.accountmain;

import java.util.Scanner;

import com.jpsiders.designpattern.account.Account;
import com.jpsiders.designpattern.checkbalance.CheckBalance;
import com.jpsiders.designpattern.deposite.Deposite;
import com.jpsiders.designpattern.withdraw.Withdraw;

public class AccountMain {
	private static Account account;
	private static Withdraw withDraw;
	private static Deposite deposite;
	private static CheckBalance balance;
	static Scanner sc;
	static boolean flag=true;
	
	public static void main(String[] args) {
		try {
			while(flag) {
				factory();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
	
	public static Account factory() {
		sc= new Scanner(System.in);
		System.out.println("Ener your choice : ");
		int choice= sc.nextInt();
		System.out.println("1. Withdraw\n 2. Deposite\n 3. CheckBalance\n 4. Exit");
		switch (choice) {
		case 1:
			withDraw = new Withdraw(2000);
		case 2:
			deposite = new Deposite(2000);
			
		default:
			return account;
		}
		
	}
}
