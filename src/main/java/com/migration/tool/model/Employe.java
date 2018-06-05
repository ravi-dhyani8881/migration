package com.migration.tool.model;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "users")
public class Employe {
	
	public String name;
	public String lastName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	

}
