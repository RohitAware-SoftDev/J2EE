package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resources.Pizza;

public class PizzaHut extends Thread{
	Pizza pizza;

	public PizzaHut(Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public void run() {
		pizza.makePizza(5);
	}
}
