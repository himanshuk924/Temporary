package com.cg.employee.employee.controller;

public class EmployeePojo {
 private String name;
 private String empid;
 private String designation;
 
public String getName() {
	return name;
}

public String getEmpid() {
	return empid;
}

public String getDesignation() {
	return designation;
}

public EmployeePojo() {
	super();
}

public EmployeePojo(String name, String empid, String designation) {
	super();
	this.name = name;
	this.empid = empid;
	this.designation = designation;
}
 
}
