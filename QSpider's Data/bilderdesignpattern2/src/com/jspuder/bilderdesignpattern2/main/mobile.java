package com.jspuder.bilderdesignpattern2.main;

public class mobile {
	String brand;
	String model;
	String os;
	String processor;
	double price;
	int ram;
	int rom;
	int front_cam;
	int rare_cam;
	String color;
	
	public mobile(String brand, String model, String os, String processor, double price, int ram, int rom,
			int front_cam, int rare_cam, String color) {
		super();
		this.brand = brand;
		this.model = model;
		this.os = os;
		this.processor = processor;
		this.price = price;
		this.ram = ram;
		this.rom = rom;
		this.front_cam = front_cam;
		this.rare_cam = rare_cam;
		this.color = color;
	}

	@Override
	public String toString() {
		return "mobile "+
				"\nbrand = " + brand + 
				"\nmodel = " + model + 
				"\nos = " + os + 
				"\nprocessor = " + processor +
				"\nprice = "+ price +
				"\nram = " + ram + 
				"\nrom = " + rom + 
				"\nfront_cam = " + front_cam + 
				"\nrare_cam = " + rare_cam +
				"\ncolor = " + color ;
	}
	
	
	
	

}
