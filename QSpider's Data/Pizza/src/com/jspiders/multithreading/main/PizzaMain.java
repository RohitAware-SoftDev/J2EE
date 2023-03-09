package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resources.Pizza;
import com.jspiders.multithreading.thread.Friends;
import com.jspiders.multithreading.thread.PizzaHut;

public class PizzaMain {
	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		Friends friends = new Friends(pizza);
		PizzaHut pizzaHut = new PizzaHut(pizza);
		friends.start();
		pizzaHut.start();
	}
}
