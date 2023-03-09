package com.jspiders.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Player1 {

	@Id
	private int id;
	private String name;
	private String role;
	private int jersyNo;
	@ManyToOne
	Team1 team1;
}
