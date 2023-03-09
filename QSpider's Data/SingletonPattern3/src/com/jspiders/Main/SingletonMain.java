package com.jspiders.Main;

import com.jspiders.Objetc.Singletonlazy;

public class SingletonMain {
	public static void main(String[] args) {
		Singletonlazy object1=Singletonlazy.get_object();
		Singletonlazy object2=Singletonlazy.get_object();
		
		System.out.println(object1);
		System.out.println(object2);
	}
}
