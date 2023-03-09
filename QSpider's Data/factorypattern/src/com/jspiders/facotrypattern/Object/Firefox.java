package com.jspiders.facotrypattern.Object;

import com.jspiders.facotrypattern.Interface.Browser;

public class Firefox implements Browser{

	@Override
	public void start() {
		System.out.println("Firefox Started");

	}

}
