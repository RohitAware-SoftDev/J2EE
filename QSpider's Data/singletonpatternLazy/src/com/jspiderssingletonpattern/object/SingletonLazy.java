package com.jspiderssingletonpattern.object;

public class SingletonLazy {
	private static SingletonLazy object;
	private SingletonLazy() {
		System.out.println("Contructor accessed");
	}
	
	public static SingletonLazy getObject() {
		System.out.println("Contructor creation method is accessed");
		if(object==null) {
			object = new SingletonLazy();
		}
		return object;
	}
}
