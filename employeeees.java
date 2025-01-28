package com.example.demo;



import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;



@Entity

@Table(name="EMPLOYEEEES")

public class employeeees {

@Id

@Column(name="empid")

int employeeid;

@Column(name="empname")

String employeename;

@Column(name="empdata")

String employeedept;

public int getemployeeid() {

	return employeeid;

}

public void setemployeename( int employeeid ) {

	this.employeeid=employeeid;

	

}

public String getEmployee() {

	return employeename;

}

public void setemployeename(String employeename) {

	this.employeename=employeename;

}

public String getemployeedept() {

	return employeedept;

}

public void setemployeedept(String employeedept) {

	this.employeedept=employeedept;

}

}
