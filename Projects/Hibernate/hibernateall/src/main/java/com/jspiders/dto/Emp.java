package com.jspiders.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Emp {

	@Id
	int id;
	String Ename;
	String Email;
	String Department;
	long Salary;
	
}
