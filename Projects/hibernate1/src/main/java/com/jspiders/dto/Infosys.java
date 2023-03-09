package com.jspiders.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Infosys {
		@Id
		int id;
		String Company_Name;
		String Locatin;
		String Branch;
}
