package com.training.cg.model.many;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CLASS")
public class Clas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int class_id;
	
	private String class_name;
	
	@ManyToMany(targetEntity = Teacher.class)
	private Set teacherSet;

	public Clas() {
		
	}

	public Clas(int class_id, String class_name, Set teacherSet) {
		super();
		this.class_id = class_id;
		this.class_name = class_name;
		this.teacherSet = teacherSet;
	}

	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public Set getTeacherSet() {
		return teacherSet;
	}

	public void setTeacherSet(Set teacherSet) {
		this.teacherSet = teacherSet;
	}

}
