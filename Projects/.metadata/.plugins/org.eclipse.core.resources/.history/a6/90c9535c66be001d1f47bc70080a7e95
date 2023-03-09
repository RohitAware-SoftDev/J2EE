package com.jspiders.DTO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
@Data
@Entity
public class Team {

	@Id
	private int id;
	private String name;
	private String coach;
	private String city;
	@OneToMany
	List<Player> players;  
}
