package com.inheritance.tableperclass;

import javax.persistence.Entity;

@Entity
public class NonTeachingStaff2 extends Staff2 {

	private String areaExpertise;

	public NonTeachingStaff2(int sid, String sname, String areaExpertise) {
		super(sid, sname);
		this.areaExpertise = areaExpertise;
	}

	public NonTeachingStaff2() {
		super();
	}
	
	public String getAreaExpertise() {
		return areaExpertise;
	}

	public void setAreaExpertise(String areaExpertise) {
		this.areaExpertise = areaExpertise;
	}
	
}
