package com.inheritance.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "NS")
public class NonTeachingStaff extends Staff {

	private String areaExpertise;

	public NonTeachingStaff(int sid, String sname, String areaExpertise) {
		super(sid, sname);
		this.areaExpertise = areaExpertise;
	}

	public NonTeachingStaff() {
		super();
	}
	
	public String getAreaExpertise() {
		return areaExpertise;
	}

	public void setAreaExpertise(String areaExpertise) {
		this.areaExpertise = areaExpertise;
	}
	
}
