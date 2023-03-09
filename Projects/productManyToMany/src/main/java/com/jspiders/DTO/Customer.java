package com.jspiders.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Customer {
	
	@Id
	private int id;
	private String name;
	private String city;
	private long contact; 
}
