package com.jspiders.factorypattern1.mobilemain;

import java.util.Scanner;

import com.jspiders.factorypattern1.Interface.Mobile;
import com.jspiders.factorypattern1.object.Iphone14ProMax;
import com.jspiders.factorypattern1.object.OnePlus9Pro;
import com.jspiders.factorypattern1.object.RedmiNote11pro;
import com.jspiders.factorypattern1.object.SamsungS20;

public class MobileMain {
	static boolean flag=true;
	private static Mobile mobile;
	private static Scanner sc;
	
	public static void main(String[] args) {		
		while(flag) {
			try {
				factory().start();
			} catch (NullPointerException e) {
				System.out.println("You Decided to Don Not Use Any Devices ");
			}
		}
		sc.close();
	}
	public static Mobile factory() {
		System.out.println("please Select Which Mobile You Want To Try"
				+ " ");
		System.out.println(" 1. SamsungS20\n 2. iphone14ProMax\n 3. OnePlus 9 Pro\n 4. RedmiNote 11 Pro");
		sc = new Scanner(System.in);
		int choice= sc.nextInt();
		switch (choice) {
		case 1:
		{
			mobile=new SamsungS20();
			return mobile;
		}
		
		case 2:
		{
			mobile=new Iphone14ProMax();
			return mobile;
		}
		case 3:
		{
			mobile=new OnePlus9Pro();
			return mobile;
		}
		case 4:
		{
			mobile=new RedmiNote11pro();
			return mobile;
		}
		default:
		{
			flag=false;
			System.out.println("Thank You for Enjoying Our Devices");
			return null;
		}
		}	
	}
}
