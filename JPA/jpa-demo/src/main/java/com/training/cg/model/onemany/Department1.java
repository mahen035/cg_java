package com.training.cg.model.onemany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTMENT1")
public class Department1 {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String dept_name;
	
	@OneToMany(mappedBy="dept", cascade = CascadeType.ALL)
	private List<Employee1> empList;

	public Department1() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public List<Employee1> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee1> empList) {
		this.empList = empList;
	}
}
