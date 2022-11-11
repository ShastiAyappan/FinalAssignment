package com.assesment.fullstack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class DoctorEntity {
	
	@Id
	@Column(name = "doctor_id")
	private int doctorId_i;
	
	@Column(name = "doctor_name")
	private String doctorName_str;
	
	@Column(name = "doctor_experience")
	private float doctorExperience_f;
	
	@Column(name = "gender")
	private String gender_str;
	
	@Column(name = "qualification")
	private String qualification_str;
	
	@Column(name = "status")
	private boolean status_boo;

	public int getDoctorId_i() {
		return doctorId_i;
	}

	public void setDoctorId_i(int doctorId_i) {
		this.doctorId_i = doctorId_i;
	}

	public String getDoctorName_str() {
		return doctorName_str;
	}

	public void setDoctorName_str(String doctorName_str) {
		this.doctorName_str = doctorName_str;
	}

	public float getDoctorExperience_f() {
		return doctorExperience_f;
	}

	public void setDoctorExperience_f(float doctorExperience_f) {
		this.doctorExperience_f = doctorExperience_f;
	}

	public String getGender_str() {
		return gender_str;
	}

	public void setGender_str(String gender_str) {
		this.gender_str = gender_str;
	}

	public String getQualification_str() {
		return qualification_str;
	}

	public void setQualification_str(String qualification_str) {
		this.qualification_str = qualification_str;
	}

	public boolean isStatus_boo() {
		return status_boo;
	}

	public void setStatus_boo(boolean status_boo) {
		this.status_boo = status_boo;
	}

	@Override
	public String toString() {
		return "DoctorEntity [doctorId_i=" + doctorId_i + ", doctorName_str=" + doctorName_str + ", doctorExperience_f="
				+ doctorExperience_f + ", gender_str=" + gender_str + ", qualification_str=" + qualification_str
				+ ", status_boo=" + status_boo + "]";
	}
	
}
