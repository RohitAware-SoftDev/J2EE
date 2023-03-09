package com.jspuder.bilderdesignpattern2.main;

public class mobilemain {
	public static void main(String[] args) {
	    mobile mobile=	new mobilebuilder().brand("Samsung").color("black").getmobile();
	    System.out.println(mobile);
	}
}
