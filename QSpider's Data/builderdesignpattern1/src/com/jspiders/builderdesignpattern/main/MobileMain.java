package com.jspiders.builderdesignpattern.main;

import com.jspiders.builderdesignpattern.bulderpackage.MobileBuilder;
import com.jspiders.builderdesignpattern.object.Mobile;

public class MobileMain {
	public static void main(String[] args) {
		Mobile mobile =new MobileBuilder().brand("Samsung").model("S20_Ultra").ram(16).memory(256).get_Mob();
		System.out.println(mobile);
	}
}
