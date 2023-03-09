package com.jspuder.bilderdesignpattern2.main;

public class mobilebuilder {
	private String brand;
	private String model;
	private String os;
	private String processor;
	private double price;
	private int ram;
	private int rom;
	private int front_cam;
	private int rare_cam;
	private String color;
	
	public mobilebuilder brand(String brand) {
		this.brand=brand;
		return this;
	}
	public mobilebuilder os(String os) {
		this.os=os;
		return this;
	}
	public mobilebuilder model(String model) {
		this.model=model;
		return this;
	}
	public mobilebuilder processor(String processor) {
		this.processor=processor;
		return this;
	}
	public mobilebuilder color(String color) {
		this.color=color;
		return this;
	}
	public mobilebuilder ram(int ram) {
		this.ram=ram;
		return this;
	}
	public mobilebuilder rom(int rom ) {
		this.rom=rom;
		return this;
	}
	public mobilebuilder frontcam(int frontcam) {
		this.front_cam=frontcam;
		return this;
	}
	public mobilebuilder rarecam(int rarecam) {
		this.rare_cam=rarecam;
		return this;
	}
	
	public mobilebuilder price(double price) {
		this.price=price;
		return this;
	}
	
	public mobile getmobile() {
		mobile mob=new mobile(this.brand,this. model, this.os, this.processor, this.price, this.ram, this.rom,this. front_cam, this.rare_cam, this.color);
		return mob;
	}
}
