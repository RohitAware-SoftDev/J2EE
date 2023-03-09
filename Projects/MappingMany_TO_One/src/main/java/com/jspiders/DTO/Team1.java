package com.jspiders.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Team1 {
	@Id
	 private int id;
	 private String name;
	 private String Coach;
	 private String city;
}
