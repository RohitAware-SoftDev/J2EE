package com.jspiders.DTO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Product {
	
	@Id
	private int id;
	private String name;
	private String categary;
	private double price;
	@ManyToMany
	List< Customer> customers;
}
