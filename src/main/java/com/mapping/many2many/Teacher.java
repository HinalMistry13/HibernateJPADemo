package com.mapping.many2many;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tid;
	private String tname;
	private String subject;

	@ManyToMany(targetEntity = ClassRoom.class)
	private Set<ClassRoom> clasSet;

	public Teacher() {
		super();
	}

	public Teacher(int tid, String tname, String subject, Set<ClassRoom> clasSet) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.subject = subject;
		this.clasSet = clasSet;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Set<ClassRoom> getClasSet() {
		return clasSet;
	}

	public void setClasSet(Set<ClassRoom> clasSet) {
		this.clasSet = clasSet;
	}
}
