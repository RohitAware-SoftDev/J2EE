package com.jspiders.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Driver {
	@Id
	private int id;
	private String name;
	private long contact;
	@OneToOne
	private Car car;
}
