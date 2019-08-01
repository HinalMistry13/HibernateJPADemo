package com.inheritance.tableperclass;

import javax.persistence.Entity;

@Entity
public class TeachingStaff2 extends Staff2 {

	private String qualification;
	private String subjectExpertise;
	
	public TeachingStaff2(int sid, String sname, String qualification, String subjectExpertise) {
		super(sid, sname);
		this.qualification = qualification;
		this.subjectExpertise = subjectExpertise;
	}
	
	public TeachingStaff2() {
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
