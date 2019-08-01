package com.inheritance.jointable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "sid")
@DiscriminatorValue(value = "TS")
public class TeachingStaff1 extends Staff1 {

	private String qualification;
	private String subjectExpertise;
	
	public TeachingStaff1(int sid, String sname, String qualification, String subjectExpertise) {
		super(sid, sname);
		this.qualification = qualification;
		this.subjectExpertise = subjectExpertise;
	}
	
	public TeachingStaff1() {
		super();
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSubjectExpertise() {
		return subjectExpertise;
	}

	public void setSubjectExpertise(String subjectExpertise) {
		this.subjectExpertise = subjectExpertise;
	}
	
}
