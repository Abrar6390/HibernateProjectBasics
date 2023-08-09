package com.model.employee;

public class EmployeeDtails1 {
	private int id;
	private String nameS;
	
	
	private EmployeeDetails2 emp;
	
	public EmployeeDetails2 getEmp() {
		return emp;
	}

	public void setEmp(EmployeeDetails2 emp) {
		this.emp = emp;
	}
     
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameS() {
		return nameS;
	}

	public void setNameS(String nameS) {
		this.nameS = nameS;
	}

	public EmployeeDtails1() {
		super();

	}

	public EmployeeDtails1(int id, String nameS) {
		super();
		this.id = id;
		this.nameS = nameS;
	}

}
