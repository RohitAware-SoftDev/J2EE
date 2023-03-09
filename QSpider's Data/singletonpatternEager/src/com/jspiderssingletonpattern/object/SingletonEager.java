package com.jspiderssingletonpattern.object;

public class SingletonEager {
	private static SingletonEager object= new SingletonEager();
	private SingletonEager() {
		System.out.println("Contructor accessed");
	}
	
	public static SingletonEager getObject() {
		System.out.println("Contructor creation method is accessed");
		return object;
	}
}
