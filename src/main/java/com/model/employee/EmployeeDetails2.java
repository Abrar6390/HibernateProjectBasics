package com.model.employee;

public class EmployeeDetails2 {
	private int pincode;
	private String city;

	
	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public EmployeeDetails2(int pincode, String city) {
		super();
		this.pincode = pincode;
		this.city = city;
	}

	public EmployeeDetails2() {
		super();

	}

}
