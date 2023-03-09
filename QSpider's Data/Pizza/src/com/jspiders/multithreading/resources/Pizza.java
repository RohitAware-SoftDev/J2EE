package com.jspiders.multithreading.resources;

public class Pizza {
int no_Of_Pizza;
	
	public void OrderPizza(int orderPizza) {
		System.out.println("Ordering"+ orderPizza+"pizzas");
		if(orderPizza>no_Of_Pizza) {
			System.out.println(orderPizza + " Pizza not are avialable . Please wait");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		no_Of_Pizza-=orderPizza;
		System.out.println("Successfully Ordered " + orderPizza + " pizzas");
	}
	public void makePizza(int makePizza) {
		System.out.println("Mkaing " + makePizza + "pizzas");
		
	}
}
