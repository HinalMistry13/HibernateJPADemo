package com.inheritance.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Staff2 {
	
	@Id
	private int sid;
	private String sname;
	
	public Staff2(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	
	public Staff2() {
		super();
	}

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}
