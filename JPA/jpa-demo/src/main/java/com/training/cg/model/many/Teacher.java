package com.training.cg.model.many;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TEACHER")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teacher_id;
	
	private String name;
	private String subject;
	
	@ManyToMany(targetEntity = Clas.class)
	private Set clasSet;
	
	public Teacher() {
		
	}

	public Teacher(int teacher_id, String name, String subject, Set clasSet) {
		super();
		this.teacher_id = teacher_id;
		this.name = name;
		this.subject = subject;
		this.clasSet = clasSet;
	}

	public int getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Set getClasSet() {
		return clasSet;
	}

	public void setClasSet(Set clasSet) {
		this.clasSet = clasSet;
	}

}
