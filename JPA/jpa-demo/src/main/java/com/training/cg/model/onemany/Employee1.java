package com.training.cg.model.onemany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE1")
public class Employee1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emp_id;
	
	private String emp_name;
	
	private double emp_salary;
	
	private String emp_desg;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dept_id")
	private Department1 dept;
	

	public Employee1() {
		
	}

	public Employee1(int emp_id, String emp_name, double emp_salary, String emp_desg) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		this.emp_desg = emp_desg;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}

	public String getEmp_desg() {
		return emp_desg;
	}

	public void setEmp_desg(String emp_desg) {
		this.emp_desg = emp_desg;
	}

	public Department1 getDept() {
		return dept;
	}

	public void setDept(Department1 dept) {
		this.dept = dept;
	}

	
}
