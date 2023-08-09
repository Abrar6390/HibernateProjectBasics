package com.model.employee;

public class EmployeeDetailsMain {

	public static void main(String[] args) {
		EmployeeDtails1 employeeDtails1=new EmployeeDtails1();
		employeeDtails1.setId(101);
		employeeDtails1.setNameS("Abrar");
		
		EmployeeDetails2 employeeDetails2=new EmployeeDetails2();
		employeeDetails2.setPincode(400071);
		employeeDetails2.setCity("sakinaka");
		
		employeeDtails1.setEmp(employeeDetails2);
		
		
		  System.out.println(employeeDtails1.getId()+" : "+employeeDtails1.getNameS());
		  System.out.println(employeeDetails2.getPincode()+" : "+employeeDetails2.getCity());
		 
	}

}
