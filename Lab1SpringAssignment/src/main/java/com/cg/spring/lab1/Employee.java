package com.cg.spring.lab1;

import org.springframework.beans.factory.annotation.Autowired;



public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private String businessUnit;
	private int age;
	private SBU sbu;
	public Employee(int employeeId,String employeeName, double salary,String businessUnit,int age)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
		this.businessUnit=businessUnit;
		
	}
	public SBU getSbu() {
		return sbu;
	}
	@Autowired
	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
