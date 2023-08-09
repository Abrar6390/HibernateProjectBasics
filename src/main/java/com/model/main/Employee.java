package com.model.main;

import org.hibernate.annotations.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@jakarta.persistence.Table(name="Emp_Details")
public class Employee {
	@Id
	@Column(name = "emp_Id")
	private int id;

	@Column(name = "Emp_Name")
	private String emp_Name;

	@Column(name = "Emp_Qualification")
	private String qulification;

	public Employee(int id, String emp_Name, String qulification) {
		super();
		this.id = id;
		this.emp_Name = emp_Name;
		this.qulification = qulification;
	}
	
	public Employee() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_Name() {
		return emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public String getQulification() {
		return qulification;
	}
	
	public void setQulification(String qulification) {
		this.qulification = qulification;
	}
	
	@Override
	public String toString() {
		return id + emp_Name + qulification;
	}
}
