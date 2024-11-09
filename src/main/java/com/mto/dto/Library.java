package com.mto.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Library {

	@Id
	int id;
	String name;
	String location;
	
	public Library() {
		// TODO Auto-generated constructor stub
	}

	

	public Library(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	
}
