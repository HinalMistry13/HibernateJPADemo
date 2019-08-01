package com.mapping.many2many;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ClassRoom {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int cid;
	private String cname;

	@ManyToMany(targetEntity = Teacher.class)
	private Set<Teacher> teacherSet;

	public ClassRoom(){
	      super();
	}

	public ClassRoom(int cid, String cname, Set<Teacher> teacherSet) {
	      super();
	      this.cid = cid;
	      this.cname = cname;
	      this.teacherSet = teacherSet;
	   }

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set<Teacher> getTeacherSet() {
		return teacherSet;
	}

	public void setTeacherSet(Set<Teacher> teacherSet) {
		this.teacherSet = teacherSet;
	}
}
