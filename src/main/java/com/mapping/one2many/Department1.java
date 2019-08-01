package com.mapping.one2many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department1 {
	@Id 
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int id;
	private String name;
	
	@OneToMany(targetEntity = Emp1.class)
	private List<Emp1> empList;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName( ){
		return name;
	}

	public void setName( String deptName ){
		this.name = deptName;
	}

	public List<Emp1> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Emp1> empList) {
		this.empList = empList;
	}
	
}
