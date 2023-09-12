package com.webservice.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private String address;
	private long mobileno;

}
