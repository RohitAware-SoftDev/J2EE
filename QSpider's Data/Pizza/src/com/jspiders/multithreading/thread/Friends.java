package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resources.Pizza;

public class Friends extends Thread{
	Pizza pizza;
	
	public Friends(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public void run() {
		pizza.OrderPizza(5);
	}
}
