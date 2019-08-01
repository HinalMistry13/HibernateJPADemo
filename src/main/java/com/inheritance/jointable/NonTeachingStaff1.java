package com.inheritance.jointable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "sid")
@DiscriminatorValue(value = "NS")
public class NonTeachingStaff1 extends Staff1 {

	private String areaExpertise;

	public NonTeachingStaff1(int sid, String sname, String areaExpertise) {
		super(sid, sname);
		this.areaExpertise = areaExpertise;
	}

	public NonTeachingStaff1() {
		super();
	}
	
	public String getAreaExpertise() {
		return areaExpertise;
	}

	public void setAreaExpertise(String areaExpertise) {
		this.areaExpertise = areaExpertise;
	}
	
}
