package com.training.cg;
//Java Bean
public class Employee {
	
	private String empId;
	private String empName;
	private String empDept;
	private double empSalary;
	
	static String organization;
	
	// Default constructor
	
	Employee(){
		
	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		if(empSalary < 20000) {
			System.out.println("Salary cant be less than 20000");
		}
		else {
			this.empSalary = empSalary;
		}	
	}
	
}
