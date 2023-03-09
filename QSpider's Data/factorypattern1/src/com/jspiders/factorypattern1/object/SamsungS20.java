package com.jspiders.factorypattern1.object;

import com.jspiders.factorypattern1.Interface.Mobile;

public class SamsungS20 implements Mobile{

	@Override
	public void start() {
		System.out.println("You Are Using Samsung S20 ");
	}
}
