package com.jspiders.builderdesignpattern.object;

public class Mobile {
	String brand;
	String model;
	double price;
	String color;
	int front_Cam;
	int rare_Cam;
	int ram;
	int memory;
	double processor;
	String Os;
	public Mobile(String brand, String model, double price, String color, int frontCam, int rareCam, int ram,
			int memory, double processor, String os) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;
		this.front_Cam = frontCam;
		this.rare_Cam = rareCam;
		this.ram = ram;
		this.memory = memory;
		this.processor = processor;
		Os = os;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", model=" + model + ", price=" + price + ", color=" + color + ", frontCam="
				+ front_Cam + ", rareCam=" + rare_Cam + ", ram=" + ram + ", memory=" + memory + ", processor=" + processor
				+ ", Os=" + Os + "]";
	}
	
	
}
