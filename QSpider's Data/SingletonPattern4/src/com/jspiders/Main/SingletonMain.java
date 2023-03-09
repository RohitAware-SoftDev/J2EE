package com.jspiders.Main;

import com.jspiders.Objetc.SingletonEager;

public class SingletonMain {
	public static void main(String[] args) {
		SingletonEager object1=SingletonEager.get_object();
		SingletonEager object2=SingletonEager.get_object();
		
		System.out.println(object1);
		System.out.println(object2);
	}
}
