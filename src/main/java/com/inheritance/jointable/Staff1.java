package com.inheritance.jointable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type")
public class Staff1 {
	
	@Id
	private int sid;
	private String sname;
	
	public Staff1(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	
	public Staff1() {
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
