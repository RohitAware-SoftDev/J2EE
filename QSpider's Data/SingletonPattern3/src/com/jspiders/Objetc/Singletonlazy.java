package com.jspiders.Objetc;

public class Singletonlazy {
	static Singletonlazy Object;
	
	private Singletonlazy() {
		System.out.println("Contructor accessed");
	}
	
	public static Singletonlazy get_object() {
		System.out.println("Get method accessed");
		if(Object==null) {
		Object=new Singletonlazy();
		}
		return Object;
	}
}
