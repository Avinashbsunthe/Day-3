package com.assignment.employee;

public class Employee
{
	private String empName;
	private int empId;
	private int empAge;
	private String empDesgn;
	private String empLocation;
	private int empExplnYrs;
	
	public Employee(String empName, int empId, int empAge, String empDesgn, String empLocation, int empExplnYrs)
	{
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empDesgn = empDesgn;
		this.empLocation = empLocation;
		this.empExplnYrs = empExplnYrs;
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Age: "+empAge);
		System.out.println("Employee Designation: "+empDesgn);
		System.out.println("Employee Location: "+empLocation);
		System.out.println("Employee ExpYears: "+empExplnYrs);
	}

	public Employee(String empName)
	{
		this.empName = empName;
		System.out.println("Employee Name: "+empName);
	}

	public Employee(String empName, int empId) 
	{
		this.empName = empName;
		this.empId = empId;
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Id: "+empId);
	}


}
