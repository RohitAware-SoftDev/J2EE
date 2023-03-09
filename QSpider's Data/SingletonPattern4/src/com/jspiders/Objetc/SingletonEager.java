package com.jspiders.Objetc;

public class SingletonEager {
	private static SingletonEager Object=new SingletonEager();
	
	private SingletonEager() {
		System.out.println("Contructor accessed");
	}
	
	public static SingletonEager get_object() {
		System.out.println("Get method accessed");
		return Object;
	}
}
