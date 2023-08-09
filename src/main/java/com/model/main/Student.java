package com.model.main;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private int id;
      
	private String name;

	private Certificate certi;


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

	public com.model.main.Certificate getCerti() {
		return certi;
	}

	public void setCerti(com.model.main.Certificate certi) {
		this.certi = certi;
	}

	public Student() {
		super();
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;

	}

}
