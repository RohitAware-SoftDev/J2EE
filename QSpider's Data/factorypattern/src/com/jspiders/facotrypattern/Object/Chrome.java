package com.jspiders.facotrypattern.Object;

import com.jspiders.facotrypattern.Interface.Browser;

public class Chrome implements Browser{

	@Override
	public void start() {
		System.out.println("Chrome Started");
	}
	
}
