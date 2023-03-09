package com.jspiders.facotrypattern.main;

import java.util.Scanner;

import com.jspiders.facotrypattern.Interface.Browser;
import com.jspiders.facotrypattern.Object.Chrome;
import com.jspiders.facotrypattern.Object.Edge;
import com.jspiders.facotrypattern.Object.Firefox;
import com.jspiders.facotrypattern.Object.Safari;

public class BrowserMain {
	
	static boolean loop=true;
	static private Browser browser; 
	private static Scanner sc;
	
	
	public static void main(String[] args) {
		while(loop) {
			try {
				factory().start();// we directly passed address while created object inside switch case
				//it's like without storing obj_ref variable inside ref_var, we use it as factory method return that 
				//Address with help of that address we started browser containing start() method 
			} catch (NullPointerException e) {
				System.out.println("No Browser Selected");
			}
		}
		sc.close();
	}
	
	private static Browser factory() {
		System.out.println("Select browser  : "+ "\n 1. Chrome "+ "\n 2. Firefox "+"\n 3. Safari "+ "\n 4. Edge ");
		sc=new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:

			browser=new Chrome();//return address of Chrome browser object
			return browser;
		
		case 2:
			
			browser=new Firefox();
			return browser;
			
		case 3:
			
			browser=new Safari();
			return browser;
			
		case 4:
			
			browser=new Edge();
			return browser;
			
		default:
			loop=false;
			System.out.println("Invalid Choice");
			return null;
		}
	}
}
