package com.jspiders.builderdesignpattern.bulderpackage;

import com.jspiders.builderdesignpattern.object.Mobile;

public class MobileBuilder {
	private String brand;
	private String model;
	private double price;
	private String color;
	private int front_Cam;
	private int	Cam;
	private int ram;
	private int memory;
	private double processor;
	private String Os;
	
	public MobileBuilder brand(String brand) {
		this.brand=brand;
		return this;
	}
	public MobileBuilder model(String model) {
		this.model=model;
		return this;
	}
	public MobileBuilder colore(String color) {
		this.color=color;
		return this;
	}
	public MobileBuilder os(String os) {
		this.Os=os;
		return this;
	}
	public MobileBuilder front_Cam(int front_cam) {
		this.front_Cam=front_cam;
		return this;
	}
	public MobileBuilder rare_Cam(int rare_Cam) {
		this.Cam=rare_Cam;
		return this;
	}
	public MobileBuilder ram(int ram) {
		this.ram=ram;
		return this;
	}
	public MobileBuilder memory(int memory) {
		this.memory=memory;
		return this;
	}
	public MobileBuilder price(double price) {
		this.price=price;
		return this;
	}
	public MobileBuilder processor(double processor) {
		this.processor=processor;
		return this;
	}
	
	public Mobile get_Mob() {
		Mobile mob=new Mobile(this.brand,this. model,this. price,this. color,this. front_Cam,this. ram,this. ram, this.memory, this.processor, this.Os);
		return mob;
	}
	
	
}
